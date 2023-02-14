import Http from "~/utils/http";


export default new class BookInfoApi extends Http {
    getList(params?: any) {
        return this.POST("/api/book/info/", params)
    }
}
