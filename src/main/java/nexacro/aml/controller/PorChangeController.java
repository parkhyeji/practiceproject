package nexacro.aml.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.aml.service.PorChangeServiceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.data.NexacroResult;
/*import nexacro.pdlaw.vo.depo.DepoVO;
import nexacro.pdlaw.vo.lawsuit.Lawsuit_ListVO;*/
import com.nexacro.xapi.data.DataSet;

@Controller
public class PorChangeController{
	
	private static final Logger log = LoggerFactory
			.getLogger(PorChangeController.class);
	
	@Resource(name = "PorChangeService")
	private PorChangeServiceImpl PorChangeService;

	@Resource
	private Validator validator;

	@InitBinder
	public void initBinder(WebDataBinder dataBinder){
		dataBinder.setValidator(this.validator);
	}
	
	// 공통 코드 로드
		@RequestMapping(value = "PorChange/loadCommonCodes.do")
		public NexacroResult loadCommonCodes(@ParamDataSet(name="ds_copy") List<Map> ds_copy){
			NexacroResult result = new NexacroResult();
			Map<String, Object> classCodeMap = new HashMap<String, Object>();
			
			
			classCodeMap.put("classCode", "P000");
			result.addDataSet("ds_workType", PorChangeService.loadCommonCode(classCodeMap));

			classCodeMap.put("classCode", "F000");
			result.addDataSet("ds_trade", PorChangeService.loadCommonCode(classCodeMap));
			
			classCodeMap.put("classCode", "I000");
			result.addDataSet("ds_goods", PorChangeService.loadCommonCode(classCodeMap));
			
			// 리스트 조회 값을 넣어야함!!
			Map<String, Object> map = new HashMap<String, Object>();
			map = ds_copy.get(0);
			
			System.out.println("확인용"+ map);

			
			result.addDataSet("ds_list", PorChangeService.showList(map));
			
			return result;
		}
	
	//배당 조회
	@RequestMapping(value = "PorChange/searchCust.do")
	public NexacroResult searchList(@ParamDataSet(name="ds_condition") List<Map> ds_condition){
		NexacroResult result = new NexacroResult();
		@SuppressWarnings("rawtypes")
		Map map = ds_condition.get(0);

		result.addDataSet("ds_emp", PorChangeService.searchList(map));

		return result;
		
	}
	
	
	
	//배당변경
	@RequestMapping(value = "PorChange/saveList.do")
	public NexacroResult saveList(@ParamDataSet(name="ds_forUpdate") List<Map> ds_forUpdate){
		//DataSetRowType
		
		Map map = ds_forUpdate.get(0);
		PorChangeService.saveList(map);
		NexacroResult result = new NexacroResult();
		
		return result;
	}
}
