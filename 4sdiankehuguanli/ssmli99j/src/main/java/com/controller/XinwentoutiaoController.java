package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.XinwentoutiaoEntity;
import com.entity.view.XinwentoutiaoView;

import com.service.XinwentoutiaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 新闻头条
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-17 14:30:57
 */
@RestController
@RequestMapping("/xinwentoutiao")
public class XinwentoutiaoController {
    @Autowired
    private XinwentoutiaoService xinwentoutiaoService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XinwentoutiaoEntity xinwentoutiao, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("mendian")) {
			xinwentoutiao.setMendianzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XinwentoutiaoEntity> ew = new EntityWrapper<XinwentoutiaoEntity>();
		PageUtils page = xinwentoutiaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xinwentoutiao), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XinwentoutiaoEntity xinwentoutiao, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("mendian")) {
			xinwentoutiao.setMendianzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XinwentoutiaoEntity> ew = new EntityWrapper<XinwentoutiaoEntity>();
		PageUtils page = xinwentoutiaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xinwentoutiao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XinwentoutiaoEntity xinwentoutiao){
       	EntityWrapper<XinwentoutiaoEntity> ew = new EntityWrapper<XinwentoutiaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xinwentoutiao, "xinwentoutiao")); 
        return R.ok().put("data", xinwentoutiaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XinwentoutiaoEntity xinwentoutiao){
        EntityWrapper< XinwentoutiaoEntity> ew = new EntityWrapper< XinwentoutiaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xinwentoutiao, "xinwentoutiao")); 
		XinwentoutiaoView xinwentoutiaoView =  xinwentoutiaoService.selectView(ew);
		return R.ok("查询新闻头条成功").put("data", xinwentoutiaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XinwentoutiaoEntity xinwentoutiao = xinwentoutiaoService.selectById(id);
		xinwentoutiao.setClicknum(xinwentoutiao.getClicknum()+1);
		xinwentoutiao.setClicktime(new Date());
		xinwentoutiaoService.updateById(xinwentoutiao);
        return R.ok().put("data", xinwentoutiao);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XinwentoutiaoEntity xinwentoutiao = xinwentoutiaoService.selectById(id);
		xinwentoutiao.setClicknum(xinwentoutiao.getClicknum()+1);
		xinwentoutiao.setClicktime(new Date());
		xinwentoutiaoService.updateById(xinwentoutiao);
        return R.ok().put("data", xinwentoutiao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XinwentoutiaoEntity xinwentoutiao, HttpServletRequest request){
    	xinwentoutiao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xinwentoutiao);

        xinwentoutiaoService.insert(xinwentoutiao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XinwentoutiaoEntity xinwentoutiao, HttpServletRequest request){
    	xinwentoutiao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xinwentoutiao);
    	xinwentoutiao.setUserid((Long)request.getSession().getAttribute("userId"));

        xinwentoutiaoService.insert(xinwentoutiao);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody XinwentoutiaoEntity xinwentoutiao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xinwentoutiao);
        xinwentoutiaoService.updateById(xinwentoutiao);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xinwentoutiaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<XinwentoutiaoEntity> wrapper = new EntityWrapper<XinwentoutiaoEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("mendian")) {
			wrapper.eq("mendianzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = xinwentoutiaoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,XinwentoutiaoEntity xinwentoutiao, HttpServletRequest request,String pre){
        EntityWrapper<XinwentoutiaoEntity> ew = new EntityWrapper<XinwentoutiaoEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        
        params.put("order", "desc");
		PageUtils page = xinwentoutiaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xinwentoutiao), params), params));
        return R.ok().put("data", page);
    }


}
