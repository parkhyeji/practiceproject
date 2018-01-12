package nexacro.sample.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.sample.service.TabPreIwrService;
import nexacro.sample.vo.CmmCodeDetailVO;
import nexacro.sample.vo.TabPreIwrVO;
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
 * 서면 관리를 위한 Controller  Class
 * 
 * @author shin wc
 * @since 10.23.2017
 * @version 1.0
 * @see
 */
@Controller
public class TabPreIwrController {

	private Logger log = LoggerFactory.getLogger(SampleController.class);
	
    // @Autowired(required = false) // Type 정의
    @Resource(name = "tabPreIwrService")
    // Name 정의
    private TabPreIwrService tabPreIwrService;
    
  //심급정보
    @RequestMapping(value = "/tabCmmSelectVO.do")
	public NexacroResult tabCmmSelectVO(CmmCodeDetailVO searchVo,String classCode) {
    	searchVo.setClassCode(classCode);
		List<CmmCodeDetailVO> sampleList = tabPreIwrService.selectCmmVoList(searchVo);

		NexacroResult result = new NexacroResult();
		result.addDataSet("output1", sampleList);

		return result;
	}
    
    //심급정보
    @RequestMapping(value = "/tabInstAdmSelectVO.do")
	public NexacroResult tabInstAdmSelectVO(@ParamDataSet(name = "ds_search", required = false) TabPreIwrVO searchVo) {

		List<TabPreIwrVO> sampleList = tabPreIwrService.selectTabInstAdmVOList(searchVo);

		NexacroResult result = new NexacroResult();
		result.addDataSet("output1", sampleList);

		return result;
	}
    
    @RequestMapping(value = "/tabInstAdmSelect2VO.do")
	public NexacroResult tabInstAdmSelect2VO(@ParamDataSet(name = "ds_search", required = false) TabPreIwrVO searchVo) {

		List<TabPreIwrVO> sampleList = tabPreIwrService.selectTabInstAdm2VOList(searchVo);

		NexacroResult result = new NexacroResult();
		result.addDataSet("output1", sampleList);

		return result;
	}
    
    
    @RequestMapping(value = "/tabInstAdmSelect3VO.do")
   	public NexacroResult tabInstAdmSelect3VO(@ParamDataSet(name = "ds_search", required = false) TabPreIwrVO searchVo) {

   		List<TabPreIwrVO> sampleList = tabPreIwrService.selectTabInstAdm3VOList(searchVo);

   		NexacroResult result = new NexacroResult();
   		result.addDataSet("output1", sampleList);

   		return result;
   	}
    
    
    /*
     * 소송관리번호 조회
     * 
     */
    @RequestMapping(value = "/tabInstAdmSelect4VO.do")
   	public NexacroResult tabInstAdmSelect4VO(@ParamDataSet(name = "ds_search", required = false) TabPreIwrVO searchVo) {

   		List<TabPreIwrVO> sampleList = tabPreIwrService.selectTabInstAdm4VOList(searchVo);

   		NexacroResult result = new NexacroResult();
   		result.addDataSet("output1", sampleList);

   		return result;
   	}
    
    @RequestMapping(value = "/tabInstAdmSelect5VO.do")
   	public NexacroResult tabInstAdmSelect5VO(@ParamDataSet(name = "ds_search", required = false) TabPreIwrVO searchVo) {

   		List<TabPreIwrVO> sampleList = tabPreIwrService.selectTabInstAdm5VOList(searchVo);

   		NexacroResult result = new NexacroResult();
   		result.addDataSet("output1", sampleList);

   		return result;
   	}
    
    @RequestMapping(value = "/tabInstAdmSelect6VO.do")
   	public NexacroResult tabInstAdmSelect6VO(@ParamDataSet(name = "ds_search", required = false) TabPreIwrVO searchVo) {

   		List<TabPreIwrVO> sampleList = tabPreIwrService.selectTabInstAdm6VOList(searchVo);

   		NexacroResult result = new NexacroResult();
   		result.addDataSet("output1", sampleList);

   		return result;
   	}
    
    //소송/심급
    
    @RequestMapping(value = "/tabInstAdmSelect7VO.do")
   	public NexacroResult tabInstAdmSelect7VO(@ParamDataSet(name = "ds_search", required = false) TabPreIwrVO searchVo) {

   		List<TabPreIwrVO> sampleList = tabPreIwrService.selectTabInstAdm7VOList(searchVo);

   		NexacroResult result = new NexacroResult();
   		result.addDataSet("output1", sampleList);

   		return result;
   	}
    
