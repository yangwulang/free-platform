/*
const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
  lintOnSave: false,
  devServer: {
    proxy: {
      '/api': {
        target: process.env.VUE_APP_BASE_URL,
        ws: true,
        changeOrigin:true,
        secure: true,                   //是否https接口
        pathRewrite:{
          '^/api':'/platform/api'//重写路径
        }
      }
    }
  }
})
*/

module.exports = {
    lintOnSave: false,
    devServer: {
        proxy: {
            '/api': {
                pathRewrite: {
                    '^/api': '/platform/api'//重写路径
                },
                target: process.env.VUE_APP_BASE_URL,
                ws: true,
                changeOrigin: true,
                secure: true                   //是否https接口
            }
        }
    }
}