package nexacro.sample.service.lawsuit.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.sample.service.lawsuit.LawsuitLegalOfficialCheckService;
import nexacro.sample.service.lawsuit.dao.ibatis.LawsuitLegalOfficialCheckDAO;
import nexacro.sample.service.lawsuit.vo.LawsuitLegalOfficialCheckVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("lawsuitlistservice")
public class LawsuitLegalOfficialCheckServiceImpl extends EgovAbstractServiceImpl implements LawsuitLegalOfficialCheckService{
	@Resource(name = "lawsuitlistDAO")
	private LawsuitLegalOfficialCheckDAO lawsuitlistDAO;
	// 당담판사 검색
		public List<LawsuitLegalOfficialCheckVO> getLegalOfficials(Map<String, Object> ListMap) {
			return lawsuitlistDAO.getLegalOfficials(ListMap);
		}
}
