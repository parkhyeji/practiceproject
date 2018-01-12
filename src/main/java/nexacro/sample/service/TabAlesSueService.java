package nexacro.sample.service;

import java.util.List;
import java.util.Map;

import nexacro.sample.vo.TabAlesSueVO;

/**
 * Test를 위한 Servlce Sample Intreface
 * 
 * @author shin wc
 * @since 10.23.2017
 * @version 1.0
 * @see
 */
public interface TabAlesSueService {

	//기본조회
		public List<TabAlesSueVO> ales_sueSelect(Map<String, Object> selectMap);
		
		
		
	//저장/수정/삭제
		public String ales_sueSave(List<TabAlesSueVO> Ales_sueVO, String lawsuitAdmNo);
}
