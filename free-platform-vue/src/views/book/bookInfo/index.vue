<template>
  <div class="bottom">
    <Card style="">
      <template #title>
        <Icon type="ios-clipboard-outline"/>
      </template>
      <div>
        <Form :label-width="70" inline>
          <FormItem label="测试">
            <Input/>
          </FormItem>
        </Form>
      </div>
    </Card>
    <Card>
      <Space style="margin-bottom: 10px" wrap>
        <Button type="primary" shape="circle" icon="md-add" @click="handleAdd">新增</Button>
        <Button shape="circle" icon="ios-search" @click="handleSearch">查询</Button>
      </Space>
      <BaseTable ref="baseTable" :columns="columns" :action="action" :rightPager="true"
                 @handleViewChapter="handleViewChapter"/>
    </Card>
  </div>
</template>

<script>
import BaseTable from "@/components/BaseTable";
import api from '@/api/index.js'
import columns from './index.js'
import viewUiPlusMixin from "@/mixin/view-ui-plus-mixin";
import tableMixin from '@/mixin/table-mixin'

export default {
  name: "BookInfo",
  mixins: [viewUiPlusMixin, tableMixin],
  components: {
    BaseTable
  },
  data() {
    return {
      columns: columns,
      action: api.book.bookInfo.list
    }
  },
  methods: {
    handleAdd() {
    },
    handleSearch() {
      this.publicSearch()
    },
    handleViewChapter(row, index) {
      this.$router.push({
        name: "bookChapterManager",
        params: {bookId: row.id}
      })
    }
  }
}
</script>

<style lang="scss" scoped>
.bottom {
  height: calc(100% - 65px);
}
</style>