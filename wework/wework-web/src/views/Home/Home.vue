<script setup lang="ts">

import {onMounted, reactive} from "vue";
import {useRoute} from "vue-router";

interface QRLoginParam{
  state:string,
  code:string
}

const state=reactive<{loginParam:QRLoginParam}>({
  loginParam:{
    state:'',
    code:''
  }
})

onMounted(()=>{
  let route = useRoute();
  console.log(route.query.code)
  console.log(route.query.state)
  state.loginParam.code=route.query.code as string
  state.loginParam.state=route.query.state as string
})

</script>

<template>
  <div>
    <p>Home</p>
    <br>
    state:{{state.loginParam.state}}
    <br>
    code:{{state.loginParam.code}}
  </div>
</template>

<style scoped>

</style>
