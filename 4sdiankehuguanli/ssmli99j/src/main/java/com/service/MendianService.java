package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MendianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MendianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MendianView;


/**
 * 门店
 *
 * @author 
 * @email 
 * @date 2021-03-17 14:30:57
 */
public interface MendianService extends IService<MendianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MendianVO> selectListVO(Wrapper<MendianEntity> wrapper);
   	
   	MendianVO selectVO(@Param("ew") Wrapper<MendianEntity> wrapper);
   	
   	List<MendianView> selectListView(Wrapper<MendianEntity> wrapper);
   	
   	MendianView selectView(@Param("ew") Wrapper<MendianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MendianEntity> wrapper);
   	
}

