package nexacro.sample.service.lawsuit.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import nexacro.sample.service.lawsuit.LawsuitService;
import nexacro.sample.service.lawsuit.dao.ibatis.LawsuitDAO;
import nexacro.sample.service.lawsuit.vo.LawsuitListVO;

@Service("lawsuitService")
public class LawsuitServiceImpl implements LawsuitService{

	@Resource(name="lawsuitDAO")
	private LawsuitDAO lawsuitDAO;
	
	@Override
	public List<LawsuitListVO> selectLawsuitList(LawsuitListVO searchVo) {
		return lawsuitDAO.selectLawsuitList(searchVo);
	}

	@Override
	public void insertLawsuit(LawsuitListVO searchVo) {
		lawsuitDAO.insertLawsuit(searchVo);
		
	}

	@Override
	public LawsuitListVO setInstanceLevel(LawsuitListVO searchVo) {
		// TODO Auto-generated method stub
		return lawsuitDAO.setInstanceLevel(searchVo);
	}

	@Override
	public void updateLawsuitVO(LawsuitListVO lawsuitList) {
		lawsuitDAO.updateLawsuitVO(lawsuitList);
		
	}

	@Override
	public void updateInstanceVO(LawsuitListVO lawsuitList) {
		lawsuitDAO.updateInstanceVO(lawsuitList);
	}

	@Override
	public void updatePladefVO(LawsuitListVO lawsuitList) {
		lawsuitDAO.updatePladefVO(lawsuitList);
	}
	
}
