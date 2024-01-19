<script setup lang="ts">
const appid=''
const agentid=''
const redirect_uri='http%3A%2F%2F127.0.0.1%3A5173%2Fhome'

const qr_code_url=`https://open.work.weixin.qq.com/wwopen/sso/qrConnect?appid=${appid}&agentid=${agentid}&redirect_uri=${redirect_uri}&state=web_login`
</script>

<template>
      <div>
        <iframe  style="height: 380px; text-align: center;" :src="qr_code_url" frameborder="0"></iframe>
      </div>
</template>

<style scoped>

</style>
