package nexacro.han.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.han.dao.HanSampleDAO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;

@SuppressWarnings("deprecation")
@Service("hanSampleService")
public class HanSampleServiceImpl extends AbstractServiceImpl{
	
	@Resource(name = "hanSampleDAO")
	private HanSampleDAO hanSampleDAO;

	@SuppressWarnings("rawtypes")
	public List loadCommonCode(Map<String, Object> classCodeMap) {
		return hanSampleDAO.loadCommonCode(classCodeMap);
	}
	
	@SuppressWarnings("rawtypes")
	public List searchCust() {
		return hanSampleDAO.searchCust();			
	}
	
	public void insertCust(Map map) {
		hanSampleDAO.insertCust(map);			
	}
	
	public void updateCust(Map map) {
		hanSampleDAO.updateCust(map);			
	}
	
	public void deleteCust(Map map) {
		hanSampleDAO.deleteCust(map);			
	}

}
