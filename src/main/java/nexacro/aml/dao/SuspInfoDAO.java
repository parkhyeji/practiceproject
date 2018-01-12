package nexacro.aml.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

@Repository("suspInfoDao")
public class SuspInfoDAO extends NexacroIbatisAbstractDAO {
	
	@SuppressWarnings("rawtypes")
	public List supSearch() {
		return list("suspInfoSql.search");
	}
	
	public void upperInset(Map map){
		insert("upper.Insert", map);
	}
	
	public void upperUpdate(Map map){
		insert("upper.Update", map);
	}
	
	public void upperDelete(Map map){
		insert("upper.Delete", map);
	}
	
	public List suspDetail(Map map){
		return list("susp.Detail", map);
	}
	
	public void detailInsert(Map map){
		insert("detail.Insert", map);
	}
	
	public void detailUpdate(Map map){
		insert("detail.Update", map);
	}
	
	public void detailDelete(Map map){
		insert("detail.Delete", map);
	}
	
}
