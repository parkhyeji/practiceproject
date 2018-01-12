package nexacro.aml.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

@Repository("AthManagementDAO")
public class AthManagementDAO extends NexacroIbatisAbstractDAO {

	@SuppressWarnings("rawtypes")
	public List load() {
		return list("aml.AthManagementDAO.load");
	}
	@SuppressWarnings("rawtypes")
	public List loadUp() {
		return list("aml.AthManagementDAO.loadUp");
	}
	
	@SuppressWarnings("rawtypes")
	public List searchList(Map ds_condition) {
		return list("aml.AthManagementDAO.searchAth", ds_condition);
	}

	@SuppressWarnings("rawtypes")
	public void delete(Map map) {
		delete ("aml.AthManagementDAO.delete", map);
	}
	@SuppressWarnings("rawtypes")
	public void deleteup(Map map) {
		delete("aml.AthManagementDAO.empDelete", map);
		
	}
	@SuppressWarnings("rawtypes")
	public void insert(Map map) {
		insert("aml.AthManagementDAO.insert", map);
	}
	
}
