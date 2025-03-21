package com.dao;

import com.entity.XinwentoutiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XinwentoutiaoVO;
import com.entity.view.XinwentoutiaoView;


/**
 * 新闻头条
 * 
 * @author 
 * @email 
 * @date 2021-03-17 14:30:57
 */
public interface XinwentoutiaoDao extends BaseMapper<XinwentoutiaoEntity> {
	
	List<XinwentoutiaoVO> selectListVO(@Param("ew") Wrapper<XinwentoutiaoEntity> wrapper);
	
	XinwentoutiaoVO selectVO(@Param("ew") Wrapper<XinwentoutiaoEntity> wrapper);
	
	List<XinwentoutiaoView> selectListView(@Param("ew") Wrapper<XinwentoutiaoEntity> wrapper);

	List<XinwentoutiaoView> selectListView(Pagination page,@Param("ew") Wrapper<XinwentoutiaoEntity> wrapper);
	
	XinwentoutiaoView selectView(@Param("ew") Wrapper<XinwentoutiaoEntity> wrapper);
	
}
