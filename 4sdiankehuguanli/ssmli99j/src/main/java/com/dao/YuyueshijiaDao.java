package com.dao;

import com.entity.YuyueshijiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuyueshijiaVO;
import com.entity.view.YuyueshijiaView;


/**
 * 预约试驾
 * 
 * @author 
 * @email 
 * @date 2021-03-17 14:30:57
 */
public interface YuyueshijiaDao extends BaseMapper<YuyueshijiaEntity> {
	
	List<YuyueshijiaVO> selectListVO(@Param("ew") Wrapper<YuyueshijiaEntity> wrapper);
	
	YuyueshijiaVO selectVO(@Param("ew") Wrapper<YuyueshijiaEntity> wrapper);
	
	List<YuyueshijiaView> selectListView(@Param("ew") Wrapper<YuyueshijiaEntity> wrapper);

	List<YuyueshijiaView> selectListView(Pagination page,@Param("ew") Wrapper<YuyueshijiaEntity> wrapper);
	
	YuyueshijiaView selectView(@Param("ew") Wrapper<YuyueshijiaEntity> wrapper);
	
}
