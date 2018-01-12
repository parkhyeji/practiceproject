package nexacro.aml.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.aml.dao.LineInfoDAO;

import org.springframework.stereotype.Service;
@SuppressWarnings("deprecation")
@Service("LineInfoService")
public class LineInfoServiceImpl {

	@Resource(name = "LineInfoDAO")
	private LineInfoDAO LineInfoDAO;
	

	@SuppressWarnings("rawtypes")
	public List state(Map<String, Object> classCodeMap) {
		return LineInfoDAO.state(classCodeMap);
	}
	@SuppressWarnings("rawtypes")
	public List empName() {
		return LineInfoDAO.empName();
	}

	@SuppressWarnings("rawtypes")
	public List report(Map map) {
		return LineInfoDAO.report(map);
	}
	
	@SuppressWarnings("rawtypes")
	public void approval(Map map) {
		LineInfoDAO.approval(map);
	}
    
	@SuppressWarnings("rawtypes")
	public void disapproval(Map map) {
		LineInfoDAO.disapproval(map);
	}
}

