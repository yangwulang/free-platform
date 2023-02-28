-- 创建一个树的触发器
drop trigger if exists tri_sys_menu;
create trigger tri_sys_menu
    before insert
    on sys_menu
    for each row
begin
    declare sorts,treeNames,parentCodes varchar(500) default '';
    set sorts = concat((select c.tree_sorts from sys_menu c where c.id = NEW.pid), NEW.tree_sort, ',');
    set treeNames = concat((select c.tree_names from sys_menu c where c.id = NEW.pid), '/', NEW.tree_names);
    set parentCodes = concat((select c.parent_codes from sys_menu c where c.id = NEW.pid), NEW.pid, ',');
    set NEW.tree_sorts = sorts;
    set NEW.tree_names = treeNames;
    set NEW.parent_codes = parentCodes;
end;