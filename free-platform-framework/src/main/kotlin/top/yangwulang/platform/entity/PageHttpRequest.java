package top.yangwulang.platform.entity;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import jakarta.servlet.http.HttpServletRequest;
public class PageHttpRequest {
    private final Integer pageNum;
    private final Integer pageSize;

    public PageHttpRequest() {
        this(1, 20);
    }

    public PageHttpRequest(Integer pageNum, Integer pageSize) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
    }

    public PageHttpRequest(HttpServletRequest httpServletRequest) {
        Integer pageNum = null;
        try {
            pageNum = Integer.parseInt(httpServletRequest.getParameter("pageNum"));
        } catch (Exception e) {
            try {
                pageNum = Integer.parseInt(httpServletRequest.getParameter("pageN"));
            } catch (Exception ignored) {
            }
        }

        Integer pageSize = null;
        try {
            pageSize = Integer.parseInt(httpServletRequest.getParameter("pageSize"));
        } catch (Exception e) {
            try {
                pageSize = Integer.parseInt(httpServletRequest.getParameter("pageS"));
            } catch (Exception ignored) {
            }
        }
        this.pageNum = pageNum == null ? 1 : pageNum;
        this.pageSize = pageSize == null ? 20 : pageSize;
    }
    public static PageHttpRequest of(HttpServletRequest httpServletRequest) {
        return new PageHttpRequest(httpServletRequest);
    }

    public Pageable toPage(Sort sort) {
        int page = this.pageNum <= 0 ? 0 : this.pageNum - 1;
        return sort == null ? PageRequest.of(page, this.pageSize) : PageRequest.of(page, this.pageSize, sort);
    }

    public Pageable toPage() {
        return toPage(null);
    }


}
