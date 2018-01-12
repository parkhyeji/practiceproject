package nexacro.aml.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

@Repository("EmpInfoDAO")
public class EmpInfoDAO extends NexacroIbatisAbstractDAO {

	@SuppressWarnings("rawtypes")
	public List EmpInfoList() {
		return list("aml.EmpInfoDAO.EmpInfoList");
	}

	public void empInfoUpdate(Map map) {
		update("aml.EmpInfoDAO.empInfoUpdate", map);
	}

	public void empJoinDateUpdate(Map map) {
		update("aml.EmpInfoDAO.empJoinDateUpdate", map);
	}

	public void empRetireDateUpdate(Map map) {
		update("aml.EmpInfoDAO.empRetireDateUpdate", map);
	}

	public List posiNameSearch(Map map) {
		return list("aml.EmpInfoDAO.posiNameSearch", map);
	}
}
