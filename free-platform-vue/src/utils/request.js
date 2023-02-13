import axios, {AxiosResponse} from "axios";
import {authStore} from '@/store/store'
import messageEvent from "@/utils/message";
import ViewUI from 'view-ui-plus'

let BASE_URL = process.env.VUE_APP_BASE_URL;
const store = authStore()


// axios.defaults.baseURL = String(BASE_URL);
axios.defaults.timeout = 10000
axios.defaults.headers["Content-Type"] = 'application/json'
// axios.defaults.headers.post['Accept'] = 'application/x-www-form-urlencoded'

let $axios = axios.create({
    // baseURL: String(BASE_URL),
    timeout: 10000
})

$axios.interceptors.request.use(config => {
    if (store.token) {
        config.headers.Authorization = store.token
        config.auth = store.token
    }
    return config
}, error => {
    return Promise.reject(error)
})

$axios.interceptors.response.use((response) => {
    const {code, message, result} = response.data
    if (code !== 200 && code !== '200') {
        // if (code === 401) {}
        messageEvent.message.error(message)
        return Promise.reject(result)
    } else {
        messageEvent.message.success(message)
        return Promise.resolve(result)
    }
}, error => {
    if (error.response.status) {
        switch (error.response.status) {
            case 401:
                messageEvent.message.error('非后台校验授权登录状态')
                break;
            case 403:
                messageEvent.message.error('非后台校验授权登录状态')
                break;
            case 404:
                messageEvent.message.error('系统路径不存在')
                break;
            default:
                messageEvent.message.error(error.response.data.message)
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
        $axios({
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
