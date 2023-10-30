package top.yangwulang.platform.services.impl

import cn.hutool.crypto.digest.MD5
import jakarta.servlet.http.HttpServletResponse
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.multipart.MultipartFile
import top.yangwulang.platform.config.fileupload.FileUploadProperties
import top.yangwulang.platform.entity.sys.FileEntityDraft
import top.yangwulang.platform.entity.sys.FileUpload
import top.yangwulang.platform.entity.sys.FileUploadDraft
import top.yangwulang.platform.exception.FileUploadError
import top.yangwulang.platform.exception.ServiceException
import top.yangwulang.platform.repository.sys.FileUploadRepository
import top.yangwulang.platform.services.FileEntityService
import top.yangwulang.platform.services.FileUploadService
import top.yangwulang.platform.services.OssFileUploadService
import java.io.InputStream
import java.lang.Exception

/**
 * @author yangwulang
 */
@Service
open class FileUploadServiceImpl(
    @Autowired repository: FileUploadRepository?,
    @Autowired protected val ossFileUploadService: OssFileUploadService,
    protected val properties: FileUploadProperties
) : BaseServiceImpl<FileUpload?, String?, FileUploadRepository?>(repository), FileUploadService {
    override fun bucketExists(bucketName: String): Boolean {
        uploadValid()
        return ossFileUploadService.bucketExists(bucketName)
    }

    override fun makeBucket(bucketName: String) {
        uploadValid()
        ossFileUploadService.makeBucket(bucketName)
    }

    override fun putObject(bucketName: String, objectName: String, filename: String) {
        uploadValid()
        ossFileUploadService.putObject(bucketName, objectName, filename)
    }

    override fun putObject(bucketName: String, objectName: String, stream: InputStream, contentType: String) {
        uploadValid()
        ossFileUploadService.putObject(bucketName, objectName, stream, contentType)
    }

    @Transactional(rollbackFor = [Exception::class])
    override fun putObject(bucketName: String, multipartFile: MultipartFile, filename: String, bizType: String) : FileUpload {
        uploadValid()
        val md5 = MD5.create().digestHex(multipartFile.bytes)
        val fileEntity = FileEntityDraft.`$`.produce {
            it.setFileMd5(md5)
                .setFilePath("\\${bucketName}\\${filename}")
                .setFileContentType("1")
        }
        val fileUpload = this.save(FileUploadDraft.`$`.produce {
            it.setFileEntity(fileEntity)
                .setFileName(filename)
                .setFileType(FileUpload.FILE_TYPE_FILE)
                .setBizType(bizType)
        })
        ossFileUploadService.putObject(bucketName, multipartFile, filename)
        return fileUpload
    }

    override fun removeObject(bucketName: String, filePath: String): Boolean {
        uploadValid()
        return ossFileUploadService.removeObject(bucketName, filePath)
    }

    override fun downloadFile(
        bucketName: String,
        filePath: String,
        originalName: String,
        response: HttpServletResponse
    ): Boolean {
        uploadValid()
        return ossFileUploadService.downloadFile(bucketName, filePath, originalName, response)
    }

    override fun getObjectUrl(bucketName: String, objectName: String): String {
        uploadValid()
        return ossFileUploadService.getObjectUrl(bucketName, objectName)
    }

    /**
     * 上传校验
     */
    private fun uploadValid() {
        if (!properties.isEnable) {
            throw ServiceException(FileUploadError.NOT_ENABLE_UPLOAD_FILE)
        }
    }
}
