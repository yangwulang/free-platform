create table sys_dict_type
(
    id          varchar(64)         not null comment '字典类型编码' primary key,
    dict_name   varchar(100)        not null comment '字典名称',
    dict_type   varchar(100)        not null comment '字典类型',
    is_sys      char(1)             not null comment '是否系统字典',
    status      char(1) DEFAULT '0' NOT NULL COMMENT '状态（0正常 1删除 2停用）',
    create_by   varchar(64)         NOT NULL COMMENT '创建者',
    create_date datetime            NOT NULL COMMENT '创建时间',
    update_by   varchar(64)         NOT NULL COMMENT '更新者',
    update_date datetime            NOT NULL COMMENT '更新时间',
    remarks     varchar(500) COMMENT '备注信息'
) COMMENT = '字典类型表';

CREATE TABLE sys_dict_data
(
    id varchar(64) NOT NULL COMMENT '字典编码' primary key ,
    pid varchar(64) NOT NULL COMMENT '父级编号',
    dict_type_id varchar(64) NOT NULL COMMENT '字典类型主键',
    parent_codes varchar(1000) NOT NULL COMMENT '所有父级编号',
    tree_sort decimal(10) NOT NULL COMMENT '本级排序号（升序）',
    tree_sorts varchar(1000) NOT NULL COMMENT '所有级别排序号',
    tree_leaf char(1) NOT NULL COMMENT '是否最末级',
    tree_level decimal(4) NOT NULL COMMENT '层次级别',
    tree_names varchar(1000) NOT NULL COMMENT '全节点名',
    dict_label varchar(100) NOT NULL COMMENT '字典标签',
    dict_value varchar(100) NOT NULL COMMENT '字典键值',
    is_sys char(1) NOT NULL COMMENT '系统内置（1是 0否）',
    description varchar(500) COMMENT '字典描述',
    css_style varchar(500) COMMENT 'css样式（如：color:red)',
    css_class varchar(500) COMMENT 'css类名（如：red）',
    status char(1) DEFAULT '0' NOT NULL COMMENT '状态（0正常 1删除 2停用）',
    create_by varchar(64) NOT NULL COMMENT '创建者',
    create_date datetime NOT NULL COMMENT '创建时间',
    update_by varchar(64) NOT NULL COMMENT '更新者',
    update_date datetime NOT NULL COMMENT '更新时间',
    remarks varchar(500) COMMENT '备注信息',
    corp_code varchar(64) DEFAULT '0' NOT NULL COMMENT '租户代码',
    corp_name varchar(100) DEFAULT 'platform' NOT NULL COMMENT '租户名称',
    constraint sys_dict_data_type_fk
        foreign key (dict_type_id) references sys_dict_type (id)
) COMMENT = '字典数据表';

create table sys_menu
(
    id             varchar(64)                   NOT NULL COMMENT '菜单编码' primary key,
    pid            varchar(64)                   NOT NULL COMMENT '父级编号',
    parent_codes   varchar(1000)                 NOT NULL COMMENT '所有父级编号',
    tree_sort      decimal(10)                   NOT NULL COMMENT '本级排序号（升序）',
    tree_sorts     varchar(1000)                 NOT NULL COMMENT '所有级别排序号',
    tree_leaf      char(1)                       NOT NULL COMMENT '是否最末级',
    tree_level     decimal(4)                    NOT NULL COMMENT '层次级别',
    tree_names     varchar(1000)                 NOT NULL COMMENT '全节点名',
    menu_name      varchar(100)                  NOT NULL COMMENT '菜单名称',
    menu_type      char(1)                       NOT NULL COMMENT '菜单类型（1菜单 2权限 3开发）',
    menu_href      varchar(1000) COMMENT '链接',
    menu_component varchar(1000) comment '组件地址',
    menu_target    varchar(20) COMMENT '目标',
    menu_icon      varchar(100) COMMENT '图标',
    menu_color     varchar(50) COMMENT '颜色',
    menu_title     varchar(100) COMMENT '菜单标题',
    permission     varchar(1000) COMMENT '权限标识',
    weight         decimal(4) COMMENT '菜单权重',
    is_show        char(1)                       NOT NULL COMMENT '是否显示（1显示 0隐藏）',
    sys_code       varchar(64) default 'default' NOT NULL COMMENT '归属系统（default:主导航菜单、mobileApp:APP菜单）',
    status         char(1)     DEFAULT '0'       NOT NULL COMMENT '状态（0正常 1删除 2停用）',
    create_by      varchar(64)                   NOT NULL COMMENT '创建者',
    create_date    datetime                      NOT NULL COMMENT '创建时间',
    update_by      varchar(64)                   NOT NULL COMMENT '更新者',
    update_date    datetime                      NOT NULL COMMENT '更新时间',
    remarks        varchar(500) COMMENT '备注信息'
) COMMENT = '菜单表';