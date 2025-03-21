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


import com.dao.YuyueshijiaDao;
import com.entity.YuyueshijiaEntity;
import com.service.YuyueshijiaService;
import com.entity.vo.YuyueshijiaVO;
import com.entity.view.YuyueshijiaView;

@Service("yuyueshijiaService")
public class YuyueshijiaServiceImpl extends ServiceImpl<YuyueshijiaDao, YuyueshijiaEntity> implements YuyueshijiaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuyueshijiaEntity> page = this.selectPage(
                new Query<YuyueshijiaEntity>(params).getPage(),
                new EntityWrapper<YuyueshijiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuyueshijiaEntity> wrapper) {
		  Page<YuyueshijiaView> page =new Query<YuyueshijiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuyueshijiaVO> selectListVO(Wrapper<YuyueshijiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuyueshijiaVO selectVO(Wrapper<YuyueshijiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuyueshijiaView> selectListView(Wrapper<YuyueshijiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuyueshijiaView selectView(Wrapper<YuyueshijiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
