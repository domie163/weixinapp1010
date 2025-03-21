package com.entity.view;

import com.entity.XinwentoutiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 新闻头条
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-17 14:30:57
 */
@TableName("xinwentoutiao")
public class XinwentoutiaoView  extends XinwentoutiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XinwentoutiaoView(){
	}
 
 	public XinwentoutiaoView(XinwentoutiaoEntity xinwentoutiaoEntity){
 	try {
			BeanUtils.copyProperties(this, xinwentoutiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
