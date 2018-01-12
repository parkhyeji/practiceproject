package nexacro.aml.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.aml.service.ReportManagementService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.data.NexacroResult;

@Controller
public class ReportManagementController{

	private static final Logger log = LoggerFactory
			.getLogger(ReportManagementController.class);

	@Resource(name = "ReportManagementService")
	private ReportManagementService ReportManagementService;

	@Resource
	private Validator validator; 

	@InitBinder
	public void initBinder(WebDataBinder dataBinder){
		dataBinder.setValidator(this.validator);
	}
	// 공통 코드 로드
	@RequestMapping(value = "reportManagement/loadCommonCodes.do")
	public NexacroResult loadCommonCodes(@ParamDataSet(name="ds_copy")List<Map> ds_copy){

		NexacroResult result = new NexacroResult();
		Map<String, Object> classCodeMap = new HashMap<String, Object>();

		classCodeMap.put("classCode", "C000");
		result.addDataSet("ds_occurType", ReportManagementService.loadCommonCode(classCodeMap));

		classCodeMap.put("classCode", "G000");
		result.addDataSet("ds_dealMethod", ReportManagementService.loadCommonCode(classCodeMap));

		classCodeMap.put("classCode", "F000");
		result.addDataSet("ds_dealChan", ReportManagementService.loadCommonCode(classCodeMap));

		classCodeMap.put("classCode", "H000");
		result.addDataSet("ds_dealType", ReportManagementService.loadCommonCode(classCodeMap));

		classCodeMap.put("classCode", "Y000");
		result.addDataSet("ds_bank", ReportManagementService.loadCommonCode(classCodeMap));

		classCodeMap.put("classCode", "I000");
		result.addDataSet("ds_dealGoods", ReportManagementService.loadCommonCode(classCodeMap));


		Map map = ds_copy.get(0);		
		result.addDataSet("ds_deal", ReportManagementService.loadreportdeal(map));
		result.addDataSet("ds_query", ReportManagementService.loadQuery(map));
		result.addDataSet("ds_score", ReportManagementService.loadQuery(map));
		return result;
	}

	// 저장
	@RequestMapping(value = "reportManagement/saveList.do")
	public NexacroResult saveList(
			@ParamDataSet(name="ds_deal") List<Map> ds_deal,
			@ParamDataSet(name="ds_query") List<Map> ds_query
			//@ParamDataSet(name="ds_oppi") List<Map> ds_oppi
			){
		//보고대상자 저장
		Map deal = ds_deal.get(0);
		ReportManagementService.insertCust(deal);

		//보고대상 거래 저장
		ReportManagementService.insertCust1(deal);

		//객관적 질의 저장
		for(Map map:ds_query){
			if(map.get("ch").equals("1")){ 
				ReportManagementService.insertQuery(map);
			}else{
			}
		}
		NexacroResult result = new NexacroResult();
		return result;
	}
	//수정
	@RequestMapping(value = "reportManagement/amendList.do")
	public NexacroResult amendList(
			@ParamDataSet(name="ds_query") List<Map> ds_query
			){
		NexacroResult result = new NexacroResult();

		//객관적 질의 수정
		Map query = new HashMap<String, Object>();
		//Map query = null;
		//Map query = ds_query(0);
		query = ds_query.get(0); //
		ReportManagementService.deleteQuery(query);
		
		for(int i=0; i < ds_query.size() ; i++){
			query = ds_query.get(i);
			if(query.get("ch").equals("1")){
				ReportManagementService.updateQuery(query);
			}
		}

		return result;
	}
}