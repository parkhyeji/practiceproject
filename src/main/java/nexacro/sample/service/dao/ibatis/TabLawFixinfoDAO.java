package nexacro.sample.service.dao.ibatis;

import java.util.List;
import java.util.Map;

import nexacro.sample.vo.TabLawFixinfoVO;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

/**
 * Test를 위한 DAO Sample Class
 *
 * @author Park SeongMin
 * @since 08.12.2015
 * @version 1.0
 * @see
 */
@Repository("tabLawFixinfoDAO")
public class TabLawFixinfoDAO extends NexacroIbatisAbstractDAO {
	
	public List<TabLawFixinfoVO> getLawsuitRecSelect(TabLawFixinfoVO law_fixinfoVO) {
		return (List<TabLawFixinfoVO>) list("prgr.Law_fixinfoDAO.getLawsuitRecSelect", law_fixinfoVO);
	}
	
	
	// 소송기일정보 및 기일상세정보 조회
	public List<TabLawFixinfoVO> getLawFixinfoSelect(TabLawFixinfoVO law_fixinfoVO) {
		return (List<TabLawFixinfoVO>) list("prgr.Law_fixinfoDAO.getLawFixinfoSelect", law_fixinfoVO);
	}
	
	// 재판외화해 등록
	
	public void insertFixinfo(TabLawFixinfoVO law_fixinfoVO) {
		insert("prgr.Law_fixinfoDAO.insertFixinfo", law_fixinfoVO);
	}
	
	
	// 재판외화해 수정
	public void updateFixinfo(TabLawFixinfoVO law_fixinfoVO) {
		update("prgr.Law_fixinfoDAO.updateFixinfo", law_fixinfoVO);
	}
	
	
	// 재판외화해 삭제
	public void deleteFixinfo(TabLawFixinfoVO law_fixinfoVO) {
		delete("prgr.Law_fixinfoDAO.deleteFixinfo", law_fixinfoVO);
	}
	
}
