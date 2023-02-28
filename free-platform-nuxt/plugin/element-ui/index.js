import {defineNuxtPlugin} from '#app'
import 'element-plus/dist/index.css'

import Cookies from "js-cookie"
import {createI18n} from "vue-i18n";
import zhCn from 'element-plus/dist/locale/zh-cn'
import ElementPlus from 'element-plus'


const i18n = createI18n({
    legacy: false,
    globalInjection: true,
    locale: Cookies.get('lang') || 'zh-CN',
    warnHtmlMessage: false,
    messages: {
        'zh-CN': zhCn,
    }
})

export default defineNuxtPlugin((nuxtApp) => {
    // Doing something with nuxtApp
    nuxtApp.vueApp.use(ElementPlus, {i18n, size: 'small', zIndex: 3000})
})