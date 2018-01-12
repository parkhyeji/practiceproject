package nexacro.aml.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.aml.dao.SuspInfoDAO;

import org.springframework.stereotype.Service;

@SuppressWarnings("deprecation")
@Service("suspInfoService")
public class SuspInfoService {

	@Resource(name = "suspInfoDao")
	private SuspInfoDAO suspInfoDao;
	
	@SuppressWarnings("rawtypes")
	public List search(){
		return suspInfoDao.supSearch();
	}
	
	public void upperInsert(Map map){
		suspInfoDao.upperInset(map);
	}
	public void upperUpdate(Map map){
		suspInfoDao.upperUpdate(map);
	}
	public void upperDelete(Map map){
		suspInfoDao.upperDelete(map);
	}
	
	public List detailList(Map map){
		return suspInfoDao.suspDetail(map);
	}
	
	public void detailInsert(Map map){
		suspInfoDao.detailInsert(map);
	}
	public void detailUpdate(Map map){
		suspInfoDao.detailUpdate(map);
	}
	public void detailDelete(Map map){
		suspInfoDao.detailDelete(map);
	}

}
