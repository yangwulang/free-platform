<template>
  <div class="baseTable">
    <Table
        class="table"
        :columns="columns"
        :data="realData"
        :loading="isLoading"
        :show-header="showHeader"
        :stripe="stripe"
    ></Table>
    <Page
        :class-name="rightPager ? 'page-right' : 'page-left'"
        :total="total"
        :show-total="true"
        :show-elevator="showElevator"
        :show-sizer="showSizer"
        :page-size="pageSize"
        :current="current"
        :disabled="disabledPager"
    />
  </div>
</template>

<script>
import {Table, Page} from 'view-ui-plus'

export default {
  name: "BaseTable",
  components: {
    Table,
    Page
  },
  props: {
    columns: {
      type: Array,
      default: () => []
    },
    stripe: {
      type: Boolean,
      default: () => true
    },
    border: {
      type: Boolean,
      default: () => false
    },
    showHeader: {
      type: Boolean,
      default: () => true
    },
    action: {
      type: String,
      default: () => null
    },
    data: {
      type: Array,
      default: () => null
    },
    rightPager: {
      type: Boolean,
      default: () => false
    },
    showElevator: {
      type: Boolean,
      default: () => false
    },
    showSizer: {
      type: Boolean,
      default: () => true
    },
    pageSize: {
      type: Number,
      default: () => 20
    },
    current: {
      type: Number,
      default: () => 1
    },
    disabledPager: {
      type: Boolean,
      default: () => false
    }
  },
  data() {
    return {
      isLoading: false,
      realData: [],
      total: 0,
      realCurrent: 1,
      realPageSize: 20
    }
  },
  computed: {},
  methods: {
    publicGet() {
      this.isLoading = true;
      if (this.data) {
        this.realData = this.data
      } else {
        if (this.action) {
          // TODO: 如果请求链接不为空，则请求数据，否则使用空数据
        } else {
          this.realData = []
        }
      }
      this.total = this.realData.length
      this.isLoading = false;
    }
  },
  created() {
    this.publicGet()
  }
}
</script>

<style lang="scss" scoped>
.baseTable {
  min-height: 35rem;
  max-height: 100%;
  width: 100%;

  .table {
    margin-bottom: 30px;
  }

  .page-right {
    float: right;
  }

  .page-left {
    float: left;
  }
}
</style>
