package nexacro.sample.vo.depo;

import nexacro.sample.vo.DefaultVO;

public class DepoVO extends DefaultVO {
	
	//페이징
	private int rownum;
	
	//공탁조회를 위한 데이터
	private String depositDepoAdmNo; //공탁관리번호
	private String depositJuriCortCode; //관할법원코드
	private String depositForcExecSeq; //강제집행일련번호
	private String depositOthDepoName; //피공탁자명
	private String depositDepoName;	//공탁자명
	private String depositDepuName; //대리인명
	private String depositDepoChg; //공탁금액
	private String depositKeepDeptCode; //보관부서코드
	private String depositDepoDate; 	//공탁일자
	private String depositDepoReleDate;  //공탁불출일자
	private String depositDepchgCollDate; //공탁금회수일자
	private String depositDepoCollChg; //공탁회수금액
	private String depositDepoCollRea; //공탁회수사유
	
	//공탁관리번호 조회를 위한 VO
	private String depositmgrDepoAdmNo; //공탁관리번호
	private String depositmgrSeq; //순번
	private String depositmgrId; //담당자ID
	private String depositmgrName; //담당자명 
	private String depositmgrDeptCode; //담당자부서코드
	private String depositmgrAsigDate; //배정일자
	 
	//검색
	private String searchCondition;//검색조건
	private String searchKeyword;//검색어
	
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
	
	public String getDepositDepoAdmNo() {
		return depositDepoAdmNo;
	}
	public void setDepositDepoAdmNo(String depositDepoAdmNo) {
		this.depositDepoAdmNo = depositDepoAdmNo;
	}
	public String getDepositJuriCortCode() {
		return depositJuriCortCode;
	}
	public void setDepositJuriCortCode(String depositJuriCortCode) {
		this.depositJuriCortCode = depositJuriCortCode;
	}
	public String getDepositForcExecSeq() {
		return depositForcExecSeq;
	}
	public void setDepositForcExecSeq(String depositForcExecSeq) {
		this.depositForcExecSeq = depositForcExecSeq;
	}
	public String getDepositOthDepoName() {
		return depositOthDepoName;
	}
	public void setDepositOthDepoName(String depositOthDepoName) {
		this.depositOthDepoName = depositOthDepoName;
	}
	public String getDepositDepoName() {
		return depositDepoName;
	}
	public void setDepositDepoName(String depositDepoName) {
		this.depositDepoName = depositDepoName;
	}
	public String getDepositDepuName() {
		return depositDepuName;
	}
	public void setDepositDepuName(String depositDepuName) {
		this.depositDepuName = depositDepuName;
	}
	public String getDepositDepoChg() {
		return depositDepoChg;
	}
	public void setDepositDepoChg(String depositDepoChg) {
		this.depositDepoChg = depositDepoChg;
	}
	public String getDepositKeepDeptCode() {
		return depositKeepDeptCode;
	}
	public void setDepositKeepDeptCode(String depositKeepDeptCode) {
		this.depositKeepDeptCode = depositKeepDeptCode;
	}
	public String getDepositDepoDate() {
		return depositDepoDate;
	}
	public void setDepositDepoDate(String depositDepoDate) {
		this.depositDepoDate = depositDepoDate;
	}
	public String getDepositDepoReleDate() {
		return depositDepoReleDate;
	}
	public void setDepositDepoReleDate(String depositDepoReleDate) {
		this.depositDepoReleDate = depositDepoReleDate;
	}
	public String getDepositDepchgCollDate() {
		return depositDepchgCollDate;
	}
	public void setDepositDepchgCollDate(String depositDepchgCollDate) {
		this.depositDepchgCollDate = depositDepchgCollDate;
	}
	public String getDepositDepoCollChg() {
		return depositDepoCollChg;
	}
	public void setDepositDepoCollChg(String depositDepoCollChg) {
		this.depositDepoCollChg = depositDepoCollChg;
	}
	public String getDepositDepoCollRea() {
		return depositDepoCollRea;
	}
	public void setDepositDepoCollRea(String depositDepoCollRea) {
		this.depositDepoCollRea = depositDepoCollRea;
	}
	public String getDepositmgrDepoAdmNo() {
		return depositmgrDepoAdmNo;
	}
	public void setDepositmgrDepoAdmNo(String depositmgrDepoAdmNo) {
		this.depositmgrDepoAdmNo = depositmgrDepoAdmNo;
	}
	public String getDepositmgrSeq() {
		return depositmgrSeq;
	}
	public void setDepositmgrSeq(String depositmgrSeq) {
		this.depositmgrSeq = depositmgrSeq;
	}
	public String getDepositmgrId() {
		return depositmgrId;
	}
	public void setDepositmgrId(String depositmgrId) {
		this.depositmgrId = depositmgrId;
	}
	public String getDepositmgrName() {
		return depositmgrName;
	}
	public void setDepositmgrName(String depositmgrName) {
		this.depositmgrName = depositmgrName;
	}
	public String getDepositmgrDeptCode() {
		return depositmgrDeptCode;
	}
	public void setDepositmgrDeptCode(String depositmgrDeptCode) {
		this.depositmgrDeptCode = depositmgrDeptCode;
	}
	public String getDepositmgrAsigDate() {
		return depositmgrAsigDate;
	}
	public void setDepositmgrAsigDate(String depositmgrAsigDate) {
		this.depositmgrAsigDate = depositmgrAsigDate;
	}
	public int getRownum() {
		return rownum;
	}
	public void setRownum(int rownum) {
		this.rownum = rownum;
	}
	
}
