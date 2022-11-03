create table sys_job
(
    job_name            varchar(64)                            not null comment '任务名称',
    job_group           varchar(64)                            not null comment '任务组名',
    description         varchar(100)                           not null comment '任务描述',
    invoke_target       varchar(1000)                          not null comment '调用目标字符串',
    cron_expression     varchar(255)                           not null comment 'Cron执行表达式',
    misfire_instruction decimal(1)                             not null comment '计划执行错误策略',
    concurrent          char                                   not null comment '是否并发执行',
    instance_name       varchar(64) default 'JeeSiteScheduler' not null comment '集群的实例名字',
    status              char                                   not null comment '状态（0正常 1删除 2暂停）',
    create_by           varchar(64)                            not null comment '创建者',
    create_date         datetime                               not null comment '创建时间',
    update_by           varchar(64)                            not null comment '更新者',
    update_date         datetime                               not null comment '更新时间',
    remarks             varchar(500)                           null comment '备注信息',
    primary key (job_name, job_group)
)
    comment '作业调度表' collate = utf8mb4_0900_ai_ci;

create index idx_sys_job_status
    on sys_job (status);

create table sys_job_log
(
    id             varchar(64)  not null comment '编号'
        primary key,
    job_name       varchar(64)  not null comment '任务名称',
    job_group      varchar(64)  not null comment '任务组名',
    job_type       varchar(50)  null comment '日志类型',
    job_event      varchar(200) null comment '日志事件',
    job_message    varchar(500) null comment '日志信息',
    is_exception   char         null comment '是否异常',
    exception_info text         null comment '异常信息',
    create_date    datetime     null comment '创建时间'
)
    comment '作业调度日志表' collate = utf8mb4_0900_ai_ci;

create index idx_sys_job_log_e
    on sys_job_log (job_event);

create index idx_sys_job_log_ie
    on sys_job_log (is_exception);

create index idx_sys_job_log_jg
    on sys_job_log (job_group);

create index idx_sys_job_log_jn
    on sys_job_log (job_name);

create index idx_sys_job_log_t
    on sys_job_log (job_type);



