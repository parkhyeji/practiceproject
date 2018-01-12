package nexacro.sample.web;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.sample.service.InsaAcptService;
import nexacro.sample.vo.com.InsaAcptVO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.annotation.ParamVariable;
import com.nexacro.spring.data.NexacroResult;


@Controller
public class InsaAcptController {

	private Logger log = LoggerFactory.getLogger(InsaAcptController.class);
	
	@Resource(name = "insaAcptService")
	private InsaAcptService insaAcptService;
	
	// 사원 승인내역 조회
	@RequestMapping(value = "/adm/selectInsaAcptList.do")
	public NexacroResult selectInsaAcptList(
			@ParamDataSet(name = "ds_input", required = false) Map params){
		
		
		//System.out.println("nexacroresult!!!");
		
		List<InsaAcptVO> insaList=insaAcptService.selectInsaAcptList(params);
		
		/*if(insaList.isEmpty()){
			System.out.println("empty!!");
		}else{
			System.out.println("$$$$$$$$$$$$");
			for(int i =0; i<insaList.size(); i++){
				System.out.println(insaList.get(0).toString());
			}
			System.out.println("$$$$$$$$$$$$");
		}*/
		
		
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output", insaList);
		
		return result;
	}
	
	// 사원 승인내역 정보 저장
	@RequestMapping(value ="/adm/saveInsaAcptList.do")
	public NexacroResult saveInsaAcptList(
			@ParamDataSet(name = "ds_input") Map params
			){
		System.out.println("i'm here!");
		if(params.size()>0){
			System.out.println("this is existing!");
			System.out.println("==="+params.toString());
		}
		
		insaAcptService.saveInsaAcptList(params);
		
		//insaAcptService.saveInsaAcptList(insaAcptVO, registerId);
		
		//NexacroResult result = new NexacroResult();
		return null;
	}
	
	
}
