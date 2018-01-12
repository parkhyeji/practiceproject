package nexacro.aml.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.aml.dao.AthManagementDAO;

import org.springframework.stereotype.Service;
@SuppressWarnings("deprecation")
@Service("AthManagementService")
public class AthManagementServiceImpl {
	
	@Resource(name = "AthManagementDAO")
	private AthManagementDAO AthManagementDAO;

	@SuppressWarnings("rawtypes")
	public List load() {
		return AthManagementDAO.load();
	}
	@SuppressWarnings("rawtypes")
	public List loadUp() {
		return AthManagementDAO.loadUp();
	}
		
	@SuppressWarnings("rawtypes")
	public List searchList(Map ds_condition) {
		return AthManagementDAO.searchList(ds_condition);			
	}

	@SuppressWarnings("rawtypes")
	public void delete(Map map) {
		AthManagementDAO.delete(map);
		
	}

	@SuppressWarnings("rawtypes")
	public void delup(List<Map> list) {
		for(Map map:list){
			String flag = (String) map.get("flag");
			if(flag.equals("U")){
				AthManagementDAO.deleteup(map);
				// delete (empNo)>>DAO.delete(map);
				// insert(if) 3 each
				String ch = (String) map.get("loginCh");
				if(ch.equals("1")){
					map.put("authNo", "0002");
					AthManagementDAO.insert(map);
				}
				ch=(String) map.get("appCh");
				if(ch.equals("1")){
					map.put("authNo", "0003");
					AthManagementDAO.insert(map);
				}
				ch = (String) map.get("readCh");
				if(ch.equals("1")){
					map.put("authNo", "0004");
					AthManagementDAO.insert(map);
				}
				ch = (String) map.get("writeCh");
				if(ch.equals("1")){
					map.put("authNo", "0005");
					AthManagementDAO.insert(map);
				}
				ch = (String) map.get("rolwriteCh");
				if(ch.equals("1")){
					map.put("authNo", "0006");
					AthManagementDAO.insert(map);
				}
				ch = (String) map.get("roldelCh");
				if(ch.equals("1")){
					map.put("authNo", "0007");
					AthManagementDAO.insert(map);
				}
			}
		}
	}
}
