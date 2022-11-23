create table sys_user
(
    user_code             varchar(100)                    not null comment '用户编码'
        primary key,
    login_code            varchar(100)                    not null comment '登录账号',
    user_name             varchar(100)                    not null comment '用户昵称',
    password              varchar(200)                    not null comment '登录密码',
    email                 varchar(300)                    null comment '电子邮箱',
    mobile                varchar(100)                    null comment '手机号码',
    phone                 varchar(100)                    null comment '办公电话',
    sex                   char                            null comment '用户性别',
    avatar                varchar(1000)                   null comment '头像路径',
    sign                  varchar(200)                    null comment '个性签名',
    wx_openid             varchar(100)                    null comment '绑定的微信号',
    mobile_imei           varchar(100)                    null comment '绑定的手机串号',
    user_type             varchar(16)                     not null comment '用户类型',
    ref_code              varchar(64)                     null comment '用户类型引用编号',
    ref_name              varchar(100)                    null comment '用户类型引用姓名',
    mgr_type              char                            not null comment '管理员类型（0非管理员 1系统管理员  2二级管理员）',
    pwd_security_level    decimal(1)                      null comment '密码安全级别（0初始 1很弱 2弱 3安全 4很安全）',
    pwd_update_date       datetime                        null comment '密码最后更新时间',
    pwd_update_record     varchar(1000)                   null comment '密码修改记录',
    pwd_question          varchar(200)                    null comment '密保问题',
    pwd_question_answer   varchar(200)                    null comment '密保问题答案',
    pwd_question_2        varchar(200)                    null comment '密保问题2',
    pwd_question_answer_2 varchar(200)                    null comment '密保问题答案2',
    pwd_question_3        varchar(200)                    null comment '密保问题3',
    pwd_question_answer_3 varchar(200)                    null comment '密保问题答案3',
    pwd_quest_update_date datetime                        null comment '密码问题修改时间',
    last_login_ip         varchar(100)                    null comment '最后登陆IP',
    last_login_date       datetime                        null comment '最后登陆时间',
    freeze_date           datetime                        null comment '冻结时间',
    freeze_cause          varchar(200)                    null comment '冻结原因',
    user_weight           decimal(8)   default 0          null comment '用户权重（降序）',
    status                char                            not null comment '状态（0正常 1删除 2停用 3冻结）',
    create_by             varchar(64)                     not null comment '创建者',
    create_date           datetime                        not null comment '创建时间',
    update_by             varchar(64)                     not null comment '更新者',
    update_date           datetime                        not null comment '更新时间',
    remarks               varchar(500)                    null comment '备注信息',
    corp_code             varchar(64)  default '0'        not null comment '租户代码',
    corp_name             varchar(100) default 'platform' not null comment '租户名称'
) comment '用户表';

create index idx_sys_user_cc
    on sys_user (corp_code);

create index idx_sys_user_email
    on sys_user (email);

create index idx_sys_user_imei
    on sys_user (mobile_imei);

create index idx_sys_user_lc
    on sys_user (login_code);

create index idx_sys_user_mobile
    on sys_user (mobile);

create index idx_sys_user_mt
    on sys_user (mgr_type);

create index idx_sys_user_rc
    on sys_user (ref_code);

create index idx_sys_user_rt
    on sys_user (user_type);

create index idx_sys_user_status
    on sys_user (status);

create index idx_sys_user_ud
    on sys_user (update_date);

create index idx_sys_user_us
    on sys_user (user_weight);

create index idx_sys_user_wo
    on sys_user (wx_openid);


create table sys_role
(
    role_code   varchar(64)                    not null comment '角色编码'
        primary key,
    role_name   varchar(100)                   not null comment '角色名称',
    role_type   varchar(100)                   null comment '角色分类（高管、中层、基层、其它）',
    role_sort   decimal                        null comment '角色排序（升序）',
    is_sys      char                           null comment '系统内置（1是 0否）',
    user_type   varchar(16)                    null comment '用户类型（employee员工 member会员）',
    data_scope  char                           null comment '数据范围设置（0未设置  1全部数据 2自定义数据）',
    biz_scope   varchar(255)                   null comment '适应业务范围（不同的功能，不同的数据权限支持）',
    status      char         default '0'       not null comment '状态（0正常 1删除 2停用）',
    create_by   varchar(64)                    not null comment '创建者',
    create_date datetime                       not null comment '创建时间',
    update_by   varchar(64)                    not null comment '更新者',
    update_date datetime                       not null comment '更新时间',
    remarks     varchar(500)                   null comment '备注信息',
    corp_code   varchar(64)  default '0'       not null comment '租户代码',
    corp_name   varchar(100) default 'platform' not null comment '租户名称'
)
    comment '角色表';

create index idx_sys_role_cc
    on sys_role (corp_code);

create index idx_sys_role_is
    on sys_role (is_sys);

create index idx_sys_role_rs
    on sys_role (role_sort);

create index idx_sys_role_status
    on sys_role (status);

