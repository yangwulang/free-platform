<template>
  <div class="bottom">
    <Card style="">
      <template #title>
        <Icon type="ios-clipboard-outline" />

      </template>
      <div>
        <Form :label-width="70" inline>
          <FormItem label="测试">
            <Input />
          </FormItem>
        </Form>
      </div>
    </Card>
    <Card>
      <Space style="margin-bottom: 10px" wrap>
        <Button type="primary" shape="circle" icon="md-add" @click="handleAdd">新增</Button>
        <Button shape="circle" icon="ios-search">查询</Button>
      </Space>
      <BaseTable :columns="columns" :data="data" :rightPager="true"/>
    </Card>
  </div>
</template>

<script>
import BaseTable from "@/components/BaseTable";
import columns from './index.js'
import viewUiPlusMixin from "@/mixin/view-ui-plus-mixin";

export default {
  name: "BookInfo",
  mixins: [viewUiPlusMixin],
  components: {
    BaseTable
  },
  data() {
    return {
      columns: columns,
      data: [{
        projectName: '测试项目',
        state: 'SOURCE_INIT'
      }],
      value: 1
    }
  },
  methods: {
    handleAdd() {
      this.$router.push("newProjectManager")
    }
  }
}
</script>

<style lang="scss" scoped>
.bottom {
  height: calc(100% - 65px);
}
</style>