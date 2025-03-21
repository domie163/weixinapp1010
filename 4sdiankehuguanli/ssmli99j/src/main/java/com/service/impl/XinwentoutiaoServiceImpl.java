package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XinwentoutiaoDao;
import com.entity.XinwentoutiaoEntity;
import com.service.XinwentoutiaoService;
import com.entity.vo.XinwentoutiaoVO;
import com.entity.view.XinwentoutiaoView;

@Service("xinwentoutiaoService")
public class XinwentoutiaoServiceImpl extends ServiceImpl<XinwentoutiaoDao, XinwentoutiaoEntity> implements XinwentoutiaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XinwentoutiaoEntity> page = this.selectPage(
                new Query<XinwentoutiaoEntity>(params).getPage(),
                new EntityWrapper<XinwentoutiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XinwentoutiaoEntity> wrapper) {
		  Page<XinwentoutiaoView> page =new Query<XinwentoutiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XinwentoutiaoVO> selectListVO(Wrapper<XinwentoutiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XinwentoutiaoVO selectVO(Wrapper<XinwentoutiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XinwentoutiaoView> selectListView(Wrapper<XinwentoutiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XinwentoutiaoView selectView(Wrapper<XinwentoutiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
