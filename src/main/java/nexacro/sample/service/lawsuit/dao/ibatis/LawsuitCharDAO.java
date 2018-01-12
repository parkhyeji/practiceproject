package nexacro.sample.service.lawsuit.dao.ibatis;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

import nexacro.sample.service.lawsuit.vo.LawsuitCharVO;

@Repository("lawsuitcharDAO")
public class LawsuitCharDAO extends NexacroIbatisAbstractDAO{

	public List<LawsuitCharVO> LawsuitCharSelectVO(Map<String, Object> ListMap) {
		// TODO Auto-generated method stub
		return (List<LawsuitCharVO>) list("lawsuitcharDAO.LawsuitCharSelectVO", ListMap);
	}

	
	
}
