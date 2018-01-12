package nexacro.sample.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.sample.service.InsaAcptService;
import nexacro.sample.service.dao.ibatis.InsaAcptDAO;
import nexacro.sample.vo.com.InsaAcptVO;

import org.springframework.stereotype.Service;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;


@Service("insaAcptService")
public class InsaAcptServiceImpl extends EgovAbstractServiceImpl implements InsaAcptService {

	@Resource(name = "insaAcptDAO")
	private InsaAcptDAO insaAcptDAO;
	
	// 사원 승인내역 조회
	@Override
	public List<InsaAcptVO> selectInsaAcptList(Map params) {
		return insaAcptDAO.selectInsaAcptList(params);
	}

	// 사원 승인내역 정보 저장
	@Override
	public void saveInsaAcptList(Map params) {
		
		insaAcptDAO.saveInsaAcptList(params);
		
	}
}
