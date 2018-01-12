package nexacro.aml.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

@Repository("custInfoDAO")
public class CustInfoDAO extends NexacroIbatisAbstractDAO {

	@SuppressWarnings("rawtypes")
	public List loadCommonCode(Map classCodeMap) {
		return list("custinfo.custInfoDAO.loadCommonCodes", classCodeMap);
	}
	
	@SuppressWarnings("rawtypes")
	public List searchCust() {
		return list("custinfo.custInfoDAO.searchCust");
	}

	public void insertCust(Map map) {
		insert("custinfo.custInfoDAO.insertCust", map);
	}
	
	public void updateCust(Map map) {
		insert("custinfo.custInfoDAO.updateCust", map);
	}
	
	public void deleteCust(Map map) {
		insert("custinfo.custInfoDAO.deleteCust", map);
	}

	@SuppressWarnings("rawtypes")
	public List searchaddr(Map map) {
		return list("custinfo.custInfoDAO.searchaddr", map);
	}
	
	/*
	public void deletecust(Map map) {
		custInfoDAO.deletecust(map);
	}
	*/

}
