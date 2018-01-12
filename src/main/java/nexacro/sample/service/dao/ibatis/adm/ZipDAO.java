package nexacro.sample.service.dao.ibatis.adm;

import java.util.List;

import nexacro.sample.adm.vo.ZipVO;

import org.springframework.stereotype.Repository;

import com.nexacro.spring.dao.ibatis.NexacroIbatisAbstractDAO;

@Repository("zipDAO")
public class ZipDAO extends NexacroIbatisAbstractDAO{

	// 우편번호 검색
	public List<ZipVO> selectZipCode(ZipVO zipVo){
		return (List<ZipVO>) list("zip.selectZipCode", zipVo);
	}
}
