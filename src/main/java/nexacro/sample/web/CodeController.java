package nexacro.sample.web;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.sample.service.CodeService;
import nexacro.sample.vo.CodeVO;
import nexacro.sample.vo.GroupCodeVO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.spring.NexacroException;
import com.nexacro.spring.annotation.ParamDataSet;
import com.nexacro.spring.annotation.ParamVariable;
import com.nexacro.spring.data.NexacroResult;

/**
 * Test를 위한 Controller Sample Class
 *
 * @author Park SeongMin
 * @since 08.12.2015
 * @version 1.0
 * @see
 */
@Controller
public class CodeController  {

	private static final Logger log = LoggerFactory.getLogger(AdvancedFileController.class);
	
    @Resource(name = "codeService")
    private CodeService codeService;
    
    /**
     * 
     * Code를 조회 한다.
     *
     * @param searchVOList
     * @return
     * @throws NexacroException 
     */
    @RequestMapping(value = "/selectCodeGroupList.do")
	public NexacroResult selectCodeGroupList(@ParamDataSet(name = "ds_search", required = false) GroupCodeVO searchVo) {
 
        List<GroupCodeVO> groupCodeList = codeService.selectCodeGroupList(searchVo);
        
        List<CodeVO> codeList = codeService.selectCodeList();
        
        NexacroResult result = new NexacroResult();
        result.addDataSet("dsGroupCode", groupCodeList);
        result.addDataSet("dsCode", codeList);
        
        return result;
    }
    
    /**
     * 
     * Code를 수정한다.
     *
     * @param modifyGroupList
     * @param modifyCodeList
     * @return
     */
    @RequestMapping(value = "/modifyCodes.do")
    public NexacroResult modifyCodes(@ParamDataSet(name="dsGroupCode") List<GroupCodeVO> modifyGroupList
                            , @ParamDataSet(name="dsCode") List<CodeVO> modifyCodeList){
        
        codeService.modifyCodeGroup(modifyGroupList);
        codeService.modifyCode(modifyCodeList);
        
        NexacroResult result = new NexacroResult();
        
        return result;
    }
/*	// 전체 코드 검색
	@RequestMapping(value = "/code/selectCodeList.do")
	public NexacroResult selectCodeList(
			@ParamVariable(name = "AllYn") String allYn,
			@ParamVariable(name = "AllCode") String allCode,
			@ParamVariable(name = "AllName") String allName,
			@ParamVariable(name = "CLASS_CODE") String classCode) {

		
		Map<String, Object> codeMap = new HashMap<String, Object>();
		codeMap.put("allYn", allYn);
		codeMap.put("allCode", allCode);
		codeMap.put("allName", allName);
		codeMap.put("classCode", classCode);
		
		List<CodeVO> codeList = codeService.selectCodeList(codeMap);
		
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_output", codeList);
		
		for(int i=0; i<codeList.size(); i++){
			System.out.println("=="+codeList.get(i).toString());
		}
		
		return result;
		
	}*/
    
}
