CREATE TABLE `sys_area`
(
    `id`          varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NOT NULL COMMENT '区域编码',
    `pid`         varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NULL     DEFAULT NULL COMMENT '父级编号',
    `area_name`   varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '名称',
    `sort`        decimal(10, 0)                                                NOT NULL COMMENT '排序',
    `area_type`   char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci      NULL     DEFAULT NULL COMMENT '区域类型',
    `create_by`   varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NOT NULL COMMENT '创建者',
    `create_date` datetime(0)                                                   NOT NULL COMMENT '创建时间',
    `update_by`   varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NOT NULL COMMENT '更新者',
    `update_date` datetime(0)                                                   NOT NULL COMMENT '更新时间',
    `remarks`     varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL     DEFAULT NULL COMMENT '备注信息',
    `status`      char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci      NOT NULL DEFAULT '0' COMMENT '状态',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT = '区域表'
  ROW_FORMAT = Dynamic;

CREATE TABLE `sys_config`
(
    `id`           varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci   NOT NULL COMMENT '编号',
    `config_name`  varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NOT NULL COMMENT '名称',
    `config_key`   varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NOT NULL COMMENT '参数键',
    `config_value` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '参数值',
    `create_by`    varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci   NOT NULL COMMENT '创建者',
    `create_date`  datetime(0)                                                    NOT NULL COMMENT '创建时间',
    `update_by`    varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci   NOT NULL COMMENT '更新者',
    `update_date`  datetime(0)                                                    NOT NULL COMMENT '更新时间',
    `remarks`      varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NULL DEFAULT NULL COMMENT '备注信息',
    PRIMARY KEY (`id`) USING BTREE,
    UNIQUE INDEX `idx_sys_config_key` (`config_key`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT = '参数配置表'
  ROW_FORMAT = Dynamic;

INSERT INTO `sys_config`
VALUES ('1648339399024902144', 'askldfns', 'test.test', 'dddd', '1614867934644609024', '2023-04-18 22:55:10',
        '1614867934644609024', '2023-04-18 22:55:11', '');
INSERT INTO `sys_config` (id, config_name, config_key, config_value, create_by, create_date, update_by, update_date,
                          remarks)
VALUES ('1708320311583735808', '用户默认密码', 'sys.defaultPassword', '123456', '1614867934644609024',
        '2023-10-01 03:17:56', '1614867934644609024', '2023-10-01 03:18:20',
        '默认的用户密码，管理员重置密码也是读取的此处');
INSERT INTO `sys_config` (id, config_name, config_key, config_value, create_by, create_date, update_by, update_date,
                          remarks)
VALUES ('1708351447915675648', '是否使用默认密码', 'sys.useDefaultPassword', 'true', '1614867934644609024',
        '2023-10-01 05:21:39', '1614867934644609024', '2023-10-01 05:30:19', null);



CREATE TABLE `sys_dict_type`
(
    `id`          varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NOT NULL COMMENT '字典类型编码',
    `dict_name`   varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '字典名称',
    `dict_type`   varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '字典类型',
    `is_sys`      char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci      NOT NULL COMMENT '是否系统字典',
    `status`      char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci      NOT NULL DEFAULT '0' COMMENT '状态（0正常 1删除 2停用）',
    `create_by`   varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NOT NULL COMMENT '创建者',
    `create_date` datetime(0)                                                   NOT NULL COMMENT '创建时间',
    `update_by`   varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NOT NULL COMMENT '更新者',
    `update_date` datetime(0)                                                   NOT NULL COMMENT '更新时间',
    `remarks`     varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL     DEFAULT NULL COMMENT '备注信息',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT = '字典类型表'
  ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_dict_type
-- ----------------------------
INSERT INTO `sys_dict_type`
VALUES ('1597580141086216192', '测试', 'test', '1', '0', '测试', '2022-11-29 13:16:00', '测试', '2022-11-29 13:16:00',
        NULL);


CREATE TABLE `sys_dict_data`
(
    `id`           varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NOT NULL COMMENT '字典编码',
    `pid`          varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NULL     DEFAULT NULL,
    `dict_type_id` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NOT NULL COMMENT '字典类型主键',
    `dict_label`   varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '字典标签',
    `dict_value`   varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '字典键值',
    `is_sys`       char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci      NOT NULL COMMENT '系统内置（1是 0否）',
    `description`  varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL     DEFAULT NULL COMMENT '字典描述',
    `css_style`    varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL     DEFAULT NULL COMMENT 'css样式（如：color:red)',
    `css_class`    varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL     DEFAULT NULL COMMENT 'css类名（如：red）',
    `status`       char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci      NOT NULL DEFAULT '0' COMMENT '状态（0正常 1删除 2停用）',
    `create_by`    varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NOT NULL COMMENT '创建者',
    `create_date`  datetime(0)                                                   NOT NULL COMMENT '创建时间',
    `update_by`    varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NOT NULL COMMENT '更新者',
    `update_date`  datetime(0)                                                   NOT NULL COMMENT '更新时间',
    `remarks`      varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL     DEFAULT NULL COMMENT '备注信息',
    `corp_code`    varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NOT NULL DEFAULT '0' COMMENT '租户代码',
    `corp_name`    varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT 'platform' COMMENT '租户名称',
    PRIMARY KEY (`id`) USING BTREE,
    INDEX `sys_dict_data_type_fk` (`dict_type_id`) USING BTREE,
    CONSTRAINT `sys_dict_data_type_fk` FOREIGN KEY (`dict_type_id`) REFERENCES `sys_dict_type` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT = '字典数据表'
  ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_dict_data
-- ----------------------------
INSERT INTO `sys_dict_data`
VALUES ('1630928173258579968', NULL, '1597580141086216192', 'we', 'we', '0', NULL, 'fdg', 'zx', '0',
        '1614867934644609024', '2023-03-01 21:49:12', '1614867934644609024', '2023-06-03 09:50:26', NULL, '0',
        'platform');
INSERT INTO `sys_dict_data`
VALUES ('1663866758538797056', NULL, '1597580141086216192', 'fdfg', 'weqre', '0', 'r', 'rr', 'rr', '0',
        '1614867934644609024', '2023-05-31 11:15:23', '1614867934644609024', '2023-05-31 11:26:12', NULL, '0',
        'platform');
INSERT INTO `sys_dict_data`
VALUES ('1680209260908765184', NULL, '1597580141086216192', 'ddd', 'ddd', '0', NULL, 'd', 'd', '0',
        '1614867934644609024', '2023-07-15 13:34:37', '1614867934644609024', '2023-07-15 13:34:37', NULL, '0',
        'platform');

CREATE TABLE `sys_job`
(
    `job_name`            varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci   NOT NULL COMMENT '任务名称',
    `job_group`           varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci   NOT NULL COMMENT '任务组名',
    `description`         varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NOT NULL COMMENT '任务描述',
    `invoke_target`       varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '调用目标字符串',
    `cron_expression`     varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NOT NULL COMMENT 'Cron执行表达式',
    `misfire_instruction` decimal(1, 0)                                                  NOT NULL COMMENT '计划执行错误策略',
    `concurrent`          char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci       NOT NULL COMMENT '是否并发执行',
    `instance_name`       varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci   NOT NULL DEFAULT 'JeeSiteScheduler' COMMENT '集群的实例名字',
    `status`              char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci       NOT NULL COMMENT '状态（0正常 1删除 2暂停）',
    `create_by`           varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci   NOT NULL COMMENT '创建者',
    `create_date`         datetime(0)                                                    NOT NULL COMMENT '创建时间',
    `update_by`           varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci   NOT NULL COMMENT '更新者',
    `update_date`         datetime(0)                                                    NOT NULL COMMENT '更新时间',
    `remarks`             varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NULL     DEFAULT NULL COMMENT '备注信息',
    PRIMARY KEY (`job_name`, `job_group`) USING BTREE,
    INDEX `idx_sys_job_status` (`status`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT = '作业调度表'
  ROW_FORMAT = Dynamic;

CREATE TABLE `sys_job_log`
(
    `id`             varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NOT NULL COMMENT '编号',
    `job_name`       varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NOT NULL COMMENT '任务名称',
    `job_group`      varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NOT NULL COMMENT '任务组名',
    `job_type`       varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NULL DEFAULT NULL COMMENT '日志类型',
    `job_event`      varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '日志事件',
    `job_message`    varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '日志信息',
    `is_exception`   char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci      NULL DEFAULT NULL COMMENT '是否异常',
    `exception_info` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci         NULL COMMENT '异常信息',
    `create_date`    datetime(0)                                                   NULL DEFAULT NULL COMMENT '创建时间',
    PRIMARY KEY (`id`) USING BTREE,
    INDEX `idx_sys_job_log_e` (`job_event`) USING BTREE,
    INDEX `idx_sys_job_log_ie` (`is_exception`) USING BTREE,
    INDEX `idx_sys_job_log_jg` (`job_group`) USING BTREE,
    INDEX `idx_sys_job_log_jn` (`job_name`) USING BTREE,
    INDEX `idx_sys_job_log_t` (`job_type`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT = '作业调度日志表'
  ROW_FORMAT = Dynamic;


CREATE TABLE `sys_menu`
(
    `id`             varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci   NOT NULL COMMENT '菜单编码',
    `pid`            varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci   NULL     DEFAULT NULL COMMENT '父级编号',
    `menu_name`      varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NOT NULL COMMENT '菜单名称',
    `menu_type`      char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci       NOT NULL COMMENT '菜单类型（1菜单 2权限 3开发）',
    `menu_href`      varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL     DEFAULT NULL COMMENT '链接',
    `menu_component` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL     DEFAULT NULL COMMENT '组件地址',
    `menu_target`    varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci   NULL     DEFAULT NULL COMMENT '目标',
    `menu_icon`      varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NULL     DEFAULT NULL COMMENT '图标',
    `menu_color`     varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci   NULL     DEFAULT NULL COMMENT '颜色',
    `menu_title`     varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NULL     DEFAULT NULL COMMENT '菜单标题',
    `permission`     varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL     DEFAULT NULL COMMENT '权限标识',
    `weight`         decimal(4, 0)                                                  NULL     DEFAULT NULL COMMENT '菜单权重',
    `is_show`        char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci       NOT NULL COMMENT '是否显示（1显示 0隐藏）',
    `sys_code`       varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci   NOT NULL DEFAULT 'default' COMMENT '归属系统（default:主导航菜单、mobileApp:APP菜单）',
    `status`         char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci       NOT NULL DEFAULT '0' COMMENT '状态（0正常 1删除 2停用）',
    `create_by`      varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci   NOT NULL COMMENT '创建者',
    `create_date`    datetime(0)                                                    NOT NULL COMMENT '创建时间',
    `update_by`      varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci   NOT NULL COMMENT '更新者',
    `update_date`    datetime(0)                                                    NOT NULL COMMENT '更新时间',
    `remarks`        varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NULL     DEFAULT NULL COMMENT '备注信息',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT = '菜单表'
  ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_menu
-- ----------------------------
INSERT INTO `sys_menu`
VALUES ('1477971894149484544', NULL, '系统管理', '1', '', NULL, '', 'icon-settings', '', NULL, '', 40, '1', 'default',
        '0', 'system', '2022-01-03 19:55:34', 'system', '2022-01-03 19:55:34', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971901036531712', '1477971894149484544', '组织管理', '1', '', NULL, '', 'icon-grid', '', NULL, '', 40, '1',
        'default', '0', 'system', '2022-01-03 19:55:35', 'system', '2022-01-03 19:55:35', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971901162360832', '1477971901036531712', '用户管理', '1', '/sys/empUser/index', NULL, '', 'icon-user', '',
        NULL, '', 40, '1', 'default', '0', 'system', '2022-01-03 19:55:35', 'system', '2022-01-03 19:55:35', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971901271412736', '1477971901162360832', '查看', '2', '', NULL, '', '', '', NULL, 'sys:empUser:view', 40,
        '1', 'default', '0', 'system', '2022-01-03 19:55:35', 'system', '2022-01-03 19:55:35', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971901405630464', '1477971901162360832', '编辑', '2', '', NULL, '', '', '', NULL, 'sys:empUser:edit', 40,
        '1', 'default', '0', 'system', '2022-01-03 19:55:35', 'system', '2022-01-03 19:55:35', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971901544042496', '1477971901162360832', '分配角色', '2', '', NULL, '', '', '', NULL,
        'sys:empUser:authRole', 40, '1', 'default', '0', 'system', '2022-01-03 19:55:35', 'system',
        '2022-01-03 19:55:35', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971901636317184', '1477971901162360832', '分配数据', '2', '', NULL, '', '', '', NULL,
        'sys:empUser:authDataScope', 40, '1', 'default', '0', 'system', '2022-01-03 19:55:35', 'system',
        '2022-01-03 19:55:35', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971901720203264', '1477971901162360832', '停用启用', '2', '', NULL, '', '', '', NULL,
        'sys:empUser:updateStatus', 40, '1', 'default', '0', 'system', '2022-01-03 19:55:35', 'system',
        '2022-01-03 19:55:35', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971901804089344', '1477971901162360832', '重置密码', '2', '', NULL, '', '', '', NULL,
        'sys:empUser:resetpwd', 40, '1', 'default', '0', 'system', '2022-01-03 19:55:35', 'system',
        '2022-01-03 19:55:35', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971901896364032', '1477971901036531712', '机构管理', '1', '/sys/office/index', NULL, '', 'icon-grid', '',
        NULL, '', 60, '1', 'default', '0', 'system', '2022-01-03 19:55:35', 'system', '2022-01-03 19:55:35', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971901997027328', '1477971901896364032', '查看', '2', '', NULL, '', '', '', NULL, 'sys:office:view', 60,
        '1', 'default', '0', 'system', '2022-01-03 19:55:35', 'system', '2022-01-03 19:55:35', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971902085107712', '1477971901896364032', '编辑', '2', '', NULL, '', '', '', NULL, 'sys:office:edit', 60,
        '1', 'default', '0', 'system', '2022-01-03 19:55:36', 'system', '2022-01-03 19:55:36', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971902168993792', '1477971901036531712', '公司管理', '1', '/sys/company/list', NULL, '', 'icon-fire', '',
        NULL, '', 60, '1', 'default', '0', 'system', '2022-01-03 19:55:36', 'system', '2022-01-03 19:55:36', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971902269657088', '1477971902168993792', '查看', '2', '', NULL, '', '', '', NULL, 'sys:company:view', 60,
        '1', 'default', '0', 'system', '2022-01-03 19:55:36', 'system', '2022-01-03 19:55:36', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971902353543168', '1477971902168993792', '编辑', '2', '', NULL, '', '', '', NULL, 'sys:company:edit', 60,
        '1', 'default', '0', 'system', '2022-01-03 19:55:36', 'system', '2022-01-03 19:55:36', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971902433234944', '1477971901036531712', '岗位管理', '1', '/sys/post/list', NULL, '', 'icon-trophy', '',
        NULL, '', 60, '1', 'default', '0', 'system', '2022-01-03 19:55:36', 'system', '2022-01-03 19:55:36', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971902517121024', '1477971902433234944', '查看', '2', '', NULL, '', '', '', NULL, 'sys:post:view', 60, '1',
        'default', '0', 'system', '2022-01-03 19:55:36', 'system', '2022-01-03 19:55:36', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971902609395712', '1477971902433234944', '编辑', '2', '', NULL, '', '', '', NULL, 'sys:post:edit', 60, '1',
        'default', '0', 'system', '2022-01-03 19:55:36', 'system', '2022-01-03 19:55:36', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971902676504576', '1477971894149484544', '权限管理', '1', '', NULL, '', 'icon-social-dropbox', '', NULL,
        '', 60, '1', 'default', '0', 'system', '2022-01-03 19:55:36', 'system', '2022-01-03 19:55:36', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971902756196352', '1477971902676504576', '角色管理', '1', '/sys/role/list', NULL, '', 'icon-people', '',
        NULL, 'sys:role', 60, '1', 'default', '0', 'system', '2022-01-03 19:55:36', 'system', '2022-01-03 19:55:36',
        NULL);
INSERT INTO `sys_menu`
VALUES ('1477971902831693824', '1477971902676504576', '二级管理员', '1', '/sys/secAdmin/list', NULL, '',
        'icon-user-female', '', NULL, 'sys:secAdmin', 60, '1', 'default', '0', 'system', '2022-01-03 19:55:36',
        'system', '2022-01-03 19:55:36', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971902894608384', '1477971902676504576', '系统管理员', '1', '/sys/corpAdmin/list', NULL, '', 'icon-badge',
        '', NULL, 'sys:corpAdmin', 80, '1', 'default', '0', 'system', '2022-01-03 19:55:36', 'system',
        '2022-01-03 19:55:36', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971903037214720', '1477971902676504576', '安全审计', '1', '/sys/audit/list', NULL, '', 'icon-energy', '',
        NULL, 'sys:audit', 80, '1', 'default', '0', 'system', '2022-01-03 19:55:36', 'system', '2022-01-03 19:55:36',
        NULL);
INSERT INTO `sys_menu`
VALUES ('1477971903234347008', '1477971894149484544', '系统设置', '1', '', NULL, '', 'icon-settings', '', NULL, '', 60,
        '1', 'default', '0', 'system', '2022-01-03 19:55:36', 'system', '2022-01-03 19:55:36', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971903427284992', '1477971903234347008', '菜单管理', '1', '/sys/menu/list', NULL, '', 'icon-book-open', '',
        NULL, 'sys:menu', 80, '1', 'default', '0', 'system', '2022-01-03 19:55:36', 'system', '2022-01-03 19:55:36',
        NULL);
INSERT INTO `sys_menu`
VALUES ('1477971903548919808', '1477971903234347008', '模块管理', '1', '/sys/module/list', NULL, '', 'icon-grid', '',
        NULL, 'sys:module', 80, '1', 'default', '0', 'system', '2022-01-03 19:55:36', 'system', '2022-01-03 19:55:36',
        NULL);
INSERT INTO `sys_menu`
VALUES ('1477971903678943232', '1477971903234347008', '参数设置', '1', '/sys/config/list', NULL, '', 'icon-wrench', '',
        NULL, 'sys:config', 60, '1', 'default', '0', 'system', '2022-01-03 19:55:36', 'system', '2022-01-03 19:55:36',
        NULL);
INSERT INTO `sys_menu`
VALUES ('1477971903813160960', '1477971903234347008', '字典管理', '1', '/sys/dictType/list', NULL, '',
        'icon-social-dropbox', '', NULL, '', 60, '1', 'default', '0', 'system', '2022-01-03 19:55:36', 'system',
        '2022-01-03 19:55:36', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971903930601472', '1477971903813160960', '类型查看', '2', '', NULL, '', '', '', NULL, 'sys:dictType:view',
        60, '1', 'default', '0', 'system', '2022-01-03 19:55:36', 'system', '2022-01-03 19:55:36', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971904022876160', '1477971903813160960', '类型编辑', '2', '', NULL, '', '', '', NULL, 'sys:dictType:edit',
        80, '1', 'default', '0', 'system', '2022-01-03 19:55:36', 'system', '2022-01-03 19:55:36', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971904106762240', '1477971903813160960', '数据查看', '2', '', NULL, '', '', '', NULL, 'sys:dictData:view',
        60, '1', 'default', '0', 'system', '2022-01-03 19:55:36', 'system', '2022-01-03 19:55:36', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971904182259712', '1477971903813160960', '数据编辑', '2', '', NULL, '', '', '', NULL, 'sys:dictData:edit',
        60, '1', 'default', '0', 'system', '2022-01-03 19:55:36', 'system', '2022-01-03 19:55:36', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971904253562880', '1477971903234347008', '行政区划', '1', '/sys/area/list', NULL, '', 'icon-map', '', NULL,
        'sys:area', 60, '1', 'default', '0', 'system', '2022-01-03 19:55:36', 'system', '2022-01-03 19:55:36', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971904329060352', '1477971903234347008', '国际化管理', '1', '/sys/lang/list', NULL, '', 'icon-globe', '',
        NULL, 'sys:lang', 80, '1', 'default', '0', 'system', '2022-01-03 19:55:36', 'system', '2022-01-03 19:55:36',
        NULL);
INSERT INTO `sys_menu`
VALUES ('1477971904408752128', '1477971903234347008', '产品许可信息', '1', '//licence', NULL, '', 'icon-paper-plane',
        '', NULL, '', 80, '1', 'default', '0', 'system', '2022-01-03 19:55:36', 'system', '2022-01-03 19:55:36', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971904484249600', '1477971894149484544', '系统监控', '1', '', NULL, '', 'icon-ghost', '', NULL, '', 60,
        '1', 'default', '0', 'system', '2022-01-03 19:55:36', 'system', '2022-01-03 19:55:36', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971904559747072', '1477971904484249600', '访问日志', '1', '/sys/log/list', NULL, '', 'fa fa-bug', '', NULL,
        'sys:log', 60, '1', 'default', '0', 'system', '2022-01-03 19:55:36', 'system', '2022-01-03 19:55:36', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971904656216064', '1477971904484249600', '数据监控', '1', '//druid/index.html', NULL, '', 'icon-disc', '',
        NULL, 'sys:state:druid', 80, '1', 'default', '0', 'system', '2022-01-03 19:55:36', 'system',
        '2022-01-03 19:55:36', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971904782045184', '1477971904484249600', '缓存监控', '1', '/state/cache/index', NULL, '',
        'icon-social-dribbble', '', NULL, 'sys:stste:cache', 80, '1', 'default', '0', 'system', '2022-01-03 19:55:36',
        'system', '2022-01-03 19:55:36', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971904903680000', '1477971904484249600', '服务器监控', '1', '/state/server/index', NULL, '',
        'icon-speedometer', '', NULL, 'sys:state:server', 80, '1', 'default', '0', 'system', '2022-01-03 19:55:36',
        'system', '2022-01-03 19:55:36', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971905042092032', '1477971904484249600', '作业监控', '1', '/job/list', NULL, '', 'icon-notebook', '', NULL,
        'sys:job', 80, '1', 'default', '0', 'system', '2022-01-03 19:55:36', 'system', '2022-01-03 19:55:36', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971905163726848', '1477971904484249600', '在线用户', '1', '/sys/online/list', NULL, '',
        'icon-social-twitter', '', NULL, 'sys:online', 60, '1', 'default', '0', 'system', '2022-01-03 19:55:36',
        'system', '2022-01-03 19:55:36', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971905289555968', '1477971904484249600', '在线文档', '1', '//swagger-ui.html', NULL, '', 'icon-book-open',
        '', NULL, 'sys:swagger', 80, '1', 'default', '0', 'system', '2022-01-03 19:55:36', 'system',
        '2022-01-03 19:55:36', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971905423773696', '1477971894149484544', '消息推送', '1', '', NULL, '', 'icon-envelope-letter', '', NULL,
        '', 60, '1', 'default', '0', 'system', '2022-01-03 19:55:36', 'system', '2022-01-03 19:55:36', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971905524436992', '1477971905423773696', '未完成消息', '1', '/msg/msgPush/list', NULL, '', '', '', NULL,
        'msg:msgPush', 60, '1', 'default', '0', 'system', '2022-01-03 19:55:36', 'system', '2022-01-03 19:55:36', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971905625100288', '1477971905423773696', '已完成消息', '1', '/msg/msgPush/list?pushed=true', NULL, '', '',
        '', NULL, 'msg:msgPush', 60, '1', 'default', '0', 'system', '2022-01-03 19:55:36', 'system',
        '2022-01-03 19:55:36', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971905721569280', '1477971905423773696', '消息模板管理', '1', '/msg/msgTemplate/list', NULL, '', '', '',
        NULL, 'msg:msgTemplate', 60, '1', 'default', '0', 'system', '2022-01-03 19:55:36', 'system',
        '2022-01-03 19:55:36', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971905830621184', '1477971894149484544', '研发工具', '1', '', NULL, '', 'fa fa-code', '', NULL, '', 80,
        '1', 'default', '0', 'system', '2022-01-03 19:55:36', 'system', '2022-01-03 19:55:36', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971905939673088', '1477971905830621184', '代码生成工具', '1', '/gen/genTable/list', NULL, '', 'fa fa-code',
        '', NULL, 'gen:genTable', 80, '1', 'default', '0', 'system', '2022-01-03 19:55:36', 'system',
        '2022-01-03 19:55:36', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971906027753472', '1477971905830621184', '代码生成实例', '1', '', NULL, '', 'icon-social-dropbox', '',
        NULL, '', 80, '1', 'default', '0', 'system', '2022-01-03 19:55:36', 'system', '2022-01-03 19:55:36', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971906103250944', '1477971906027753472', '单表/主子表', '1', '/test/testData/list', NULL, '', '', '', NULL,
        'test:testData', 80, '1', 'default', '0', 'system', '2022-01-03 19:55:36', 'system', '2022-01-03 19:55:36',
        NULL);
INSERT INTO `sys_menu`
VALUES ('1477971906182942720', '1477971906027753472', '树表/树结构表', '1', '/test/testTree/list', NULL, '', '', '',
        NULL, 'test:testTree', 80, '1', 'default', '0', 'system', '2022-01-03 19:55:36', 'system',
        '2022-01-03 19:55:36', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971906254245888', '1477971905830621184', '数据表格实例', '1', '', NULL, '', '', '', NULL, '', 80, '1',
        'default', '0', 'system', '2022-01-03 19:55:37', 'system', '2022-01-03 19:55:37', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971906338131968', '1477971906254245888', '多表头分组小计合计', '1', '/demo/dataGrid/groupGrid', NULL, '',
        '', '', NULL, '', 80, '1', 'default', '0', 'system', '2022-01-03 19:55:37', 'system', '2022-01-03 19:55:37',
        NULL);
INSERT INTO `sys_menu`
VALUES ('1477971906430406656', '1477971906254245888', '编辑表格多行编辑', '1', '/demo/dataGrid/editGrid', NULL, '', '',
        '', NULL, '', 80, '1', 'default', '0', 'system', '2022-01-03 19:55:37', 'system', '2022-01-03 19:55:37', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971906505904128', '1477971906254245888', '多表联动示例', '1', '/demo/dataGrid/multiGrid', NULL, '', '', '',
        NULL, '', 80, '1', 'default', '0', 'system', '2022-01-03 19:55:37', 'system', '2022-01-03 19:55:37', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971906577207296', '1477971905830621184', '表单组件实例', '1', '', NULL, '', '', '', NULL, '', 80, '1',
        'default', '0', 'system', '2022-01-03 19:55:37', 'system', '2022-01-03 19:55:37', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971906661093376', '1477971906577207296', '组件应用实例', '1', '/demo/form/editForm', NULL, '', '', '',
        NULL, '', 80, '1', 'default', '0', 'system', '2022-01-03 19:55:37', 'system', '2022-01-03 19:55:37', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971906728202240', '1477971906577207296', '栅格布局实例', '1', '/demo/form/layoutForm', NULL, '', '', '',
        NULL, '', 80, '1', 'default', '0', 'system', '2022-01-03 19:55:37', 'system', '2022-01-03 19:55:37', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971906803699712', '1477971906577207296', '表格表单实例', '1', '/demo/form/tableForm', NULL, '', '', '',
        NULL, '', 80, '1', 'default', '0', 'system', '2022-01-03 19:55:37', 'system', '2022-01-03 19:55:37', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971906875002880', '1477971906577207296', '多页签应用示例', '1', '/demo/form/tabPage', NULL, '', '', '',
        NULL, '', 80, '1', 'default', '0', 'system', '2022-01-03 19:55:37', 'system', '2022-01-03 19:55:37', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971906950500352', '1477971905830621184', '前端界面实例', '1', '', NULL, '', '', '', NULL, '', 80, '1',
        'default', '0', 'system', '2022-01-03 19:55:37', 'system', '2022-01-03 19:55:37', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971907017609216', '1477971906950500352', '图标样式查找', '1', '//tags/iconselect', NULL, '', '', '', NULL,
        '', 80, '1', 'default', '0', 'system', '2022-01-03 19:55:37', 'system', '2022-01-03 19:55:37', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971907101495296', '1477971894149484544', 'JeeSite社区', '1', '', NULL, '', 'icon-directions', '', NULL, '',
        80, '1', 'default', '0', 'system', '2022-01-03 19:55:37', 'system', '2022-01-03 19:55:37', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971907193769984', '1477971907101495296', '官方网站', '1', 'http://jeesite.com', NULL, '_blank', '', '',
        NULL, '', 80, '1', 'default', '0', 'system', '2022-01-03 19:55:37', 'system', '2022-01-03 19:55:37', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971907286044672', '1477971907101495296', '作者博客', '1', 'https://my.oschina.net/thinkgem', NULL,
        '_blank', '', '', NULL, '', 80, '1', 'default', '0', 'system', '2022-01-03 19:55:37', 'system',
        '2022-01-03 19:55:37', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971907386707968', '1477971907101495296', '问题反馈', '1', 'https://gitee.com/thinkgem/jeesite4/issues',
        NULL, '_blank', '', '', NULL, '', 80, '1', 'default', '0', 'system', '2022-01-03 19:55:37', 'system',
        '2022-01-03 19:55:37', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971907483176960', '1477971907101495296', '开源社区', '1', 'http://jeesite.net', NULL, '_blank', '', '',
        NULL, '', 80, '1', 'default', '0', 'system', '2022-01-03 19:55:37', 'system', '2022-01-03 19:55:37', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971907625783296', NULL, '我的工作', '1', '', NULL, '', 'icon-screen-desktop', '', NULL, '', 40, '1',
        'default', '0', 'system', '2022-01-03 19:55:37', 'system', '2022-01-03 19:55:37', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971907806138368', '1477971907625783296', '站内消息', '1', '/msg/msgInner/list', NULL, '', 'icon-speech',
        '', NULL, '', 40, '1', 'default', '0', 'system', '2022-01-03 19:55:37', 'system', '2022-01-03 19:55:37', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971907999076352', '1477971907806138368', '查看', '2', '', NULL, '', '', '', NULL, 'msg:msgInner:view', 40,
        '1', 'default', '0', 'system', '2022-01-03 19:55:37', 'system', '2022-01-03 19:55:37', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971908103933952', '1477971907806138368', '编辑', '2', '', NULL, '', '', '', NULL, 'msg:msgInner:edit', 40,
        '1', 'default', '0', 'system', '2022-01-03 19:55:37', 'system', '2022-01-03 19:55:37', NULL);
INSERT INTO `sys_menu`
VALUES ('1477971908192014336', '1477971907806138368', '审核', '2', '', NULL, '', '', '', NULL, 'msg:msgInner:auth', 40,
        '1', 'default', '0', 'system', '2022-01-03 19:55:37', 'system', '2022-01-03 19:55:37', NULL);
INSERT INTO `sys_menu`
VALUES ('1485791554636230656', NULL, '扩展功能', '1', '', NULL, '', 'icon-screen-desktop', '', '', '', 40, '1',
        'default', '0', 'system', '2022-01-25 09:48:06', 'system', '2022-01-25 09:48:06', '');
INSERT INTO `sys_menu`
VALUES ('1485791654221590528', '1485791554636230656', '内容管理', '1', '', NULL, '', 'icon-social-dropbox', '', '', '',
        40, '1', 'default', '0', 'system', '2022-01-25 09:48:30', 'system', '2022-01-25 09:48:30', '');
INSERT INTO `sys_menu`
VALUES ('1485791807015890944', '1485791654221590528', '内容发布', '1', '/cms/index', NULL, '', 'icon-book-open', '', '',
        'cms:view,cms:article', 40, '1', 'default', '0', 'system', '2022-01-25 09:49:06', 'system',
        '2022-01-25 09:49:06', '');
INSERT INTO `sys_menu`
VALUES ('1485792356150947840', '1485791654221590528', '栏目管理', '1', '/cms/category/list', NULL, '', 'icon-plus', '',
        '', 'cms:category', 40, '1', 'default', '0', 'system', '2022-01-25 09:51:17', 'system', '2022-01-25 09:51:17',
        '');
INSERT INTO `sys_menu`
VALUES ('1485792460232601600', '1485791654221590528', '站点设置', '1', '/cms/site/list', NULL, '', 'icon-badge', '', '',
        'cms:site', 40, '1', 'default', '0', 'system', '2022-01-25 09:51:42', 'system', '2022-01-25 09:53:56', '');
INSERT INTO `sys_menu`
VALUES ('1485792593208815616', '1485791654221590528', '模版管理', '1', '/cms/template/list', NULL, '',
        'icon-graduation', '', '', 'cms:template', 40, '1', 'default', '0', 'system', '2022-01-25 09:52:14', 'system',
        '2022-01-25 09:52:14', '');
INSERT INTO `sys_menu`
VALUES ('1503925768240037888', NULL, '授权管理', '1', '/oauthServer/oauthClientDetails/list', NULL, '', '', '', '',
        'oauthServer:oauthClientDetails:view,oauthServer:oauthClientDetails:edit', 20, '1', 'default', '0', 'system',
        '2022-03-16 10:46:59', 'system', '2022-03-16 16:36:28', '');
INSERT INTO `sys_menu`
VALUES ('1567102122905509888', '1477971903234347008', 'oss策略', '1', '/oss/ossConfig/list', NULL, '', '', '', '',
        'oss:ossConfig:view,oss:ossConfig:edit', 80, '1', 'default', '0', 'system', '2022-09-06 18:47:16', 'system',
        '2022-09-07 11:04:32', '');
INSERT INTO `sys_menu`
VALUES ('1630577213766696960', NULL, '测试', '1', '/sdaf', 'ddd', NULL, NULL, NULL, NULL, NULL, 1, '1', 'default', '1',
        'system', '2023-02-28 22:34:37', 'system', '2023-02-28 22:34:37', NULL);
INSERT INTO `sys_menu`
VALUES ('1630577213766696961', '1630577213766696960', '测试', '1', '/sdaf', 'ddd', NULL, NULL, NULL, NULL, NULL, 1, '1',
        'default', '0', 'system', '2023-02-28 22:34:37', 'system', '2023-02-28 22:34:37', NULL);

CREATE TABLE `sys_role`
(
    `id`          varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NOT NULL,
    `role_code`   varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '角色编码',
    `role_name`   varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '角色名称',
    `role_type`   varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL     DEFAULT NULL COMMENT '角色分类（高管、中层、基层、其它）',
    `role_sort`   decimal(10, 0)                                                NULL     DEFAULT NULL COMMENT '角色排序（升序）',
    `is_sys`      char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci      NULL     DEFAULT NULL COMMENT '系统内置（1是 0否）',
    `user_type`   varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NULL     DEFAULT NULL COMMENT '用户类型（employee员工 member会员）',
    `data_scope`  char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci      NULL     DEFAULT NULL COMMENT '数据范围设置（0未设置  1全部数据 2自定义数据）',
    `biz_scope`   varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL     DEFAULT NULL COMMENT '适应业务范围（不同的功能，不同的数据权限支持）',
    `status`      char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci      NOT NULL DEFAULT '0' COMMENT '状态（0正常 1删除 2停用）',
    `create_by`   varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NOT NULL COMMENT '创建者',
    `create_date` datetime(0)                                                   NOT NULL COMMENT '创建时间',
    `update_by`   varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NOT NULL COMMENT '更新者',
    `update_date` datetime(0)                                                   NOT NULL COMMENT '更新时间',
    `remarks`     varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL     DEFAULT NULL COMMENT '备注信息',
    `corp_code`   varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NOT NULL DEFAULT '0' COMMENT '租户代码',
    `corp_name`   varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT 'platform' COMMENT '租户名称',
    PRIMARY KEY (`id`) USING BTREE,
    INDEX `idx_sys_role_cc` (`corp_code`) USING BTREE,
    INDEX `idx_sys_role_is` (`is_sys`) USING BTREE,
    INDEX `idx_sys_role_rs` (`role_sort`) USING BTREE,
    INDEX `idx_sys_role_status` (`status`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT = '角色表'
  ROW_FORMAT = Dynamic;

INSERT INTO `sys_role`
VALUES ('1626879149973553152', 'super_manager', '测试', '高管', 30, '1', 'employee', NULL, NULL, '0', 'system',
        '2023-02-18 17:39:50', 'system', '2023-02-18 17:40:34', NULL, '0', 'platform');

CREATE TABLE `sys_role_menu`
(
    `role_id` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '角色id',
    `menu_id` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '菜单id',
    INDEX `sys_role_menu_sys_menu_id_fk` (`menu_id`) USING BTREE,
    INDEX `sys_role_menu_sys_role_id_fk` (`role_id`) USING BTREE,
    CONSTRAINT `sys_role_menu_sys_menu_id_fk` FOREIGN KEY (`menu_id`) REFERENCES `sys_menu` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
    CONSTRAINT `sys_role_menu_sys_role_id_fk` FOREIGN KEY (`role_id`) REFERENCES `sys_role` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT = '角色菜单关联'
  ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_role_menu
-- ----------------------------
insert into `sys_role_menu` (role_id, menu_id)
values  ('1626879149973553152', '1477971894149484544'),
        ('1626879149973553152', '1477971901036531712'),
        ('1626879149973553152', '1477971901162360832'),
        ('1626879149973553152', '1477971901271412736'),
        ('1626879149973553152', '1477971901405630464'),
        ('1626879149973553152', '1477971901544042496'),
        ('1626879149973553152', '1477971901636317184'),
        ('1626879149973553152', '1477971901720203264'),
        ('1626879149973553152', '1477971901804089344'),
        ('1626879149973553152', '1477971901896364032'),
        ('1626879149973553152', '1477971901997027328'),
        ('1626879149973553152', '1477971902085107712'),
        ('1626879149973553152', '1477971902168993792'),
        ('1626879149973553152', '1477971902269657088'),
        ('1626879149973553152', '1477971902353543168'),
        ('1626879149973553152', '1477971902433234944'),
        ('1626879149973553152', '1477971902517121024'),
        ('1626879149973553152', '1477971902609395712'),
        ('1626879149973553152', '1477971902676504576'),
        ('1626879149973553152', '1477971902756196352'),
        ('1626879149973553152', '1477971902831693824'),
        ('1626879149973553152', '1477971902894608384'),
        ('1626879149973553152', '1477971903037214720'),
        ('1626879149973553152', '1477971903234347008'),
        ('1626879149973553152', '1477971903427284992'),
        ('1626879149973553152', '1477971903548919808'),
        ('1626879149973553152', '1477971903678943232'),
        ('1626879149973553152', '1477971903813160960'),
        ('1626879149973553152', '1477971903930601472'),
        ('1626879149973553152', '1477971904022876160'),
        ('1626879149973553152', '1477971904106762240'),
        ('1626879149973553152', '1477971904182259712'),
        ('1626879149973553152', '1477971904253562880'),
        ('1626879149973553152', '1477971904329060352'),
        ('1626879149973553152', '1477971904408752128'),
        ('1626879149973553152', '1477971904484249600'),
        ('1626879149973553152', '1477971904559747072'),
        ('1626879149973553152', '1477971904656216064'),
        ('1626879149973553152', '1477971904782045184'),
        ('1626879149973553152', '1477971904903680000'),
        ('1626879149973553152', '1477971905042092032'),
        ('1626879149973553152', '1477971905163726848'),
        ('1626879149973553152', '1477971905289555968'),
        ('1626879149973553152', '1477971905423773696'),
        ('1626879149973553152', '1477971905524436992'),
        ('1626879149973553152', '1477971905625100288'),
        ('1626879149973553152', '1477971905721569280'),
        ('1626879149973553152', '1477971905830621184'),
        ('1626879149973553152', '1477971905939673088'),
        ('1626879149973553152', '1477971906027753472'),
        ('1626879149973553152', '1477971906103250944'),
        ('1626879149973553152', '1477971906182942720'),
        ('1626879149973553152', '1477971906254245888'),
        ('1626879149973553152', '1477971906338131968'),
        ('1626879149973553152', '1477971906430406656'),
        ('1626879149973553152', '1477971906505904128'),
        ('1626879149973553152', '1477971906577207296'),
        ('1626879149973553152', '1477971906661093376'),
        ('1626879149973553152', '1477971906728202240'),
        ('1626879149973553152', '1477971906803699712'),
        ('1626879149973553152', '1477971906875002880'),
        ('1626879149973553152', '1477971906950500352'),
        ('1626879149973553152', '1477971907017609216'),
        ('1626879149973553152', '1477971907101495296'),
        ('1626879149973553152', '1477971907193769984'),
        ('1626879149973553152', '1477971907286044672'),
        ('1626879149973553152', '1477971907386707968'),
        ('1626879149973553152', '1477971907483176960'),
        ('1626879149973553152', '1477971907625783296'),
        ('1626879149973553152', '1477971907806138368'),
        ('1626879149973553152', '1477971907999076352'),
        ('1626879149973553152', '1477971908103933952'),
        ('1626879149973553152', '1477971908192014336'),
        ('1626879149973553152', '1485791554636230656'),
        ('1626879149973553152', '1485791654221590528'),
        ('1626879149973553152', '1485791807015890944'),
        ('1626879149973553152', '1485792356150947840'),
        ('1626879149973553152', '1485792460232601600'),
        ('1626879149973553152', '1485792593208815616'),
        ('1626879149973553152', '1503925768240037888'),
        ('1626879149973553152', '1567102122905509888'),
        ('1626879149973553152', '1630577213766696960'),
        ('1626879149973553152', '1630577213766696961');
CREATE TABLE `sys_user`
(
    `user_code`             varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NOT NULL COMMENT '用户编码',
    `login_code`            varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NOT NULL COMMENT '登录账号',
    `user_name`             varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NOT NULL COMMENT '用户昵称',
    `password`              varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NOT NULL COMMENT '登录密码',
    `email`                 varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NULL     DEFAULT NULL COMMENT '电子邮箱',
    `mobile`                varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NULL     DEFAULT NULL COMMENT '手机号码',
    `phone`                 varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NULL     DEFAULT NULL COMMENT '办公电话',
    `sex`                   char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci       NULL     DEFAULT NULL COMMENT '用户性别',
    `avatar`                varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL     DEFAULT NULL COMMENT '头像路径',
    `sign`                  varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NULL     DEFAULT NULL COMMENT '个性签名',
    `wx_openid`             varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NULL     DEFAULT NULL COMMENT '绑定的微信号',
    `mobile_imei`           varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NULL     DEFAULT NULL COMMENT '绑定的手机串号',
    `user_type`             varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci   NOT NULL COMMENT '用户类型',
    `ref_code`              varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci   NULL     DEFAULT NULL COMMENT '用户类型引用编号',
    `ref_name`              varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NULL     DEFAULT NULL COMMENT '用户类型引用姓名',
    `mgr_type`              char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci       NOT NULL COMMENT '管理员类型（0非管理员 1系统管理员  2二级管理员）',
    `pwd_security_level`    decimal(1, 0)                                                  NULL     DEFAULT NULL COMMENT '密码安全级别（0初始 1很弱 2弱 3安全 4很安全）',
    `pwd_update_date`       datetime(0)                                                    NULL     DEFAULT NULL COMMENT '密码最后更新时间',
    `pwd_update_record`     varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL     DEFAULT NULL COMMENT '密码修改记录',
    `pwd_question`          varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NULL     DEFAULT NULL COMMENT '密保问题',
    `pwd_question_answer`   varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NULL     DEFAULT NULL COMMENT '密保问题答案',
    `pwd_question_2`        varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NULL     DEFAULT NULL COMMENT '密保问题2',
    `pwd_question_answer_2` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NULL     DEFAULT NULL COMMENT '密保问题答案2',
    `pwd_question_3`        varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NULL     DEFAULT NULL COMMENT '密保问题3',
    `pwd_question_answer_3` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NULL     DEFAULT NULL COMMENT '密保问题答案3',
    `pwd_quest_update_date` datetime(0)                                                    NULL     DEFAULT NULL COMMENT '密码问题修改时间',
    `last_login_ip`         varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NULL     DEFAULT NULL COMMENT '最后登陆IP',
    `last_login_date`       datetime(0)                                                    NULL     DEFAULT NULL COMMENT '最后登陆时间',
    `freeze_date`           datetime(0)                                                    NULL     DEFAULT NULL COMMENT '冻结时间',
    `freeze_cause`          varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NULL     DEFAULT NULL COMMENT '冻结原因',
    `user_weight`           decimal(8, 0)                                                  NULL COMMENT '用户权重（降序）',
    `status`                char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci       NOT NULL COMMENT '状态（0正常 1删除 2停用 3冻结）',
    `create_by`             varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci   NOT NULL COMMENT '创建者',
    `create_date`           datetime(0)                                                    NOT NULL COMMENT '创建时间',
    `update_by`             varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci   NOT NULL COMMENT '更新者',
    `update_date`           datetime(0)                                                    NOT NULL COMMENT '更新时间',
    `remarks`               varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NULL     DEFAULT NULL COMMENT '备注信息',
    `corp_code`             varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci   NOT NULL DEFAULT '0' COMMENT '租户代码',
    `corp_name`             varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NOT NULL DEFAULT 'platform' COMMENT '租户名称',
    PRIMARY KEY (`user_code`) USING BTREE,
    INDEX `idx_sys_user_cc` (`corp_code`) USING BTREE,
    INDEX `idx_sys_user_email` (`email`) USING BTREE,
    INDEX `idx_sys_user_imei` (`mobile_imei`) USING BTREE,
    INDEX `idx_sys_user_lc` (`login_code`) USING BTREE,
    INDEX `idx_sys_user_mobile` (`mobile`) USING BTREE,
    INDEX `idx_sys_user_mt` (`mgr_type`) USING BTREE,
    INDEX `idx_sys_user_rc` (`ref_code`) USING BTREE,
    INDEX `idx_sys_user_rt` (`user_type`) USING BTREE,
    INDEX `idx_sys_user_status` (`status`) USING BTREE,
    INDEX `idx_sys_user_ud` (`update_date`) USING BTREE,
    INDEX `idx_sys_user_us` (`user_weight`) USING BTREE,
    INDEX `idx_sys_user_wo` (`wx_openid`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT = '用户表'
  ROW_FORMAT = Dynamic;

INSERT INTO `sys_user`
VALUES ('123', '123456', '123456', '123456', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '1', NULL, NULL, '1', NULL,
        NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, '0', 'system',
        '2022-12-10 15:43:21', 'sys', '2022-12-10 15:43:28', NULL, '0', 'platform');
INSERT INTO `sys_user`
VALUES ('1614867934644609024', 'system', 'asdf', '21232f297a57a5a743894a0e4a801fc3', 'wwer', NULL, NULL, NULL, NULL,
        NULL, NULL, NULL, '1', NULL, NULL, '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL,
        NULL, NULL, 0, '0', 'system', '2021-12-31 16:00:00', 'system', '2021-12-31 16:00:00', NULL, '0', 'platform');

CREATE TABLE `sys_user_role`
(
    `user_code` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户编码',
    `role_code` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NOT NULL COMMENT '角色编码',
    PRIMARY KEY (`user_code`, `role_code`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT = '用户与角色关联表'
  ROW_FORMAT = Dynamic;


INSERT INTO `sys_user_role`
VALUES ('1614867934644609024', '1626879149973553152');

create table sys_company
(
    id                varchar(64)  not null comment '公司主键'
        primary key,
    pid               varchar(64)  null comment '父级id',
    company_name      varchar(300) not null comment '公司名称',
    company_code      varchar(300) not null comment '公司编码',
    company_full_name varchar(500) null comment '公司全面',
    corp_code         varchar(64)  null comment '租户编码',
    corp_name         varchar(100) null comment '租户名称'
)
    comment '公司表';

create table sys_employee
(
    emp_code   varchar(64)  not null comment '员工编码'
        primary key,
    user_code  varchar(64)  not null comment '用户id',
    company_id varchar(64)  null comment '公司id',
    emp_name   varchar(500) null comment '员工姓名',
    constraint sys_employee_sys_company_id_fk
        foreign key (company_id) references sys_company (id),
    constraint sys_employee_sys_user_user_code_fk
        foreign key (user_code) references sys_user (user_code)
)
    comment '员工表';

create table sys_post
(
    id        varchar(64)  not null comment '岗位id'
        primary key,
    post_code varchar(300) not null comment '岗位编码',
    post_name varchar(500) not null comment '岗位名称',
    post_type char         null comment '岗位类型（高管、中层、低层）'
)
    comment '岗位表';

create table sys_employee_post
(
    post_id  varchar(64) not null comment '岗位id',
    emp_code varchar(64) not null comment '员工id',
    primary key (post_id, emp_code),
    constraint sys_employee_post_sys_employee_emp_code_fk
        foreign key (emp_code) references sys_employee (emp_code),
    constraint sys_employee_post_sys_post_id_fk
        foreign key (post_id) references sys_post (id)
)
    comment '员工岗位';

