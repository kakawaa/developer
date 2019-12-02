package it.gomcarter.frameworks.base.pager;


/**
 * 提供默认的翻页工具（支持mysql）
 *
 * @authher gomcarter 2017年12月2日 08:10:35
 */
public class DatagridPager implements Pageable {
    protected int rows = 20;
    protected int page = 1;
    protected String sort = "id";
    protected String order = "desc";

    public DatagridPager(int rows, int page) {
        this.rows = rows;
        this.page = page;
    }

    public DatagridPager(int rows, int page, String sort, String order) {
        this.rows = rows;
        this.page = page;
        this.sort = sort;
        this.order = order;
    }

    public DatagridPager() {

    }

    @Override
    public Pageable turnPage(int pageNo) {
        this.page = pageNo;
        return this;
    }

    public int getRows() {
        return rows;
    }

    public DatagridPager setRows(int rows) {
        this.rows = rows;
        return this;
    }

    public int getPage() {
        return page;
    }

    public DatagridPager setPage(int page) {
        this.page = page;
        return this;
    }

    public String getSort() {
        return sort;
    }

    public DatagridPager setSort(String sort) {
        this.sort = sort;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public DatagridPager setOrder(String order) {
        this.order = order;
        return this;
    }

    @Override
    public int getStartNum() {
        return this.rows * (this.page - 1);
    }

    @Override
    public int getPageCount() {
        return this.rows;
    }

    @Override
    public String getOrderColumn() {
        return sort;
    }

    @Override
    public String getOrderType() {
        return order;
    }
}