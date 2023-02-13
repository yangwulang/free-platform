import { defineNuxtPlugin } from '#app'
import viewUi from 'view-ui-plus'

import 'view-ui-plus/dist/styles/viewuiplus.css'

export default defineNuxtPlugin((nuxtApp) => {
    // Doing something with nuxtApp
    nuxtApp.vueApp.use(viewUi)
})