package com.entity.view;

import com.entity.CaipinEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 菜品
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("caipin")
public class CaipinView extends CaipinEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 一级分类的值
		*/
		private String caipinValue;
		/**
		* 二级分类的值
		*/
		private String caipinErjiValue;
		/**
		* 是否上架的值
		*/
		private String shangxiaValue;



	public CaipinView() {

	}

	public CaipinView(CaipinEntity caipinEntity) {
		try {
			BeanUtils.copyProperties(this, caipinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 一级分类的值
			*/
			public String getCaipinValue() {
				return caipinValue;
			}
			/**
			* 设置： 一级分类的值
			*/
			public void setCaipinValue(String caipinValue) {
				this.caipinValue = caipinValue;
			}
			/**
			* 获取： 二级分类的值
			*/
			public String getCaipinErjiValue() {
				return caipinErjiValue;
			}
			/**
			* 设置： 二级分类的值
			*/
			public void setCaipinErjiValue(String caipinErjiValue) {
				this.caipinErjiValue = caipinErjiValue;
			}
			/**
			* 获取： 是否上架的值
			*/
			public String getShangxiaValue() {
				return shangxiaValue;
			}
			/**
			* 设置： 是否上架的值
			*/
			public void setShangxiaValue(String shangxiaValue) {
				this.shangxiaValue = shangxiaValue;
			}











}
