package nexacro.aml.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.aml.dao.RuleAlertInfoDAO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;

@SuppressWarnings("deprecation")
@Service("RuleAlertInfoService")
public class RuleAlertInfoService extends AbstractServiceImpl{
	
	@Resource(name = "RuleAlertInfoDAO")
	private RuleAlertInfoDAO RuleAlertInfoDAO;
	
	//고객번호
	@SuppressWarnings("rawtypes")
	public List loadCustCode() {
		return RuleAlertInfoDAO.loadCustCode();
	}
	
	//룰ID
	@SuppressWarnings("rawtypes")
	public List loadRuleId() {
		return RuleAlertInfoDAO.loadRuleId();
	}
	
	//업무구분
	public List loadWorkTypeCode(Map<String, Object> classCodeMap) {
		return RuleAlertInfoDAO.loadWorkTypeCode(classCodeMap);
	}
	
	//거래지점,배당지점
	@SuppressWarnings("rawtypes")
	public List loadOfficeCode(Map<String, Object> classCodeMap) {
		return RuleAlertInfoDAO.loadOfficeCode(classCodeMap);
	}
	
	//거래상품
	public List loadDealGoods(Map<String, Object> classCodeMap) {
		return RuleAlertInfoDAO.loadDealGoods(classCodeMap);
	}
	
	//입출금구분
	public List loadDewiTypeCode(Map<String, Object> classCodeMap) {
		return RuleAlertInfoDAO.loadDewiTypeCode(classCodeMap);
	}
	
	//의심거래조사
	@SuppressWarnings("rawtypes")
	public List loadstCode(Map<String, Object> classCodeMap) {
		return RuleAlertInfoDAO.loadstCode(classCodeMap);
	}
	
	//보고서상태, 보고제외구분
	public List loadClassCode(Map<String, Object> classCodeMap) {
		return RuleAlertInfoDAO.loadClassCode(classCodeMap);
	}
	
	//룰 데이터 등록
	public void insertRuleData(Map map) {
		//상세테이블 INSERT
		String detailPk = RuleAlertInfoDAO.searchDetailPk(map); //상세테이블 PK생성
		map.put("detailPk", detailPk);
		RuleAlertInfoDAO.insertDetail(map);
		
		//거래상세테이블 INSERT
		String detailDealPk = RuleAlertInfoDAO.searchDetailDealPk(map); //거래상세테이블 PK생성
		map.put("detailDealPk", detailDealPk);
		RuleAlertInfoDAO.insertDealDetail(map);
		
		//결과테이블 INSERT
		String alertGroupNo = RuleAlertInfoDAO.searchAlertGroupNO(detailPk); //결과테이블 PK생성
		map.put("alertGroupNo", alertGroupNo);
		RuleAlertInfoDAO.insertResult(map);
	}

	public List searchResultList() {
		return RuleAlertInfoDAO.searchResultList();
	}
	
}
