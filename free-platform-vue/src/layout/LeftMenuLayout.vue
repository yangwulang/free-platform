<template>
  <div class="layout">
    <Layout>
      <Sider class="layout-sider" hide-trigger>
        <BaseMenu
            :menuList="menuList"
            theme="dark"
            @handleSelect="handleMenuSelect">
          <template v-slot:header>
            <div class="header">
              <img class="logo" alt="" :src="require('@/assets/logo.png')"/>
              <p class="title">
                工程迁移
              </p>
            </div>
          </template>
        </BaseMenu>
      </Sider>
      <Layout>
        <Content class="boardContent">
          <Card style="margin-bottom: 10px">
            <Breadcrumb>
              <BreadcrumbItem v-for="(item, index) in openList" :key="index">
                {{ item.title }}
              </BreadcrumbItem>
            </Breadcrumb>
          </Card>
          <RouterView/>
        </Content>
      </Layout>
    </Layout>
  </div>
</template>

<script>
import {Layout, Sider, Breadcrumb, BreadcrumbItem, Card, Content} from 'view-ui-plus'
import BaseMenu from "@/components/BaseMenu";

export default {
  name: "LeftMenuLayout",
  components: {
    BaseMenu,
    Layout,
    Sider,
    Breadcrumb,
    BreadcrumbItem,
    Card,
    Content
  },
  data() {
    return {
      menuList: [{
        title: '迁移工程管理',
        name: 'transferProjectManager',
        id: 'transferProjectManager',
        children: [
          {
            title: '项目管理',
            name: 'projectManager',
            pId: 'transferProjectManager'
          }
        ]
      }, {
        title: "小说平台",
        name: 'bookPlatForm',
        id: 'bookPlatForm',
        children: [
          {
            title: "小说管理",
            name: "bookInfoManager",
            id: "bookInfoManager"
          }
        ]
      }],
      openList: []
    }
  },
  methods: {
    handleMenuSelect(name, {active, open}) {
      this.openList = open
      this.$router.push(active.name)
    }
  }
}
</script>

<style lang="scss" scoped>
.layout {
  height: 100%;

  .ivu-layout {
    height: 100%;

    .header {
      height: 60px;
      color: white;
      padding: 14px 22px;
      display: grid;
      grid-template-columns: 30px calc(100% - 40px);
      grid-template-areas: "header title";
      align-items: center;
      justify-content: space-around;

      .title {
        grid-area: title;
        font-size: 20px;
        font-weight: 200;
      }

      .logo {
        width: 30px;
        grid-area: header;
      }
    }
  }

}
</style>