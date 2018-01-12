package nexacro.aml.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;



import nexacro.aml.dao.EmpCrudDAO;

import org.springframework.stereotype.Service;


@SuppressWarnings("deprecation")
@Service("EmpCrudService")
public class EmpCrudServiceImpl {
	
	@Resource(name = "EmpCrudDAO")
	private EmpCrudDAO EmpCrudDAO;

	
	@SuppressWarnings("rawtypes")
	public List searchCust() {
		return EmpCrudDAO.searchCust();			
	}
	
	public void insertCust(Map map) {
		EmpCrudDAO.insertCust(map);			
	}
	
	public void updateCust(Map map) {
		EmpCrudDAO.updateCust(map);			
	}
	
	public void deleteCust(Map map) {
		EmpCrudDAO.deleteCust(map);			
	}


}
