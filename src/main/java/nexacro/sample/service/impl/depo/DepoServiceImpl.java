package nexacro.sample.service.impl.depo;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;


import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import nexacro.sample.service.dao.ibatis.depo.DepoDAO;
import nexacro.sample.service.depo.DepoService;
import nexacro.sample.vo.depo.DepoVO;
import nexacro.sample.vo.depo.MgrInfoVO;

@Service("DepoService")
public class DepoServiceImpl extends EgovAbstractServiceImpl implements DepoService{

	@Resource(name="DepoDAO")
	private DepoDAO dao;
	
	@Override
	public List<DepoVO> selectDepoList(DepoVO vo) throws Exception {
		return dao.selectDepoList(vo);
	}

	@Override
	public List<DepoVO> selectOneDepo(DepoVO vo) throws Exception {
		return dao.selectDepoOne(vo);
	}

	@Override
	public List<MgrInfoVO> selectMgrInfoVOs(MgrInfoVO vo) throws Exception {
		return dao.selectMgrList(vo);
	}

	@Override
	//@Transactional
	public String saveDepo(List<DepoVO> depoVO) throws Exception {
		
		String saveKey = null;
		
		int size = depoVO.size();
		
		for(int i = 0 ; i<size ; i++){
			DepoVO depoInfo = depoVO.get(i);
			
			DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) depoInfo;
			
			if(accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){
				if(depoInfo.getDepositmgrName() == null){
					dao.insertDepoInfo(depoInfo);
				}
				else{
					dao.insertAllinfo(depoInfo);
				}
				saveKey = depoInfo.getDepositDepoAdmNo();
			}
			else if(accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
				dao.updateDepoInfo(depoInfo);
				dao.updateDepoMgr(depoInfo);
			}
			else if(accessor.getRowType() == DataSet.ROW_TYPE_DELETED){
				dao.deleteDepoInfo(depoInfo);
			} 
			
		}
		
		return saveKey;
	}
	

	

}
