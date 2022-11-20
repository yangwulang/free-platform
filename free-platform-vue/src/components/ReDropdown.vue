<template>
  <Dropdown @on-click="handleClick" placement="right-start">
    <span class="drop-menu-span" :style="titleStyle">
      <Icon :type="parent.icon" :color="iconColor" :size="30"></Icon>
      <span  color="#515a6e" v-if="showTitle">{{ parent.title }}</span>
    </span>
    <template v-slot:list>
      <DropdownMenu>
        <template v-for="(item, index) in parent.children" v-bind:key="`reDropdown-${index}`">
          <re-dropdown v-if="item.children" :key="`drop_${item.name}`" :parent="item"></re-dropdown>
          <DropdownItem v-else :key="`drop_${item.name}`" :name="item.name">
            <Icon :type="item.icon" color="#515a6e" :size="30"></Icon>
            {{ item.title }}
          </DropdownItem>
        </template>
      </DropdownMenu>
    </template>
  </Dropdown>
</template>

<script>
import {Dropdown, DropdownMenu, Icon,DropdownItem} from 'view-ui-plus'
export default {
  name: "ReDropdown",
  components: {
    Dropdown,
    DropdownMenu,
    Icon,
    DropdownItem
  },
  props: {
    parent: {
      type: Object,
      default: () => ({})
    },
    iconColor: {
      type: String,
      default: '#515a6e'
    },
    showTitle: {
      type: Boolean,
      default: true
    }
  },
  computed: {
    titleStyle () {
      return {
        textAlign: this.showTitle ? 'left' : 'center',
        paddingLeft: this.showTitle ? '16px' : ''
      }
    }
  },
  methods: {
    handleClick (name) {
      if (!this.showTitle) this.$emit('on-select', name)
    }
  }
}
</script>

<style scoped>

</style>
