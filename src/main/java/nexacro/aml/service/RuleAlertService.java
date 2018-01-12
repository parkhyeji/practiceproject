package nexacro.aml.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.aml.dao.AmlSampleDAO;
import nexacro.aml.dao.RuleAlertDAO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;

@SuppressWarnings("deprecation")
@Service("RuleAlertService")
public class RuleAlertService extends AbstractServiceImpl{
	
	@Resource(name = "RuleAlertDAO")
	private RuleAlertDAO ruleAlertDAO;

	@SuppressWarnings("rawtypes")
	public List loadCustCode() {
		return ruleAlertDAO.loadCustCode();
	}
	
	@SuppressWarnings("rawtypes")
	public List loadGruoupNo() {
		return ruleAlertDAO.loadGroupCode();
	}
	
	@SuppressWarnings("rawtypes")
	public List loadDealGroupCode() {
		return ruleAlertDAO.loadDealGroupCode();
	}
	
	@SuppressWarnings("rawtypes")
	public List loadDealGroupCodeRuleId(Map map) {
		return ruleAlertDAO.loadDealGroupCodeRuleId(map);
	}
	
	@SuppressWarnings("rawtypes")
	public List loadRuleId() {
		return ruleAlertDAO.loadRuleId();
	}
	
	@SuppressWarnings("rawtypes")
	public List loadOfficeCode(Map<String, Object> classCodeMap) {
		return ruleAlertDAO.loadOfficeCode(classCodeMap);
	}
	
	@SuppressWarnings("rawtypes")
	public List loadChgedId() {
		return ruleAlertDAO.loadChgedId();
	}
	
	@SuppressWarnings("rawtypes")
	public List loadstCode(Map<String, Object> classCodeMap) {
		return ruleAlertDAO.loadstCode(classCodeMap);
	}
	/*public List loadCommonCode(Map<String, Object> classCodeMap) {
		return ruleAlertDAO.loadCommonCode(classCodeMap);
	}*/
	@SuppressWarnings("rawtypes")
	public List searchResult() {
		return ruleAlertDAO.searchResult();			
	}

	public void insertResult(Map map) {
		System.out.println("service map : " + map);
		String maxPk = ruleAlertDAO.searchMaxPk();
		map.put("maxPk" , maxPk);
		System.out.println("maxPk = " + maxPk);
		ruleAlertDAO.insertResult(map);
	}
	
	@SuppressWarnings("rawtypes")
	public List searchDetail() {
		return ruleAlertDAO.searchDetail();			
	}
	
	public void insertDetail(Map map) {
		ruleAlertDAO.insertDetail(map);
	}
	
	@SuppressWarnings("rawtypes")
	public List searchDealDetail() {
		return ruleAlertDAO.searchDealDetail();			
	}

	public List loadWorkTypeCode(Map<String, Object> classCodeMap) {
		return ruleAlertDAO.loadWorkTypeCode(classCodeMap);
	}

	public List loadDealGoods(Map<String, Object> classCodeMap) {
		return ruleAlertDAO.loadDealGoods(classCodeMap);
	}

	public List loadDewiTypeCode(Map<String, Object> classCodeMap) {
		return ruleAlertDAO.loadDewiTypeCode(classCodeMap);
	}

	public void insertDealDetail(Map map) {
		ruleAlertDAO.insertDealDetail(map);
	}

	public List loadClassCode(Map<String, Object> classCodeMap) {
		return ruleAlertDAO.loadClassCode(classCodeMap);
	}
	
	public void deleteDealDetail(Map map) {
		ruleAlertDAO.deleteDealDetail(map);
	}

}
