package nexacro.sample.service.lawsuit.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import nexacro.sample.service.lawsuit.LawsuitNotiNoService;
import nexacro.sample.service.lawsuit.dao.ibatis.LawsuitNotiNoDAO;
import nexacro.sample.service.lawsuit.vo.LawsuitNotiNoVO;

/**
 * @author Kim PyeongAn
 * @since 10.27.2017
 * @version 1.0
 */
@Service("lawsuitNotiNoService")
public class LawsuitNotiNoServiceImpl implements LawsuitNotiNoService{
	
	@Resource(name="lawsuitNotiNoDAO")
	private LawsuitNotiNoDAO lawsuitNotiNoDAO;
	
	@Override
	public List<LawsuitNotiNoVO> selectlawsuitNotiNoList(
			LawsuitNotiNoVO searchVO) {
		return lawsuitNotiNoDAO.selectLawsuitNotiNoVoList(searchVO);
	}
	

}
