package nexacro.sample.web;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

/*import nexacro.pdlaw.vo.depo.DepoVO;
import nexacro.pdlaw.vo.lawsuit.Lawsuit_ListVO;*/

import nexacro.sample.service.RaisService;
import nexacro.sample.vo.RaisVO;

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

@Controller
public class RaisController {
	
	private static final Logger log = LoggerFactory
			.getLogger(RaisController.class);
	
	@Resource(name = "raisservice")
	private RaisService raisservice;

	/*@Resource(name = "propertiesService")
	private EgovPropertyService propertiesService;*/

	@Resource
	private Validator validator;

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		dataBinder.setValidator(this.validator);
	}
	
	// 소제기검색
	@RequestMapping(value = "/rais/getRaisreqList.do")
	public NexacroResult getRaisreqList(
		@ParamVariable(name = "lawRaisreqNo") String lawRaisreqNo,
		@ParamVariable(name = "lawRaisreqClasCode") String lawRaisreqClasCode,
		@ParamVariable(name = "lawRaisreqReqDate1") String lawRaisreqReqDate1,
		@ParamVariable(name = "lawRaisreqReqDate2") String lawRaisreqReqDate2,
		@ParamVariable(name = "lawRaisreqRepWtr") String lawRaisreqRepWtr) {
		
		
		Map<String, Object> selectMap = new HashMap<String, Object>();
		
		selectMap.put("lawRaisreqNo", lawRaisreqNo);            
		selectMap.put("lawRaisreqClasCode", lawRaisreqClasCode);
		selectMap.put("lawRaisreqReqDate1", lawRaisreqReqDate1);
		selectMap.put("lawRaisreqReqDate2", lawRaisreqReqDate2);
		selectMap.put("lawRaisreqRepWtr", lawRaisreqRepWtr);  

		List<RaisVO> raisList = raisservice.getRaisreqList(selectMap);

		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output", raisList);

		return result;
	}	
	
	
	// 소제기 의뢰자 검색
	@RequestMapping(value = "/rais/getRaisMenList.do")
	public NexacroResult getRaisMenList(
			@ParamVariable(name = "insaName",required=false) String insaName,
			@ParamVariable(name = "insaSabun",required=false) String insaSabun) {
		Map<String, Object> getMgrList = new HashMap<String, Object>();
		getMgrList.put("insaName",insaName);
		getMgrList.put("insaSabun",insaSabun);
		List<Map> getMgrList_List = raisservice.getRaisMenList(getMgrList);
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output", getMgrList_List);
		return result;

	}
	
	
	// 소제기 회신 용 소제기 정보 검색
	@RequestMapping(value = "/rais/getRaisreqView.do")
	public NexacroResult getRaisreqView(
		@ParamVariable(name = "lawRaisreqNo") String lawRaisreqNo) {
		
		Map<String, Object> selectMap = new HashMap<String, Object>();
		
		selectMap.put("lawRaisreqNo", lawRaisreqNo);
		
		List<Map> raisList = raisservice.getRaisreqView(selectMap);

		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output", raisList);
		
		String codeno="";
		for(Map rais:raisList){
			codeno = (String) rais.get("lawRaisreqClasCode");
		}
		Map<String, Object> codename = new HashMap<String, Object>();
		codename.put("codeno", codeno);
		
		if(codeno.contains("1")){
			codename.put("codename", "구상");
		}else if(codeno.contains("2")){
			codename.put("codename", "의료과실");
		}else if(codeno.contains("3")){
			codename.put("codename", "장기채무부존재");
		}else if(codeno.contains("4")){
			codename.put("codename", "특허침해");
		}else if(codeno.contains("5")){
			codename.put("codename", "장기채무부존재");
		}else if(codeno.contains("6")){
			codename.put("codename", "특허침해");
		}else if(codeno.contains("7")){
			codename.put("codename", "장기채무부존재");
		}else if(codeno.contains("8")){
			codename.put("codename", "특허침해");
		}else if(codeno.contains("99")){
			codename.put("codename", "기타");
		}
		
		result.addDataSet("ds_output2", codename);
		
		return result;
	}	
	
	// 소제기현황
	@RequestMapping(value = "rais/getRaisreqDetailList.do")
	public NexacroResult getRaisreqDetailList(
		@ParamVariable(name = "edt_ID") String lawRaisreqReqId,
		@ParamVariable(name = "combo_Clas_Code") String lawRaisreqClasCode,
		@ParamVariable(name = "cal_Req_Date1") String lawRaisreqReqDate1,
		@ParamVariable(name = "cal_Req_Date2") String lawRaisreqReqDate2,
		@ParamVariable(name = "radio_Wtr") String lawRaisreqRepWtr) {
	
		Map<String, Object> selectMap = new HashMap<String, Object>();
		
		selectMap.put("lawRaisreqReqId", lawRaisreqReqId);            
		selectMap.put("lawRaisreqClasCode", lawRaisreqClasCode);
		selectMap.put("lawRaisreqReqDate1", lawRaisreqReqDate1);
		selectMap.put("lawRaisreqReqDate2", lawRaisreqReqDate2);
		selectMap.put("lawRaisreqRepWtr", lawRaisreqRepWtr);  
		System.out.println("sctest2");
		List<RaisVO> raisList = raisservice.getRaisreqDetailList(selectMap);
		System.out.println("sctest3");
		NexacroResult result = new NexacroResult();
		System.out.println("sctest4");
		result.addDataSet("ds_output", raisList);

		return result;
	}	
	
	//소제기 관리 창에서의 피고조회 (raisreq_reg.xdfl)
	@RequestMapping(value = "/rais/getRaisreqDefList.do")
	public NexacroResult getRaisreqDefList(
		@ParamVariable(name = "lawRaisreqNo") String raisreqNo ) {
		
		Map<String, Object> selectMap = new HashMap<String, Object>();
		
		selectMap.put("raisreqNo", raisreqNo);            

		List<RaisVO> defList = raisservice.getRaisreqDefList(selectMap);
		
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output", defList);

		return result;
	}	
	
	//피고 검색 후 전체 목록 조회 (pop_defsearch.xdfl)
	@RequestMapping(value = "/rais/getRaisreqDefSearch.do")
	public NexacroResult getRaisreqDefSearch(
			@ParamDataSet(name = "ds_search", required = false) List<Map> searchParams ) {
		
		List<Map> defList = raisservice.getRaisreqDefSearch(searchParams);
		
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output", defList);
		
		return result;
	}	
	
	//피고 선택 조회
	@RequestMapping(value = "/rais/getRaisreqDefSelectList.do")
	public NexacroResult getRaisreqDefSelectList(
			@ParamVariable(name = "lawRaisreqNo") String raisreqNo ) {
		
		List<Map> defList = raisservice.getRaisreqDefSelectList(raisreqNo);
		
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output", defList);
		
		return result;
	}	
	
	// 소제기 등록
	@RequestMapping(value = "/rais/insertRaisreq.do")
	public NexacroResult insertRaisreq(
		@ParamVariable(name = "edt_No") String lawRaisreqNo,
		@ParamVariable(name = "edt_Req_ID") String lawRaisreqReqId,
		@ParamVariable(name = "combo_Clas_Code") String lawRaisreqClasCode,
		@ParamVariable(name = "ta_Rea") String lawRaisreqRea,
		@ParamVariable(name = "ta_etc") String lawRaisreqEtcPoin,
		@ParamVariable(name = "cal_Req_Date") String lawRaisreqReqDate){
		
		Map<String, Object> selectMap = new HashMap<String, Object>();
		
		selectMap.put("lawRaisreqNo", lawRaisreqNo);            
		selectMap.put("lawRaisreqReqId", lawRaisreqReqId);            
		selectMap.put("lawRaisreqClasCode", lawRaisreqClasCode);
		selectMap.put("lawRaisreqRea", lawRaisreqRea);
		selectMap.put("lawRaisreqEtcPoin", lawRaisreqEtcPoin);  
		selectMap.put("lawRaisreqReqDate", lawRaisreqReqDate);
		
		System.out.println("=소제기등록 맵="+selectMap.toString());
		raisservice.insertRaisreq(selectMap);

		NexacroResult result = new NexacroResult();
		return result;
	}	
	
	// 소제기 수정
	@RequestMapping(value = "/rais/procAllRaisreq.do")
	public NexacroResult procAllRaisreq(
		@ParamDataSet(name = "ds_input") List<Map> params) {
		
		System.out.println("============================"+params.toString());
		
		raisservice.procAllRaisreq(params);

		NexacroResult result = new NexacroResult();
		return result;
	}
	
	// 회신등록수정
	@RequestMapping(value = "/rais/updateRaisreqRep.do")
	public NexacroResult updateRaisreqRep(
		@ParamDataSet(name = "ds_input") List<Map> params) {
		
		System.out.println("============================"+params.toString());

		raisservice.updateRaisereqRep(params);

		NexacroResult result = new NexacroResult();
		return result;
	}
	
	// 피고등록삭제수정
	@RequestMapping(value = "/rais/saveDefAll.do")
	public NexacroResult saveDefAll(
		@ParamDataSet(name = "ds_input") List<Map> params) {
		
		System.out.println("============================"+params.toString());

		raisservice.saveDefAll(params);

		NexacroResult result = new NexacroResult();
		return result;
	}
	
	/*raisreq_reg.xdfl*/
		//소제기, 피고 등록수정삭제 
		@RequestMapping(value = "/rais/controlRaisDefAll.do")
		public NexacroResult controlRaisDef(
			@ParamDataSet(name = "ds_input_def") List<Map> defParams,
			@ParamDataSet(name = "ds_input_rais") List<Map> raisParam,
			@ParamDataSet(name = "ds_input_def_deleted", required=false) List<Map> defDeletedParams,
			@ParamVariable(name = "status") String status) {
			
			System.out.println("============================"+defParams.toString());
			System.out.println("============================"+raisParam.toString());
			if(defDeletedParams != null){
				System.out.println("============="+defDeletedParams.toString());
			}else{
				System.out.println("ds_input_def_deleted is null");
			}
			System.out.println("============================"+status);
			
			Map<String, Object> raisMap = raisParam.get(0);
			
			NexacroResult result = new NexacroResult();	
			
			//	String status = "";
			//	status = (String) raisMap.get("rowType");
			
			switch(status){
				case "insert": case "INSERT":
					//소제기 추가 -> 피고(외래키) 추가 
					raisservice.insertRaisReq(raisMap); // 소제기 추가
					
					if(defParams.size()>0){
						if(raisMap.get("lawRaisreqNo") != null){
							for (int i = 0; i < defParams.size(); i++) {
								
								Map defMap = defParams.get(i);
								
								String value1 = (String) raisMap.get("lawRaisreqNo");
								defMap.put("lawRaisreqNo", value1);
								
								defParams.set(i, defMap);
									
							}
						}
						raisservice.insertDefAll(defParams); // 피고 추가
					}
					break;
			
				case "update": case "UPDATE":
					raisservice.updateRaisReq(raisMap);//소제기 수정
					raisservice.updateDefAll(defParams); //피고 수정 
					
					if( defDeletedParams != null ) {
						if( defDeletedParams.size() > 0 ){
							raisservice.updateDefAll(defDeletedParams);
						}	
					}
					
					break;
					
				case "delete": case "DELETE":
					//피고(외래키) 제거 -> 소제기 제거
					if(raisMap.get("lawRaisreqNo") != null){		
						raisservice.deleteDefAll((String) raisMap.get("lawRaisreqNo")); //피고 삭제 
						raisservice.deleteRaisReq((String) raisMap.get("lawRaisreqNo")); //소제기 삭제
					}
					break;
					
				default:
					break;
				
			}
	
			//NexacroResult result = new NexacroResult();
			
			return result;
			
		}
		
	/*// 소제기현황
	@RequestMapping(value = "/rais/getRaisreqList.do")
	public ModelAndView getRaisreqList(XPlatformMapDTO xpDto, Model model) {
		ModelAndView mav = new ModelAndView("xplatformMapView");

		try {
			DataSetMap tranInfo = xpDto.getTranInfoMap();
			Map<String, Object> inVar = xpDto.getInVariableMap();
			Map<String, DataSetMap> inDataset = xpDto.getInDataSetMap();
			Map<String, Object> outVar = xpDto.getOutVariableMap();
			Map<String, DataSetMap> outDataset = xpDto.getOutDataSetMap();

			raisservice.getRaisreqList(tranInfo, inVar, inDataset, outVar,
					outDataset);
			mav.addObject(XPlatformConstant.OUT_VARIABLES_ATT_NAME,
					xpDto.getOutVariableMap());
			mav.addObject(XPlatformConstant.OUT_DATASET_ATT_NAME,
					xpDto.getOutDataSetMap());

			mav.addObject(XPlatformConstant.ERROR_CODE, "0");
			mav.addObject(XPlatformConstant.ERROR_MSG, "");

		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject(XPlatformConstant.ERROR_CODE, "-1");
			mav.addObject(XPlatformConstant.ERROR_MSG, e.toString());
		}
		return mav;
	}
	
	// 소제기 검색
	@RequestMapping(value = "/rais/getRaisreqDetailList.do")
	public ModelAndView getRaisreqDetailList(XPlatformMapDTO xpDto, Model model) {
		ModelAndView mav = new ModelAndView("xplatformMapView");

		try {
			DataSetMap tranInfo = xpDto.getTranInfoMap();
			Map<String, Object> inVar = xpDto.getInVariableMap();
			Map<String, DataSetMap> inDataset = xpDto.getInDataSetMap();
			Map<String, Object> outVar = xpDto.getOutVariableMap();
			Map<String, DataSetMap> outDataset = xpDto.getOutDataSetMap();

			raisservice.getRaisreqDetailList(tranInfo, inVar, inDataset,
					outVar, outDataset);
			mav.addObject(XPlatformConstant.OUT_VARIABLES_ATT_NAME,
					xpDto.getOutVariableMap());
			mav.addObject(XPlatformConstant.OUT_DATASET_ATT_NAME,
					xpDto.getOutDataSetMap());

			mav.addObject(XPlatformConstant.ERROR_CODE, "0");
			mav.addObject(XPlatformConstant.ERROR_MSG, "");

		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject(XPlatformConstant.ERROR_CODE, "-1");
			mav.addObject(XPlatformConstant.ERROR_MSG, e.toString());
		}
		return mav;
	}

	// 소제기 수정
	@RequestMapping(value = "/rais/procAllRaisreq.do")
	public ModelAndView procAllRaisreq(XPlatformMapDTO xpDto, Model model) {

		ModelAndView mav = new ModelAndView("xplatformMapView");

		try {
			DataSetMap tranInfo = xpDto.getTranInfoMap();
			Map<String, Object> inVar = xpDto.getInVariableMap();
			Map<String, DataSetMap> inDataset = xpDto.getInDataSetMap();
			Map<String, Object> outVar = xpDto.getOutVariableMap();
			Map<String, DataSetMap> outDataset = xpDto.getOutDataSetMap();

			raisservice.procAllRaisreq(tranInfo, inVar, inDataset, outVar,
					outDataset);
			mav.addObject(XPlatformConstant.ERROR_CODE, "0");
			mav.addObject(XPlatformConstant.ERROR_MSG, "");

		} catch (Exception e) {

			e.printStackTrace();
			mav.addObject(XPlatformConstant.ERROR_CODE, "-1");
			mav.addObject(XPlatformConstant.ERROR_MSG, e.toString());
		}
		return mav;
	}
	
	// 회신등록수정
	@RequestMapping(value = "/rais/updateRaisreqRep.do")
	public ModelAndView updateRaisreqRep(XPlatformMapDTO xpDto, Model model) {
		ModelAndView mav = new ModelAndView("xplatformMapView");

		try {
			DataSetMap tranInfo = xpDto.getTranInfoMap();
			Map<String, Object> inVar = xpDto.getInVariableMap();
			Map<String, DataSetMap> inDataset = xpDto.getInDataSetMap();
			Map<String, Object> outVar = xpDto.getOutVariableMap();
			Map<String, DataSetMap> outDataset = xpDto.getOutDataSetMap();

			raisservice.updateRaisereqRep(tranInfo, inVar, inDataset, outVar,
					outDataset);
			mav.addObject(XPlatformConstant.ERROR_CODE, "0");
			mav.addObject(XPlatformConstant.ERROR_MSG, "");

		} catch (Exception e) {

			e.printStackTrace();
			mav.addObject(XPlatformConstant.ERROR_CODE, "-1");
			mav.addObject(XPlatformConstant.ERROR_MSG, e.toString());
		}
		return mav;
	}

	// 피고조회
	@RequestMapping(value = "/rais/getRaisreqDefList.do")
	public ModelAndView getRaisreqDefList(XPlatformMapDTO xpDto, Model model) {
		ModelAndView mav = new ModelAndView("xplatformMapView");

		try {
			DataSetMap tranInfo = xpDto.getTranInfoMap();
			Map<String, Object> inVar = xpDto.getInVariableMap();
			Map<String, DataSetMap> inDataset = xpDto.getInDataSetMap();
			Map<String, Object> outVar = xpDto.getOutVariableMap();
			Map<String, DataSetMap> outDataset = xpDto.getOutDataSetMap();

			raisservice.getRaisreqDefList(tranInfo, inVar, inDataset, outVar,
					outDataset);

			mav.addObject(XPlatformConstant.OUT_VARIABLES_ATT_NAME,
					xpDto.getOutVariableMap());
			mav.addObject(XPlatformConstant.OUT_DATASET_ATT_NAME,
					xpDto.getOutDataSetMap());

			mav.addObject(XPlatformConstant.ERROR_CODE, "0");
			mav.addObject(XPlatformConstant.ERROR_MSG, "");

		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject(XPlatformConstant.ERROR_CODE, "-1");
			mav.addObject(XPlatformConstant.ERROR_MSG, e.toString());
		}
		return mav;
	}

	// 피고등록삭제수정
	@RequestMapping(value = "/rais/saveDefAll.do")
	public ModelAndView saveDefAll(XPlatformMapDTO xpDto, Model model) {

		ModelAndView mav = new ModelAndView("xplatformMapView");

		try {
			DataSetMap tranInfo = xpDto.getTranInfoMap();
			Map<String, Object> inVar = xpDto.getInVariableMap();
			Map<String, DataSetMap> inDataset = xpDto.getInDataSetMap();
			Map<String, Object> outVar = xpDto.getOutVariableMap();
			Map<String, DataSetMap> outDataset = xpDto.getOutDataSetMap();

			raisservice.saveDefAll(tranInfo, inVar, inDataset, outVar,
					outDataset);
			mav.addObject(XPlatformConstant.ERROR_CODE, "0");
			mav.addObject(XPlatformConstant.ERROR_MSG, "");

		} catch (Exception e) {

			e.printStackTrace();
			mav.addObject(XPlatformConstant.ERROR_CODE, "-1");
			mav.addObject(XPlatformConstant.ERROR_MSG, e.toString());
		}
		return mav;
	}*/
}
