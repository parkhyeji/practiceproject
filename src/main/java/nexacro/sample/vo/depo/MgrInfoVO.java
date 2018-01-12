package nexacro.sample.vo.depo;

import nexacro.sample.vo.DefaultVO;

public class MgrInfoVO extends DefaultVO{
 
	private int rownum;
	
	private String insaSabun;
	private String insaName;
	private String insaEmail;
	private String insaDeptCode;
	private String deptName;
	
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	private String searchCondition;
	private String searchKeyword;
	
	public String getSearchCondition() {
		return searchCondition;
	}
	public void setSearchCondition(String searchCondition) {
		this.searchCondition = searchCondition;
	}
	public String getSearchKeyword() {
		return searchKeyword;
	}
	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}
	public int getRownum() {
		return rownum;
	}
	public void setRownum(int rownum) {
		this.rownum = rownum;
	}
	public String getInsaSabun() {
		return insaSabun;
	}
	public void setInsaSabun(String insaSabun) {
		this.insaSabun = insaSabun;
	}
	public String getInsaName() {
		return insaName;
	}
	public void setInsaName(String insaName) {
		this.insaName = insaName;
	}
	public String getInsaEmail() {
		return insaEmail;
	}
	public void setInsaEmail(String insaEmail) {
		this.insaEmail = insaEmail;
	}
	public String getInsaDeptCode() {
		return insaDeptCode;
	}
	public void setInsaDeptCode(String insaDeptCode) {
		this.insaDeptCode = insaDeptCode;
	}
	
}
