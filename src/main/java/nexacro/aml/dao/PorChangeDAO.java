package nexacro.aml.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

@Repository("PorChangeDAO")
public class PorChangeDAO extends NexacroIbatisAbstractDAO {
	
	@SuppressWarnings("rawtypes")
	public List loadCommonCode(Map<String, Object> classCodeMap) {
		return list("aml.PorChangeDAO.loadCommonCodes", classCodeMap);
	}
	
	@SuppressWarnings("rawtypes")
	public List showList(Map<String, Object> listMap) {
		return list("aml.PorChangeDAO.showList", listMap);
	}
	
	@SuppressWarnings("rawtypes")
	public List searchList(Map ds_condition) {
		return list("aml.PorChangeDAO.searchList", ds_condition);
	}
	
	public void saveList(Map map) {
		update("aml.PorChangeDAO.updateList", map);
		
	}
	

}