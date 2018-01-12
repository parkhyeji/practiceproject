package nexacro.aml.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.aml.service.SuspDealService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.spring.data.NexacroResult;
/*import nexacro.pdlaw.vo.depo.DepoVO;
import nexacro.pdlaw.vo.lawsuit.Lawsuit_ListVO;*/

@Controller
public class SuspDealController{

	private static final Logger log = LoggerFactory
			.getLogger(SuspDealController.class);

	@Resource(name = "SuspDealService")
	private SuspDealService suspDealServiece;

	@Resource
	private Validator validator;

	@InitBinder
	public void initBinder(WebDataBinder dataBinder){
		dataBinder.setValidator(this.validator);
	}

	//공통 코드 로드
	@RequestMapping(value = "suspPageLoad/suspPageLoad.do")
	public NexacroResult loadCommonCodes(){
		NexacroResult result = new NexacroResult();
		Map<String, Object> classCodeMap = new HashMap<String, Object>();
		
		//고객정보(상단)
		classCodeMap.put("custNo", "2017122200004");
		result.addDataSet("ds_custInfo", suspDealServiece.loadCustCode(classCodeMap));
		
		//룰정보
		result.addDataSet("ds_ruleInfo", suspDealServiece.loadRuleInfo(classCodeMap));
		
		//고객정보(하단)
		result.addDataSet("ds_ruleAlertDealDetail", suspDealServiece.loadCustInfo(classCodeMap));
		return result;
	}
}
