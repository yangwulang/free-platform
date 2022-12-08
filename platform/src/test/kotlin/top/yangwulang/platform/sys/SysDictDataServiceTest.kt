package top.yangwulang.platform.sys

import org.junit.jupiter.api.Test
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.annotation.Rollback
import top.yangwulang.platform.entity.sys.SysDictData
import top.yangwulang.platform.entity.sys.SysDictType
import top.yangwulang.platform.services.sys.SysDictDataService
import top.yangwulang.platform.services.sys.SysDictTypeService


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SysDictDataServiceTest {

    private val logger: Logger = LoggerFactory.getLogger(SysDictDataServiceTest::class.java)

    @Autowired
    private lateinit var sysDictDataService: SysDictDataService

    @Autowired
    private lateinit var sysDictTypeService: SysDictTypeService


    @Test
    fun testGet() {
        val findById = sysDictDataService.findById("00")
        logger.info(" {} ", findById)
    }

    @Test
    fun testDictType() {
        val sysDictType = SysDictType()
        sysDictType.dictType = "test"
        sysDictType.dictName = "测试"
        sysDictType.isSys = "1"
        sysDictType.status = "0"
        sysDictTypeService.save(sysDictType)
    }

    @Test
    @Rollback(value = false)
    fun saveData() {
        val sysDictType = sysDictTypeService.findById("1597580141086216192")
//        val parent = SysDictData()
//        parent.id = "0"

        val sysDictData = SysDictData()
        sysDictData.isSys = "1"
        sysDictData.dictLabel = "测试"
        sysDictData.dictValue = "1234"
//        sysDictData.parentCodes = "0,"
        sysDictData.status = "0"
//        sysDictData.treeNames = "sys.test"
//        sysDictData.treeSort = 30
//        sysDictData.treeSorts = "30,"
        sysDictData.corpCode = "lll"
        sysDictData.corpName = "222"
        sysDictData.treeLeaf = "1"
//        sysDictData.treeLevel = 1
        sysDictData.dictType = sysDictType


        val sysDictData2 = SysDictData()
        sysDictData2.parent = sysDictData
        sysDictData2.isSys = "1"
        sysDictData2.dictLabel = "测试123"
        sysDictData2.dictValue = "1234123"
//        sysDictData.parentCodes = "0,"
        sysDictData2.status = "0"
//        sysDictData.treeNames = "sys.test"
//        sysDictData.treeSort = 30
//        sysDictData.treeSorts = "30,"
        sysDictData2.corpCode = "lll"
        sysDictData2.corpName = "222"
        sysDictData2.treeLeaf = "1"
//        sysDictData.treeLevel = 1
        sysDictData2.dictType = sysDictType

        val sysDictData3 = SysDictData()
        sysDictData3.parent = sysDictData
        sysDictData3.isSys = "1"
        sysDictData3.dictLabel = "测试123qwe"
        sysDictData3.dictValue = "1234123qwe"
//        sysDictData.parentCodes = "0,"
        sysDictData3.status = "0"
//        sysDictData.treeNames = "sys.test"
//        sysDictData.treeSort = 30
//        sysDictData.treeSorts = "30,"
        sysDictData3.corpCode = "lll"
        sysDictData3.corpName = "222"
        sysDictData3.treeLeaf = "1"
//        sysDictData.treeLevel = 1
        sysDictData3.dictType = sysDictType

        sysDictData.children.add(sysDictData2)
        sysDictData.children.add(sysDictData3)

        sysDictDataService.save(sysDictData)
    }
}