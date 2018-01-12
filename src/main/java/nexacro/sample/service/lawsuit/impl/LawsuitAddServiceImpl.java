package nexacro.sample.service.lawsuit.impl;


import javax.annotation.Resource;

import nexacro.sample.service.lawsuit.LawsuitAddService;
import nexacro.sample.service.lawsuit.dao.ibatis.LawsuitAddDAO;
import nexacro.sample.service.lawsuit.vo.LawsuitAddVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("lawsuitaddService")
public class LawsuitAddServiceImpl extends EgovAbstractServiceImpl implements LawsuitAddService {

	@Resource(name = "lawsuitaddDAO")
	private LawsuitAddDAO lawsuitaddDAO;

	@Override
	public void LawsuitAddSaveVO(LawsuitAddVO LawsuitAddVo) {
		// TODO Auto-generated method stub
		lawsuitaddDAO.updateAddLawsuit(LawsuitAddVo);
			
		}	
	}