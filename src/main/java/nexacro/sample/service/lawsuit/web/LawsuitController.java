package nexacro.sample.service.lawsuit.web;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.lawsuit.LawsuitService;
import nexacro.sample.service.lawsuit.vo.LawsuitListVO;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.annotation.ParamVariable;
import com.nexacro.spring.data.NexacroResult;

@Controller
public class LawsuitController {
	// private Logger log = LoggerFactory.getLogger(LawsuitService.class);

	@Resource(name = "lawsuitService")
	private LawsuitService lawsuitService;

	@RequestMapping(value = "/lawsuit/lawsuitSelectVO.do")
	public NexacroResult selectVo(
			@ParamVariable(name = "lawsuitAdmNo") String lawsuitAdmNo,
			@ParamVariable(name = "instAdmCode") String instAdmCode
			){
		LawsuitListVO searchVo = new LawsuitListVO();
		// System.out.println("=====instAdmCode : "+instAdmCode);
		searchVo.setLawsuitAdmNo(lawsuitAdmNo);
		searchVo.setInstAdmCode(instAdmCode);
		
		List<LawsuitListVO> lawsuitList = lawsuitService
				.selectLawsuitList(searchVo);

		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output", lawsuitList);
		result.addDataSet("ds_output1", lawsuitList);
		result.addDataSet("ds_output2", lawsuitList);

		for (LawsuitListVO a : lawsuitList) {
			// System.out.println("심급 : " + a.getInstAdmCode());
			// System.out.println("담당대리인명 : " + a.getInstAdmCtpmgrDepuname());
			// System.out.println("담당자: " + a.getInstAdmCtpmgrName());
			// System.out.println("원피고 구분 : "+ a.getLawsuitCpPladefSepcode());
		}

		return result;
	}
	
	@RequestMapping(value = "/lawsuit/setInstanceLev.do")
	public NexacroResult setInstanceLevel(@ParamVariable(name = "lawsuitAdmNo") String lawsuitAdmNo)
	{
		LawsuitListVO searchVo = new LawsuitListVO();
		// System.out.println("=====instAdmCode : "+instAdmCode);
		searchVo.setLawsuitAdmNo(lawsuitAdmNo);
		
		NexacroResult result = new NexacroResult();
		
		lawsuitService.setInstanceLevel(searchVo);
		
		return result; 
	}
	
	@RequestMapping(value="/lawsuit/insertLawsuitVO.do")
	public NexacroResult insertLawsuit(@ParamDataSet(name="ds_input") LawsuitListVO searchVo)
	{
		NexacroResult result = new NexacroResult();
		
		lawsuitService.insertLawsuit(searchVo);
		
		return result;
	}

	@RequestMapping(value = "/lawsuit/lawsuitModifyVO.do")
	public NexacroResult modifyVo(
			@ParamDataSet(name = "ds_input1") LawsuitListVO lawsuitList1,
			@ParamDataSet(name = "ds_input") LawsuitListVO lawsuitList2,
			@ParamDataSet(name = "ds_input2") LawsuitListVO lawsuitList3) {

		lawsuitService.updateInstanceVO(lawsuitList1);
		lawsuitService.updateLawsuitVO(lawsuitList2);
		lawsuitService.updatePladefVO(lawsuitList3);

		NexacroResult result = new NexacroResult();

		return result;
	}

}
