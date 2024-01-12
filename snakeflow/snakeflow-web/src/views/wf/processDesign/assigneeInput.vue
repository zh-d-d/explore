<script setup lang="ts">

import {UserFilled} from "@element-plus/icons-vue";
import {onMounted, ref} from "vue";
import {DeptUser, getDeptUserTree} from "@/api/sys/user.ts";

const treeData = ref<DeptUser[]>([]);


onMounted(async () => {

  treeData.value = await getDeptUserTree()

  const res = await getDeptUserTree()
  console.log(res[0].children)


  console.log(res);
  console.log(treeData.value)
})

</script>

<template>
  <el-row>
    <el-col :span="22">
      <el-select></el-select>
    </el-col>

    <el-col :span="2">
      <el-button type="primary">
        <template #icon>
          <el-icon>
            <UserFilled/>
          </el-icon>
        </template>
      </el-button>
    </el-col>
  </el-row>
</template>

<style scoped>

</style>
