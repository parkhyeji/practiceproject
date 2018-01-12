package nexacro.Sys.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.Sys.dao.SysDetailDAO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;

@SuppressWarnings("deprecation")
@Service("sysDetailService")
public class SysDetailServiceImpl extends AbstractServiceImpl{
	
	@Resource(name = "sysDetailDAO")
	private SysDetailDAO sysDetailDAO;
	
	@SuppressWarnings("rawtypes")
	public List loadCommonCodeDetail() {
		return sysDetailDAO.loadCommonCodeDetail();
	}
	
	@SuppressWarnings("rawtypes")
	public List read(Map map) {
		return sysDetailDAO.read(map);
	}

	public List selectOption(Map map) { // 상위 셀렉트박스 값 변경시 하위셀렉트박스 제어
		return sysDetailDAO.selectOption(map);
	}

	public void insert(Map map) {
		sysDetailDAO.insert(map);			
	}

	public void update(Map map) {
		sysDetailDAO.update(map);			
	}
	
	public void delete(Map map) {
		sysDetailDAO.delete(map);			
	}	
}
