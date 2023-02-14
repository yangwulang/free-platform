import {hash} from "ohash";


export interface SResponse<T> {
    result?: T
    code: number | string
    message: string
}

const fetch = (url: string, options?: any, headers?: any): Promise<any> => {
    const {public: {BASE_URL, REWRITE_PATH}} = useRuntimeConfig()
    url = url.replace(new RegExp('^' + REWRITE_PATH), "")
    const requestUrl = BASE_URL + url
    const key = hash(JSON.stringify(options) + url)
    const customHeaders = {token: useCookie('token').value, ...headers}

    return new Promise((resolve, reject) => {
        useFetch<SResponse<any>>(requestUrl, {...options, key, headers: customHeaders}).then(({data, error}) => {
            if (error.value) {
                reject(error.value)
                return
            }
            let value: SResponse<any> = data.value as SResponse<any>
            if (value.code !== '200') {
                // 这里处理错你自定义的错误，例如code !== 1
                throw createError({
                    statusCode: 500,
                    statusMessage: requestUrl,
                    message: '自己后端接口的报错信息',
                })
            } else {
                resolve(value.result)
            }
        }).catch((err: any) => {
            console.log(err)
            reject(err)
        })
    })
}

export default class Http {
    GET(url: string, params?: any, headers?: any): Promise<any> {
        return fetch(url, {method: 'get', params: params}, headers)
    }

    POST(url: string, params?: any, headers?: any): Promise<any> {
        return fetch(url, {method: 'post', params: params}, headers)
    }

    PUT(url: string, params?: any, headers?: any): Promise<any> {
        return fetch(url, {method: 'put', params: params}, headers)
    }

    DELETE(url: string, params?: any, headers?: any): Promise<any> {
        return fetch(url, {method: 'delete', params: params}, headers)
    }
}

