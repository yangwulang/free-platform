<template>
  <Card style="height: calc(100% - .652rem)">
    <template #title>
      asdf
    </template>
    <Form ref="formValidate" :model="formValidate" :rules="ruleValidate" :label-width="80">
      <FormItem label="项目名" prop="projectName">
        <Input v-model="formValidate.projectName" placeholder="Enter your name"></Input>
      </FormItem>
      <FormItem>
        <Button type="primary" @click="handleSubmit('formValidate')">保存</Button>
        <Button @click="handleReset('formValidate')" style="margin-left: 8px">重置</Button>
      </FormItem>
    </Form>
  </Card>
</template>

<script>
import viewUiPlusMixin from "@/mixin/view-ui-plus-mixin";
export default {
  name: "ProjectFrom",
  mixins: [viewUiPlusMixin],
  components: {
  },
  data() {
    return {
      formValidate: {
        projectName: ''
      },
      ruleValidate: []
    }
  },
  methods: {
    handleSubmit(form) {

    },
    handleReset(form) {

    }
  }
}
</script>

<style scoped>

</style>