package nexacro.aml.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.aml.service.RuleAlertInfoService;

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

@Controller
public class RuleAlertInfoController{

	private static final Logger log = LoggerFactory
			.getLogger(RuleAlertInfoController.class);

	@Resource(name = "RuleAlertInfoService")
	private RuleAlertInfoService RuleAlertInfoService;

	@Resource
	private Validator validator;

	@InitBinder
	public void initBinder(WebDataBinder dataBinder){
		dataBinder.setValidator(this.validator);
	}

	//공통코드 로드
	@RequestMapping(value = "ruleRoadData/ruleRoadData.do")
	public NexacroResult loadCommonCodes(){
		NexacroResult result = new NexacroResult();
		Map<String, Object> classCodeMap = new HashMap<String, Object>();
		//고객번호
		//result.addDataSet("ds_custNo", RuleAlertInfoService.loadCustCode());

		//룰ID
		result.addDataSet("ds_ruleId", RuleAlertInfoService.loadRuleId());

		//업무구분
		classCodeMap.put("classCode", "P000");
		result.addDataSet("ds_workTypeCode", RuleAlertInfoService.loadWorkTypeCode(classCodeMap));

		//거래지점
		classCodeMap.put("classCode", "V000");
		result.addDataSet("ds_dealOfficeCode", RuleAlertInfoService.loadOfficeCode(classCodeMap));

		//거래상품
		classCodeMap.put("classCode", "I000");
		result.addDataSet("ds_dealGoods", RuleAlertInfoService.loadDealGoods(classCodeMap));

		//입출금구분
		classCodeMap.put("classCode", "H000");
		result.addDataSet("ds_dewiTypeCode", RuleAlertInfoService.loadDewiTypeCode(classCodeMap));

		//배당지점
		classCodeMap.put("classCode", "V000");
		result.addDataSet("ds_officeCode", RuleAlertInfoService.loadOfficeCode(classCodeMap));

		//의심거래조사
		classCodeMap.put("classCode", "T000");
		result.addDataSet("ds_stCode", RuleAlertInfoService.loadstCode(classCodeMap));

		//보고서상태
		classCodeMap.put("classCode", "U000");
		result.addDataSet("ds_reportCode", RuleAlertInfoService.loadClassCode(classCodeMap));

		//보고제외구분
		classCodeMap.put("classCode", "S000");
		result.addDataSet("ds_reportReason", RuleAlertInfoService.loadClassCode(classCodeMap));

		return result;
	}

	//고객리스트 로드
	@RequestMapping(value = "custListRoadData/custListRoadData.do")
	public NexacroResult custListRoadData(){
		NexacroResult result = new NexacroResult();
		Map<String, Object> classCodeMap = new HashMap<String, Object>();
		
		//고객리스트
		result.addDataSet("ds_custList", RuleAlertInfoService.loadCustCode());

		return result;
	}


	//룰 결과 데이터 등록
	@RequestMapping(value = "ruleAlertDataInsert/ruleAlertDataInsert.do")
	public NexacroResult ruleAlertDataInsert(
			@ParamDataSet(name="ds_ruleInsert") List<Map> ds_ruleInsert){
		NexacroResult result = new NexacroResult();
		Map map = ds_ruleInsert.get(0);
		RuleAlertInfoService.insertRuleData(map);
		return result;
	}

	//룰 결과 데이터 조회
	@RequestMapping(value = "ruleAlertDataSearch/ruleAlertDataSearch.do")
	public NexacroResult ruleAlertDataSearch(){
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_ruleResultList", RuleAlertInfoService.searchResultList());
		return result;
	}

}
