package nexacro.sample.web.depo;

 
import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.depo.DepoService;
import nexacro.sample.vo.depo.DepoVO;
import nexacro.sample.vo.depo.MgrInfoVO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.data.NexacroResult;

@Controller
public class DepoController {
	
	private static final Logger log = LoggerFactory.getLogger(DepoController.class);
	
	@Resource(name="DepoService")
	private DepoService DepoService;
	
	//공탁목록조회
	@RequestMapping("/depo/Depo/selectDepoList.do")
	public NexacroResult selectDepoList(
			@ParamDataSet(name="ds_search", required=false) DepoVO searchVO) throws Exception{
		
		List<DepoVO> list = DepoService.selectDepoList(searchVO);
		
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output", list);
		return result;
	}
	
	//공탁상세조회
	@RequestMapping("/depo/Depo/selectDepoView.do")
	public NexacroResult selectDepoOne(
			@ParamDataSet(name="ds_search", required=false) DepoVO searchVO) throws Exception{
		
		List<DepoVO> item = DepoService.selectOneDepo(searchVO);
		
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output",item);
		return result;
	}
	
	//관리자조회
	@RequestMapping("/depo/Depo/selectMgrList.do")
	public NexacroResult selectMgrList(
			@ParamDataSet(name="ds_search", required=false) MgrInfoVO searchVO) throws Exception{
		
		List<MgrInfoVO> list = DepoService.selectMgrInfoVOs(searchVO);
		
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output",list);
		return result;
	}
	
	//공탁정보저장/수정/삭제
	@RequestMapping("depo/Depo/dbAccessDepo.do")
	public NexacroResult saveDepo(
			@ParamDataSet(name="ds_input", required=false) List<DepoVO> depoVO) throws Exception{
		
		String saveKey = DepoService.saveDepo(depoVO);
		
		NexacroResult result = new NexacroResult();
		result.addVariable("saveKey", saveKey);
		
		return result;
	}
	
}