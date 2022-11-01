package top.yangwulang.platform.services

import javax.servlet.http.HttpServletRequest

class Page {
    var pageNum: Int = 1
    var pageSize: Int = 20

    constructor() : this(1, 20)

    constructor(pageNum: Int, pageSize: Int) {
        this.pageNum = pageNum
        this.pageSize = pageSize
    }

    constructor(httpServletRequest: HttpServletRequest) {
        var pageNum = httpServletRequest.getParameter("pageNum")
        var pageSize = httpServletRequest.getParameter("pageSize")

        if (pageNum == null) {
            pageNum = httpServletRequest.getParameter("pageN")
        }
        if (pageNum == null) {
            pageNum = "1"
        }
        if (pageSize == null) {
            pageSize = httpServletRequest.getParameter("pageS")
        }
        if (pageSize == null) {
            pageSize = "20"
        }
        this.pageNum = pageNum.toInt()
        this.pageSize = pageSize.toInt()
    }
}