package top.yangwulang.platform.utils;

import cn.hutool.extra.spring.SpringUtil;
import org.jetbrains.annotations.NotNull;
import top.yangwulang.platform.entity.sys.FileUploadDraft;
import top.yangwulang.platform.entity.TypeBase;
import top.yangwulang.platform.exception.ServiceException;
import top.yangwulang.platform.services.FileUploadService;

import java.util.Collection;
import java.util.Objects;

/**
 * @author yangwulang
 */
public class FileUploadUtils {
    private static final class Static {
        public static final FileUploadService FILE_UPLOAD_SERVICE = SpringUtil.getBean(FileUploadService.class);
    }

    /**
     * 保存上传的附件，绑定业务实体
     *
     * @param fileUploadIds 文件上传的所有id
     * @param baseEntity    绑定的实体，这个实体中一定要携带id
     * @param bizType       业务类型
     */
    public static void saveUploadFile(Collection<String> fileUploadIds, TypeBase baseEntity, @NotNull String bizType) {
        saveUploadFile(fileUploadIds, null, baseEntity, bizType);
    }

    /**
     * 保存上传的附件，绑定业务实体
     *
     * @param fileUploadIds       文件上传的所有id
     * @param deleteFileUploadIds 删除了的文件上传id
     * @param baseEntity          绑定的实体，这个实体中一定要携带id
     * @param bizType             业务类型
     */
    public static void saveUploadFile(
            Collection<String> fileUploadIds,
            Collection<String> deleteFileUploadIds,
            TypeBase baseEntity,
            @NotNull String bizType
    ) {
        saveUploadFile(fileUploadIds, deleteFileUploadIds, baseEntity.id(), bizType);
    }


    /**
     * 保存上传的附件，绑定业务实体
     *
     * @param fileUploadIds       文件上传的所有id
     * @param deleteFileUploadIds 删除了的文件上传id
     * @param baseEntityId        绑定的实体id
     * @param bizType             业务类型
     */
    public static void saveUploadFile(
            Collection<String> fileUploadIds,
            Collection<String> deleteFileUploadIds,
            String baseEntityId,
            @NotNull String bizType
    ) {
        if (fileUploadIds == null) {
            throw new ServiceException("上传的附件id不能为空!");
        }
        Static.FILE_UPLOAD_SERVICE.saveAll(
                fileUploadIds.stream()
                        .map(Static.FILE_UPLOAD_SERVICE::findNullable)
                        .filter(Objects::nonNull)
                        .filter(it -> bizType.equals(it.bizType()))
                        .map(it ->
                                FileUploadDraft.$.produce(it, draft -> draft.setBizKey(baseEntityId))
                        )
                        .toList()
        );
        if (deleteFileUploadIds != null) {
            Static.FILE_UPLOAD_SERVICE.deleteAllById(deleteFileUploadIds);
        }
    }


}
