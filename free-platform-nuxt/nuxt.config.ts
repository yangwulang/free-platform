// https://nuxt.com/docs/api/configuration/nuxt-config
export default defineNuxtConfig({
    modules: [
        '@nuxtjs/i18n',
        // '@nuxtjs/axios',
        // '@nuxtjs/proxy',
        // '@nuxtjs/style-resources',
    ],
    plugins: [{
        src: 'plugin/iview/index',
        ssr: true
    }],
    css: [
        '@/assets/css/main.scss'
    ],
    runtimeConfig: {
        public: {
            // BASE_URL: 'http://localhost:8080'
            BASE_URL: process.env.NUXT_PUBLIC_API_BASE || 'http://localhost:8080/platform/api',
            REWRITE_PATH: process.env.REWRITE_PATH || '/api',
        }
    },
    nitro: {
        devProxy: {
            "/api": {
                toProxy: true,
                target: "http://localhost:8080/platform/api/",
                prependPath: true,
                changeOrigin: true,
            }
        }
    }
})
