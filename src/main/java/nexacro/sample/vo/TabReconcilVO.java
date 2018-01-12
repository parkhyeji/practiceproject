package nexacro.sample.vo;

import java.util.Date;

/**
 * 
 * @author SHIN WC
 * @since 10.23.2017
 * @version 1.0
 * @see
 */
public class TabReconcilVO extends PageableVO {

    
	private String instAdmCode;//심급코드
    private String lawsuitAdmNo;//소송관리번호
    private int preIwrNo;//일련번호
    private String preIwrDfsDeg;//변론차수
    private String preIwrIssuSepcode;//쟁정사항구분코드
    private String preIwrName;//중비서면제목
    private String preIwrCont;//준비서면내용
    private String preIwrWritDate;//작성일자
    private String preIwrCompWtr;//완료여부
    private String preIwrOutLyrid;//외부작성변호사id
    
   
	private String instAdmPrgrCode;//소송진행상태코
	private String instAdmCaseNo;//사건번호
	private String instAdmName;//심급명
	
	private String instAdmCortCode;//수행법원코드
	private String instAdmPetiSenddate;//소장송부일자
	private String instAdmCortReqidate;//법원접수일자
	private String instAdmAsitParcdate;//보조참가일자
	private String instAdmAsitParcopin;//보조참가의견
	
	private String instAdmIssuPoin;//쟁점사항
	private String instAdmCpOpin;//당사의견
	private String instAdmClamVopcode;//청구소가화폐코드
	private int instAdmClamVop;//청구소가
	private int instAdmDivRate;//총분담비율
	
	private String instAdmJudId;//판사id
	private String instAdmJudName;//판사명
	private int instAdmIssuChg;//쟁점금액
	private String instAdmCtpmgrName;//상대담당자명
	private String instAdmCtpmgrDepuname;//상대담당대리인
	private String instAdmRaisreqDate;//소제기일자
	
	private String instAdmVodSepcode;//승패소구분코드
	private String instAdmJudgDate;//판결일자
	private String instAdmJudgCfmDate;//판결확정일자
	private String instAdmJudgDelidate;//판결송달일자
	private int instAdmVodChg;//승패소금액
	
	private int instAdmRegnChg;//인정금액
	private String instAdmPayDlindate;//지급기한일자
	private int instAdmWincRate;//승소율
	private String instAdmJudgCont;//판결내용
	private String instAdmEntLyrId;//위임변호사id
	
	
	//원피고
	private String pladefName;//원피고명
	private String pladefRegNo;//원피고등록번호
	private String pladefMainTel;//주요연락처전화번호
	private String pladefAddTel;//추가연락처전화번호
	private String pladefPos;//우편번호
	private String pladefAddr1;//주소1
	private String pladefClamVol;//청구소가
	private String pladefLawConcSepcode;//소송종결구분코드
	
	private String pladefConcDate;//종결일자
	//private String pladefLawConcSepcode;//소송종결구분코드
	private String pladefLawconcInstcode;//소송종료심급구분코드
	private String pladefLawConcCont;//종결내용
	private String pladefConcCont;//종결내용
	
	//재판외화해
    //private String lawsuitAdmNo;//소송관리번호    
    private String pladefSepCode;//원피고구분코드
    private String pladefSeq;//원피고일련번호
   // private String instAdmCode;//심급코드
    private int tabReconcilSeq;//일련번호
    
