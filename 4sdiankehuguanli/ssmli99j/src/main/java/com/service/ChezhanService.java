package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChezhanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChezhanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChezhanView;


/**
 * 车展
 *
 * @author 
 * @email 
 * @date 2021-03-17 14:30:57
 */
public interface ChezhanService extends IService<ChezhanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChezhanVO> selectListVO(Wrapper<ChezhanEntity> wrapper);
   	
   	ChezhanVO selectVO(@Param("ew") Wrapper<ChezhanEntity> wrapper);
   	
   	List<ChezhanView> selectListView(Wrapper<ChezhanEntity> wrapper);
   	
   	ChezhanView selectView(@Param("ew") Wrapper<ChezhanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChezhanEntity> wrapper);
   	
}

