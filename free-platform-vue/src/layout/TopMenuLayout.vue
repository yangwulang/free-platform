<template>
  <div class="webSiteContext">
    <Menu mode="horizontal" :theme="theme" active-name="1">
      <MenuItem name="icon" class="icon-item" to="/webSite/index">
        <img class="icon" :src="getIconImg" alt=""/>
      </MenuItem>
      <MenuItem name="1" to="/">
        <Icon type="ios-paper"/>
        首页
      </MenuItem>
    </Menu>
    <div class="layoutCenter">
      <RouterView/>
    </div>
  </div>
</template>

<script>

import {Menu, MenuItem, Icon} from 'view-ui-plus'

export default {
  name: "WebSiteLayout",
  components: {
    Menu,
    MenuItem,
    Icon
  },
  data() {
    return {
      drawer: false,
      theme: 'dark',
      isLogin: false,
      searchLoading: false,
      needFullCenter: false,
      needFooter: true,
      searchModel: [],
      contentList: [{label: '测试', value: 'sss'}, {label: '测试', value: 'sss1'}],
    }
  },
  methods: {
  },
  computed: {
    getIconImg() {
      return ''
    }
  },
  created() {
  }
}
</script>

<style lang="scss" scoped>

</style>
