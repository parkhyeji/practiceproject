package nexacro.aml.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

@Repository("EmpCrudDAO")
public class EmpCrudDAO extends NexacroIbatisAbstractDAO {

	
	@SuppressWarnings("rawtypes")
	public List searchCust() {
		return list("aml.EmpCrudDAO.searchCust");
	}
	
	public void insertCust(Map map) {
		insert("aml.EmpCrudDAO.insertCust", map);
	}

	public void updateCust(Map map) {
		insert("aml.EmpCrudDAO.updateCust", map);
	}
	
	public void deleteCust(Map map) {
		insert("aml.EmpCrudDAO.deleteCust", map);
	}

}
