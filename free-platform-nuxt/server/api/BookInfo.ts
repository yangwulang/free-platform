import Http from "~/utils/http";

interface BookInfo {
    id?: string
    bookName?: string
    author?: string
    describe?: string
    bookImgPath?: string
}


export default new class BookInfoApi extends Http<BookInfo> {
    getList(params?: any) {
        return this.POST("/api/book/info/", params)
    }
}
