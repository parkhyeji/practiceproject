package nexacro.sample.service.lawsuit.dao.ibatis;

import java.util.List;

import nexacro.sample.service.lawsuit.vo.LawsuitNotiNoVO;
import nexacro.sample.vo.SampleVO;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;


/**
 * 소송접수관리 DAO
 * 
 * @author Kim PyeongAn
 * @since 10.27.2017
 * @version 1.0
 */

@Repository("lawsuitNotiNoDAO")
public class LawsuitNotiNoDAO extends NexacroIbatisAbstractDAO {
	public List<LawsuitNotiNoVO> selectLawsuitNotiNoVoList(LawsuitNotiNoVO searchVo)
	{
		return (List<LawsuitNotiNoVO>) list("lawsuitNotiNoDAO.selectLawsuitNotiNoVOList", searchVo);
	}
}
