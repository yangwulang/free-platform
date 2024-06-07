package top.yangwulang.platform.entity;

import org.babyfish.jimmer.DraftConsumer;
import org.babyfish.jimmer.internal.GeneratedBy;
import top.yangwulang.platform.entity.message.MessageRecord;
import top.yangwulang.platform.entity.message.MessageRecordDraft;
import top.yangwulang.platform.entity.message.MessageRecordUser;
import top.yangwulang.platform.entity.message.MessageRecordUserDraft;
import top.yangwulang.platform.entity.sys.Area;
import top.yangwulang.platform.entity.sys.AreaDraft;
import top.yangwulang.platform.entity.sys.Company;
import top.yangwulang.platform.entity.sys.CompanyDraft;
import top.yangwulang.platform.entity.sys.Config;
import top.yangwulang.platform.entity.sys.ConfigDraft;
import top.yangwulang.platform.entity.sys.DictData;
import top.yangwulang.platform.entity.sys.DictDataDraft;
import top.yangwulang.platform.entity.sys.DictType;
import top.yangwulang.platform.entity.sys.DictTypeDraft;
import top.yangwulang.platform.entity.sys.Employee;
import top.yangwulang.platform.entity.sys.EmployeeDraft;
import top.yangwulang.platform.entity.sys.FileEntity;
import top.yangwulang.platform.entity.sys.FileEntityDraft;
import top.yangwulang.platform.entity.sys.FileUpload;
import top.yangwulang.platform.entity.sys.FileUploadDraft;
import top.yangwulang.platform.entity.sys.Menu;
import top.yangwulang.platform.entity.sys.MenuDraft;
import top.yangwulang.platform.entity.sys.OptionAnalysis;
import top.yangwulang.platform.entity.sys.OptionAnalysisDraft;
import top.yangwulang.platform.entity.sys.Post;
import top.yangwulang.platform.entity.sys.PostDraft;
import top.yangwulang.platform.entity.sys.Role;
import top.yangwulang.platform.entity.sys.RoleDraft;
import top.yangwulang.platform.entity.sys.User;
import top.yangwulang.platform.entity.sys.UserDraft;

@GeneratedBy
public interface Objects {
    static MessageRecord createMessageRecord(DraftConsumer<MessageRecordDraft> block) {
        return MessageRecordDraft.$.produce(block);
    }

    static MessageRecord createMessageRecord(MessageRecord base,
            DraftConsumer<MessageRecordDraft> block) {
        return MessageRecordDraft.$.produce(base, block);
    }

    static MessageRecordUser createMessageRecordUser(DraftConsumer<MessageRecordUserDraft> block) {
        return MessageRecordUserDraft.$.produce(block);
    }

    static MessageRecordUser createMessageRecordUser(MessageRecordUser base,
            DraftConsumer<MessageRecordUserDraft> block) {
        return MessageRecordUserDraft.$.produce(base, block);
    }

    static Area createArea(DraftConsumer<AreaDraft> block) {
        return AreaDraft.$.produce(block);
    }

    static Area createArea(Area base, DraftConsumer<AreaDraft> block) {
        return AreaDraft.$.produce(base, block);
    }

    static Company createCompany(DraftConsumer<CompanyDraft> block) {
        return CompanyDraft.$.produce(block);
    }

    static Company createCompany(Company base, DraftConsumer<CompanyDraft> block) {
        return CompanyDraft.$.produce(base, block);
    }

    static Config createConfig(DraftConsumer<ConfigDraft> block) {
        return ConfigDraft.$.produce(block);
    }

    static Config createConfig(Config base, DraftConsumer<ConfigDraft> block) {
        return ConfigDraft.$.produce(base, block);
    }

    static DictData createDictData(DraftConsumer<DictDataDraft> block) {
        return DictDataDraft.$.produce(block);
    }

    static DictData createDictData(DictData base, DraftConsumer<DictDataDraft> block) {
        return DictDataDraft.$.produce(base, block);
    }

    static DictType createDictType(DraftConsumer<DictTypeDraft> block) {
        return DictTypeDraft.$.produce(block);
    }

    static DictType createDictType(DictType base, DraftConsumer<DictTypeDraft> block) {
        return DictTypeDraft.$.produce(base, block);
    }

    static Employee createEmployee(DraftConsumer<EmployeeDraft> block) {
        return EmployeeDraft.$.produce(block);
    }

    static Employee createEmployee(Employee base, DraftConsumer<EmployeeDraft> block) {
        return EmployeeDraft.$.produce(base, block);
    }

    static FileEntity createFileEntity(DraftConsumer<FileEntityDraft> block) {
        return FileEntityDraft.$.produce(block);
    }

    static FileEntity createFileEntity(FileEntity base, DraftConsumer<FileEntityDraft> block) {
        return FileEntityDraft.$.produce(base, block);
    }

    static FileUpload createFileUpload(DraftConsumer<FileUploadDraft> block) {
        return FileUploadDraft.$.produce(block);
    }

    static FileUpload createFileUpload(FileUpload base, DraftConsumer<FileUploadDraft> block) {
        return FileUploadDraft.$.produce(base, block);
    }

    static Menu createMenu(DraftConsumer<MenuDraft> block) {
        return MenuDraft.$.produce(block);
    }

    static Menu createMenu(Menu base, DraftConsumer<MenuDraft> block) {
        return MenuDraft.$.produce(base, block);
    }

    static OptionAnalysis createOptionAnalysis(DraftConsumer<OptionAnalysisDraft> block) {
        return OptionAnalysisDraft.$.produce(block);
    }

    static OptionAnalysis createOptionAnalysis(OptionAnalysis base,
            DraftConsumer<OptionAnalysisDraft> block) {
        return OptionAnalysisDraft.$.produce(base, block);
    }

    static Post createPost(DraftConsumer<PostDraft> block) {
        return PostDraft.$.produce(block);
    }

    static Post createPost(Post base, DraftConsumer<PostDraft> block) {
        return PostDraft.$.produce(base, block);
    }

    static Role createRole(DraftConsumer<RoleDraft> block) {
        return RoleDraft.$.produce(block);
    }

    static Role createRole(Role base, DraftConsumer<RoleDraft> block) {
        return RoleDraft.$.produce(base, block);
    }

    static User createUser(DraftConsumer<UserDraft> block) {
        return UserDraft.$.produce(block);
    }

    static User createUser(User base, DraftConsumer<UserDraft> block) {
        return UserDraft.$.produce(base, block);
    }
}
