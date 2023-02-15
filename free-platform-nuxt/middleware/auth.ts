/**
 * 路由拦截
 */
export default defineNuxtRouteMiddleware((to, from) => {
    console.log(to, from)
    return navigateTo(to)
})