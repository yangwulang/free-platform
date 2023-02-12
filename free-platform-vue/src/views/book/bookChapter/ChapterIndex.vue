<template>
  <div>
sdf
  </div>
</template>

<script>
import BaseTable from "@/components/BaseTable";
import api from '@/api/index.js'
import columns from './index.js'
import viewUiPlusMixin from "@/mixin/view-ui-plus-mixin";
import tableMixin from '@/mixin/table-mixin'
export default {
  name: "ChapterIndex",
  mixins: [viewUiPlusMixin, tableMixin],
  components: {
    // eslint-disable-next-line vue/no-unused-components
    BaseTable
  },
  data() {
    return {
      columns: columns,
      action: api.book.bookInfo.list
    }
  },
  created() {
    console.log(JSON.parse(JSON.stringify(this.$route.params)))
  },
  methods: {
    handleAdd() {
    },
    handleSearch() {
      this.publicSearch()
    },
  }
}
</script>

<style scoped>

</style>