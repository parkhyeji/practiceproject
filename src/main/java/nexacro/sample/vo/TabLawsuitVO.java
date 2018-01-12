package nexacro.sample.vo;

import java.util.Date;

/**
 * 
 * @author SHIN WC
 * @since 10.23.2017
 * @version 1.0
 * @see
 */
public class TabLawsuitVO extends PageableVO {

    //소송 테이블
	private String lawsuitAdmNo;//소송관리번호
	private String lawRaisreqNo;//소제기의뢰번호
	private String lawsuitAplCortCode;//신청법원코드
	private String lawsuitAplCaseCode;//신청사건번호
	private String lawsuitCaseTyCode;//사건유형코드
	private String lawsuitCpPladefSepcode;//당사원피고구분코드
	private String lawsuitAsitParcWtr;//보조참가여부
	private String lawsuitCtaWtr;//반소여부
	private String lawsuitCtaNo;//반소송번호
	private String lawsuitCtaCaseNo;//반소사건번호
	private int lawsuitCtaChg;
	private String lawsuitTempReqiDate;//소송가접수일자
	private String lawsuitRaisRea;//소송제기사유
	private String lawsuitCostCfnApldate;
	private String lawsuitConcDate;
	private String lawsuitFulfDetmWtr;
	public String getLawsuitAdmNo() {
		return lawsuitAdmNo;
	}
	public void setLawsuitAdmNo(String lawsuitAdmNo) {
		this.lawsuitAdmNo = lawsuitAdmNo;
	}
	public String getLawRaisreqNo() {
		return lawRaisreqNo;
	}
	public void setLawRaisreqNo(String lawRaisreqNo) {
		this.lawRaisreqNo = lawRaisreqNo;
	}
	public String getLawsuitAplCortCode() {
		return lawsuitAplCortCode;
	}
	public void setLawsuitAplCortCode(String lawsuitAplCortCode) {
		this.lawsuitAplCortCode = lawsuitAplCortCode;
	}
	public String getLawsuitAplCaseCode() {
		return lawsuitAplCaseCode;
	}
	public void setLawsuitAplCaseCode(String lawsuitAplCaseCode) {
		this.lawsuitAplCaseCode = lawsuitAplCaseCode;
	}
	public String getLawsuitCaseTyCode() {
		return lawsuitCaseTyCode;
	}
	public void setLawsuitCaseTyCode(String lawsuitCaseTyCode) {
		this.lawsuitCaseTyCode = lawsuitCaseTyCode;
	}
	public String getLawsuitCpPladefSepcode() {
		return lawsuitCpPladefSepcode;
	}
	public void setLawsuitCpPladefSepcode(String lawsuitCpPladefSepcode) {
		this.lawsuitCpPladefSepcode = lawsuitCpPladefSepcode;
	}
	public String getLawsuitAsitParcWtr() {
		return lawsuitAsitParcWtr;
	}
	public void setLawsuitAsitParcWtr(String lawsuitAsitParcWtr) {
		this.lawsuitAsitParcWtr = lawsuitAsitParcWtr;
	}
	public String getLawsuitCtaWtr() {
		return lawsuitCtaWtr;
	}
	public void setLawsuitCtaWtr(String lawsuitCtaWtr) {
		this.lawsuitCtaWtr = lawsuitCtaWtr;
	}
	public String getLawsuitCtaNo() {
		return lawsuitCtaNo;
	}
	public void setLawsuitCtaNo(String lawsuitCtaNo) {
		this.lawsuitCtaNo = lawsuitCtaNo;
	}
	public String getLawsuitCtaCaseNo() {
		return lawsuitCtaCaseNo;
	}
	public void setLawsuitCtaCaseNo(String lawsuitCtaCaseNo) {
		this.lawsuitCtaCaseNo = lawsuitCtaCaseNo;
	}
	public int getLawsuitCtaChg() {
		return lawsuitCtaChg;
	}
	public void setLawsuitCtaChg(int lawsuitCtaChg) {
		this.lawsuitCtaChg = lawsuitCtaChg;
	}
	public String getLawsuitTempReqiDate() {
		return lawsuitTempReqiDate;
	}
	public void setLawsuitTempReqiDate(String lawsuitTempReqiDate) {
		this.lawsuitTempReqiDate = lawsuitTempReqiDate;
	}
	public String getLawsuitRaisRea() {
		return lawsuitRaisRea;
	}
	public void setLawsuitRaisRea(String lawsuitRaisRea) {
		this.lawsuitRaisRea = lawsuitRaisRea;
	}
	public String getLawsuitCostCfnApldate() {
		return lawsuitCostCfnApldate;
	}
	public void setLawsuitCostCfnApldate(String lawsuitCostCfnApldate) {
		this.lawsuitCostCfnApldate = lawsuitCostCfnApldate;
	}
	public String getLawsuitConcDate() {
		return lawsuitConcDate;
	}
	public void setLawsuitConcDate(String lawsuitConcDate) {
		this.lawsuitConcDate = lawsuitConcDate;
	}
	public String getLawsuitFulfDetmWtr() {
		return lawsuitFulfDetmWtr;
	}
	public void setLawsuitFulfDetmWtr(String lawsuitFulfDetmWtr) {
		this.lawsuitFulfDetmWtr = lawsuitFulfDetmWtr;
	}
	
	
}
