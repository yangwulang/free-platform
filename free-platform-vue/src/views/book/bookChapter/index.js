export default [{
    title: '小说名称',
    key: 'book.bookName',
    width: 250,
    fixed: 'left',
    render: (h, params) => {
        return h('span', params.row.book.bookName);
    }
},{
    title: '章节名',
    key: 'chapterTitle',
},{
    title: '操作',
    key: 'action',
    slot: 'action',
    align: 'center',
    fixed: 'right',
    width: 250
}]