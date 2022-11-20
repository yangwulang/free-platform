import {createApp} from 'vue'
import App from './App.vue'
import router from "@/router";
import ViewUI from 'view-ui-plus';
import ElementPlus from 'element-plus'
import pinia from "@/store/store";
import axios from "axios";

import 'view-ui-plus/dist/styles/viewuiplus.css'
import 'element-plus/dist/index.css'

const app = createApp(App)

app.config.globalProperties.$http = axios

app.use(router)
    .use(pinia)
    .use(ViewUI)
    .use(ElementPlus)
    .mount('#app')
