package nexacro.sample.service.lawsuit;

import java.util.List;

import nexacro.sample.service.lawsuit.vo.LawsuitListVO;

public interface LawsuitService {
	List<LawsuitListVO> selectLawsuitList(LawsuitListVO searchVo);
	
	LawsuitListVO setInstanceLevel(LawsuitListVO searchVo);
	
	void insertLawsuit(LawsuitListVO searchVo);
	
	void updateLawsuitVO(LawsuitListVO lawsuitList);
	void updateInstanceVO(LawsuitListVO lawsuitList);
	void updatePladefVO(LawsuitListVO lawsuitList);
}
