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


import com.dao.MendianDao;
import com.entity.MendianEntity;
import com.service.MendianService;
import com.entity.vo.MendianVO;
import com.entity.view.MendianView;

@Service("mendianService")
public class MendianServiceImpl extends ServiceImpl<MendianDao, MendianEntity> implements MendianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MendianEntity> page = this.selectPage(
                new Query<MendianEntity>(params).getPage(),
                new EntityWrapper<MendianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MendianEntity> wrapper) {
		  Page<MendianView> page =new Query<MendianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MendianVO> selectListVO(Wrapper<MendianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MendianVO selectVO(Wrapper<MendianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MendianView> selectListView(Wrapper<MendianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MendianView selectView(Wrapper<MendianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
