package nexacro.sample.service.lawsuit.vo;

import nexacro.sample.vo.DefaultVO;

public class LawsuitListVO extends DefaultVO{
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
		private String lawsuitCtaChg;
		private String lawsuitTempReqiDate;//소송가접수일자
		private String lawsuitRaisRea;//소송제기사유
		private String lawsuitCostCfnApldate;
		private String lawsuitConcDate;
		private String lawsuitFulfDetmWtr;
		
		//심급
		private String instAdmCode;//심급코드
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
		private String instAdmClamVop;//청구소가
		private String instAdmDivRate;//총분담비율
		
		private String instAdmJudId;//판사id
		private String instAdmIssuChg;//쟁점금액
		private String instAdmCtpmgrName;//상대담당자명
		private String instAdmCtpmgrDepuname;//상대담당대리인
		private String instAdmRaisreqDate;//소제기일자
		
		private String instAdmVodSepcode;//승패소구분코드
		private String instAdmJudgDate;//판결일자
		private String instAdmJudgCfmDate;//판결확정일자
		private String instAdmJudgDelidate;//판결송달일자
		private String instAdmVodChg;//승패소금액
		
		private String instAdmRegnChg;//인정금액
		private String instAdmPayDlindate;//지급기한일자
		private String instAdmWincRate;//승소율
		private String instAdmJudgCont;//판결내용
		private String instAdmEntLyrId;//위임변호사id
		private String instAdmJudName;
		private String instAdmEntLyrName;
		
		// 원/피고
		private String pladefSepCode;
		private String pladefSeq;
		private String pladefName;
		private String pladefRegNo;
		private String pladefMainTel;
		private String pladefAddTel;
		private String pladefPos;
		private String pladefAddr1;
		private String pladefAddr2;
		private String pladefClamVol;
		private String pladefRegInst;
		private String pladefEndInst;
		
		public String getPladefName() {
			return pladefName;
		}
		public void setPladefName(String pladefName) {
			this.pladefName = pladefName;
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
		public String getPladefAddr2() {
			return pladefAddr2;
		}
		public void setPladefAddr2(String pladefAddr2) {
			this.pladefAddr2 = pladefAddr2;
		}
		public String getPladefClamVol() {
			return pladefClamVol;
		}
		public void setPladefClamVol(String pladefClamVol) {
			this.pladefClamVol = pladefClamVol;
		}
		public String getPladefRegInst() {
			return pladefRegInst;
		}
		public void setPladefRegInst(String pladefRegInst) {
			this.pladefRegInst = pladefRegInst;
		}
		public String getPladefEndInst() {
			return pladefEndInst;
		}
		public void setPladefEndInst(String pladefEndInst) {
			this.pladefEndInst = pladefEndInst;
		}
		public String getInstAdmJudName() {
			return instAdmJudName;
		}
		public void setInstAdmJudName(String instAdmJudName) {
			this.instAdmJudName = instAdmJudName;
		}
		public String getInstAdmEntLyrName() {
			return instAdmEntLyrName;
		}
		public void setInstAdmEntLyrName(String instAdmEntLyrName) {
			this.instAdmEntLyrName = instAdmEntLyrName;
		}
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
		public String getLawsuitCtaChg() {
			return lawsuitCtaChg;
		}
		public void setLawsuitCtaChg(String lawsuitCtaChg) {
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
		public String getInstAdmCode() {
			return instAdmCode;
		}
		public void setInstAdmCode(String instAdmCode) {
			this.instAdmCode = instAdmCode;
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
		public String getInstAdmClamVop() {
			return instAdmClamVop;
		}
		public void setInstAdmClamVop(String instAdmClamVop) {
			this.instAdmClamVop = instAdmClamVop;
		}
		public String getInstAdmDivRate() {
			return instAdmDivRate;
		}
		public void setInstAdmDivRate(String instAdmDivRate) {
			this.instAdmDivRate = instAdmDivRate;
		}
		public String getInstAdmJudId() {
			return instAdmJudId;
		}
		public void setInstAdmJudId(String instAdmJudId) {
			this.instAdmJudId = instAdmJudId;
		}
		public String getInstAdmIssuChg() {
			return instAdmIssuChg;
		}
		public void setInstAdmIssuChg(String instAdmIssuChg) {
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
		public String getInstAdmVodChg() {
			return instAdmVodChg;
		}
		public void setInstAdmVodChg(String instAdmVodChg) {
			this.instAdmVodChg = instAdmVodChg;
		}
		public String getInstAdmRegnChg() {
			return instAdmRegnChg;
		}
		public void setInstAdmRegnChg(String instAdmRegnChg) {
			this.instAdmRegnChg = instAdmRegnChg;
		}
		public String getInstAdmPayDlindate() {
			return instAdmPayDlindate;
		}
		public void setInstAdmPayDlindate(String instAdmPayDlindate) {
			this.instAdmPayDlindate = instAdmPayDlindate;
		}
		public String getInstAdmWincRate() {
			return instAdmWincRate;
		}
		public void setInstAdmWincRate(String instAdmWincRate) {
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
		
		
}