    @RequestMapping(value = "/tabInstAdmSelectVOFromMap.do")
	public NexacroResult tabInstAdmSelectVOFromMap(@ParamDataSet(name = "ds_search", required = false) TabPreIwrVO searchVo) {
    	
    	List<Map> sampleList = tabPreIwrService.selectTabInstAdmMapList(searchVo);
    	
    	NexacroResult result = new NexacroResult();
    	result.addDataSet("output1", sampleList);
    	
    	return result;
    }
    
    //준비서면정보
    @RequestMapping(value = "/tabPreIwrSelectVO.do")
	public NexacroResult selectVo(@ParamDataSet(name = "ds_search", required = false) TabPreIwrVO searchVo) {

		List<TabPreIwrVO> sampleList = tabPreIwrService.selectTabPreIwrVOList(searchVo);

		NexacroResult result = new NexacroResult();
		result.addDataSet("output1", sampleList);

		return result;
	}
    
    @RequestMapping(value = "/tabPreIwrSelectVOFromMap.do")
	public NexacroResult selectVoFromMap(@ParamDataSet(name = "ds_search", required = false) TabPreIwrVO searchVo) {
    	
    	List<Map> sampleList = tabPreIwrService.selectTabPreIwrMapList(searchVo);
    	
    	NexacroResult result = new NexacroResult();
    	result.addDataSet("output1", sampleList);
    	
    	return result;
    }
    
    @RequestMapping(value = "/tabInstAdmOrgModifyVO.do")
	public NexacroResult tabInstAdmOrgModifyVO(@ParamDataSet(name = "input1") List<TabPreIwrVO> modifyList) {
    	
    	tabPreIwrService.modifyMultiTabInstAdmVO(modifyList);
        
        NexacroResult result = new NexacroResult();
        
        return result;
    }
    
    @RequestMapping(value = "/tabPreIwrModifyVO.do")
	public NexacroResult modifyVO(
			@ParamDataSet(name = "input1") List<TabPreIwrVO> modifyList,
			@ParamVariable(name="lawsuitAdmNo", required=false) String lawsuitAdmNo,
			@ParamVariable(name="instAdmCode", required=false) String instAdmCode
			
			) {
    	System.out.println("tabPreIwrModifyVO");
    	
    	if(lawsuitAdmNo =="" || lawsuitAdmNo ==null){
    		System.out.println("tabPreIwrModifyVO ==NULL");
    	}else{    		
    		System.out.println("tabPreIwrModifyVO != NULL");
	    	
    		System.out.println("tinstAdmCode;"+instAdmCode);
    		System.out.println("lawsuitAdmNo;"+lawsuitAdmNo);
    		for(TabPreIwrVO vo:modifyList){
    			if("".equals(vo.getPreIwrNo())){
    				continue;
    			}else{
    				vo.setInstAdmCode(instAdmCode);
    	    		vo.setLawsuitAdmNo(lawsuitAdmNo);
    			}
	    		
	    		
	    	}
    		
    	}
    	tabPreIwrService.modifyMultiTabPreIwrVO(modifyList);
        
        NexacroResult result = new NexacroResult();
        
        return result;
    }
    
    
    @RequestMapping(value = "/tabPreIwrModify2VO.do")
	public NexacroResult modify2VO(
			@ParamDataSet(name = "input1") List<TabPreIwrVO> modifyList			
			) {
    	System.out.println("tabPreIwrModify2VO");
    	
    	
    	tabPreIwrService.modifyMultiTabPreIwrVO(modifyList);
        
        NexacroResult result = new NexacroResult();
        
        return result;
    }
    
    //modifyMultiTablawsuitOrgVO
    
    @RequestMapping(value = "/tabLawsuitOrg2ModifyVO.do")
	public NexacroResult tabLawsuitOrg2ModifyVO(@ParamDataSet(name = "input1") List<TabPreIwrVO> modifyList) {
    	
    	tabPreIwrService.modifyMultiTablawsuitOrgVO(modifyList);
        
        NexacroResult result = new NexacroResult();
        
        return result;
    }
    
    
    @RequestMapping(value = "/tabPreIwrPaging.do")
	public NexacroResult selectPaging(@ParamDataSet(name = "ds_search", required = false) TabPreIwrVO searchVO) {
    
        if(searchVO == null) {
        	searchVO = new TabPreIwrVO();
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

    	List<TabPreIwrVO> sampleList = tabPreIwrService.selectTabPreIwrPaging(searchVO);

    	int totalCount = tabPreIwrService.selectTabPreIwrCount(searchVO);
    	paginationInfo.setTotalRecordCount(totalCount);
        
    	List paginationInfos = new ArrayList();
    	paginationInfos.add(paginationInfo);
        
        NexacroResult result = new NexacroResult();
        result.addDataSet("dsList", sampleList);
        result.addDataSet("dsPagingInfo", paginationInfos);
        
        return result;
    }
    
   
}
