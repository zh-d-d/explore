<script setup lang="ts">

import {onMounted, reactive} from "vue";
import {DeptUser, getDeptUserTree} from "@/api/sys/user.ts";


const initAssigneeStatus = Object.freeze({
  value: '',
  data: [],
  loadState: false
})

const state = reactive<{
  assignee: {
    value: string | number ,
    data: DeptUser[],
    loadState: boolean
  }
}>({
  assignee: {
    ...initAssigneeStatus
  }
})


onMounted(async () => {
  state.assignee.loadState = true
  state.assignee.data = await getDeptUserTree()
  state.assignee.loadState = false
})

</script>

<template>
  <el-row>
    <el-col :span="22">
      <el-tree-select :data="state.assignee.data" show-checkbox multiple v-model="state.assignee.value"
                      />
    </el-col>
  </el-row>
</template>

<style scoped>

</style>
