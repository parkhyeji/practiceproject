package nexacro.sample.web.administrator;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.sample.service.administrator.AdmService;
import nexacro.sample.vo.administrator.AdmVO;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.annotation.ParamVariable;
import com.nexacro.spring.data.NexacroResult;

@Controller
public class AdmController {
	
	@Resource(name = "admService")
	private AdmService admService;
	
	// 로그인 체크
	@RequestMapping(value = "administrator/login.do")
	public NexacroResult logincheck(
				@ParamVariable(name = "id") String id,
				@ParamVariable(name = "pwd") String pwd) {
		
		Map<String, String> loginMap = new HashMap<String, String>();
		loginMap.put("id", id);
		loginMap.put("pwd", pwd);
		
		AdmVO admVO = admService.selectLogin(loginMap);
		/*System.out.println("id: " + admVO.getInsaId());
		System.out.println("pwd: " + admVO.getInsaPwd());
		System.out.println("name: " + admVO.getInsaName());
		System.out.println("insaSabun: " + admVO.getInsaSabun());
		System.out.println("insaStat: " + admVO.getInsaStat());
		System.out.println("insaPutWtr: " + admVO.getInsaPutWtr());*/
		System.out.println("msg: " + admVO.getMsg());
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output", admVO);
		
		return result;
	}
	
	// 존재하는 아이디인지 검색
	@RequestMapping(value = "administrator/selectId.do")
	public NexacroResult selectId(
			@ParamVariable(name = "id") String id){
		
		AdmVO admVO = admService.selectId(id);
		
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output", admVO);
		
		return result;
	}
	
	// 회원가입
	@RequestMapping(value = "administrator/insertAdm.do")
	public NexacroResult inserAdm(
			@ParamDataSet(name = "ds_input", required = false) AdmVO admVO){
		//System.out.println(admVO.getBirth().substring(6));
		admVO.setBackBirth(admVO.getBirth().substring(6));
		//System.out.println(admVO.getBirth().substring(0, 6));
		admVO.setBirth(admVO.getBirth().substring(0, 6));
		admService.insertAdm(admVO);
		
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output", admVO);
		
		return result;
	}
	
}
