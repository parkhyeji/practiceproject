package nexacro.sample.service.lawsuit.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.sample.service.lawsuit.LawsuitAdm_NoService;
import nexacro.sample.service.lawsuit.dao.ibatis.LawsuitAdm_NoDAO;
import nexacro.sample.service.lawsuit.vo.LawsuitAdm_NoVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("lawsuitadmnoService")
public class LawsuitAdm_NoServiceImpl extends EgovAbstractServiceImpl implements LawsuitAdm_NoService {

	@Resource(name = "lawsuitadmnoDAO")
	private LawsuitAdm_NoDAO lawsuitadmnoDAO;

	@Override
	public List<LawsuitAdm_NoVO> selectlawsuitadmnoServiceVO(
			Map<String, Object> ListMap) {
		// TODO Auto-generated method stub
		return lawsuitadmnoDAO.selectlawsuitadmnoServiceVO(ListMap);
	}

}
