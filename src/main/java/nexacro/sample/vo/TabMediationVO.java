package nexacro.sample.vo;




/**
 * 
 * @author Park SeongMin
 * @since 08.12.2015
 * @version 1.0
 * @see
 */
public class TabMediationVO extends PageableVO {

    // Fields
	// 소송기본사항
		private String lawAdmNo;
		private String instCode;
		
		private String lawsuitAdmNo;
		private String instAdmCode;
		private String instAdmPrgrCode;
		private String pladefSepCode;
		private String instAdmCortCode;
		private String instAdmCaseNo;
		private int instAdmIssuChg;
		private String instAdmCtpmgrName;

		// 원피고 목록
		private int pladefSeq;
		private String pladefName;
		private String pladefRegNo;
		private int pladefClamVol;
		private String pladefMainTel;
		private String pladefAddTel;
		private String pladefLawConcSepcode;

		// 조정안
		private int mediationSeq;
		private String mediationWritDate;
		private int mediationChg;
		private String mediationCont;
		private String mediationRefPoin;

		
		
		
		public String getLawAdmNo() {
			return lawAdmNo;
		}

		public void setLawAdmNo(String lawAdmNo) {
			this.lawAdmNo = lawAdmNo;
		}

		public String getInstCode() {
			return instCode;
		}

		public void setInstCode(String instCode) {
			this.instCode = instCode;
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

		public String getInstAdmPrgrCode() {
			return instAdmPrgrCode;
		}

		public void setInstAdmPrgrCode(String instAdmPrgrCode) {
			this.instAdmPrgrCode = instAdmPrgrCode;
		}

		public String getPladefSepCode() {
			return pladefSepCode;
		}

		public void setPladefSepCode(String pladefSepCode) {
			this.pladefSepCode = pladefSepCode;
		}

		public String getInstAdmCortCode() {
			return instAdmCortCode;
		}

		public void setInstAdmCortCode(String instAdmCortCode) {
			this.instAdmCortCode = instAdmCortCode;
		}

		public String getInstAdmCaseNo() {
			return instAdmCaseNo;
		}

		public void setInstAdmCaseNo(String instAdmCaseNo) {
			this.instAdmCaseNo = instAdmCaseNo;
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

		public int getPladefSeq() {
			return pladefSeq;
		}

		public void setPladefSeq(int pladefSeq) {
			this.pladefSeq = pladefSeq;
		}

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

		public int getPladefClamVol() {
			return pladefClamVol;
		}

		public void setPladefClamVol(int pladefClamVol) {
			this.pladefClamVol = pladefClamVol;
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

		public String getPladefLawConcSepcode() {
			return pladefLawConcSepcode;
		}

		public void setPladefLawConcSepcode(String pladefLawConcSepcode) {
			this.pladefLawConcSepcode = pladefLawConcSepcode;
		}

		public int getMediationSeq() {
			return mediationSeq;
		}

		public void setMediationSeq(int mediationSeq) {
			this.mediationSeq = mediationSeq;
		}

		public String getMediationWritDate() {
			return mediationWritDate;
		}

		public void setMediationWritDate(String mediationWritDate) {
			this.mediationWritDate = mediationWritDate;
		}

		public int getMediationChg() {
			return mediationChg;
		}

		public void setMediationChg(int mediationChg) {
			this.mediationChg = mediationChg;
		}

		public String getMediationCont() {
			return mediationCont;
		}

		public void setMediationCont(String mediationCont) {
			this.mediationCont = mediationCont;
		}

		public String getMediationRefPoin() {
			return mediationRefPoin;
		}

		public void setMediationRefPoin(String mediationRefPoin) {
			this.mediationRefPoin = mediationRefPoin;
		}

		@Override
		public String toString() {
			return "MediationVO [lawsuitAdmNo=" + lawsuitAdmNo + ", instAdmCode="
					+ instAdmCode + ", instAdmPrgrCode=" + instAdmPrgrCode
					+ ", pladefSepCode=" + pladefSepCode + ", instAdmCortCode="
					+ instAdmCortCode + ", instAdmCaseNo=" + instAdmCaseNo
					+ ", instAdmIssuChg=" + instAdmIssuChg + ", instAdmCtpmgrName="
					+ instAdmCtpmgrName + ", pladefSeq=" + pladefSeq
					+ ", pladefName=" + pladefName + ", pladefRegNo=" + pladefRegNo
					+ ", pladefClamVol=" + pladefClamVol + ", pladefMainTel="
					+ pladefMainTel + ", pladefAddTel=" + pladefAddTel
					+ ", pladefLawConcSepcode=" + pladefLawConcSepcode
					+ ", mediationSeq=" + mediationSeq + ", mediationWritDate="
					+ mediationWritDate + ", mediationChg=" + mediationChg
					+ ", mediationCont=" + mediationCont + ", mediationRefPoin="
					+ mediationRefPoin + "]";
		}

		
    

   

}
