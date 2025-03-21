package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusschezhanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusschezhanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusschezhanView;


/**
 * 车展评论表
 *
 * @author 
 * @email 
 * @date 2021-03-17 14:30:57
 */
public interface DiscusschezhanService extends IService<DiscusschezhanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusschezhanVO> selectListVO(Wrapper<DiscusschezhanEntity> wrapper);
   	
   	DiscusschezhanVO selectVO(@Param("ew") Wrapper<DiscusschezhanEntity> wrapper);
   	
   	List<DiscusschezhanView> selectListView(Wrapper<DiscusschezhanEntity> wrapper);
   	
   	DiscusschezhanView selectView(@Param("ew") Wrapper<DiscusschezhanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusschezhanEntity> wrapper);
   	
}

