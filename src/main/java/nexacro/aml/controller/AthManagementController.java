package nexacro.aml.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.aml.service.AthManagementServiceImpl;


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
public class AthManagementController{
	
	private static final Logger log = LoggerFactory
			.getLogger(AthManagementController.class);
	
	@Resource(name = "AthManagementService")
	private AthManagementServiceImpl AthManagementService;

	@Resource
	private Validator validator;

	@InitBinder
	public void initBinder(WebDataBinder dataBinder){
		dataBinder.setValidator(this.validator);
	}
	//권한 보여주기
		@RequestMapping(value = "AthManagement/load.do")
		public NexacroResult load(){
			NexacroResult result = new NexacroResult();
			
			result.addDataSet("ds_list", AthManagementService.load());
			result.addDataSet("ds_delup", AthManagementService.loadUp());


			return result;
			
		}

		
		
	//사원 조회
	@RequestMapping(value = "AthManagement/searchEmp.do")
	public NexacroResult searchList(@ParamDataSet(name="ds_condition") List<Map> ds_condition){
		NexacroResult result = new NexacroResult();
		@SuppressWarnings("rawtypes")
		Map map = ds_condition.get(0);

		result.addDataSet("ds_delup", AthManagementService.searchList(map));

		return result;
		
	}
	//수정
	@RequestMapping(value = "AthManagement/delup.do")
	public NexacroResult deleteUp(@ParamDataSet(name="ds_delup") List<Map> ds_delup){
		AthManagementService.delup(ds_delup);
		NexacroResult result = new NexacroResult();
		return result;
	}
}
