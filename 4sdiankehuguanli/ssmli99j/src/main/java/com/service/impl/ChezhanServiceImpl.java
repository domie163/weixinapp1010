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


import com.dao.ChezhanDao;
import com.entity.ChezhanEntity;
import com.service.ChezhanService;
import com.entity.vo.ChezhanVO;
import com.entity.view.ChezhanView;

@Service("chezhanService")
public class ChezhanServiceImpl extends ServiceImpl<ChezhanDao, ChezhanEntity> implements ChezhanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChezhanEntity> page = this.selectPage(
                new Query<ChezhanEntity>(params).getPage(),
                new EntityWrapper<ChezhanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChezhanEntity> wrapper) {
		  Page<ChezhanView> page =new Query<ChezhanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChezhanVO> selectListVO(Wrapper<ChezhanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChezhanVO selectVO(Wrapper<ChezhanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChezhanView> selectListView(Wrapper<ChezhanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChezhanView selectView(Wrapper<ChezhanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
