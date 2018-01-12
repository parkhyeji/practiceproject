package nexacro.sample.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.sample.service.CmmCodeDetailService;
import nexacro.sample.vo.CmmCodeDetailVO;
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
public class CmmCodeDetailController {

	private Logger log = LoggerFactory.getLogger(SampleController.class);
	
    // @Autowired(required = false) // Type 정의
    @Resource(name = "cmmCodeDetailService")
    // Name 정의
    private CmmCodeDetailService cmmCodeDetailService;
    
    
       
    @RequestMapping(value = "/cmmCodeDetailSelectVO.do")
	public NexacroResult cmmCodeDetailSelectVO(CmmCodeDetailVO searchVo, String classCode) {

    	System.out.println("classCode;"+classCode);
    	searchVo.setClassCode(classCode);
		List<CmmCodeDetailVO> sampleList = cmmCodeDetailService.selectCmmCodeDetailVOList(searchVo);

		NexacroResult result = new NexacroResult();
		result.addDataSet("output1", sampleList);

		return result;
	}
    
    @RequestMapping(value = "/cmmCodeDetailSelectVOFromMap.do")
	public NexacroResult cmmCodeDetailSelectVOFromMap(@ParamDataSet(name = "ds_search", required = false) CmmCodeDetailVO searchVo) {
    	
    	List<Map> sampleList = cmmCodeDetailService.selectCmmCodeDetailMapList(searchVo);
    	
    	NexacroResult result = new NexacroResult();
    	result.addDataSet("output1", sampleList);
    	
    	return result;
    }
    
    @RequestMapping(value = "/cmmCodeDetailModifyVO.do")
	public NexacroResult modifyVO(@ParamDataSet(name = "input1") List<CmmCodeDetailVO> modifyList) {
    	
    	cmmCodeDetailService.modifyMultiCmmCodeDetailVO(modifyList);
        
        NexacroResult result = new NexacroResult();
        
        return result;
    }
    
    
    @RequestMapping(value = "/cmmCodeDetailPaging.do")
	public NexacroResult selectPaging(@ParamDataSet(name = "tabEdocAdm", required = false) CmmCodeDetailVO searchVO) {
    
        if(searchVO == null) {
        	searchVO = new CmmCodeDetailVO();
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

    	List<CmmCodeDetailVO> sampleList = cmmCodeDetailService.selectCmmCodeDetailPaging(searchVO);

    	int totalCount = cmmCodeDetailService.selectCmmCodeDetailCount(searchVO);
    	paginationInfo.setTotalRecordCount(totalCount);
        
    	List paginationInfos = new ArrayList();
    	paginationInfos.add(paginationInfo);
        
        NexacroResult result = new NexacroResult();
        result.addDataSet("dsList", sampleList);
        result.addDataSet("dsPagingInfo", paginationInfos);
        
        return result;
    }

    @RequestMapping(value="/code/giveMeCode.do")
    public NexacroResult giveMeCode(
    		@ParamVariable(name="UseYn") String useYn,
    		@ParamVariable(name="CLASS_CODE") String classCode
    		){
    	
    	String total = "000";
    	Map<String, Object> codeMap = new HashMap<String, Object>();
    	codeMap.put("useYn", useYn);
    	codeMap.put("classCode", classCode);
    	codeMap.put("total", total);
    	
    	List<CmmCodeDetailVO> codeList = cmmCodeDetailService.giveMeCode(codeMap);
    	
    	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@");
    	if(codeList.size()==0){
    		System.out.println("@@@@@nonon");
    	}
    	for(int i=0; i<codeList.size(); i++){
    		System.out.println(codeList.get(i).toString());
    	}
    	
    	NexacroResult result = new NexacroResult();
    	
    	result.addDataSet("ds_output", codeList);
    	
    	return result;
    	
    }
    
    }
