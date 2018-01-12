package nexacro.sample.service;

import java.util.List;
import java.util.Map;

import nexacro.sample.vo.TabAlesSueVO;
import nexacro.sample.vo.TabLawFixinfoVO;

/**
 * Test를 위한 Servlce Sample Intreface
 * 
 * @author shin wc
 * @since 10.23.2017
 * @version 1.0
 * @see
 */
public interface TabLawFixinfoService {
/*
    List<SampleVO> selectSampleVOList(SampleVO searchVO);

    List<Map> selectSampleMapList(SampleVO searchVO);
    
    List<SampleVO> selectSamplePaging(SampleVO searchVO);
    
    int selectSampleCount(SampleVO searchVO);
    
    void modifyMultiSampleVO(List<SampleVO> modifyList);
*/

	// 소송기본사항 조회
	List<TabLawFixinfoVO> getLawsuitRecSelect(TabLawFixinfoVO searchVO);
	
	// 소송기일정보 및 기일상세정보 조회
	List<TabLawFixinfoVO> getLawFixinfoSelect(TabLawFixinfoVO searchVO);
		
	
	
	// 저장, 수정 , 삭제

	void getLawFixinfoCud(List<TabLawFixinfoVO> searchVO);
	
}
