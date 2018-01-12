package nexacro.sample.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.sample.service.TabEdocAdmService;
import nexacro.sample.vo.TabEdocAdmVO;
import nexacro.sample.vo.TabLawsuitVO;
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
public class TabEdocAdmController {

	private Logger log = LoggerFactory.getLogger(SampleController.class);
	
    // @Autowired(required = false) // Type 정의
    @Resource(name = "tabEdocAdmService")
    // Name 정의
    private TabEdocAdmService tabEdocAdmService;
    
    @RequestMapping(value = "/tabLawsuitSelectVO.do")
   	public NexacroResult tabLawsuitSelectVO(@ParamDataSet(name = "ds_search", required = false) TabLawsuitVO searchVo) {

   		System.out.println("aaa");
    	List<TabLawsuitVO> sampleList = tabEdocAdmService.selectTabLawsuitVOList(searchVo);

   		NexacroResult result = new NexacroResult();
   		result.addDataSet("output1", sampleList);

   		return result;
   	}
       
       @RequestMapping(value = "/tabLawsuitSelectVOFromMap.do")
   	public NexacroResult tabLawsuitSelectVOFromMap(@ParamDataSet(name = "ds_search", required = false) TabLawsuitVO searchVo) {
       	
       	List<Map> sampleList = tabEdocAdmService.selectTabLawsuitMapList(searchVo);
       	
       	NexacroResult result = new NexacroResult();
       	result.addDataSet("output1", sampleList);
       	
       	return result;
       }
       
    @RequestMapping(value = "/tabEdocAdmSelectVO.do") 
	public NexacroResult selectVo(@ParamDataSet(name = "ds_search", required = false) TabEdocAdmVO searchVo) {

		List<TabEdocAdmVO> sampleList = tabEdocAdmService.selectTabEdocAdmVOList(searchVo);

		NexacroResult result = new NexacroResult();
		result.addDataSet("output1", sampleList);

		return result;
	}
    
    @RequestMapping(value = "/tabEdocAdmSelect2VO.do")
	public NexacroResult select2Vo(@ParamDataSet(name = "ds_search", required = false) TabEdocAdmVO searchVo) {

		List<TabEdocAdmVO> sampleList = tabEdocAdmService.selectTabEdocAdm2VOList(searchVo);

		NexacroResult result = new NexacroResult();
		result.addDataSet("output1", sampleList);

		return result;
	}
    
    @RequestMapping(value = "/tabEdocAdmSelectVOFromMap.do")
	public NexacroResult selectVoFromMap(@ParamDataSet(name = "ds_search", required = false) TabEdocAdmVO searchVo) {
    	
    	List<Map> sampleList = tabEdocAdmService.selectTabEdocAdmMapList(searchVo);
    	
    	NexacroResult result = new NexacroResult();
    	result.addDataSet("output1", sampleList);
    	
    	return result;
    }
    
    @RequestMapping(value = "/tabEdocAdmModifyVO.do")
	public NexacroResult modifyVO(@ParamDataSet(name = "input1") List<TabEdocAdmVO> modifyList) {
    	
    	tabEdocAdmService.modifyMultiTabEdocAdmVO(modifyList);
        
        NexacroResult result = new NexacroResult();
        
        return result;
    }
    
    
    @RequestMapping(value = "/tabEdocAdmPaging.do")
	public NexacroResult selectPaging(@ParamDataSet(name = "tabEdocAdm", required = false) TabEdocAdmVO searchVO) {
    
        if(searchVO == null) {
        	searchVO = new TabEdocAdmVO();
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

    	List<TabEdocAdmVO> sampleList = tabEdocAdmService.selectTabEdocAdmPaging(searchVO);

    	int totalCount = tabEdocAdmService.selectTabEdocAdmCount(searchVO);
    	paginationInfo.setTotalRecordCount(totalCount);
        
    	List paginationInfos = new ArrayList();
    	paginationInfos.add(paginationInfo);
        
        NexacroResult result = new NexacroResult();
        result.addDataSet("dsList", sampleList);
        result.addDataSet("dsPagingInfo", paginationInfos);
        
        return result;
    }
    
   
}
