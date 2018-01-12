package nexacro.Sys.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.Sys.dao.SysSampleDAO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;

@SuppressWarnings("deprecation")
@Service("sysSampleService")
public class SysSampleServiceImpl extends AbstractServiceImpl{

	@Resource(name = "sysSampleDAO")
	private SysSampleDAO sysSampleDAO;

	@SuppressWarnings("rawtypes")
	public List loadCommonCode() {
		return sysSampleDAO.loadCommonCode();
	}	
	
	public List read(Map map) {
		return sysSampleDAO.read(map);
	}

	public void insert(Map map) {
		sysSampleDAO.insert(map);			
	}

	public void update(Map map) {
		sysSampleDAO.update(map);			
	}
	
	public void delete(Map map) {
		sysSampleDAO.delete(map);			
	}	
}
