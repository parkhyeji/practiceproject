package nexacro.aml.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.aml.service.AmlSampleServiceImpl;
import nexacro.aml.service.RuleAlertService;
import nexacro.sample.vo.RaisVO;

import org.aspectj.weaver.ast.Instanceof;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.annotation.ParamVariable;
import com.nexacro.spring.data.NexacroResult;
/*import nexacro.pdlaw.vo.depo.DepoVO;
import nexacro.pdlaw.vo.lawsuit.Lawsuit_ListVO;*/
import com.nexacro.xapi.data.DataSet;

@Controller
public class RuleAlertController{

	private static final Logger log = LoggerFactory
			.getLogger(RuleAlertController.class);

	@Resource(name = "RuleAlertService")
	private RuleAlertService ruleAlertService;

	@Resource
	private Validator validator;

	@InitBinder
	public void initBinder(WebDataBinder dataBinder){
		dataBinder.setValidator(this.validator);
	}

	//공통 코드 로드
	@RequestMapping(value = "custCombo/loadCustCodes.do")
	public NexacroResult loadCommonCodes(){
		NexacroResult result = new NexacroResult();
		Map<String, Object> classCodeMap = new HashMap<String, Object>();
		//고객번호 공통코드
		result.addDataSet("ds_custNo", ruleAlertService.loadCustCode());

		//보고제외구분코드
		classCodeMap.put("classCode", "S000");
		result.addDataSet("ds_reportReason", ruleAlertService.loadClassCode(classCodeMap));

		//보고서 상태코드
		classCodeMap.put("classCode", "U000");
		result.addDataSet("ds_reportCode", ruleAlertService.loadClassCode(classCodeMap));

		return result;
	}

	//룰 결과 데이터 조회
	@RequestMapping(value = "ruleResultList/resultList.do")
	public NexacroResult ruleAlertResultList(){
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_ruleResult", ruleAlertService.searchResult());
		return result;
	}

	//룰 결과 데이터 등록
	@RequestMapping(value = "ruleInsert/insertList.do")
	public NexacroResult ruleAlertResultInsert(
			@ParamDataSet(name="ds_resultInsert") List<Map> ds_resultInsert){
		NexacroResult result = new NexacroResult();
		Map map = ds_resultInsert.get(0);
		ruleAlertService.insertResult(map);
		return result;
	}

	@RequestMapping(value = "detailLoadCode/detailLoadCodes.do")
	public NexacroResult loadDetailCodes(){
		NexacroResult result = new NexacroResult();
		Map<String, Object> classCodeMap = new HashMap<String, Object>();
		//그룹번호
		result.addDataSet("ds_groupNo", ruleAlertService.loadGruoupNo());

		//룰ID 리스트 로드
		result.addDataSet("ds_ruleId", ruleAlertService.loadRuleId());

		//배당지점코드 공통코드
		classCodeMap.put("classCode", "V000");
		result.addDataSet("ds_officeCode", ruleAlertService.loadOfficeCode(classCodeMap));

		//배당담당자 리스트 로드
		result.addDataSet("ds_chgedId", ruleAlertService.loadChgedId());

		//의심거래조사코드 공통코드
		classCodeMap.put("classCode", "T000");
		result.addDataSet("ds_stCode", ruleAlertService.loadstCode(classCodeMap));	

		return result;
	}

	//룰 상세 데이터 조회
	@RequestMapping(value = "detailList/detailList.do")
	public NexacroResult ruleAlertdetailList(){
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_detailList", ruleAlertService.searchDetail());
		return result;
	}

	//룰 상세 데이터 등록
	@RequestMapping(value = "detailInsert/detailInsert.do")
	public NexacroResult ruleAlertDetailInsert(
			@ParamDataSet(name="ds_detailList") List<Map> ds_detailList){
		NexacroResult result = new NexacroResult();
		Map map = ds_detailList.get(0);
		ruleAlertService.insertDetail(map);
		return result;
	}

	//룰 거래상세 콤보박스 온로드
	@RequestMapping(value = "dealDetailLoadCode/dealDetailLoadCode.do")
	public NexacroResult loadDealDetailCodes(){
		NexacroResult result = new NexacroResult();
		Map<String, Object> classCodeMap = new HashMap<String, Object>();

		//그룹번호
		result.addDataSet("ds_groupNo", ruleAlertService.loadDealGroupCode());

		//업무구분코드 공통코드
		classCodeMap.put("classCode", "P000");
		result.addDataSet("ds_workTypeCode", ruleAlertService.loadWorkTypeCode(classCodeMap));

		//거래상품코드 공통코드
		classCodeMap.put("classCode", "I000");
		result.addDataSet("ds_dealGoods", ruleAlertService.loadDealGoods(classCodeMap));

		//입출금구분코드 공통코드
		classCodeMap.put("classCode", "H000");
		result.addDataSet("ds_dewiTypeCode", ruleAlertService.loadDewiTypeCode(classCodeMap));	

		//거래지점코드 공통코드
		classCodeMap.put("classCode", "V000");
		result.addDataSet("ds_dealOfficeCode", ruleAlertService.loadOfficeCode(classCodeMap));

		//거래담당자 리스트 로드
		result.addDataSet("ds_dealChgedId", ruleAlertService.loadChgedId());
		return result;
	}

	//룰 거래상세 데이터 조회
	@RequestMapping(value = "dealDetailList/dealDetailList.do")
	public NexacroResult ruleAlertDealDetailList(){
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_dealDetail", ruleAlertService.searchDealDetail());
		return result;
	}

	//그룹번호에 해당하는 룰ID 검색
	@RequestMapping(value = "dealDetail/dealDetail.do")
	public NexacroResult ruleAlertDetailList(
			@ParamDataSet(name="ds_ruleId") List<Map> ds_ruleId){
		NexacroResult result = new NexacroResult();
		Map map = ds_ruleId.get(0);
		result.addDataSet("ds_detail", ruleAlertService.loadDealGroupCodeRuleId(map));
		return result;
	}

	//룰 거래상세 데이터 등록
	@RequestMapping(value = "dealDetailInsert/dealDetailInsert.do")
	public NexacroResult ruleAlertDealDetailInsert(
			@ParamDataSet(name="ds_dealDetail") List<Map> ds_dealDetail){
		NexacroResult result = new NexacroResult();
		Map map = ds_dealDetail.get(0);
		ruleAlertService.insertDealDetail(map);
		return result;
	}

	//룰 거래상세 데이터 삭제
	@RequestMapping(value = "deleteDealDetail/deleteDealDetail.do")
	public NexacroResult ruleAlertdeleteDealDetail(
			@ParamDataSet(name="ds_dealDetail") List<Map> ds_dealDetail){
		NexacroResult result = new NexacroResult();
		Map map = ds_dealDetail.get(0);
		ruleAlertService.deleteDealDetail(map);
		return result;
	}
}
