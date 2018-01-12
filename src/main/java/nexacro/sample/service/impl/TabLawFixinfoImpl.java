package nexacro.sample.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.sample.service.TabLawFixinfoService;
import nexacro.sample.service.dao.ibatis.TabLawFixinfoDAO;
import nexacro.sample.vo.TabLawFixinfoVO;

import org.springframework.stereotype.Service;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

/**
 * Test를 위한 ServiceImpl Sample Class
 *
 * @author Park SeongMin
 * @since 08.12.2015
 * @version 1.0
 * @see
 */
@Service("tabLawFixinfoService")
public class TabLawFixinfoImpl extends EgovAbstractServiceImpl implements TabLawFixinfoService {

	@Resource(name = "tabLawFixinfoDAO")
	private TabLawFixinfoDAO tabLawFixinfoDAO;
	
	
	// 소송관리번호 조회
	@Override
	public List<TabLawFixinfoVO> getLawsuitRecSelect(TabLawFixinfoVO searchVO) {
		
		return tabLawFixinfoDAO.getLawsuitRecSelect(searchVO);
	}
	
	
	// 소송기일정보 및 기일상세정보 조회
	@Override
	public List<TabLawFixinfoVO> getLawFixinfoSelect(TabLawFixinfoVO searchVO) {
		
		return tabLawFixinfoDAO.getLawFixinfoSelect(searchVO);
	}
	
	
	
	//저장, 수정, 삭제
			@Override
			public void getLawFixinfoCud(List<TabLawFixinfoVO> searchVO) {
				int size = searchVO.size();
		        for (int i=0; i<size; i++) {
		        	TabLawFixinfoVO Law_fixinfoVO = searchVO.get(i);
		        	
		        	DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) Law_fixinfoVO;
					
		    		if(accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){
		    			tabLawFixinfoDAO.insertFixinfo(Law_fixinfoVO);
		    		}else if(accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
		    			tabLawFixinfoDAO.updateFixinfo(Law_fixinfoVO);
		    		}else if(accessor.getRowType() == DataSet.ROW_TYPE_DELETED){
		    			tabLawFixinfoDAO.deleteFixinfo(Law_fixinfoVO);;
		    			
		    		}
		    		
		        }	
				
			}
			
    
}
