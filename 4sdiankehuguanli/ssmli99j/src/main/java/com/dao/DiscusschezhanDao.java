package com.dao;

import com.entity.DiscusschezhanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusschezhanVO;
import com.entity.view.DiscusschezhanView;


/**
 * 车展评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-17 14:30:57
 */
public interface DiscusschezhanDao extends BaseMapper<DiscusschezhanEntity> {
	
	List<DiscusschezhanVO> selectListVO(@Param("ew") Wrapper<DiscusschezhanEntity> wrapper);
	
	DiscusschezhanVO selectVO(@Param("ew") Wrapper<DiscusschezhanEntity> wrapper);
	
	List<DiscusschezhanView> selectListView(@Param("ew") Wrapper<DiscusschezhanEntity> wrapper);

	List<DiscusschezhanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusschezhanEntity> wrapper);
	
	DiscusschezhanView selectView(@Param("ew") Wrapper<DiscusschezhanEntity> wrapper);
	
}
