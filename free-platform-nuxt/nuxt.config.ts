// https://nuxt.com/docs/api/configuration/nuxt-config
export default defineNuxtConfig({
/*    modules: [
        "@nuxtjs/axios",
        '@nuxtjs/style-resources',
    ],*/
    plugins: [{
        src: 'plugin/iview/index',
        ssr: true
    }],
    css: [
        '@/assets/css/main.scss'
    ]

})
