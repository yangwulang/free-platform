package top.yangwulang.platform.entity;

import top.yangwulang.platform.entity.message.MessageRecordTable;
import top.yangwulang.platform.entity.message.MessageRecordUserTable;
import top.yangwulang.platform.entity.sys.AreaTable;
import top.yangwulang.platform.entity.sys.CompanyTable;
import top.yangwulang.platform.entity.sys.ConfigTable;
import top.yangwulang.platform.entity.sys.DictDataTable;
import top.yangwulang.platform.entity.sys.DictTypeTable;
import top.yangwulang.platform.entity.sys.EmployeeTable;
import top.yangwulang.platform.entity.sys.FileEntityTable;
import top.yangwulang.platform.entity.sys.FileUploadTable;
import top.yangwulang.platform.entity.sys.MenuTable;
import top.yangwulang.platform.entity.sys.OptionAnalysisTable;
import top.yangwulang.platform.entity.sys.PostTable;
import top.yangwulang.platform.entity.sys.RoleTable;
import top.yangwulang.platform.entity.sys.UserTable;

public interface Tables {
    MessageRecordTable MESSAGE_RECORD_TABLE = MessageRecordTable.$;

    MessageRecordUserTable MESSAGE_RECORD_USER_TABLE = MessageRecordUserTable.$;

    AreaTable AREA_TABLE = AreaTable.$;

    CompanyTable COMPANY_TABLE = CompanyTable.$;

    ConfigTable CONFIG_TABLE = ConfigTable.$;

    DictDataTable DICT_DATA_TABLE = DictDataTable.$;

    DictTypeTable DICT_TYPE_TABLE = DictTypeTable.$;

    EmployeeTable EMPLOYEE_TABLE = EmployeeTable.$;

    FileEntityTable FILE_ENTITY_TABLE = FileEntityTable.$;

    FileUploadTable FILE_UPLOAD_TABLE = FileUploadTable.$;

    MenuTable MENU_TABLE = MenuTable.$;

    OptionAnalysisTable OPTION_ANALYSIS_TABLE = OptionAnalysisTable.$;

    PostTable POST_TABLE = PostTable.$;

    RoleTable ROLE_TABLE = RoleTable.$;

    UserTable USER_TABLE = UserTable.$;
}
