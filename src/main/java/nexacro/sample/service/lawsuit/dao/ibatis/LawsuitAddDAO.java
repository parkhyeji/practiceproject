package nexacro.sample.service.lawsuit.dao.ibatis;


import nexacro.sample.service.lawsuit.vo.LawsuitAddVO;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

@Repository("lawsuitaddDAO")
public class LawsuitAddDAO extends NexacroIbatisAbstractDAO{

	public void updateAddLawsuit(LawsuitAddVO ListVo) {
		update("lawsuitaddDAO.updateAddLawsuit", ListVo);
	}
}
