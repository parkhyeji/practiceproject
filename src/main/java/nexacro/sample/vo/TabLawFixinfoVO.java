package nexacro.sample.vo;

import java.util.Date;

public class TabLawFixinfoVO extends PageableVO{

	// TAB_INST_ADM
	private String lawsuitAdmNo; // 소송관리번호
	private String instAdmCode; // 심급코드
	private String instAdmCaseNo; // 사건번호
	private String instAdmPrgrCode; // 소송진행상태코드
	private String instAdmCortCode; // 수행법원코드

	//TAB_PLADEF
	private String lawsuitCpPladefSepcode; // 당사 원피고 구분코드
	private String pladefName; // 원피고명
	private String pladefClamVol; // 원피고별 청구소가

	// TAB_LAWSUIT
	private String lawsuitCaseTyCode; // 사건유형코드

	// TAB_LAW_FIXINFO
	private int lawFixinfoNum;//일련번호
	private String lawFixinfoSepcode; // 기일부분코드
	private Date lawFixinfoDate; // 기일일시
	private String lawFixinfoPlc; // 기일장소
	private String lawFixinfoMainIssu; // 주요쟁점사항
	private String lawFixinfoCpInsi; // 당사주장
	private String lawFixinfoOthInsi; // 상대방주장
	private String lawFixinfoCortOpin; // 재판부의견
	private String lawFixinfoLyrOpin; // 변호사의견
	private Date lawFixinfoDlinDate; // 기일마감일시
	
	
	
	public int getLawFixinfoNum() {
		return lawFixinfoNum;
	}
	public void setLawFixinfoNum(int lawFixinfoNum) {
		this.lawFixinfoNum = lawFixinfoNum;
	}
	public String getLawsuitAdmNo() {
		return lawsuitAdmNo;
	}
	public void setLawsuitAdmNo(String lawsuitAdmNo) {
		this.lawsuitAdmNo = lawsuitAdmNo;
	}
	public String getInstAdmCode() {
		return instAdmCode;
	}
	public void setInstAdmCode(String instAdmCode) {
		this.instAdmCode = instAdmCode;
	}
	public String getInstAdmCaseNo() {
		return instAdmCaseNo;
	}
	public void setInstAdmCaseNo(String instAdmCaseNo) {
		this.instAdmCaseNo = instAdmCaseNo;
	}
	public String getInstAdmPrgrCode() {
		return instAdmPrgrCode;
	}
	public void setInstAdmPrgrCode(String instAdmPrgrCode) {
		this.instAdmPrgrCode = instAdmPrgrCode;
	}
	public String getInstAdmCortCode() {
		return instAdmCortCode;
	}
	public void setInstAdmCortCode(String instAdmCortCode) {
		this.instAdmCortCode = instAdmCortCode;
	}
	public String getLawsuitCpPladefSepcode() {
		return lawsuitCpPladefSepcode;
	}
	public void setLawsuitCpPladefSepcode(String lawsuitCpPladefSepcode) {
		this.lawsuitCpPladefSepcode = lawsuitCpPladefSepcode;
	}
	public String getPladefName() {
		return pladefName;
	}
	public void setPladefName(String pladefName) {
		this.pladefName = pladefName;
	}
	public String getPladefClamVol() {
		return pladefClamVol;
	}
	public void setPladefClamVol(String pladefClamVol) {
		this.pladefClamVol = pladefClamVol;
	}
	public String getLawsuitCaseTyCode() {
		return lawsuitCaseTyCode;
	}
	public void setLawsuitCaseTyCode(String lawsuitCaseTyCode) {
		this.lawsuitCaseTyCode = lawsuitCaseTyCode;
	}
	public String getLawFixinfoSepcode() {
		return lawFixinfoSepcode;
	}
	public void setLawFixinfoSepcode(String lawFixinfoSepcode) {
		this.lawFixinfoSepcode = lawFixinfoSepcode;
	}
	
	public String getLawFixinfoPlc() {
		return lawFixinfoPlc;
	}
	public void setLawFixinfoPlc(String lawFixinfoPlc) {
		this.lawFixinfoPlc = lawFixinfoPlc;
	}
	public String getLawFixinfoMainIssu() {
		return lawFixinfoMainIssu;
	}
	public void setLawFixinfoMainIssu(String lawFixinfoMainIssu) {
		this.lawFixinfoMainIssu = lawFixinfoMainIssu;
	}
	public String getLawFixinfoCpInsi() {
		return lawFixinfoCpInsi;
	}
	public void setLawFixinfoCpInsi(String lawFixinfoCpInsi) {
		this.lawFixinfoCpInsi = lawFixinfoCpInsi;
	}
	public String getLawFixinfoOthInsi() {
		return lawFixinfoOthInsi;
	}
	public void setLawFixinfoOthInsi(String lawFixinfoOthInsi) {
		this.lawFixinfoOthInsi = lawFixinfoOthInsi;
	}
	public String getLawFixinfoCortOpin() {
		return lawFixinfoCortOpin;
	}
	public void setLawFixinfoCortOpin(String lawFixinfoCortOpin) {
		this.lawFixinfoCortOpin = lawFixinfoCortOpin;
	}
	public String getLawFixinfoLyrOpin() {
		return lawFixinfoLyrOpin;
	}
	public void setLawFixinfoLyrOpin(String lawFixinfoLyrOpin) {
		this.lawFixinfoLyrOpin = lawFixinfoLyrOpin;
	}
	public Date getLawFixinfoDate() {
		return lawFixinfoDate;
	}
	public void setLawFixinfoDate(Date lawFixinfoDate) {
		this.lawFixinfoDate = lawFixinfoDate;
	}
	public Date getLawFixinfoDlinDate() {
		return lawFixinfoDlinDate;
	}
	public void setLawFixinfoDlinDate(Date lawFixinfoDlinDate) {
		this.lawFixinfoDlinDate = lawFixinfoDlinDate;
	}
    
	
	
}
