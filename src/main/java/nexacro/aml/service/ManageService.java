package nexacro.aml.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.aml.dao.ManageDAO;

import org.springframework.stereotype.Service;

@SuppressWarnings("deprecation")
@Service("ManageService")
public class ManageService {
	
	@Resource(name = "ManageDAO")
	private ManageDAO ManageDAO;
	
	@SuppressWarnings("rawtypes")
	public List ManageCommonCode(Map<String, Object> classCodeMap) {
		return ManageDAO.ManageCommonCode(classCodeMap);
	}
	//보고서관리 조회
	public List ManageList(Map map){
		return ManageDAO.ManageList(map);
	}	

}
