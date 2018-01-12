package nexacro.aml.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.aml.service.EmpCrudServiceImpl;
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
public class EmpCrudController{
	
	private static final Logger log = LoggerFactory
			.getLogger(EmpCrudController.class);
	
	@Resource(name = "EmpCrudService")
	private EmpCrudServiceImpl EmpCrudService;

	@Resource
	private Validator validator;

	@InitBinder
	public void initBinder(WebDataBinder dataBinder){
		dataBinder.setValidator(this.validator);
	}
	
	
	@RequestMapping(value = "EmpCrud/searchCust.do")
	public NexacroResult searchCust(){
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_list", EmpCrudService.searchCust());
		return result;
	}
	
	@RequestMapping(value = "EmpCrud/saveList.do")
	public NexacroResult saveList(@ParamDataSet(name="ds_list") List<Map> ds_list){
		//DataSetRowType
		
		for(Map map:ds_list){
			int rowType = (int) map.get("DataSetRowType");
			switch (rowType) {
			case DataSet.ROW_TYPE_INSERTED:
				EmpCrudService.insertCust(map);
			break;
			case DataSet.ROW_TYPE_UPDATED:
				EmpCrudService.updateCust(map);
			break;
			case DataSet.ROW_TYPE_DELETED:
				EmpCrudService.deleteCust(map);
			break;
			}
		}
		NexacroResult result = new NexacroResult();
		return result;
	}
}
