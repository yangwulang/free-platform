import {defineStore, createPinia} from 'pinia'

const pinia = createPinia()

/**
 * 授权存储桶
 * @type {StoreDefinition<string, {userInfo: {id: string, userName: string}}, GettersTree<{userInfo: {id: string, userName: string}}>, unknown>}
 */
export const authStore = defineStore({
    id: 'authStore',
    state: () => ({
        userInfo: {
            userName: '测试',
            id: 'xxxxxx'
        }
    }),
})
/**
 * 配置存储桶
 * @type {StoreDefinition<string, {enableBaseFooter: boolean}, GettersTree<{enableBaseFooter: boolean}>, unknown>}
 */
export const configStore = defineStore({
    id: 'configStore',
    state: () => ({
        enableBaseFooter: true
    })
})
/**
 * 音乐存储桶
 * @type {StoreDefinition<string, StateTree, GettersTree<StateTree>, unknown>} d
 */
export const musicStore = defineStore({
    id: 'musicStore'
})

/**
 * 视频存储桶
 * @type {StoreDefinition<string, StateTree, GettersTree<StateTree>, unknown>}
 */
export const movieStore = defineStore({
    id: 'movieStore',
})

export default pinia
