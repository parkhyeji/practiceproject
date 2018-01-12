package nexacro.sample.page;

import java.util.Arrays;

public class PagingVO {

	private String pageName;
	private int totalCnt;
	private int listSize;
	private int pageSize; 
	private int pageNo;
	private int goLeft;
	private int goRight;
	private int totalPage;
	private int userGroup;
	private int startNum;
	private int endNum;
	private Integer nums[];
	private String strNum;
	public String getPageName() {
		return pageName;
	}
	public void setPageName(String pageName) {
		this.pageName = pageName;
	}
	public int getTotalCnt() {
		return totalCnt;
	}
	public void setTotalCnt(int totalCnt) {
		this.totalCnt = totalCnt;
	}
	public int getListSize() {
		return listSize;
	}
	public void setListSize(int listSize) {
		this.listSize = listSize;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getGoLeft() {
		return goLeft;
	}
	public void setGoLeft(int goLeft) {
		this.goLeft = goLeft;
	}
	public int getGoRight() {
		return goRight;
	}
	public void setGoRight(int goRight) {
		this.goRight = goRight;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getUserGroup() {
		return userGroup;
	}
	public void setUserGroup(int userGroup) {
		this.userGroup = userGroup;
	}
	public int getStartNum() {
		return startNum;
	}
	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}
	public int getEndNum() {
		return endNum;
	}
	public void setEndNum(int endNum) {
		this.endNum = endNum;
	}
	public Integer[] getNums() {
		return nums;
	}
	public void setNums(Integer[] nums) {
		this.nums = nums;
	}
	public String getStrNum() {
		return strNum;
	}
	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}
	@Override
	public String toString() {
		return "PagingVO [pageName=" + pageName + ", totalCnt=" + totalCnt
				+ ", listSize=" + listSize + ", pageSize=" + pageSize
				+ ", pageNo=" + pageNo + ", goLeft=" + goLeft + ", goRight="
				+ goRight + ", totalPage=" + totalPage + ", userGroup="
				+ userGroup + ", startNum=" + startNum + ", endNum=" + endNum
				+ ", nums=" + Arrays.toString(nums) + ", strNum=" + strNum
				+ "]";
	}
	
	

	
}
