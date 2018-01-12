package nexacro.aml.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.aml.dao.EmpInfoDAO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;


@SuppressWarnings("deprecation")
@Service("EmpInfoService")
public class EmpInfoService extends AbstractServiceImpl{
	
	@Resource(name = "EmpInfoDAO")
	private EmpInfoDAO empInfoDAO;

	@SuppressWarnings("rawtypes")
	public List EmpInfoList() {
		return empInfoDAO.EmpInfoList();			
	}

	public void empInfoUpdate(Map map) {
		empInfoDAO.empInfoUpdate(map);
	}

	public void empJoinDateUpdate(Map map) {
		empInfoDAO.empJoinDateUpdate(map);
	}
	
	public void empRetireDateUpdate(Map map) {
		empInfoDAO.empRetireDateUpdate(map);
	}

	public List posiNameSearch(Map map) {
		return empInfoDAO.posiNameSearch(map);
	}
}
