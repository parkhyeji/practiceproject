package nexacro.sample.service.lawsuit.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.sample.service.lawsuit.LawsuitCharService;
import nexacro.sample.service.lawsuit.dao.ibatis.LawsuitCharDAO;
import nexacro.sample.service.lawsuit.vo.LawsuitCharVO;

import org.springframework.stereotype.Service;

import com.nexacro.spring.data.DataSetRowTypeAccessor;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("lawsuitcharService")
public class LawsuitCharServiceImpl extends EgovAbstractServiceImpl implements LawsuitCharService {

	@Resource(name = "lawsuitcharDAO")
	private LawsuitCharDAO lawsuitcharDAO;

	@Override
	public List<LawsuitCharVO> LawsuitCharSelectVO(Map<String, Object> ListMap) {
		// TODO Auto-generated method stub
		return lawsuitcharDAO.LawsuitCharSelectVO(ListMap);
	}

}
