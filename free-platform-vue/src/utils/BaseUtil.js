const BaseUtil = {
    /**
     * 设置表单嵌套对象数据
     * @author: Enzo
     * @date: 2019-10-31
     */
    setFormData(formData, resData = {}) {
        Object.keys(formData).forEach(item => {
            if (typeof formData[item] === 'object') {
                if (formData[item] instanceof Array) {
                    // 数组暂不处理
                } else {
                    Object.keys(formData[item]).forEach(item1 => {
                        // eslint-disable-next-line no-prototype-builtins
                        if (resData[item].hasOwnProperty(item1)) {
                            formData[item][item1] = resData[item][item1];
                        }
                    });
                }
            } else {
                formData[item] = resData[item];
            }
        });
        return formData;
    },

    /**
     * 获得文件大小
     * @author: Enzo
     * @date: 2019-11-6
     */
    getFileSize(size) {
        if (size < 1024) {
            return size + 'B';
        } else if (size / 1024 < 1024) {
            return Math.round((size / 1024) * 100) / 100.0 + 'KB';
        } else if (size / 1024 / 1024 < 1024) {
            return Math.round((size / 1024 / 1024) * 100) / 100.0 + 'MB';
        } else if (size / 1024 / 1024 / 1024 < 1024 * 100) {
            return Math.round((size / 1024 / 1024 / 1024) * 100) / 100.0 + 'GB';
        }
    },
    specialDownloadFile(downPath, fileName) {
        const xhr = new XMLHttpRequest();
        xhr.open('GET', downPath, true);
        xhr.responseType = 'blob';
        // xhr.setRequestHeader('Authorization', `Basic ${getCookieItem('Admin-Token')}`);
        xhr.onload = () => {
            if (xhr.status === 200) {
                // 获取文件blob数据并保存
                const urlObject = window.URL || window.webkitURL || window;
                const export_blob = new Blob([xhr.response]);
                const save_link = document.createElementNS('http://www.w3.org/1999/xhtml', 'a');
                save_link.href = urlObject.createObjectURL(export_blob);
                save_link.download = fileName;
                save_link.click();
            }
        };

        xhr.send();
    },
    /**
     * 下载文件
     * @author Enzo
     * @date 2019-11-27
     */
    downFile(downPath, fileName) {
        const link = document.createElement('a');
        link.style.display = 'none';
        link.href = downPath;
        if (fileName != null) {
            link.setAttribute('download', fileName);
        }
        console.log(link);
        document.body.appendChild(link);
        link.click();
    },
    /**
     * 查找树节点，根据func回调来判断，这个回调函数需要返回一个Boolean值,
     * <code>
     *   BaseUtil.findParent(<br/>&nbsp;&nbsp;&nbsp;&nbsp;
     *                        this.treeData,<br/>&nbsp;&nbsp;&nbsp;&nbsp;
     *                        data => data.value === this.formValidate.streetId,<br/>&nbsp;&nbsp;&nbsp;&nbsp;
     *                        'value',<br/>&nbsp;&nbsp;&nbsp;&nbsp;
     *                        'children'<br/>&nbsp;&nbsp;&nbsp;&nbsp;
     *   )
     * </code>
     * 使用方式类似于上述一样，查找 this.treeData 中子级值为 this.formValidate.streetId 的所有父级包括这个子集本身
     * @param tree 树形结构
     * @param func 回调函数用来寻找的依据
     * @param queryObj 是否需要返回对象而不是对象中的字段
     * @param findField 查找的字段名
     * @param childrenField 子级的字段名
     * @param path 返回的数据
     * @author yangwulang
     * @returns {[]|*[]}
     */
    findParent(tree, func, queryObj = false, findField = 'value', childrenField = 'children', path = []) {
        if (!tree) return [];
        for (const data of tree) {
            path.push(queryObj ? data : data[findField]);
            if (func(data)) return path;
            if (data[childrenField]) {
                const findChildren = this.findParent(data[childrenField], func, queryObj, findField, childrenField, path);
                if (findChildren.length) return findChildren;
            }
            path.pop();
        }
        return [];
    },
    /**
     * 解除双向绑定,在必要时解除绑定
     * @param obj 待解绑的对象
     * @author yangwulang
     * @returns {any} 解绑之后的对象
     */
    removeTwoWayBind(obj) {
        return JSON.parse(JSON.stringify(obj));
    },
    /**
     * 遍历树形结构，其中树形结构一定要有children
     * 字段这个树只能是非单个的，数组形式的树
     * @param treeArr 树Array
     * @param callback 回调方法，返回每一个节点的数据
     * @author yangwulang
     */
    forEachTreeArray(treeArr, callback) {
        if (treeArr instanceof Array) {
            treeArr.forEach(tree => {
                this.forEachTree(tree, callback);
            });
        } else {
            new Error('treeArr 非数组, 请使用 forEachTree 方法');
        }
    },
    /**
     * 遍历树形结构，其中树形结构一定要有children
     * 字段这个树只能是单个的，非为数组形式的树
     * @param tree 树结构
     * @param callback 回调方法，返回节点数据
     * @author yangwulang
     */
    forEachTree(tree, callback) {
        if (tree !== undefined) {
            if (tree instanceof Array) {
                throw Error('遍历树结构非为数组形式的树, 请使用 forEachTreeArray 方法');
            }
            if (tree.children) {
                // 如果是数组就遍历
                if (tree.children instanceof Array) {
                    // 如果是数组就遍历递归
                    tree.children.forEach(treeChildItem => {
                        BaseUtil.forEachTree(treeChildItem, callback);
                    });
                } else {
                    // 如果不是数组但有子节点，将子节点递归
                    this.forEachTree(tree.children, callback);
                }
                callback(tree);
            } else {
                // 没有子节点，直接回调
                callback(tree);
            }
        }
    },
};
export default BaseUtil;
