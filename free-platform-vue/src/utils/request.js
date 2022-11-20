import axios, {AxiosResponse} from "axios";
import {authStore} from '@/store/store'
import message from "@/utils/message";
import ViewUI from 'view-ui-plus'

let BASE_URL = process.env.VUE_APP_BASE_URL;
const store = authStore()


axios.defaults.baseURL = String(BASE_URL);
axios.defaults.timeout = 10000
axios.defaults.headers.post['contentType'] = 'application/json;charset=UTF-8'

axios = axios.create({
    baseURL: String(BASE_URL),
    timeout: 10000,
    'header.post': 'application/json;charset=UTF-8'
})

axios.interceptors.request.use(config => {
    if (store.token) {
        config.headers.Authorization = store.token
        config.auth = store.token
    }
    return config
}, error => {
    return Promise.reject(error)
})

axios.interceptors.response.use((response: AxiosResponse) => {
    let dataObj;
    try {
        dataObj = JSON.parse(response.data)
    } catch (e) {
        try {
            // 兼容IE
            if (window.ActiveXObject) {
                const xmlObject = new ActiveXObject("Microsoft.XMLDOM");
                xmlObject.async = "false";
                xmlObject.loadXML(response.data);
                dataObj = xmlObject
            } else {
                const domParser = new DOMParser();
                dataObj = domParser.parseFromString(response.data);
            }
        } catch (xmlE) {
            message.message.error(`数据解析出错 没有设置对应解析器 ${response.data}`)
        }
        const {code, message, data} = dataObj
        if (code !== 200) {
            if (code === 401) {

            }
            message.message.error(message)
            return Promise.reject(data)
        } else {
            return Promise.resolve(data)
        }
    }
}, error => {
    if (error.response.status) {
        switch (error.response.status) {
            case 401:
                message.message.error('非后台校验授权登录状态')
                break;
            case 403:
                message.message.error('非后台校验授权登录状态')
                break;
            case 404:
                message.message.error('系统路径不存在')
                break;
            default:
                message.message.error(error.response.data.message)
                break;
        }
        return Promise.reject(error)
    }
})

export function request(url,
                        params,
                        method = 'GET',
                        config = {},) {
    return new Promise((resolve, reject) => {
        ViewUI.LoadingBar.start()
        axios({
            method: method,
            url: url,
            data: params
        }).then(data => {
            resolve(data)
        }).catch(e => {
            reject(e)
        })
        ViewUI.LoadingBar.finish()
    })
}
