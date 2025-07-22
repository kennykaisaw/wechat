const { defineConfig } = require('@vue/cli-service')
module.exports = {
  devServer: {
    port: 3000,
    proxy: {
      '/api': {
        target: 'http://localhost:8080', // Spring Boot 后端地址
        changeOrigin: true
      }
    }
  }
}
