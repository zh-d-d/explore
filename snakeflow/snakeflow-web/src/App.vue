<script setup lang="ts">
import SnakerFlowDesigner from 'snakerflow-designer-vue';
import {ref} from "vue";


import AssigneeInput from "@/views/wf/processDesign/assigneeInput.vue";

const flowData = ref({})
const assigneeConfigWay = ref(2);






</script>

<template>
  <div style="height: 100%;">
    <SnakerFlowDesigner v-model="flowData" :showDoc="false">

      <!--      <template #form-item-task-form="{ model, field }">-->
      <!--        <el-form :model="model">-->
      <!--          <el-form-item label="表单">-->
      <!--            <el-select v-model="model[field]" >-->
      <!--&lt;!&ndash;              <el-option v-for="taskFromItem in taskFormOptions"/>&ndash;&gt;-->
      <!--            </el-select>-->
      <!--          </el-form-item>-->
      <!--        </el-form>-->

      <!--        -->
      <!--        <a-form :label-col="{ flex: '120px' }" :model="model">-->
      <!--          <a-form-item label="表单" :colon="false">-->
      <!--            <a-select-->
      <!--                v-model:value="model[field]"-->
      <!--                :options="taskFormOptions"-->
      <!--                :dropdownStyle="{ zIndex: 9999 }"-->
      <!--            />-->
      <!--          </a-form-item>-->
      <!--        </a-form>-->
      <!--      </template>-->


      <template #form-item-task-assignee="{ model, field }">
        <el-form :model="model">
          <el-form-item label="参与者">

            <el-radio-group v-model="assigneeConfigWay" size="small">
              <el-radio-button label="2">下拉选择</el-radio-button>
              <el-radio-button label="1">文本输入</el-radio-button>
            </el-radio-group>

            <div style="margin-top: 8px">
              <AssigneeInput v-if="assigneeConfigWay==2" v-model:value="model[field]"/>
              <el-input v-else v-model:value="model[field]"></el-input>
            </div>
          </el-form-item>
        </el-form>
        <!--        <a-form :label-col="{ flex: '120px' }" :model="model">-->
        <!--          <a-form-item label="参与者" :colon="false">-->
        <!--            <a-radio-group v-model:value="assigneeConfigWay" button-style="outline" size="small">-->
        <!--              <a-radio-button :value="2">下拉选择</a-radio-button>-->
        <!--              <a-radio-button :value="1">文本输入</a-radio-button>-->
        <!--            </a-radio-group>-->
        <!--            <div style="margin-top: 8px">-->
        <!--              <AssigneeInput v-if="assigneeConfigWay == 2" v-model:value="model[field]" />-->
        <!--              <a-input v-else v-model:value="model[field]" />-->
        <!--            </div>-->
        <!--          </a-form-item>-->
        <!--        </a-form>-->
      </template>
    </SnakerFlowDesigner>
  </div>

</template>

<style scoped >
:deep(.el-form-item__content){
  display: block;
}
</style>
