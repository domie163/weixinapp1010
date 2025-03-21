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


import com.dao.DiscusschezhanDao;
import com.entity.DiscusschezhanEntity;
import com.service.DiscusschezhanService;
import com.entity.vo.DiscusschezhanVO;
import com.entity.view.DiscusschezhanView;

@Service("discusschezhanService")
public class DiscusschezhanServiceImpl extends ServiceImpl<DiscusschezhanDao, DiscusschezhanEntity> implements DiscusschezhanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusschezhanEntity> page = this.selectPage(
                new Query<DiscusschezhanEntity>(params).getPage(),
                new EntityWrapper<DiscusschezhanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusschezhanEntity> wrapper) {
		  Page<DiscusschezhanView> page =new Query<DiscusschezhanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusschezhanVO> selectListVO(Wrapper<DiscusschezhanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusschezhanVO selectVO(Wrapper<DiscusschezhanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusschezhanView> selectListView(Wrapper<DiscusschezhanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusschezhanView selectView(Wrapper<DiscusschezhanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
