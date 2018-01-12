package nexacro.sample.service.lawsuit.dao.ibatis;

import java.util.List;

import nexacro.sample.service.lawsuit.vo.LawsuitListVO;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

@Repository("lawsuitDAO")
public class LawsuitDAO extends NexacroIbatisAbstractDAO{
	public List<LawsuitListVO> selectLawsuitList(LawsuitListVO searchVo)
	{
		return (List<LawsuitListVO>) list("lawsuitDAO.selectLawsuitVOList", searchVo);
	}
	
	public LawsuitListVO setInstanceLevel(LawsuitListVO searchVo)
	{
		return (LawsuitListVO) list("lawsuitDAO.setInstanceLevel", searchVo);
	}
	
	public void insertLawsuit(LawsuitListVO searchVo)
	{
		insert("lawsuitDao.insertLawsuit", searchVo);
	}
	
	public void updateLawsuitVO(LawsuitListVO lawsuit)
	{
		update("lawsuitDAO.updateLawsuit",lawsuit);
	}
	public void updateInstanceVO(LawsuitListVO lawsuit)
	{
		update("lawsuitDAO.updateInstance",lawsuit);
	}
	public void updatePladefVO(LawsuitListVO lawsuit)
	{
		update("lawsuitDAO.updatePladef",lawsuit);
	}
}
