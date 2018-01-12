package nexacro.aml.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.aml.dao.CustInfoDAO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;

@SuppressWarnings("deprecation")
@Service("custInfoService")
public class CustInfoServiceImpl extends AbstractServiceImpl{
	
	@Resource(name = "custInfoDAO")
	private CustInfoDAO custInfoDAO;

	@SuppressWarnings("rawtypes")
	public List loadCommonCode(Map<String, Object> classCodeMap) {
		return custInfoDAO.loadCommonCode(classCodeMap);
	}

	@SuppressWarnings("rawtypes")
	public List searchCust() {
		return custInfoDAO.searchCust();			
	}

	public void insertCust(Map map) {
		custInfoDAO.insertCust(map);			
	}
	
	public void updateCust(Map map) {
		custInfoDAO.updateCust(map);			
	}
	
	public void deleteCust(Map map) {
		custInfoDAO.deleteCust(map);			
	}
	
	public List searchaddr(Map map) {
		return custInfoDAO.searchaddr(map);			
	}
	
}
