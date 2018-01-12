package nexacro.sample.service.dao.ibatis;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

@Repository("sueDAO")
public class SueDAO extends NexacroIbatisAbstractDAO{

	@SuppressWarnings("rawtypes")
	public List sueMenList(Map<String, Object> sueMap){
		System.out.println("sueMenList");
		return list("sue.sueDAO.getSueMenList", sueMap);
	}
	
	@SuppressWarnings("rawtypes")
	public List sueView(Map<String, Object> sueMap){
		return list("sue.sueDAO.sueView", sueMap);
	}
	@SuppressWarnings("rawtypes")
	public void sueUpdate(Map<String, Object> params){
		//return list("sue.sueDAO.sueUpdate", params);
		update("sue.sueDAO.sueUpdate", params);
	}
	
	@SuppressWarnings("rawtypes")
	public int sueTotalCnt(){
		System.out.println("sueTotalCnt");
		return (int) select("sue.sueDAO.sueTotalCnt");
	}
	//public void sueUpdate(List<Map> params){
	
	/*public void insertSue(Map<String, Object> paramMap){
		insert("sue.sueDAO.insertSue", paramMap);
	}*/
	/*public void updateSue(Map<String, Object> paramMap){
		insert("sue.sueDAO.updateSue", paramMap);
	}
	public void deleteSue(Map<String, Object> paramMap){
		insert("sue.sueDAO.deleteSue", paramMap);
	}*/
	
}
