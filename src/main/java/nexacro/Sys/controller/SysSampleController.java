package nexacro.Sys.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.Sys.service.SysSampleServiceImpl;
import nexacro.sample.vo.RaisVO;

import org.aspectj.weaver.ast.Instanceof;
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
public class SysSampleController{

	private static final Logger log = LoggerFactory
			.getLogger(SysSampleController.class);
	
	@Resource(name = "sysSampleService")
	private SysSampleServiceImpl sysSampleService;

	@Resource
	private Validator validator;

	@InitBinder
	public void initBinder(WebDataBinder dataBinder){
		dataBinder.setValidator(this.validator);
	}

	// 공통 코드 로드
	@RequestMapping(value = "sysSample/loadCommonCodes.do")
	public NexacroResult loadCommonCodes(){
		NexacroResult result = new NexacroResult();
		
		result.addDataSet("class_code_dataset", sysSampleService.loadCommonCode());		
		
		return result;
	}

	// 마스터 화면에서 조회
	@RequestMapping(value = "sysSample/read.do")
	public NexacroResult read(
			@ParamDataSet(name="common_search") List<Map> common_search){
		
		Map map = common_search.get(0);
		
		NexacroResult result = new NexacroResult();

		result.addDataSet("common_master_dataset", sysSampleService.read(map));		

		return result;
	}	
}