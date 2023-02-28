import { defineNuxtPlugin } from '#app'
import viewUi from 'view-ui-plus'

// import Cookies from "js-cookie"
// import {createI18n} from "vue-i18n";
// import zh from "view-ui-plus/dist/locale/zh-CN";
// import en from "view-ui-plus/dist/locale/en-US";

import 'view-ui-plus/dist/styles/viewuiplus.css'


/*const i18n = createI18n({
    legacy: false,
    globalInjection: true,
    locale: Cookies.get('lang') || 'zh-CN',
    warnHtmlMessage: false,
    messages: {
        'zh-CN': zh,
        'en-US': en
    }
})*/

export default defineNuxtPlugin((nuxtApp) => {
    // Doing something with nuxtApp
    // nuxtApp.vueApp.use(viewUi, {i18n})
    nuxtApp.vueApp.use(viewUi)
})