package nexacro.crud.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.crud.dao.CrudSampleDAO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;

@SuppressWarnings("deprecation")
@Service("crudSampleService")
public class CrudSampleServiceImpl extends AbstractServiceImpl{
	
	@Resource(name = "crudSampleDAO")
	private CrudSampleDAO crudSampleDAO;

	@SuppressWarnings("rawtypes")
	public List loadCommonCode(Map<String, Object> classCodeMap) {
		return crudSampleDAO.loadCommonCode(classCodeMap);			
	}
	
	@SuppressWarnings("rawtypes")
	public List searchCust() {
		return crudSampleDAO.searchCust();			
	}
	
	public void insertCust(Map map) {
		crudSampleDAO.insertCust(map);			
	}
	
	public void updateCust(Map map) {
		crudSampleDAO.updateCust(map);			
	}
	
	public void deleteCust(Map map) {
		crudSampleDAO.deleteCust(map);			
	}

}
