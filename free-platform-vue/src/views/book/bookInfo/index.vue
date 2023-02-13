<template>
  <div class="bottom">
    <Card style="">
      <template #title>
        <Icon type="ios-clipboard-outline"/>
      </template>
      <div>
        <Form :label-width="70" :model="queryForm" inline>
          <FormItem label="小说名称" prop="bookName">
            <Input v-model="queryForm.bookName" placeholder="请输入书籍名"></Input>
          </FormItem>
          <FormItem label="作者" prop="author">
            <Input v-model="queryForm.author" placeholder="请输入作者名"></Input>
          </FormItem>
        </Form>
      </div>
    </Card>
    <Card>
      <Space style="margin-bottom: 10px" wrap>
        <Button type="primary" shape="circle" icon="md-add" @click="handleAdd">新增</Button>
        <Button shape="circle" icon="ios-search" @click="handleSearch">查询</Button>
      </Space>
      <BaseTable ref="baseTable"
                 :columns="columns"
                 :action="action"
                 :rightPager="true"
                 :action-buttons="actionBtn"
                 @handleViewChapter="handleViewChapter"
                 @handleEdit="handleEdit"/>
    </Card>
    <Drawer title="Basic Drawer" :closable="false" v-model="isOpenOptionDraw" width="1200">
      <Form ref="formValidate" :model="form" :label-width="150">
        <Row>
          <Col span="12">
            <FormItem label="书籍名称" prop="bookName">
              <Input v-model="form.bookName" placeholder="请输入书籍名"></Input>
            </FormItem>
          </Col>
          <Col span="12">
            <FormItem label="作者" prop="author">
              <Input v-model="form.author" placeholder="请输入作者"></Input>
            </FormItem>
          </Col>
        </Row>
        <FormItem label="书籍图片地址" prop="bookName">
          <img :src="form.bookImgPath" alt="">
          <Input v-model="form.bookImgPath" placeholder="书籍图片地址"></Input>
        </FormItem>
        <FormItem label="分类" prop="category">
          <Input v-model="form.category" placeholder="请输入分类"></Input>
        </FormItem>
        <FormItem label="描述" prop="describe">
          <Input v-model="form.describe" type="textarea" :border="false" :rows="4" placeholder="请输入分类"></Input>
        </FormItem>
      </Form>
    </Drawer>
  </div>
</template>

<script>
import BaseTable from "@/components/BaseTable";
import api from '@/api/index.js'
import columns from './index.js'
import viewUiPlusMixin from "@/mixin/view-ui-plus-mixin";
import tableMixin from '@/mixin/table-mixin'
import {request} from "@/utils/request";
import {Col} from "view-ui-plus";

export default {
  name: "BookInfo",
  mixins: [viewUiPlusMixin, tableMixin],
  components: {
    Col,
    BaseTable
  },
  data() {
    return {
      columns: columns,
      action: api.book.bookInfo.list,
      actionBtn: [{
        type: 'text',
        name: '同步章节',
        click: this.handleAsyncChapter
      },{
        type: 'text',
        name: '查看章节',
        click: this.handleViewChapter
      }],
      queryForm: {
        bookName: '',
        author: ''
      },
      form: {
        bookName: '',
        bookImgPath: '',
        category: '',
        describe: '',
        status: '',
        author: ''
      },
      isOpenOptionDraw: false
    }
  },
  methods: {
    handleAdd() {
    },
    handleAsyncChapter(row, index) {
      request(api.book.bookInfo.asyncChapter, {id: row.id}, 'post').then(result => {
        console.log(result)
      })
    },
    handleSearch() {
      this.publicSearch(this.queryForm)
    },
    handleEdit(handleEdit) {
      this.isOpenOptionDraw = true
      request(this.action + handleEdit.id, {}).then(result => {
        this.form = result
      })
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