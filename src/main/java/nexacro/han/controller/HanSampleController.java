package nexacro.han.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.han.service.HanSampleServiceImpl;
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
public class HanSampleController{
	
	private static final Logger log = LoggerFactory
			.getLogger(HanSampleController.class);
	
	@Resource(name = "hanSampleService")
	private HanSampleServiceImpl hanSampleService;

	@Resource
	private Validator validator;

	@InitBinder
	public void initBinder(WebDataBinder dataBinder){
		dataBinder.setValidator(this.validator);
	}
	
	// 공통 코드 로드
	@RequestMapping(value = "hanSample/loadCommonCodes.do")
	public NexacroResult loadCommonCodes(){
		NexacroResult result = new NexacroResult();
		Map<String, Object> classCodeMap = new HashMap<String, Object>();
		
		classCodeMap.put("classCode", "A000");
		result.addDataSet("ds_realType", hanSampleService.loadCommonCode(classCodeMap));
		
		classCodeMap.put("classCode", "B000");
		result.addDataSet("ds_nation", hanSampleService.loadCommonCode(classCodeMap));

		classCodeMap.put("classCode", "E000");
		result.addDataSet("ds_gender", hanSampleService.loadCommonCode(classCodeMap));
		
		classCodeMap.put("classCode", "Q000");
		result.addDataSet("ds_custType", hanSampleService.loadCommonCode(classCodeMap));

		classCodeMap.put("classCode", "R000");
		result.addDataSet("ds_raRank", hanSampleService.loadCommonCode(classCodeMap));
		
		return result;
	}
	
	@RequestMapping(value = "hanSample/searchCust.do")
	public NexacroResult searchCust(){
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_list", hanSampleService.searchCust());
		return result;
	}
	
	@RequestMapping(value = "hanSample/saveList.do")
	public NexacroResult saveList(@ParamDataSet(name="ds_list") List<Map> ds_list){
		//DataSetRowType
		
		for(Map map:ds_list){
			int rowType = (int) map.get("DataSetRowType");
			switch (rowType) {
			case DataSet.ROW_TYPE_INSERTED:
				hanSampleService.insertCust(map);
			break;
			case DataSet.ROW_TYPE_UPDATED:
				hanSampleService.updateCust(map);
			break;
			case DataSet.ROW_TYPE_DELETED:
				hanSampleService.deleteCust(map);
			break;
			}
		}
		NexacroResult result = new NexacroResult();
		return result;
	}
}
