create table sys_role_menu
(
    role_id varchar(64) not null comment '角色id',
    menu_id varchar(64) not null comment '菜单id',
    constraint sys_role_menu_sys_menu_id_fk
        foreign key (menu_id) references sys_menu (id),
    constraint sys_role_menu_sys_role_role_code_fk
        foreign key (role_id) references sys_role (role_code)
)
    comment '角色菜单关联';
