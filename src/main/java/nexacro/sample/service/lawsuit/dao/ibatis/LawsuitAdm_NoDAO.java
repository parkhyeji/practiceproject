package nexacro.sample.service.lawsuit.dao.ibatis;

import java.util.List;
import java.util.Map;

import nexacro.sample.service.lawsuit.vo.LawsuitAdm_NoVO;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;


@Repository("lawsuitadmnoDAO")
public class LawsuitAdm_NoDAO extends NexacroIbatisAbstractDAO{

	public List<LawsuitAdm_NoVO> selectlawsuitadmnoServiceVO(Map<String, Object> ListMap) {
		// TODO Auto-generated method stub
		
		return (List<LawsuitAdm_NoVO>) list("lawsuitadmnoDAO.selectlawsuitadmnoServiceVO", ListMap);
	}

}
