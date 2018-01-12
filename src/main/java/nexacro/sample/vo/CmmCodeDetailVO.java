package nexacro.sample.vo;

import java.util.Date;

/**
 * 
 * @author SHIN WC
 * @since 10.23.2017
 * @version 1.0
 * @see
 */
public class CmmCodeDetailVO extends PageableVO {

    
	private String classCode;//분류코드
	private String codeNo;//상세코드
	private String codeName;//상세코드명
	private String codeName2;//상세코드명2
	private String useYn;//사용여부
	private int sortSeq;//소팅순서
	public String getClassCode() {
		return classCode;
	}
	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}
	public String getCodeNo() {
		return codeNo;
	}
	public void setCodeNo(String codeNo) {
		this.codeNo = codeNo;
	}
	public String getCodeName() {
		return codeName;
	}
	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}
	public String getCodeName2() {
		return codeName2;
	}
	public void setCodeName2(String codeName2) {
		this.codeName2 = codeName2;
	}
	public String getUseYn() {
		return useYn;
	}
	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}
	public int getSortSeq() {
		return sortSeq;
	}
	public void setSortSeq(int sortSeq) {
		this.sortSeq = sortSeq;
	}
	/*jsd*/
	@Override
	public String toString() {
		return "CmmCodeDetailVO [classCode=" + classCode + ", codeNo=" + codeNo
				+ ", codeName=" + codeName + ", codeName2=" + codeName2
				+ ", useYn=" + useYn + ", sortSeq=" + sortSeq + "]";
	}
	
	
	
	

	
	
}
