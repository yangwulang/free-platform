<template>
  <NuxtLayout :name="layout">
    <template v-slot:body="data">
      <div>{{data.currentRoute}}</div>
      <!--      <Button>测试机哦</Button>-->
      <NuxtPage :route="data.currentRoute"/>
    </template>
  </NuxtLayout>
</template>

<script setup lang="ts">
import {Button} from "view-ui-plus";

let layout = "default";
</script>

<style lang="scss">
* {
  margin: 0;
  padding: 0;
}
</style>