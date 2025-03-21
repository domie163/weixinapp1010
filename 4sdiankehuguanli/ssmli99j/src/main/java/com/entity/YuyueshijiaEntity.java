package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 预约试驾
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-17 14:30:57
 */
@TableName("yuyueshijia")
public class YuyueshijiaEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YuyueshijiaEntity() {
		
	}
	
	public YuyueshijiaEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 门店账号
	 */
					
	private String mendianzhanghao;
	
	/**
	 * 门店名称
	 */
					
	private String mendianmingcheng;
	
	/**
	 * 汽车名称
	 */
					
	private String qichemingcheng;
	
	/**
	 * 汽车品牌
	 */
					
	private String qichepinpai;
	
	/**
	 * 汽车图片
	 */
					
	private String qichetupian;
	
	/**
	 * 预约时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date yuyueshijian;
	
	/**
	 * 用户id
	 */
					
	private Long userid;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：门店账号
	 */
	public void setMendianzhanghao(String mendianzhanghao) {
		this.mendianzhanghao = mendianzhanghao;
	}
	/**
	 * 获取：门店账号
	 */
	public String getMendianzhanghao() {
		return mendianzhanghao;
	}
	/**
	 * 设置：门店名称
	 */
	public void setMendianmingcheng(String mendianmingcheng) {
		this.mendianmingcheng = mendianmingcheng;
	}
	/**
	 * 获取：门店名称
	 */
	public String getMendianmingcheng() {
		return mendianmingcheng;
	}
	/**
	 * 设置：汽车名称
	 */
	public void setQichemingcheng(String qichemingcheng) {
		this.qichemingcheng = qichemingcheng;
	}
	/**
	 * 获取：汽车名称
	 */
	public String getQichemingcheng() {
		return qichemingcheng;
	}
	/**
	 * 设置：汽车品牌
	 */
	public void setQichepinpai(String qichepinpai) {
		this.qichepinpai = qichepinpai;
	}
	/**
	 * 获取：汽车品牌
	 */
	public String getQichepinpai() {
		return qichepinpai;
	}
	/**
	 * 设置：汽车图片
	 */
	public void setQichetupian(String qichetupian) {
		this.qichetupian = qichetupian;
	}
	/**
	 * 获取：汽车图片
	 */
	public String getQichetupian() {
		return qichetupian;
	}
	/**
	 * 设置：预约时间
	 */
	public void setYuyueshijian(Date yuyueshijian) {
		this.yuyueshijian = yuyueshijian;
	}
	/**
	 * 获取：预约时间
	 */
	public Date getYuyueshijian() {
		return yuyueshijian;
	}
	/**
	 * 设置：用户id
	 */
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}

}
