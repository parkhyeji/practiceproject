package nexacro.sample.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.sample.service.TabReconcilService;
import nexacro.sample.vo.TabReconcilVO;
import nexacro.sample.vo.UnitVO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.annotation.ParamVariable;
import com.nexacro.spring.data.NexacroFirstRowHandler;
import com.nexacro.spring.data.NexacroResult;
import com.nexacro.xapi.data.DataSet;
import com.nexacro.xapi.data.DataSetList;
import com.nexacro.xapi.data.PlatformData;
import com.nexacro.xapi.data.Variable;
import com.nexacro.xapi.data.VariableList;
import com.nexacro.xapi.tx.HttpPlatformRequest;
import com.nexacro.xapi.tx.HttpPlatformResponse;

import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;

/**
 * 서면 관리를 위한 Controller Tab_Edoc_Adm Class
 * 
 * @author shin wc
 * @since 10.23.2017
 * @version 1.0
 * @see
 */
@Controller
public class TabReconcilController {

	private Logger log = LoggerFactory.getLogger(SampleController.class);
	
    // @Autowired(required = false) // Type 정의
    @Resource(name = "tabReconcilService")
    // Name 정의
    private TabReconcilService tabReconcilService;
    
    
    @RequestMapping(value = "/tabPladefOrgSelectVO.do")
   	public NexacroResult tabPladefOrgSelectVO(@ParamDataSet(name = "ds_search", required = false) TabReconcilVO searchVo) {

   		List<TabReconcilVO> sampleList = tabReconcilService.selectTabPladefVOList(searchVo);

   		NexacroResult result = new NexacroResult();
   		result.addDataSet("output1", sampleList);

   		return result;
   	}
    
    ///////////////////////////////////////////////
    
    @RequestMapping(value = "/tabReconcil2SelectVO.do")
	public NexacroResult tabReconcil2SelectVO(@ParamDataSet(name = "ds_search", required = false) TabReconcilVO searchVo) {

		List<TabReconcilVO> sampleList = tabReconcilService.selectTabReconcil2VOList(searchVo);

		NexacroResult result = new NexacroResult();
		result.addDataSet("output1", sampleList);

		return result;
	}
    
    //////////////////////////////////////////////selectTabReconcil3VOList
    @RequestMapping(value = "/tabReconcil3SelectVO.do")
	public NexacroResult tabReconcil3SelectVO(@ParamDataSet(name = "input1", required = false) TabReconcilVO searchVo) {
    	System.out.println("getLawsuitAdmNo;"+searchVo.getLawsuitAdmNo());
		List<TabReconcilVO> sampleList = tabReconcilService.selectTabReconcil3VOList(searchVo);

		NexacroResult result = new NexacroResult();
		result.addDataSet("output1", sampleList);

		return result;
	}
    
    
    @RequestMapping(value = "/tabReconcilSelectVO.do")
	public NexacroResult selectVo(@ParamDataSet(name = "ds_search", required = false) TabReconcilVO searchVo) {

		List<TabReconcilVO> sampleList = tabReconcilService.selectTabReconcilVOList(searchVo);

		NexacroResult result = new NexacroResult();
		result.addDataSet("output1", sampleList);

		return result;
	}
    
    @RequestMapping(value = "/tabReconcilSelectVOFromMap.do")
	public NexacroResult selectVoFromMap(@ParamDataSet(name = "ds_search", required = false) TabReconcilVO searchVo) {
    	
    	List<Map> sampleList = tabReconcilService.selectTabReconcilMapList(searchVo);
    	
    	NexacroResult result = new NexacroResult();
    	result.addDataSet("output1", sampleList);
    	
    	return result;
    }
    
    @RequestMapping(value = "/tabReconcilModifyVO.do")
	public NexacroResult modifyVO(@ParamDataSet(name = "input1") List<TabReconcilVO> modifyList) {
    	
    	tabReconcilService.modifyMultiTabReconcilVO(modifyList);
        
        NexacroResult result = new NexacroResult();
        
        return result;
    }
    
    //modifyMultiTabPladefOrgVO
    @RequestMapping(value = "/tabPladefOrg2ModifyVO.do")
	public NexacroResult modifyMultiTabPladefOrgVO(@ParamDataSet(name = "input1") List<TabReconcilVO> modifyList) {
    	
    	tabReconcilService.modifyMultiTabPladefOrgVO(modifyList);
        
        NexacroResult result = new NexacroResult();
        
        return result;
    }
    
    //(TabReconcilVO searchVO);
    @RequestMapping(value = "/deleteTabReconcilVO.do")
   	public NexacroResult deleteTabReconcilVO(@ParamDataSet(name = "input1", required = false) TabReconcilVO searchVo) {
    	
    	System.out.println("deleteTabReconcilVO");
    	//System.out.println("getLawsuitAdmNo:"+searchVo.getLawsuitAdmNo());
    	//tabReconcilVO
    	
       	tabReconcilService.deleteTabReconcilVO(searchVo);
           
           NexacroResult result = new NexacroResult();
           
           return result;
       }
    
    
    @RequestMapping(value = "/tabReconcilPaging.do")
	public NexacroResult selectPaging(@ParamDataSet(name = "ds_search", required = false) TabReconcilVO searchVO) {
    
        if(searchVO == null) {
        	searchVO = new TabReconcilVO();
        }

        searchVO.setPageUnit(10);
        searchVO.setPageSize(10);

        
    	PaginationInfo paginationInfo = new PaginationInfo();
    	paginationInfo.setCurrentPageNo(searchVO.getPageIndex());
    	paginationInfo.setRecordCountPerPage(searchVO.getPageUnit());
    	paginationInfo.setPageSize(searchVO.getPageSize());

    	searchVO.setFirstIndex(paginationInfo.getFirstRecordIndex());
    	searchVO.setLastIndex(paginationInfo.getLastRecordIndex());
    	searchVO.setRecordCountPerPage(paginationInfo.getRecordCountPerPage());

    	List<TabReconcilVO> sampleList = tabReconcilService.selectTabReconcilPaging(searchVO);

    	int totalCount = tabReconcilService.selectTabReconcilCount(searchVO);
    	paginationInfo.setTotalRecordCount(totalCount);
        
    	List paginationInfos = new ArrayList();
    	paginationInfos.add(paginationInfo);
        
        NexacroResult result = new NexacroResult();
        result.addDataSet("dsList", sampleList);
        result.addDataSet("dsPagingInfo", paginationInfos);
        
        return result;
    }
    
   
}
