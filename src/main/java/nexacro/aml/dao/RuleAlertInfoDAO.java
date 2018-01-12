package nexacro.aml.dao;

import java.util.List;
import java.util.Map;


//scmoon 주석처리
/*import nexacro.pdlaw.vo.lawsuit.Lawsuit_ListVO;*/
import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

@Repository("RuleAlertInfoDAO")
public class RuleAlertInfoDAO extends NexacroIbatisAbstractDAO {

	//고객번호
	@SuppressWarnings("rawtypes")
	public List loadCustCode() {
		return list("aml.RuleAlertInfoDAO.loadCustCodes");
	}

	//룰ID
	@SuppressWarnings("rawtypes")
	public List loadRuleId() {
		return list("aml.RuleAlertInfoDAO.loadRuleId");
	}

	//업무구분
	public List loadWorkTypeCode(Map<String, Object> classCodeMap) {
		return list("aml.RuleAlertInfoDAO.loadWorkTypeCode", classCodeMap);
	}

	//거래지점,배당지점
	@SuppressWarnings("rawtypes")
	public List loadOfficeCode(Map<String,Object> classCodeMap) {
		return list("aml.RuleAlertInfoDAO.loadOfficeCode", classCodeMap);
	}

	//거래상품
	public List loadDealGoods(Map<String, Object> classCodeMap) {
		return list("aml.RuleAlertInfoDAO.loadDealGoods", classCodeMap);
	}

	//입출금구분
	public List loadDewiTypeCode(Map<String, Object> classCodeMap) {
		return list("aml.RuleAlertInfoDAO.loadDewiTypeCode", classCodeMap);
	}

	//의심거래조사
	@SuppressWarnings("rawtypes")
	public List loadstCode(Map<String,Object> classCodeMap) {
		return list("aml.RuleAlertInfoDAO.loadstCode", classCodeMap);
	}

	//보고서상태, 보고제외구분
	public List loadClassCode(Map<String, Object> classCodeMap) {
		return list("aml.RuleAlertInfoDAO.loadClassCode", classCodeMap);
	}
	
	//상세 PK
	public String searchDetailPk(Map map) {
		return (String) select("aml.RuleAlertInfoDAO.searchDetailPk", map);
	}

	//상세테이블 insert
	public void insertDetail(Map map) {
		insert("aml.RuleAlertInfoDAO.insertDetail", map);
	}
	
	//거래상세 PK
	public String searchDetailDealPk(Map map) {
		return (String) select("aml.RuleAlertInfoDAO.searchDetailDealPk", map);
	}
	
	//거래상세테이블 insert
	public void insertDealDetail(Map map) {
		insert("aml.RuleAlertInfoDAO.insertDealDetail", map);
	}
	
	//결과 PK
	public String searchAlertGroupNO(String detailPk) {
		return (String) select("aml.RuleAlertInfoDAO.searchAlertGroupNO", detailPk);
	}
	
	//결과테이블 insert
	public void insertResult(Map map) {
		insert("aml.RuleAlertInfoDAO.insertResult", map);
	}

	public List searchResultList() {
		return list("aml.RuleAlertInfoDAO.searchResultList");
	}
}
