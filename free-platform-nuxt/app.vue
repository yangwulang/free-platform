<template>
  <NuxtLayout :name="layout">
    <template #body>
      <!--      <Button>测试机哦</Button>-->
      <NuxtPage/>
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