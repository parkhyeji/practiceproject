package nexacro.sample.service.lawsuit;

import java.util.List;

import nexacro.sample.service.lawsuit.vo.LawsuitNotiNoVO;

public interface LawsuitNotiNoService {
	List<LawsuitNotiNoVO> selectlawsuitNotiNoList(LawsuitNotiNoVO searchVO);
}
