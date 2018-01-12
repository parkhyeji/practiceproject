package nexacro.sample.vo;

public class PageVO {
	private int pageNo = 0;
	private int listSize;
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getListSize() {
		return listSize;
	}
	public void setListSize(int listSize) {
		this.listSize = listSize;
	}
	public PageVO(int pageNo, int listSize) {
		super();
		this.pageNo = pageNo;
		this.listSize = listSize;
	}
	public PageVO() {
		super();
	}
	
}
