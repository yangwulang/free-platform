package top.yangwulang.platform.controller.message;

import java.lang.System;

/**
 * @author yangwulang
 */
@lombok.extern.slf4j.Slf4j
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007J\u0012\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0007R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0010"}, d2 = {"Ltop/yangwulang/platform/controller/message/MessageRecordController;", "", "()V", "messageRecordService", "Ltop/yangwulang/platform/services/MessageRecordService;", "getMessageRecordService", "()Ltop/yangwulang/platform/services/MessageRecordService;", "setMessageRecordService", "(Ltop/yangwulang/platform/services/MessageRecordService;)V", "getCurrentUserMessageRecord", "", "Ltop/yangwulang/platform/entity/message/dto/MessageRecordListView;", "readMessageRecord", "", "readMessageRecordInput", "Ltop/yangwulang/platform/entity/message/input/BatchReadMessageRecordInput;", "free-platform-framework"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"${adminPath}/message"})
@org.springframework.web.bind.annotation.RestController
@io.swagger.v3.oas.annotations.tags.Tags(value = {@io.swagger.v3.oas.annotations.tags.Tag(name = "\u6d88\u606f\u7ba1\u7406"), @io.swagger.v3.oas.annotations.tags.Tag(name = "\u6d88\u606f\u8bb0\u5f55")})
public final class MessageRecordController {
    @org.springframework.beans.factory.annotation.Autowired
    public top.yangwulang.platform.services.MessageRecordService messageRecordService;
    
    public MessageRecordController() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final top.yangwulang.platform.services.MessageRecordService getMessageRecordService() {
        return null;
    }
    
    public final void setMessageRecordService(@org.jetbrains.annotations.NotNull
    top.yangwulang.platform.services.MessageRecordService p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @io.swagger.v3.oas.annotations.Operation(summary = "\u83b7\u53d6\u5f53\u524d\u7528\u6237\u6d88\u606f")
    @org.springframework.web.bind.annotation.PostMapping(value = {"/list"})
    public final java.util.List<top.yangwulang.platform.entity.message.dto.MessageRecordListView> getCurrentUserMessageRecord() {
        return null;
    }
    
    @org.springframework.web.bind.annotation.PostMapping(value = {"/read"})
    @io.swagger.v3.oas.annotations.Operation(summary = "\u5df2\u8bfb\u5f53\u524d\u7528\u6237\u6307\u5b9a\u7684\u6d88\u606f")
    public final void readMessageRecord(@org.jetbrains.annotations.NotNull
    @org.springframework.validation.annotation.Validated
    @org.springframework.web.bind.annotation.RequestBody
    top.yangwulang.platform.entity.message.input.BatchReadMessageRecordInput readMessageRecordInput) {
    }
}