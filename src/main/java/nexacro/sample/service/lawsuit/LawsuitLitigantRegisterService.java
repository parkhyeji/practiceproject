package nexacro.sample.service.lawsuit;

import java.util.List;

import nexacro.sample.service.lawsuit.vo.LawsuitLitigantRegisterVO;

public interface LawsuitLitigantRegisterService {
	int updatePlaDefAll(LawsuitLitigantRegisterVO pladefIn);
	
	List<LawsuitLitigantRegisterVO> selectPladefAll(LawsuitLitigantRegisterVO pladefIn);
	//insert
	int plaDefMgr(LawsuitLitigantRegisterVO pladefIn);
}
