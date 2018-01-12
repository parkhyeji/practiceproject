package nexacro.aml.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.aml.dao.AmlSampleDAO;
import nexacro.aml.dao.RuleAlertDAO;
import nexacro.aml.dao.SuspDealDAO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;

@SuppressWarnings("deprecation")
@Service("SuspDealService")
public class SuspDealService extends AbstractServiceImpl{
	
	@Resource(name = "SuspDealDAO")
	private SuspDealDAO suspDealDao;

	public List loadCustCode(Map<String, Object> classCodeMap) {
		return suspDealDao.loadCustCode(classCodeMap);
	}

	public List loadRuleInfo(Map<String, Object> classCodeMap) {
		return suspDealDao.loadRuleInfo(classCodeMap);
	}

	public List loadCustInfo(Map<String, Object> classCodeMap) {
		return suspDealDao.loadCustInfo(classCodeMap);
	}
	
}
