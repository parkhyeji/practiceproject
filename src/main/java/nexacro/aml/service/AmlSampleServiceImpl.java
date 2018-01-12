package nexacro.aml.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.aml.dao.AmlSampleDAO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;

@SuppressWarnings("deprecation")
@Service("amlSampleService")
public class AmlSampleServiceImpl extends AbstractServiceImpl{
	
	@Resource(name = "amlSampleDAO")
	private AmlSampleDAO amlSampleDAO;

	@SuppressWarnings("rawtypes")
	public List loadCommonCode(Map<String, Object> classCodeMap) {
		return amlSampleDAO.loadCommonCode(classCodeMap);
	}
	
	@SuppressWarnings("rawtypes")	
	public List searchStrList(Map map) {
		return amlSampleDAO.searchStrList(map);
	}

	//Rule정보 조회
	public List searchRule(Map map) {
		return amlSampleDAO.searchRule(map);
	}
	//cust정보 조회
	public List searchCust(Map map) {
		return amlSampleDAO.searchCust(map);
	}
	
	public List viewReason(Map map){
		return amlSampleDAO.reason(map);
	}
	
}
