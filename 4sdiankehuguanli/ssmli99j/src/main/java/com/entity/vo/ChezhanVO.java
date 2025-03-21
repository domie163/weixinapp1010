package com.entity.vo;

import com.entity.ChezhanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 车展
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-17 14:30:57
 */
public class ChezhanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 门店名称
	 */
	
	private String mendianmingcheng;
		
	/**
	 * 汽车名称
	 */
	
	private String qichemingcheng;
		
	/**
	 * 汽车分类
	 */
	
	private String qichefenlei;
		
	/**
	 * 汽车品牌
	 */
	
	private String qichepinpai;
		
	/**
	 * 汽车颜色
	 */
	
	private String qicheyanse;
		
	/**
	 * 汽车图片
	 */
	
	private String qichetupian;
		
	/**
	 * 天窗
	 */
	
	private String tianchuang;
		
	/**
	 * 换挡方式
	 */
	
	private String huandangfangshi;
		
	/**
	 * 座位
	 */
	
	private String zuowei;
		
	/**
	 * 汽车排量
	 */
	
	private String qichepailiang;
		
	/**
	 * 上市年份
	 */
	
	private String shangshinianfen;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 汽车详情
	 */
	
	private String qichexiangqing;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
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
	 * 设置：汽车分类
	 */
	 
	public void setQichefenlei(String qichefenlei) {
		this.qichefenlei = qichefenlei;
	}
	
	/**
	 * 获取：汽车分类
	 */
	public String getQichefenlei() {
		return qichefenlei;
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
	 * 设置：汽车颜色
	 */
	 
	public void setQicheyanse(String qicheyanse) {
		this.qicheyanse = qicheyanse;
	}
	
	/**
	 * 获取：汽车颜色
	 */
	public String getQicheyanse() {
		return qicheyanse;
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
	 * 设置：天窗
	 */
	 
	public void setTianchuang(String tianchuang) {
		this.tianchuang = tianchuang;
	}
	
	/**
	 * 获取：天窗
	 */
	public String getTianchuang() {
		return tianchuang;
	}
				
	
	/**
	 * 设置：换挡方式
	 */
	 
	public void setHuandangfangshi(String huandangfangshi) {
		this.huandangfangshi = huandangfangshi;
	}
	
	/**
	 * 获取：换挡方式
	 */
	public String getHuandangfangshi() {
		return huandangfangshi;
	}
				
	
	/**
	 * 设置：座位
	 */
	 
	public void setZuowei(String zuowei) {
		this.zuowei = zuowei;
	}
	
	/**
	 * 获取：座位
	 */
	public String getZuowei() {
		return zuowei;
	}
				
	
	/**
	 * 设置：汽车排量
	 */
	 
	public void setQichepailiang(String qichepailiang) {
		this.qichepailiang = qichepailiang;
	}
	
	/**
	 * 获取：汽车排量
	 */
	public String getQichepailiang() {
		return qichepailiang;
	}
				
	
	/**
	 * 设置：上市年份
	 */
	 
	public void setShangshinianfen(String shangshinianfen) {
		this.shangshinianfen = shangshinianfen;
	}
	
	/**
	 * 获取：上市年份
	 */
	public String getShangshinianfen() {
		return shangshinianfen;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：汽车详情
	 */
	 
	public void setQichexiangqing(String qichexiangqing) {
		this.qichexiangqing = qichexiangqing;
	}
	
	/**
	 * 获取：汽车详情
	 */
	public String getQichexiangqing() {
		return qichexiangqing;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
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
