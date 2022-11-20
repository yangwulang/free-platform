<template>
  <Card style="height: calc(100% - .652rem)">
    <template #extra>
      <Space wrap>
        <Button type="primary" shape="circle" icon="md-add" @click="handleAdd">新增</Button>
        <Button shape="circle" icon="ios-search">查询</Button>
      </Space>
    </template>
    <BaseTable :columns="columns" :data="data" :rightPager="true"/>
  </Card>
</template>

<script>
import BaseTable from "@/components/BaseTable.vue";
import columns from './index.js'
import viewUiPlusMixin from "@/mixin/view-ui-plus-mixin";

export default {
  name: "index-dbs",
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

<style scoped>

</style>