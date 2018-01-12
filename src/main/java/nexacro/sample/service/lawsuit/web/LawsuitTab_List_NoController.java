package nexacro.sample.service.lawsuit.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.sample.service.lawsuit.LawsuitTab_List_NoService;
import nexacro.sample.service.lawsuit.vo.LawsuitTab_List_NoVO;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.spring.NexacroException;
import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.annotation.ParamVariable;
import com.nexacro.spring.data.NexacroResult;

@Controller
public class LawsuitTab_List_NoController {
	//private static final Logger log = LoggerFactory.getLogger(LawsuitTab_List_NoController.class);

	@Resource(name = "lawsuittablistnoService")
	private LawsuitTab_List_NoService lawsuittablistnoService;

	@Resource
	private Validator validator;

	 @InitBinder
     public void initBinder(WebDataBinder dataBinder) {
	 dataBinder.setValidator(this.validator);
	 }//추가

	@RequestMapping(value = "/lawsuit/LawsuitTabListNoSelectVO.do")
	public NexacroResult LawsuitTabListNoSelectVO(
			@ParamVariable(name = "lawsuitTabListNo") String lawsuitTabListNo){
		Map<String, Object> LawsuitTabListNoSelectVO = new HashMap<String, Object>();
		LawsuitTabListNoSelectVO.put("lawsuitTabListNo", lawsuitTabListNo);
		List<LawsuitTab_List_NoVO> getMgrSelect_List = lawsuittablistnoService.LawsuitTabListNoSelectVO(LawsuitTabListNoSelectVO);
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output", getMgrSelect_List);
		return result;
	}
	
	@RequestMapping(value = "/lawsuit/lawsuittablistnoModifyVO.do")
	public NexacroResult lawsuittablistnoModifyVO(
			@ParamDataSet(name = "ds_input") List<LawsuitTab_List_NoVO> LawsuitTab_List_NoVO) throws NexacroException {
        int result_int=lawsuittablistnoService.lawsuittablistnoModifyVO(LawsuitTab_List_NoVO);
		NexacroResult result = new NexacroResult();
		return result;
	}

	private void validate(List<LawsuitTab_List_NoVO> modifyList) throws NexacroException {
		// TODO Auto-generated method stub
		BindingResult bindingResult = null;
		for (LawsuitTab_List_NoVO lawsuittablistnoVO : modifyList) {
			bindingResult = new BeanPropertyBindingResult(lawsuittablistnoVO, "lawsuittablistnoVO");
			validator.validate(lawsuittablistnoVO, bindingResult);
			if (bindingResult.hasErrors()) {
				String errorMessages = getErrorMessages(bindingResult);

				NexacroException nexacroException = new NexacroException(errorMessages);
				nexacroException.setErrorCode(NexacroException.DEFAULT_ERROR_CODE);
				nexacroException.setErrorMsg(errorMessages);

				throw nexacroException;
			}
		}
	}

	private String getErrorMessages(BindingResult bindingResult) {
		// TODO Auto-generated method stub
StringBuffer sb = new StringBuffer();
		
		for (ObjectError error : bindingResult.getAllErrors()) {
			sb.append(error.getDefaultMessage()).append("\n");
		}
		
		return sb.toString();
	}
	}




