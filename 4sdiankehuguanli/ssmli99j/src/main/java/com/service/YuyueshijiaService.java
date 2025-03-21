package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuyueshijiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuyueshijiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuyueshijiaView;


/**
 * 预约试驾
 *
 * @author 
 * @email 
 * @date 2021-03-17 14:30:57
 */
public interface YuyueshijiaService extends IService<YuyueshijiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuyueshijiaVO> selectListVO(Wrapper<YuyueshijiaEntity> wrapper);
   	
   	YuyueshijiaVO selectVO(@Param("ew") Wrapper<YuyueshijiaEntity> wrapper);
   	
   	List<YuyueshijiaView> selectListView(Wrapper<YuyueshijiaEntity> wrapper);
   	
   	YuyueshijiaView selectView(@Param("ew") Wrapper<YuyueshijiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuyueshijiaEntity> wrapper);
   	
}

