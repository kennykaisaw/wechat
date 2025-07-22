<template>
  <div>
    <h2>聊天</h2>
    <div class="chat-box">
      <div class="message">小明：你好！</div>
      <div class="message self">我：你好，小明！</div>
    </div>
    <input placeholder="输入消息..." />
    <button>发送</button>
  </div>
</template>

<script setup>
// 静态页面，无逻辑
</script>

<style scoped>
.chat-box { border: 1px solid #ccc; height: 200px; margin-bottom: 10px; padding: 10px; overflow-y: auto; }
.message { margin: 5px 0; }
.message.self { text-align: right; color: #42b983; }
input { width: 80%; padding: 8px; }
button { width: 18%; padding: 8px; }
</style> 