import {getCurrentInstance} from 'vue';

export default {
    data() {
        return {
            ref: null
        }
    },
    mounted() {
        this.ref = getCurrentInstance()
    },
    methods: {
        publicSearch(form) {
            this.ref.ctx.$refs.baseTable.publicGet(form)
        }
    }
}