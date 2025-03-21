package com.entity.view;

import com.entity.MendianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 门店
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-17 14:30:57
 */
@TableName("mendian")
public class MendianView  extends MendianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MendianView(){
	}
 
 	public MendianView(MendianEntity mendianEntity){
 	try {
			BeanUtils.copyProperties(this, mendianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
