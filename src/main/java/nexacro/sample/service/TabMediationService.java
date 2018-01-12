package nexacro.sample.service;

import java.util.List;
import java.util.Map;

import nexacro.sample.vo.TabMediationVO;


/**
 * Test를 위한 Servlce Sample Intreface
 * 
 * @author shin wc
 * @since 10.23.2017
 * @version 1.0
 * @see
 */
public interface TabMediationService {
	// 기본사항조회
		public List<TabMediationVO> mediationSelect(Map<String, Object> selectMap);

		// 원피고조회
		public List<TabMediationVO> pladefSelect(Map<String, Object> selectMap);
		
		// 조정안조회
		public List<TabMediationVO> bottomSearch(Map<String, Object> selectMap);
		
		// 조정안 저장 수정 삭제
		public String mediationSave(List<TabMediationVO> MediationVO, String lawAdmNo,
				String instCode);
}
