package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XinwentoutiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XinwentoutiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XinwentoutiaoView;


/**
 * 新闻头条
 *
 * @author 
 * @email 
 * @date 2021-03-17 14:30:57
 */
public interface XinwentoutiaoService extends IService<XinwentoutiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinwentoutiaoVO> selectListVO(Wrapper<XinwentoutiaoEntity> wrapper);
   	
   	XinwentoutiaoVO selectVO(@Param("ew") Wrapper<XinwentoutiaoEntity> wrapper);
   	
   	List<XinwentoutiaoView> selectListView(Wrapper<XinwentoutiaoEntity> wrapper);
   	
   	XinwentoutiaoView selectView(@Param("ew") Wrapper<XinwentoutiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinwentoutiaoEntity> wrapper);
   	
}

