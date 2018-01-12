package nexacro.Sys.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.Sys.service.SysDetailServiceImpl;
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
public class SysDetailController{

	private static final Logger log = LoggerFactory
			.getLogger(SysDetailController.class);
	
	@Resource(name = "sysDetailService")
	private SysDetailServiceImpl sysDetailService;
	@Resource(name = "sysSampleService")
	private SysSampleServiceImpl sysSampleService;
	
	@Resource
	private Validator validator;

	@InitBinder
	public void initBinder(WebDataBinder dataBinder){
		dataBinder.setValidator(this.validator);
	}	
	
	// 공통 코드 디테일 로드
	@RequestMapping(value = "sysDetail/loadCommonCodesDetail.do")
	public NexacroResult loadCommonCodes(){
		NexacroResult result = new NexacroResult();
		
		result.addDataSet("class_code_dataset", sysSampleService.loadCommonCode());		// 공통코드
		result.addDataSet("comm_class_code", sysDetailService.loadCommonCodeDetail());	// 공통코드 디테일
		
		return result;
	}

	// 마스터 화면에서 조회
	@RequestMapping(value = "sysDetail/read.do")
	public NexacroResult read(
			@ParamDataSet(name="select_dataset") List<Map> select_dataset){

		Map map = select_dataset.get(0);

		NexacroResult result = new NexacroResult();

		result.addDataSet("common_detail_dataset", sysDetailService.read(map));
		result.addDataSet("common_master_dataset", sysDetailService.read(map));

		return result;
	}
	
	// 상위 셀렉트박스 값 변경시 하위셀렉트박스 제어
	@RequestMapping(value = "sysDetail/selectOption.do")
	public NexacroResult selectOption(
			@ParamDataSet(name="gubuen") List<Map> gubuen) {
	
		Map map = gubuen.get(0);
	
		NexacroResult result = new NexacroResult();
	
		result.addDataSet("comm_class_code", sysDetailService.selectOption(map));
	
		return result;
	}

	// 저장, 수정
	@RequestMapping(value = "sysDetail/saveList.do")
	public NexacroResult saveList(
			@ParamDataSet(name="common_detail_dataset") List<Map> common_detail_dataset){

		for(Map map:common_detail_dataset){
			int rowType = (int) map.get("DataSetRowType");
			switch (rowType) {
			case DataSet.ROW_TYPE_INSERTED:
				sysDetailService.insert(map);
			break;
			case DataSet.ROW_TYPE_UPDATED:
				sysDetailService.update(map);
			break;			
			}
		}
		NexacroResult result = new NexacroResult();
		return result;
	}
	
	// 삭제
	@RequestMapping(value = "sysDetail/deleteList.do")
	public NexacroResult deleteList(
			@ParamDataSet(name="common_detail_dataset") List<Map> common_detail_dataset){
			
		NexacroResult result = new NexacroResult();
			
		Map map = common_detail_dataset.get(0);			

		sysDetailService.delete(map);

		return result;
	}
}