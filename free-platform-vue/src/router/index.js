import {createRouter, createWebHashHistory} from 'vue-router'
import {authStore} from "@/store/store";

/**
 * 具体路由信息
 * meta中各参数作用
 *  needAuth: 是否需要鉴权，为true时需要进行鉴权操作，如果没有权限，进行相关操作，例如重定向到登录页
 *  needFooter：是否需要足描述信息，false表示不需要足部信息
 *              (非大足部 layout 被分成了三块，一块顶部导航条，一块中间层，一块足部（此足部为大足部）)
 *              小足部意思是再内嵌页面中例如排行榜单中有个列表页，在列表页下方的足部为小足部，使用大足部还是
 *              小足部使用此信息做区分
 *  needFullCenter：是否需要占领全部中间层，此参数为true的时候会将头部以下的区域（注意：整个屏幕除去头部最后的区域，
 *                  如果不需要产生滚动条，请在下级组件中，使用height:100%占领全部区域）
 */

let matches = require.context('./', true, /^\.\/[^/]+\/.+\.js$/);
let routes = []
matches.keys().forEach(key => {
    routes = routes.concat(matches(key).default)
})
const realRoutes = [
    {
        path: '/login',
        name: 'login',
        component: () => import('@/views/login/Login')
    },
    {
        path: '/',
        name: 'home',
        redirect: `/dbTransfer/left${routes.length > 0 ? '/'+routes[0].path : ''}`
    },
    {
        path: "/dbTransfer/left",
        name: "leftMenu",
        component: () => import('@/layout/LeftMenuLayout'),
        children: routes
    }
]
const router = createRouter({
    history: createWebHashHistory(),
    routes: realRoutes
})

/*router.beforeEach((to, form, next) => {
    if (to.meta.needAuth && !authStore().userName) {
        next({
            path: '/login',
            query: {redirect: to.fullPath}
        })
    } else {
        next()
    }
})*/

export default router

