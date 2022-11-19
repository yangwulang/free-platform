create table book_sync_log
(
    id           varchar(64)   not null comment '章节内容同步日志主键',
    biz_key      varchar(64)   null comment '业务主键',
    sync_message varchar(300)  null comment '同步消息',
    sync_status  varchar(500)  null comment '同步状态',
    sync_path    varchar(500)  null,
    sync_error   varchar(1000) null,
    sync_date    datetime      null comment '同步时间',
    constraint book_sync_log_pk
        primary key (id)
)
    comment '章节内容同步日志';

