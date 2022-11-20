<template>
  <Submenu :name="parent.name">
    <template v-slot:title>
      <Icon :type="parent.icon"/>
      {{ parent.title }}
    </template>
    <template v-for="(item, index) in parent.children" v-bind:key="`reSubmenu-${index}`">
      <ReSubmenu
          v-if="item.children"
          :key="`menu_${item.name}`"
          :name="item.name"
          :parent="item"
      >
      </ReSubmenu>
      <MenuItem v-else :key="`menu_${item.name}`" :name="item.name">
        <Icon :type="item.icon"/>
        {{ item.title }}
      </MenuItem>
    </template>
  </Submenu>
</template>

<script>
import {Submenu, MenuItem, Icon} from 'view-ui-plus'

export default {
  name: "ReSubmenu",
  components: {
    Submenu,
    MenuItem,
    Icon
  },
  props: {
    parent: {
      type: Object,
      default: () => ({})
    }
  }
}
</script>

<style scoped>

</style>