    private String reconcilReqChg;//요구금액
    private String reconcilAppvChg;//승인금액
    private String reconcilMgrOpin;//담당자의견
    private String reconcilAppvDate;//승인일자
    private String reconcilExptjudgChg;//예상판결액
    private String reconcilAppvId;//최종승인자id
    //private String reconcilAppvName;//최종승인자
    
    
	public String getLawsuitAdmNo() {
		return lawsuitAdmNo;
	}
	public void setLawsuitAdmNo(String lawsuitAdmNo) {
		this.lawsuitAdmNo = lawsuitAdmNo;
	}
	public String getPladefSepCode() {
		return pladefSepCode;
	}
	public void setPladefSepCode(String pladefSepCode) {
		this.pladefSepCode = pladefSepCode;
	}
	public String getPladefSeq() {
		return pladefSeq;
	}
	public void setPladefSeq(String pladefSeq) {
		this.pladefSeq = pladefSeq;
	}
	public String getInstAdmCode() {
		return instAdmCode;
	}
	public void setInstAdmCode(String instAdmCode) {
		this.instAdmCode = instAdmCode;
	}
	public int getTabReconcilSeq() {
		return tabReconcilSeq;
	}
	public void setTabReconcilSeq(int tabReconcilSeq) {
		this.tabReconcilSeq = tabReconcilSeq;
	}
	public String getReconcilReqChg() {
		return reconcilReqChg;
	}
	public void setReconcilReqChg(String reconcilReqChg) {
		this.reconcilReqChg = reconcilReqChg;
	}
	public String getReconcilAppvChg() {
		return reconcilAppvChg;
	}
	public void setReconcilAppvChg(String reconcilAppvChg) {
		this.reconcilAppvChg = reconcilAppvChg;
	}
	public String getReconcilMgrOpin() {
		return reconcilMgrOpin;
	}
	public void setReconcilMgrOpin(String reconcilMgrOpin) {
		this.reconcilMgrOpin = reconcilMgrOpin;
	}
	public String getReconcilAppvDate() {
		return reconcilAppvDate;
	}
	public void setReconcilAppvDate(String reconcilAppvDate) {
		this.reconcilAppvDate = reconcilAppvDate;
	}
	public String getReconcilExptjudgChg() {
		return reconcilExptjudgChg;
	}
	public void setReconcilExptjudgChg(String reconcilExptjudgChg) {
		this.reconcilExptjudgChg = reconcilExptjudgChg;
	}
	public String getReconcilAppvId() {
		return reconcilAppvId;
	}
	public void setReconcilAppvId(String reconcilAppvId) {
		this.reconcilAppvId = reconcilAppvId;
	}
	public int getPreIwrNo() {
		return preIwrNo;
	}
	public void setPreIwrNo(int preIwrNo) {
		this.preIwrNo = preIwrNo;
	}
	public String getPreIwrDfsDeg() {
		return preIwrDfsDeg;
	}
	public void setPreIwrDfsDeg(String preIwrDfsDeg) {
		this.preIwrDfsDeg = preIwrDfsDeg;
	}
	public String getPreIwrIssuSepcode() {
		return preIwrIssuSepcode;
	}
	public void setPreIwrIssuSepcode(String preIwrIssuSepcode) {
		this.preIwrIssuSepcode = preIwrIssuSepcode;
	}
	public String getPreIwrName() {
		return preIwrName;
	}
	public void setPreIwrName(String preIwrName) {
		this.preIwrName = preIwrName;
	}
	public String getPreIwrCont() {
		return preIwrCont;
	}
	public void setPreIwrCont(String preIwrCont) {
		this.preIwrCont = preIwrCont;
	}
	public String getPreIwrWritDate() {
		return preIwrWritDate;
	}
	public void setPreIwrWritDate(String preIwrWritDate) {
		this.preIwrWritDate = preIwrWritDate;
	}
	public String getPreIwrCompWtr() {
		return preIwrCompWtr;
	}
	public void setPreIwrCompWtr(String preIwrCompWtr) {
		this.preIwrCompWtr = preIwrCompWtr;
	}
	public String getPreIwrOutLyrid() {
		return preIwrOutLyrid;
	}
	public void setPreIwrOutLyrid(String preIwrOutLyrid) {
		this.preIwrOutLyrid = preIwrOutLyrid;
	}
	public String getInstAdmPrgrCode() {
		return instAdmPrgrCode;
	}
	public void setInstAdmPrgrCode(String instAdmPrgrCode) {
		this.instAdmPrgrCode = instAdmPrgrCode;
	}
	public String getInstAdmCaseNo() {
		return instAdmCaseNo;
	}
	public void setInstAdmCaseNo(String instAdmCaseNo) {
		this.instAdmCaseNo = instAdmCaseNo;
	}
	public String getInstAdmName() {
		return instAdmName;
	}
	public void setInstAdmName(String instAdmName) {
		this.instAdmName = instAdmName;
	}
	public String getInstAdmCortCode() {
		return instAdmCortCode;
	}
	public void setInstAdmCortCode(String instAdmCortCode) {
		this.instAdmCortCode = instAdmCortCode;
	}
	public String getInstAdmPetiSenddate() {
		return instAdmPetiSenddate;
	}
	public void setInstAdmPetiSenddate(String instAdmPetiSenddate) {
		this.instAdmPetiSenddate = instAdmPetiSenddate;
	}
	public String getInstAdmCortReqidate() {
		return instAdmCortReqidate;
	}
	public void setInstAdmCortReqidate(String instAdmCortReqidate) {
		this.instAdmCortReqidate = instAdmCortReqidate;
	}
	public String getInstAdmAsitParcdate() {
		return instAdmAsitParcdate;
	}
	public void setInstAdmAsitParcdate(String instAdmAsitParcdate) {
		this.instAdmAsitParcdate = instAdmAsitParcdate;
	}
	public String getInstAdmAsitParcopin() {
		return instAdmAsitParcopin;
	}
	public void setInstAdmAsitParcopin(String instAdmAsitParcopin) {
		this.instAdmAsitParcopin = instAdmAsitParcopin;
	}
	public String getInstAdmIssuPoin() {
		return instAdmIssuPoin;
	}
	public void setInstAdmIssuPoin(String instAdmIssuPoin) {
		this.instAdmIssuPoin = instAdmIssuPoin;
	}
	public String getInstAdmCpOpin() {
		return instAdmCpOpin;
	}
	public void setInstAdmCpOpin(String instAdmCpOpin) {
		this.instAdmCpOpin = instAdmCpOpin;
	}
	public String getInstAdmClamVopcode() {
		return instAdmClamVopcode;
	}
	public void setInstAdmClamVopcode(String instAdmClamVopcode) {
		this.instAdmClamVopcode = instAdmClamVopcode;
	}
	public int getInstAdmClamVop() {
		return instAdmClamVop;
	}
	public void setInstAdmClamVop(int instAdmClamVop) {
		this.instAdmClamVop = instAdmClamVop;
	}
	public int getInstAdmDivRate() {
		return instAdmDivRate;
	}
	public void setInstAdmDivRate(int instAdmDivRate) {
		this.instAdmDivRate = instAdmDivRate;
	}
	public String getInstAdmJudId() {
		return instAdmJudId;
	}
	public void setInstAdmJudId(String instAdmJudId) {
		this.instAdmJudId = instAdmJudId;
	}
	public String getInstAdmJudName() {
		return instAdmJudName;
	}
	public void setInstAdmJudName(String instAdmJudName) {
		this.instAdmJudName = instAdmJudName;
	}
	public int getInstAdmIssuChg() {
		return instAdmIssuChg;
	}
	public void setInstAdmIssuChg(int instAdmIssuChg) {
		this.instAdmIssuChg = instAdmIssuChg;
	}
	public String getInstAdmCtpmgrName() {
		return instAdmCtpmgrName;
	}
	public void setInstAdmCtpmgrName(String instAdmCtpmgrName) {
		this.instAdmCtpmgrName = instAdmCtpmgrName;
	}
	public String getInstAdmCtpmgrDepuname() {
		return instAdmCtpmgrDepuname;
	}
	public void setInstAdmCtpmgrDepuname(String instAdmCtpmgrDepuname) {
		this.instAdmCtpmgrDepuname = instAdmCtpmgrDepuname;
	}
	public String getInstAdmRaisreqDate() {
		return instAdmRaisreqDate;
	}
	public void setInstAdmRaisreqDate(String instAdmRaisreqDate) {
		this.instAdmRaisreqDate = instAdmRaisreqDate;
	}
	public String getInstAdmVodSepcode() {
		return instAdmVodSepcode;
	}
	public void setInstAdmVodSepcode(String instAdmVodSepcode) {
		this.instAdmVodSepcode = instAdmVodSepcode;
	}
	public String getInstAdmJudgDate() {
		return instAdmJudgDate;
	}
	public void setInstAdmJudgDate(String instAdmJudgDate) {
		this.instAdmJudgDate = instAdmJudgDate;
	}
	public String getInstAdmJudgCfmDate() {
		return instAdmJudgCfmDate;
	}
	public void setInstAdmJudgCfmDate(String instAdmJudgCfmDate) {
		this.instAdmJudgCfmDate = instAdmJudgCfmDate;
	}
	public String getInstAdmJudgDelidate() {
		return instAdmJudgDelidate;
	}
	public void setInstAdmJudgDelidate(String instAdmJudgDelidate) {
		this.instAdmJudgDelidate = instAdmJudgDelidate;
	}
	public int getInstAdmVodChg() {
		return instAdmVodChg;
	}
	public void setInstAdmVodChg(int instAdmVodChg) {
		this.instAdmVodChg = instAdmVodChg;
	}
	public int getInstAdmRegnChg() {
		return instAdmRegnChg;
	}
	public void setInstAdmRegnChg(int instAdmRegnChg) {
		this.instAdmRegnChg = instAdmRegnChg;
	}
	public String getInstAdmPayDlindate() {
		return instAdmPayDlindate;
	}
	public void setInstAdmPayDlindate(String instAdmPayDlindate) {
		this.instAdmPayDlindate = instAdmPayDlindate;
	}
	public int getInstAdmWincRate() {
		return instAdmWincRate;
	}
	public void setInstAdmWincRate(int instAdmWincRate) {
		this.instAdmWincRate = instAdmWincRate;
	}
	public String getInstAdmJudgCont() {
		return instAdmJudgCont;
	}
	public void setInstAdmJudgCont(String instAdmJudgCont) {
		this.instAdmJudgCont = instAdmJudgCont;
	}
	public String getInstAdmEntLyrId() {
		return instAdmEntLyrId;
	}
	public void setInstAdmEntLyrId(String instAdmEntLyrId) {
		this.instAdmEntLyrId = instAdmEntLyrId;
	}
	/*
	public String getReconcilAppvName() {
		return reconcilAppvName;
	}
	public void setReconcilAppvName(String reconcilAppvName) {
		this.reconcilAppvName = reconcilAppvName;
	}
    */
	public String getPladefName() {
		return pladefName;
	}
	public void setPladefName(String pladefName) {
		this.pladefName = pladefName;
	}
	public String getPladefRegNo() {
		return pladefRegNo;
	}
	public void setPladefRegNo(String pladefRegNo) {
		this.pladefRegNo = pladefRegNo;
	}
	public String getPladefMainTel() {
		return pladefMainTel;
	}
	public void setPladefMainTel(String pladefMainTel) {
		this.pladefMainTel = pladefMainTel;
	}
	public String getPladefAddTel() {
		return pladefAddTel;
	}
	public void setPladefAddTel(String pladefAddTel) {
		this.pladefAddTel = pladefAddTel;
	}
	public String getPladefPos() {
		return pladefPos;
	}
	public void setPladefPos(String pladefPos) {
		this.pladefPos = pladefPos;
	}
	public String getPladefAddr1() {
		return pladefAddr1;
	}
	public void setPladefAddr1(String pladefAddr1) {
		this.pladefAddr1 = pladefAddr1;
	}
	public String getPladefClamVol() {
		return pladefClamVol;
	}
	public void setPladefClamVol(String pladefClamVol) {
		this.pladefClamVol = pladefClamVol;
	}
	public String getPladefLawConcSepcode() {
		return pladefLawConcSepcode;
	}
	public void setPladefLawConcSepcode(String pladefLawConcSepcode) {
		this.pladefLawConcSepcode = pladefLawConcSepcode;
	}
	public String getPladefConcDate() {
		return pladefConcDate;
	}
	public void setPladefConcDate(String pladefConcDate) {
		this.pladefConcDate = pladefConcDate;
	}
	public String getPladefLawconcInstcode() {
		return pladefLawconcInstcode;
	}
	public void setPladefLawconcInstcode(String pladefLawconcInstcode) {
		this.pladefLawconcInstcode = pladefLawconcInstcode;
	}
	public String getPladefLawConcCont() {
		return pladefLawConcCont;
	}
	public void setPladefLawConcCont(String pladefLawConcCont) {
		this.pladefLawConcCont = pladefLawConcCont;
	}
	public String getPladefConcCont() {
		return pladefConcCont;
	}
	public void setPladefConcCont(String pladefConcCont) {
		this.pladefConcCont = pladefConcCont;
	}
	
	
	
    
}
