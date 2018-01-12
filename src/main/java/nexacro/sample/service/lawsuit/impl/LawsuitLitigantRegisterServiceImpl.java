package nexacro.sample.service.lawsuit.impl;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.lawsuit.LawsuitLitigantRegisterService;
import nexacro.sample.service.lawsuit.dao.ibatis.LawsuitLitigantRegisterDAO;
import nexacro.sample.service.lawsuit.vo.LawsuitLitigantRegisterVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("lawsuitLitigantService")
public class LawsuitLitigantRegisterServiceImpl  extends EgovAbstractServiceImpl implements LawsuitLitigantRegisterService {

@Resource(name = "LawsuitLitigantRegisterDAO")
private LawsuitLitigantRegisterDAO LawsuitLitigantRegisterDAO;
	
@Override
public int updatePlaDefAll(LawsuitLitigantRegisterVO pladefIn) {
	LawsuitLitigantRegisterDAO.updatePladefAll(pladefIn);
	return 0;
	}



@Override
public List<LawsuitLitigantRegisterVO> selectPladefAll(
		LawsuitLitigantRegisterVO pladefIn) {
	return LawsuitLitigantRegisterDAO.selectPladefAll(pladefIn);
}



@Override
public int plaDefMgr(LawsuitLitigantRegisterVO pladefIn) {
	LawsuitLitigantRegisterDAO.plaDefMgr(pladefIn);
	return 0;
} 
}
