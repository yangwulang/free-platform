const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
  lintOnSave: false,
  devServer: {
    proxy: {
      '/platform': {
        target: process.env.VUE_APP_BASE_URL,
        ws: true,
        changeOrigin:true,
        secure: true,                   //是否https接口
        pathRewrite:{
          '^/platform':'/platform'//重写路径
        }
      }
    }
  }
})
