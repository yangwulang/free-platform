<template>
  <div class="layout">
    <Layout class="layout-body">
      <Header class="layout-header" :style="{position: 'fixed', width: '100%', zIndex: 1}">
        <Menu mode="horizontal" :theme="theme" active-name="1">
          <div class="layout-logo">

          </div>
          <div class="layout-nav">
            <MenuItem name="1">
              <Icon type="md-book" />
              书籍
            </MenuItem>
            <MenuItem name="2">
              <Icon type="logo-youtube" />
              视频
            </MenuItem>
            <MenuItem name="3">
              <Icon type="md-musical-note" />
              音乐
            </MenuItem>
            <MenuItem name="4">
              <Icon type="md-chatbubbles" />
              聊天
            </MenuItem>
          </div>
        </Menu>
      </Header>
      <Layout>
        <Sider class="layout-sider" hide-trigger>Sider</Sider>
        <Content class="layout-content">
          <slot name="body"></slot>
        </Content>
        <Sider class="layout-sider sider-right" style="width: 30px;min-width: 30px;max-width: 60px">Sider</Sider>
      </Layout>
      <Footer class="layout-footer-center">2011-2016 &copy; View Design</Footer>
    </Layout>
  </div>

</template>

<script setup lang="ts">
import {Icon, MenuItem, Menu, Content, Layout, Sider} from "view-ui-plus";

let theme = "light"
</script>

<style lang="scss" scoped>
.layout {
  border: 1px solid #d7dde4;
  background: #000;
  //position: relative;
  border-radius: 4px;
  overflow: hidden;
  .layout-body {
    .ivu-layout-content {
      &:before {
        content: ' ';
        //position: absolute;
        clear: both;
        display: block;
        height: 60px;
        width: 100%;
      }
    }
  }
}

.layout-logo {
  width: 100px;
  height: 30px;
  //background: #5b6270;
  border-radius: 3px;
  float: left;
  position: relative;
  top: 15px;
  left: 20px;
}

.layout-nav {
  width: 420px;
  margin: 0 20px 0 auto;
}

.layout-footer-center {
  text-align: center;
}

.layout-sider{
  background: #ffffff;
  border-left: 1px;
  border-color: rgba(224,224,224,var(--tw-border-opacity));
  &:before {
    content: ' ';
    //position: absolute;
    clear: both;
    display: block;
    height: 60px;
    width: 100%;
  }
}
.sider-right {
  background: rgba(255,255,255,var(--tw-bg-opacity));
}
</style>