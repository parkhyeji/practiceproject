package nexacro.aml.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.aml.dao.PorChangeDAO;

import org.springframework.stereotype.Service;

@SuppressWarnings("deprecation")
@Service("PorChangeService")
public class PorChangeServiceImpl {
	@Resource(name = "PorChangeDAO")
	private PorChangeDAO PorChangeDAO;

	@SuppressWarnings("rawtypes")
	public List loadCommonCode(Map<String, Object> classCodeMap) {
		return PorChangeDAO.loadCommonCode(classCodeMap);			
	}
	
	
	@SuppressWarnings("rawtypes")
	public List showList(Map<String, Object> classCodeMap) {
		return PorChangeDAO.showList(classCodeMap);			
	}
	
	@SuppressWarnings("rawtypes")
	public List searchList(Map ds_condition) {
		return PorChangeDAO.searchList(ds_condition);			
	}


	public void saveList(Map map) {
		PorChangeDAO.saveList(map);
		
	}


}

