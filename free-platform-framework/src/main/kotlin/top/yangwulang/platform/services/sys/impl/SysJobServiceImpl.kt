package top.yangwulang.platform.services.sys.impl

import org.quartz.Scheduler
import org.quartz.SchedulerException
import org.quartz.TriggerKey
import org.quartz.impl.matchers.GroupMatcher
import org.quartz.impl.triggers.CronTriggerImpl
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.quartz.QuartzProperties
import org.springframework.context.SmartLifecycle
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.domain.Specification
import org.springframework.data.jpa.repository.Modifying
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource
import org.springframework.scheduling.quartz.SchedulerFactoryBean
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import top.yangwulang.platform.entity.sys.SysJob
import top.yangwulang.platform.entity.sys.SysJobId
import top.yangwulang.platform.entity.sys.dto.SysJobDto
import top.yangwulang.platform.exception.ServiceException
import top.yangwulang.platform.factory.JobFactory
import top.yangwulang.platform.repository.sys.SysJobRepository
import top.yangwulang.platform.services.BaseService
import top.yangwulang.platform.services.BaseServiceImpl
import top.yangwulang.platform.services.sys.SysJobService
import java.util.*
import javax.persistence.criteria.CriteriaBuilder
import javax.persistence.criteria.CriteriaQuery
import javax.persistence.criteria.Predicate
import javax.persistence.criteria.Root


@Service
class SysJobServiceImpl :
    BaseServiceImpl<SysJob, SysJobId, SysJobDto, SysJobRepository>(),
    SmartLifecycle, SysJobService {
    private var isRunning = false
    protected val lifecycleMonitor = Any()
    private val jobFactory = JobFactory()
    private lateinit var schedulerFactoryBean: SchedulerFactoryBean

    @Autowired
    private lateinit var quartzProperties: QuartzProperties

    @Autowired
    private lateinit var routingDataSource: AbstractRoutingDataSource

    @Transactional
    @Modifying
    override fun start() {
        synchronized(lifecycleMonitor) {
            if (isRunning) {
                this.doStart()
                this.isRunning = true
            }
        }
    }

    @Transactional
    @Modifying
    override fun startAll(): Boolean {
        return try {
            this.schedulerFactoryBean.setStartupDelay(0)
            this.schedulerFactoryBean.start()
            true
        } catch (e: Exception) {
            logger.error("启动定时器失败!", e)
            false
        }
    }


    private fun doStart() {
        schedulerFactoryBean = SchedulerFactoryBean()
        schedulerFactoryBean.isAutoStartup = quartzProperties.isAutoStartup
        schedulerFactoryBean.setStartupDelay(quartzProperties.startupDelay.seconds.toInt())
        val properties = Properties()
        properties.putAll(quartzProperties.properties)
        schedulerFactoryBean.setQuartzProperties(properties)
        schedulerFactoryBean.setDataSource(routingDataSource)
        schedulerFactoryBean.afterPropertiesSet()

        val sysJobDto = SysJobDto()
        sysJobDto.instanceName = properties["org.quartz.scheduler.instanceName"].toString()
        val findList = this.findList(sysJobDto)
        findList.forEach {
            if (it.status == "1") {
//                this.delete()
            } else {
                this.save(this.jobFactory.convertBoToDto(it))
            }
        }
        this.schedulerFactoryBean.start()
    }

    fun getScheduler(): Scheduler {
        return schedulerFactoryBean.scheduler
    }

    override fun stop() {

    }

    override fun isRunning(): Boolean {
        try {
            if (isRunning && !this.getScheduler().isInStandbyMode && this.getScheduler().isStarted) {
                return true;
            }
        } catch (e: Exception) {
            logger.error("获取定时器状态时失败!", e)
            return false
        }
        return false
    }

    override fun findList(dto: SysJobDto): List<SysJob> {
        val jobs = ArrayList<SysJob>()
        if (this.schedulerFactoryBean != null) {
            val scheduler = this.getScheduler()
            scheduler.triggerGroupNames.forEach {
                val triggerKeys = scheduler.getTriggerKeys(GroupMatcher.groupEquals<TriggerKey>(it))
                triggerKeys.forEach { triggerKey ->
                    val trigger = scheduler.getTrigger(triggerKey)
                    if (trigger is CronTriggerImpl) {
                        val sysJob = SysJob()
                        sysJob.convert(sysJob, trigger)
                        jobs.add(sysJob)
                    }
                }
            }
        }
        return jobs
    }

    @Transactional
    @Modifying
    override fun runOnce(sysJob: SysJob) {
        if (schedulerFactoryBean != null) {
            try {
                val triggerKey = TriggerKey.triggerKey(sysJob.id?.jobName, sysJob.id?.jobGroup)
                val trigger = getScheduler().getTrigger(triggerKey)
                getScheduler().triggerJob(trigger.jobKey)
            } catch (e: SchedulerException) {
                throw ServiceException("运行一次失败", e)
            }
        }
    }

    override fun convertFactory(): JobFactory {
        return jobFactory
    }


    override fun save(dto: SysJobDto): SysJob {
        return repository.save(this.jobFactory.convertDtoToBo(dto))
    }

    override fun where(
        dto: SysJobDto,
        root: Root<SysJob>,
        criteriaQuery: CriteriaQuery<*>,
        cb: CriteriaBuilder,
        predicates: MutableList<Predicate>
    ) {
    }
}