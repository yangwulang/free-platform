package top.yangwulang.platform.entity;

import top.yangwulang.platform.entity.message.MessageRecordFetcher;
import top.yangwulang.platform.entity.message.MessageRecordUserFetcher;
import top.yangwulang.platform.entity.sys.AreaFetcher;
import top.yangwulang.platform.entity.sys.CompanyFetcher;
import top.yangwulang.platform.entity.sys.ConfigFetcher;
import top.yangwulang.platform.entity.sys.DictDataFetcher;
import top.yangwulang.platform.entity.sys.DictTypeFetcher;
import top.yangwulang.platform.entity.sys.EmployeeFetcher;
import top.yangwulang.platform.entity.sys.FileEntityFetcher;
import top.yangwulang.platform.entity.sys.FileUploadFetcher;
import top.yangwulang.platform.entity.sys.MenuFetcher;
import top.yangwulang.platform.entity.sys.OptionAnalysisFetcher;
import top.yangwulang.platform.entity.sys.PostFetcher;
import top.yangwulang.platform.entity.sys.RoleFetcher;
import top.yangwulang.platform.entity.sys.UserFetcher;

public interface Fetchers {
    MessageRecordFetcher MESSAGE_RECORD_FETCHER = MessageRecordFetcher.$;

    MessageRecordUserFetcher MESSAGE_RECORD_USER_FETCHER = MessageRecordUserFetcher.$;

    AreaFetcher AREA_FETCHER = AreaFetcher.$;

    CompanyFetcher COMPANY_FETCHER = CompanyFetcher.$;

    ConfigFetcher CONFIG_FETCHER = ConfigFetcher.$;

    DictDataFetcher DICT_DATA_FETCHER = DictDataFetcher.$;

    DictTypeFetcher DICT_TYPE_FETCHER = DictTypeFetcher.$;

    EmployeeFetcher EMPLOYEE_FETCHER = EmployeeFetcher.$;

    FileEntityFetcher FILE_ENTITY_FETCHER = FileEntityFetcher.$;

    FileUploadFetcher FILE_UPLOAD_FETCHER = FileUploadFetcher.$;

    MenuFetcher MENU_FETCHER = MenuFetcher.$;

    OptionAnalysisFetcher OPTION_ANALYSIS_FETCHER = OptionAnalysisFetcher.$;

    PostFetcher POST_FETCHER = PostFetcher.$;

    RoleFetcher ROLE_FETCHER = RoleFetcher.$;

    UserFetcher USER_FETCHER = UserFetcher.$;
}
