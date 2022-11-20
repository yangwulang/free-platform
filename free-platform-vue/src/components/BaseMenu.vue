<template>
  <div class="side-menu-wrapper">
    <slot name="header"></slot>
    <Menu
        :theme="theme"
        @on-select="handleSelect"
        v-show="!collapsed"
        style="width: 100%;height: 100%;z-index: 0"
        :active-name="activeNames"
        :open-names="openNames"
    >
      <template v-for="(item, index) in menuList" v-bind:key="`main-menu${index}`">
        <ReSubmenu
            v-if="item.children"
            :key="`menu_${item.name}`"
            :name="item.name"
            :parent="item"
        >
          <menu-item></menu-item>
        </ReSubmenu>
        <MenuItem v-else>
          {{ item.title }}
        </MenuItem>
      </template>
    </Menu>
    <div class="drop-wrapper" v-show="collapsed">
      <template v-for="(item, index) in menuList" v-bind:key="`drop-wrapper${index}`">
        <ReDropdown @on-select="handleSelect" v-if="item.children" icon-color="#fff" :show-title="false"
                    :key="`drop_${item.name}`" :parent="item"></ReDropdown>
        <Tooltip v-else transfer :content="item.title" placement="right" :key="`drop_${item.name}`">
          <span @click="handleClick(item.name)" class="drop-menu-span">
            <Icon :type="item.icon" color="#fff" :size="30"/>
          </span>
        </Tooltip>
      </template>
    </div>
  </div>
</template>

<script>
import {Menu, MenuItem, Icon, Tooltip} from 'view-ui-plus'
import ReSubmenu from "./ReSubmenu";
import ReDropdown from "./ReDropdown";
import BaseUtil from "@/utils/BaseUtil";

export default {
  name: "BaseMenu",
  components: {
    ReSubmenu,
    ReDropdown,
    Menu,
    MenuItem,
    Icon,
    Tooltip
  },
  props: {
    theme: {
      type: String,
      default: 'light'
    },
    menuList: {
      type: Array,
      default: () => []
    },
    collapsed: {
      type: Boolean,
      default: false
    },
  },
  data() {
    return {
      menuIndex: {},
      openNames: [],
      activeNames: ''
    }
  },
  methods: {
    handleSelect(name) {
      this.$emit('handleSelect', name, this.getOneLeftName(this.menuList, name))
    },
    handleClick(name) {
      console.log(name)
    },
    getOneLeftName(menuList, name) {
      if (menuList.length > 0) {
        let arr = BaseUtil.findParent(menuList, (value) => {
          if (name) {
            if (value.name === name) {
              return value
            }
            return false
          } else {
            return value.pId === menuList[0].id
          }
        }, true)
        return {active: arr[arr.length - 1], open: arr}
      }
      return {active: '', open: []}
    }
  },
  created() {
    const {active, open} = this.getOneLeftName(this.menuList)
    this.activeNames = active.name
    this.openNames = open.map(a => a.name)
    this.handleSelect(this.activeNames)
  }
}
</script>

<style scoped>

</style>
