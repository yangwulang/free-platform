<template>
  <div class="baseTable">
    <Table
        class="table"
        :height="height"
        :max-height="maxHeight"
        :columns="columns"
        :data="realData"
        :loading="isLoading"
        :show-header="showHeader"
        :stripe="stripe"
    >
      <template #action="{ row, index }">
        <Button
            v-for="(item, index) in actionButtons"
            :key="`optionBtn-${index}`"
            :type="item.type"
            @click="item.click(row, index)"
        >
          {{ item.name }}
        </Button>
        <Button type="text" @click="handleEdit(row, index)">编辑</Button>
      </template>
    </Table>
    <Page
        :class-name="rightPager ? 'page-right' : 'page-left'"
        :total="total"
        :show-total="true"
        :show-elevator="showElevator"
        :show-sizer="showSizer"
        :page-size="pageSize"
        :current="current"
        :disabled="disabledPager"
        @onChange="handlePageChange"
        @onPageSizeChange="handlePageSizeChange"
    />
  </div>
</template>

<script>
import {Table, Page, Button} from 'view-ui-plus'
import {request} from "@/utils/request";

export default {
  name: "BaseTable",
  components: {
    Button,
    Table,
    Page
  },
  props: {
    columns: {
      type: Array,
      default: () => []
    },
    actionButtons: {
      type: Array,
      default: () => []
    },
    stripe: {
      type: Boolean,
      default: () => true
    },
    maxHeight: {
      type: Number,
      default: () => 600
    },
    height: {
      type: Number,
      default: () => 480
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
    },
    model: {
      type: Object,
      default: () => {
      }
    }
  },
  data() {
    return {
      isLoading: false,
      realData: [],
      total: 0,
      realCurrent: 1,
      realPageSize: 20,
      realAction: ''
    }
  },
  computed: {},
  methods: {
    publicGet(form = {}) {
      this.isLoading = true;
      if (this.data) {
        this.realData = this.data
        this.total = this.realData.length
      } else {
        if (this.action) {
          if (this.realAction === '') {
            this.realAction = this.action
          }
          this.requestListData(form)
        } else {
          this.realData = []
          this.total = this.realData.length
        }
      }
      this.isLoading = false;
    },
    requestListData(form = {}) {
      request(this.realAction, form, 'post').then(result => {
        this.realData = result.content
        this.total = result.totalElements
        this.realPageSize = result.numberOfElements
        this.realCurrent = result.number + 1
      })
    },
    handlePageChange(page) {
      this.realAction = `${this.action}?pageNum=${page}&pageSize=${this.realPageSize}`
      this.requestListData()
    },
    handlePageSizeChange(pageSize) {
      this.realPageSize = pageSize
    },
    handleViewChapter(row, index) {
      this.$emit('handleViewChapter', row, index)
    },
    handleEdit(row, index) {
      this.$emit('handleEdit', row, index)
    }
  },
  created() {
    this.$nextTick(() => {
      this.publicGet(this.model)
    })
  }
}
</script>

<style lang="scss" scoped>
.baseTable {
  //min-height: 35rem;
  //max-height: 100rem;
  width: 100%;
  overflow: hidden;

  .table {
    margin-bottom: 30px;
  }

  .page-right {
    float: right;
    margin-bottom: 5rem;
  }

  .page-left {
    float: left;
  }
}
</style>
