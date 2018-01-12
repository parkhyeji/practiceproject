package nexacro.sample.service.lawsuit.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import nexacro.sample.service.lawsuit.LawsuitTab_List_NoService;
import nexacro.sample.service.lawsuit.dao.ibatis.LawsuitTab_List_NoDAO;
import nexacro.sample.service.lawsuit.vo.LawsuitAddVO;
import nexacro.sample.service.lawsuit.vo.LawsuitTab_List_NoVO;

import org.springframework.stereotype.Service;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("lawsuittablistnoService")
public class LawsuitTab_List_NoServiceImpl extends EgovAbstractServiceImpl implements LawsuitTab_List_NoService {

	@Resource(name = "lawsuittablistnoDAO")
	private LawsuitTab_List_NoDAO lawsuittablistnoDAO;

	@Override
	public List<LawsuitTab_List_NoVO> LawsuitTabListNoSelectVO(Map<String, Object> ListMap) {
		// TODO Auto-generated method stub
		return lawsuittablistnoDAO.LawsuitTabListNoSelectVO(ListMap);
	}

	@Override
	public int lawsuittablistnoModifyVO(List<LawsuitTab_List_NoVO> LawsuitTab_List_NoVO) {
		// TODO Auto-generated method stub
        int result=0;
		int size = LawsuitTab_List_NoVO.size();
        
        for (int i=0; i<size; i++) {
        	LawsuitTab_List_NoVO tablistno = LawsuitTab_List_NoVO.get(i);
        	DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor)tablistno;
                if(accessor.getRowType() == DataSet.ROW_TYPE_INSERTED){
                  lawsuittablistnoDAO.insertlawsuittablistnoVO(tablistno);
               }else if (accessor.getRowType() == DataSet.ROW_TYPE_UPDATED){
                	lawsuittablistnoDAO.updatelawsuittablistnoVO(tablistno);
                }else if (accessor.getRowType() == DataSet.ROW_TYPE_NORMAL){
                	result=10;
                }
            }
        return result;
        }
	}