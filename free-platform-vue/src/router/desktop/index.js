export default [{
    path: 'projectManager',
    name: 'projectManager',
    meta: {needAuth: true},
    component: () => import('@/views/index/index.vue'),
}, {
    path: 'newProjectManager',
    name: 'newProjectManager',
    component: () => import('@/views/index/ProjectFrom.vue'),
}]