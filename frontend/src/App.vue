<template>
  <nav>
    <router-link to="/">首页</router-link> |
    <router-link to="/login">登录</router-link> |
    <router-link to="/register">注册</router-link> |
    <router-link to="/chat">聊天</router-link> |
    <router-link to="/friends">好友</router-link>
  </nav>
  <router-view/>
</template>

<script>
export default {
  name: 'App'
}
</script>

<style>
nav {
  margin-bottom: 20px;
}
nav a {
  margin: 0 10px;
  text-decoration: none;
  color: #42b983;
}
nav a.router-link-exact-active {
  font-weight: bold;
  color: #35495e;
}
</style>
