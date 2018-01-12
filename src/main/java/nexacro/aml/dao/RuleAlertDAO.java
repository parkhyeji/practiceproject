package nexacro.aml.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;












//scmoon 주석처리
/*import nexacro.pdlaw.vo.lawsuit.Lawsuit_ListVO;*/
import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

@Repository("RuleAlertDAO")
public class RuleAlertDAO extends NexacroIbatisAbstractDAO {
	
	@SuppressWarnings("rawtypes")
	public List loadCustCode() {
		return list("aml.RuleAlertDAO.loadCustCodes");
	}
	
	@SuppressWarnings("rawtypes")
	public List loadGroupCode() {
		return list("aml.RuleAlertDAO.loadGroupCode");
	}
	
	@SuppressWarnings("rawtypes")
	public List loadDealGroupCode() {
		return list("aml.RuleAlertDAO.loadDealGroupCode");
	}
	
	@SuppressWarnings("rawtypes")
	public List loadDealGroupCodeRuleId(Map map) {
		return list("aml.RuleAlertDAO.loadDealGroupCodeRuleId", map);
	}
	
	@SuppressWarnings("rawtypes")
	public List loadRuleId() {
		return list("aml.RuleAlertDAO.loadRuleId");
	}
	
	@SuppressWarnings("rawtypes")
	public List loadOfficeCode(Map<String,Object> classCodeMap) {
		return list("aml.RuleAlertDAO.loadOfficeCode", classCodeMap);
	}
	
	@SuppressWarnings("rawtypes")
	public List loadChgedId() {
		return list("aml.RuleAlertDAO.loadChgedId");
	}
	
	@SuppressWarnings("rawtypes")
	public List loadstCode(Map<String,Object> classCodeMap) {
		return list("aml.RuleAlertDAO.loadstCode", classCodeMap);
	}
	public List searchResult() {
		return list("aml.RuleAlertDAO.searchResult");
	}
	
	public String searchMaxPk() {
		return (String) select("aml.RuleAlertDAO.searchMaxPk");
	}

	/*public void insertResult(Map map) {
		System.out.println("AAA");
		System.out.println("map : " + map);
		insert("aml.RuleAlertDAO.insertResult", map);
	}*/
	
	public void insertResult(Map map) {
		System.out.println("Dao map : " + map);
		insert("aml.RuleAlertDAO.resultInsert", map);
	}
	
	public List searchDetail() {
		return list("aml.RuleAlertDAO.searchDetail");
	}
	
	public void insertDetail(Map map) {
		insert("aml.RuleAlertDAO.detailInsert", map);
	}
	
	public List searchDealDetail() {
		return list("aml.RuleAlertDAO.searchDealDetail");
	}

	public List loadWorkTypeCode(Map<String, Object> classCodeMap) {
		return list("aml.RuleAlertDAO.loadWorkTypeCode", classCodeMap);
	}

	public List loadDealGoods(Map<String, Object> classCodeMap) {
		return list("aml.RuleAlertDAO.loadDealGoods", classCodeMap);
	}

	public List loadDewiTypeCode(Map<String, Object> classCodeMap) {
		return list("aml.RuleAlertDAO.loadDewiTypeCode", classCodeMap);
	}

	public void insertDealDetail(Map map) {
		insert("aml.RuleAlertDAO.detailDealInsert", map);
	}

	public List loadClassCode(Map<String, Object> classCodeMap) {
		return list("aml.RuleAlertDAO.loadClassCode", classCodeMap);
	}
	
	public void deleteDealDetail(Map map) {
		insert("aml.RuleAlertDAO.deleteDealDetail", map);
	}
}
