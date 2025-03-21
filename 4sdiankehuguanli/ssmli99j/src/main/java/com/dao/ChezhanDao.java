package com.dao;

import com.entity.ChezhanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChezhanVO;
import com.entity.view.ChezhanView;


/**
 * 车展
 * 
 * @author 
 * @email 
 * @date 2021-03-17 14:30:57
 */
public interface ChezhanDao extends BaseMapper<ChezhanEntity> {
	
	List<ChezhanVO> selectListVO(@Param("ew") Wrapper<ChezhanEntity> wrapper);
	
	ChezhanVO selectVO(@Param("ew") Wrapper<ChezhanEntity> wrapper);
	
	List<ChezhanView> selectListView(@Param("ew") Wrapper<ChezhanEntity> wrapper);

	List<ChezhanView> selectListView(Pagination page,@Param("ew") Wrapper<ChezhanEntity> wrapper);
	
	ChezhanView selectView(@Param("ew") Wrapper<ChezhanEntity> wrapper);
	
}
