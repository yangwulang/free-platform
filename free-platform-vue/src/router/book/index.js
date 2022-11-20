export default [{
    path: 'bookInfoManager',
    name: 'bookInfoManager',
    meta: {needAuth: true},
    component: () => import('@/views/book/bookInfo/index.vue'),
}, {
    path: 'bookChapterManager/:bookId',
    name: 'bookChapterManager',
    meta: {needAuth: true},
    component: () => import('@/views/book/bookChapter/ChapterIndex')
}]