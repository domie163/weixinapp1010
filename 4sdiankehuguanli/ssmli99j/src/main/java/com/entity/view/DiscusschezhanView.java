package com.entity.view;

import com.entity.DiscusschezhanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 车展评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-17 14:30:57
 */
@TableName("discusschezhan")
public class DiscusschezhanView  extends DiscusschezhanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusschezhanView(){
	}
 
 	public DiscusschezhanView(DiscusschezhanEntity discusschezhanEntity){
 	try {
			BeanUtils.copyProperties(this, discusschezhanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
