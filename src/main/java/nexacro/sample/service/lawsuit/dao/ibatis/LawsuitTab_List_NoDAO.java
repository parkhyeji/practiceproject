package nexacro.sample.service.lawsuit.dao.ibatis;

import java.util.List;
import java.util.Map;

import nexacro.sample.service.lawsuit.vo.LawsuitTab_List_NoVO;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

@Repository("lawsuittablistnoDAO")
public class LawsuitTab_List_NoDAO extends NexacroIbatisAbstractDAO{

	public List<LawsuitTab_List_NoVO> LawsuitTabListNoSelectVO(Map<String, Object> ListMap) {
		// TODO Auto-generated method stub
		return (List<LawsuitTab_List_NoVO>) list("lawsuittablistnoDAO.LawsuitTabListNoSelectVO", ListMap);
	}
	
	public void insertlawsuittablistnoVO(LawsuitTab_List_NoVO tablistno) {
		// TODO Auto-generated method stub
		insert("lawsuittablistnoDAO.insertlawsuittablistnoVO", tablistno);
	}

	public void updatelawsuittablistnoVO(LawsuitTab_List_NoVO tablistno) {
		// TODO Auto-generated method stub
		update("lawsuittablistnoDAO.updatelawsuittablistnoVO", tablistno);
	}
}
