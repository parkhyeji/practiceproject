package nexacro.aml.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

@Repository("LineInfoDAO")
public class LineInfoDAO extends NexacroIbatisAbstractDAO{

	@SuppressWarnings("rawtypes")
	public List state(Map<String, Object> classCodeMap) {
		return list("aml.LineInfoDAO.state", classCodeMap);
	}
	
	@SuppressWarnings("rawtypes")
	public List empName() {
		return list("aml.LineInfoDAO.empName");
	}

	@SuppressWarnings("rawtypes")
	public List report(Map map) {
		return list("aml.LineInfoDAO.report", map);
	}

	public void approval(Map map) {
		update("aml.LineInfoDAO.approval", map);
	}

	public void disapproval(Map map) {
		update("aml.LineInfoDAO.disapproval", map);
	}

	

}
