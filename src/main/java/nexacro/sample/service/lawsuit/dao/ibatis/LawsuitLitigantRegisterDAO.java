package nexacro.sample.service.lawsuit.dao.ibatis;

import java.util.List;

import org.springframework.stereotype.Repository;

import nexacro.sample.service.lawsuit.vo.LawsuitLitigantRegisterVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("LawsuitLitigantRegisterDAO")
public class LawsuitLitigantRegisterDAO extends EgovAbstractDAO {

	public int updatePladefAll(LawsuitLitigantRegisterVO ListVO) {
		return update("lawsuit.LawsuitLitigantRegisterVO.updatePladefAll", ListVO);
	}
	
	public List<LawsuitLitigantRegisterVO> selectPladefAll(LawsuitLitigantRegisterVO pladefIn)
	{
		return (List<LawsuitLitigantRegisterVO>) list("LawsuitLitigantRegisterDAO.selectPladefAll",pladefIn);
	}
	
	//insert
	public int plaDefMgr(LawsuitLitigantRegisterVO ListVO) {
		insert("lawsuit.LawsuitLitigantRegisterVO.plaDefMgr", ListVO);
		return 0;
	}
}
