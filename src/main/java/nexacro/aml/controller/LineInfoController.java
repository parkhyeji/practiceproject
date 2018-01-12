package nexacro.aml.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.aml.service.LineInfoServiceImpl;

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
public class LineInfoController{
	
	private static final Logger log = LoggerFactory
			.getLogger(LineInfoController.class);
	
	@Resource(name = "LineInfoService")
	private LineInfoServiceImpl LineInfoService;

	@Resource
	private Validator validator;

	@InitBinder
	public void initBinder(WebDataBinder dataBinder){
		dataBinder.setValidator(this.validator);
	}
	
	// 공통 코드 로드 - 결재서류 상태
		@RequestMapping(value = "LineInfo/state.do")
		public NexacroResult reportState(){
			NexacroResult result = new NexacroResult();
			Map<String, Object> classCodeMap = new HashMap<String, Object>();
			
			
			classCodeMap.put("classCode", "W000");
			result.addDataSet("ds_state", LineInfoService.state(classCodeMap));

			
			return result;
		}
	// 공통 코드 로드 
		@RequestMapping(value = "LineInfo/empName.do")
		public NexacroResult empName(){
			NexacroResult result = new NexacroResult();
			
			result.addDataSet("ds_emp", LineInfoService.empName());

			
			return result;
		}
	
	//결재서류 조회
	@RequestMapping(value = "LineInfo/report.do")
	public NexacroResult report(@ParamDataSet(name="ds_condition") List<Map> ds_condition){
		NexacroResult result = new NexacroResult();
		@SuppressWarnings("rawtypes")
		Map map = ds_condition.get(0);
		
		result.addDataSet("ds_report", LineInfoService.report(map));

		return result;
		
	}
	
	
	
	//승인
	@RequestMapping(value = "LineInfo/approval.do")
	public NexacroResult approval(@ParamDataSet(name="ds_copy") List<Map> ds_copy){
		for(int i=0; i<ds_copy.size(); i++){
		Map map = ds_copy.get(i);
	    LineInfoService.disapproval(map);
		}
		NexacroResult result = new NexacroResult();
		
		return result;
	}
	
	//반려
		@RequestMapping(value = "LineInfo/disapproval.do")
		public NexacroResult disapproval(@ParamDataSet(name="ds_copy") List<Map> ds_copy){
			for(int i=0; i<ds_copy.size(); i++){
			Map map = ds_copy.get(i);
		    LineInfoService.disapproval(map);
			}

			NexacroResult result = new NexacroResult();
			
			return result;
		}
}
