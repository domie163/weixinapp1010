package com.dao;

import com.entity.MendianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MendianVO;
import com.entity.view.MendianView;


/**
 * 门店
 * 
 * @author 
 * @email 
 * @date 2021-03-17 14:30:57
 */
public interface MendianDao extends BaseMapper<MendianEntity> {
	
	List<MendianVO> selectListVO(@Param("ew") Wrapper<MendianEntity> wrapper);
	
	MendianVO selectVO(@Param("ew") Wrapper<MendianEntity> wrapper);
	
	List<MendianView> selectListView(@Param("ew") Wrapper<MendianEntity> wrapper);

	List<MendianView> selectListView(Pagination page,@Param("ew") Wrapper<MendianEntity> wrapper);
	
	MendianView selectView(@Param("ew") Wrapper<MendianEntity> wrapper);
	
}
