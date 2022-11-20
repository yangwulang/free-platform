let column = [{
    title: '小说名称',
    key: 'bookName'
}, {
    title: '分类',
    key: 'category'
}, {
    title: '小说封面',
    key: 'bookImgPath',
    render: (h, {row}) => {
        return h('img', {src: row.bookImgPath})
    }
}, {
    title: '描述',
    key: 'describe'
}, {
    title: '状态',
    key: 'status'
}, {
    title: '操作',
    key: 'action',
    width: 130
}];
export default column
