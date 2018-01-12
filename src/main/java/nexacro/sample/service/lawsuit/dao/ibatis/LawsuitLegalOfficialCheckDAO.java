package nexacro.sample.service.lawsuit.dao.ibatis;

import java.util.List;
import java.util.Map;

import nexacro.sample.service.lawsuit.vo.LawsuitLegalOfficialCheckVO;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("lawsuitlistDAO")
public class LawsuitLegalOfficialCheckDAO extends EgovAbstractDAO{
	// 당담 판사 조회
			public List<LawsuitLegalOfficialCheckVO> getLegalOfficials(Map<String, Object> ListMap) {
				return (List<LawsuitLegalOfficialCheckVO>)list("lawsuit.Lawsuit_ListDAO.getLegalOfficials", ListMap);
			}
}
