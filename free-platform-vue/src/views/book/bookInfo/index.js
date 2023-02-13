let column = [{
    title: '小说名称',
    key: 'bookName',
    width: 250,
    fixed: 'left'
}, {
    title: '分类',
    key: 'category',
    width: 100
}, {
    title: '作者',
    key: 'author',
    width: 180
}, {
    title: '小说封面',
    key: 'bookImgPath',
    render: (h, {row}) => {
        return h('img', {src: row.bookImgPath})
    },
    width: 300
}, {
    title: '描述',
    key: 'describe',
    width: 800
}, {
    title: '状态',
    key: 'status',
    width: 100
}, {
    title: '操作',
    key: 'action',
    slot: 'action',
    align: 'center',
    fixed: 'right',
    width: 250
}];
export default column
