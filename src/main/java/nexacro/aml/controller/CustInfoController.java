package nexacro.aml.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.aml.service.CustInfoServiceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.annotation.ParamVariable;
import com.nexacro.spring.data.NexacroResult;
/*import nexacro.pdlaw.vo.depo.DepoVO;
import nexacro.pdlaw.vo.lawsuit.Lawsuit_ListVO;*/
import com.nexacro.xapi.data.DataSet;

@Controller
public class CustInfoController{

	private static final Logger log = LoggerFactory
			.getLogger(CustInfoController.class);
	
	@Resource(name = "custInfoService")
	private CustInfoServiceImpl custInfoService;

	@Resource
	private Validator validator;

	@InitBinder
	public void initBinder(WebDataBinder dataBinder){
		dataBinder.setValidator(this.validator);
	}
	
	// 공통 코드 로드
	@RequestMapping(value = "custinfo/loadCommonCodes.do")
	public NexacroResult loadCommonCodes(){
		NexacroResult result = new NexacroResult();
		Map<String, Object> classCodeMap = new HashMap<String, Object>();
		
		classCodeMap.put("classCode", "A000");
		result.addDataSet("ds_realType", custInfoService.loadCommonCode(classCodeMap));
		
		classCodeMap.put("classCode", "B000");
		result.addDataSet("ds_nation", custInfoService.loadCommonCode(classCodeMap));

		classCodeMap.put("classCode", "E000");
		result.addDataSet("ds_gender", custInfoService.loadCommonCode(classCodeMap));
		
		classCodeMap.put("classCode", "Q000");
		result.addDataSet("ds_custType", custInfoService.loadCommonCode(classCodeMap));

		classCodeMap.put("classCode", "R000");
		result.addDataSet("ds_raRank", custInfoService.loadCommonCode(classCodeMap));
		
		return result;
	}
		
	@RequestMapping(value = "custinfo/searchCust.do")
	public NexacroResult searchCust(){
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_list", custInfoService.searchCust());
		return result;
	}
	
	@RequestMapping(value = "custinfo/saveList.do")
	public NexacroResult saveList(@ParamDataSet(name="ds_list") List<Map> ds_list){
		//DataSetRowTypeList
		
		for(Map map:ds_list){
			int rowType = (int) map.get("DataSetRowType");
			switch (rowType) {
			case DataSet.ROW_TYPE_INSERTED:
				custInfoService.insertCust(map);
			break;
			case DataSet.ROW_TYPE_UPDATED:
				custInfoService.updateCust(map);
			break;
			case DataSet.ROW_TYPE_DELETED:
				custInfoService.deleteCust(map);
			break;
			}
		}
		NexacroResult result = new NexacroResult();
		return result;
	}
	
	//룰 거래상세 데이터 삭제
	@RequestMapping(value = "deletecust/deletecust.do")
	public NexacroResult deletecust(
			@ParamDataSet(name="ds_list") List<Map> ds_list){
		NexacroResult result = new NexacroResult();
		Map map = ds_list.get(0);
		custInfoService.deleteCust(map);
		return result;
	}
	
	@RequestMapping(value = "custinfo/searchaddr.do")
	public NexacroResult searchaddr(@ParamDataSet(name="ds_search") List<Map> ds_search){
		NexacroResult result = new NexacroResult();
		System.out.println("나와라 ------------------------------"+ds_search);
		Map map = ds_search.get(0);
		System.out.println("나와라 2222222222222222------------------------------"+map);
		
		result.addDataSet("ds_list", custInfoService.searchaddr(map));
		return result;
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

