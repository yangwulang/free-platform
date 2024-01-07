create table sys_message_record
(
    id           varchar(64)   not null,
    type         varchar(500)  not null comment '类型',
    title        varchar(500)  not null comment '消息标题',
    sub_title    varchar(500)  not null comment '子标题',
    avatar       varchar(500) null comment '消息icon',
    content      varchar(1000) not null comment '消息内容',
    message_type int           not null comment '消息类型',
    status       int           not null comment '状态' default 0,
    constraint sys_message_record_pk
        primary key (id)
);

create table sys_message_record_user
(
    id        varchar(64)   not null,
    record_id varchar(64)   null comment '记录id',
    user_id   varchar(67)   null comment '用户id',
    is_read   int default 0 not null comment '是否已读',
    constraint sys_message_record_user_pk
        primary key (id)
)
    comment '用户消息记录';

alter table sys_message_record_user
    add constraint sys_message_record_user_sys_message_record_id_fk
        foreign key (record_id) references sys_message_record (id);

alter table sys_message_record_user
    add constraint sys_message_record_user_sys_user_user_code_fk
        foreign key (user_id) references sys_user (user_code);




