package nexacro.sample.service.impl.administrator;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.sample.adm.vo.ZipVO;
import nexacro.sample.service.adm.ZipService;
import nexacro.sample.service.administrator.AdmService;
import nexacro.sample.service.dao.ibatis.adm.ZipDAO;
import nexacro.sample.service.dao.ibatis.administrator.AdmDao;
import nexacro.sample.service.dao.ibatis.depo.DepoDAO;
import nexacro.sample.util.Sha256;
import nexacro.sample.vo.administrator.AdmVO;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;


@Service("zipService")
public class ZipServiceImpl extends EgovAbstractServiceImpl implements ZipService {

	@Resource(name="zipDAO")
	private ZipDAO zipDAO;
	
	@Override
	public List<ZipVO> selectZipCode(ZipVO zipVO) {
		return zipDAO.selectZipCode(zipVO);
	}
		
}
