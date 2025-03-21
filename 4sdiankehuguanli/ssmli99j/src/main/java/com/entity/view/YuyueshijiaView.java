package com.entity.view;

import com.entity.YuyueshijiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 预约试驾
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-17 14:30:57
 */
@TableName("yuyueshijia")
public class YuyueshijiaView  extends YuyueshijiaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuyueshijiaView(){
	}
 
 	public YuyueshijiaView(YuyueshijiaEntity yuyueshijiaEntity){
 	try {
			BeanUtils.copyProperties(this, yuyueshijiaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
