<script setup lang="ts">
import {request} from "@/utils/http/axios";
import {onMounted, reactive} from "vue";

interface DictVo {
  value: string,
  label: string
}

const props = defineProps({
  renderType: {
    type: String,
    default: 'Select'
  },
  code: {
    type: String
  },
  value: [Array, Object, String, Number]
})

const state = reactive<
    {
      dictOption: DictVo[],
      selectValue:string
    }
>({
  dictOption: [],
  selectValue:''
})

let emit = defineEmits()
// emit("mychange",11,22) //可以传参 //用setup函数则为context.emit("mychange",11,22)

const getDictType = (code: any) => {
  request<DictVo[]>({
    method: 'post',
    url: '/api/sys/dict/getByDictType',
    data: {
      dictType: code
    }
  }).then((res) => {
    state.dictOption=res
  })
}

onMounted(async () => {
  await getDictType(props.code)
})


</script>

<template>
  <!--  <el-radio-group v-if="props.renderType=='RadioGroup'">-->

  <!--  </el-radio-group>-->
  <el-select v-model="state.selectValue">
    <el-option v-for="item in state.dictOption" :key="item.value" :label="item.label" :value="item.value"/>
  </el-select>
</template>

<style scoped>

</style>
