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
 * 菜品
 *
 * @author 
 * @email
 */
@TableName("caipin")
public class CaipinEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public CaipinEntity() {

	}

	public CaipinEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 菜品名称
     */
    @TableField(value = "caipin_name")

    private String caipinName;


    /**
     * 菜品照片
     */
    @TableField(value = "caipin_photo")

    private String caipinPhoto;


    /**
     * 一级分类
     */
    @TableField(value = "caipin_types")

    private Integer caipinTypes;


    /**
     * 二级分类
     */
    @TableField(value = "caipin_erji_types")

    private Integer caipinErjiTypes;


    /**
     * 菜品库存
     */
    @TableField(value = "caipin_kucun_number")

    private Integer caipinKucunNumber;


    /**
     * 购买获得积分
     */
    @TableField(value = "caipin_price")

    private Integer caipinPrice;


    /**
     * 菜品原价
     */
    @TableField(value = "caipin_old_money")

    private Double caipinOldMoney;


    /**
     * 现价/积分
     */
    @TableField(value = "caipin_new_money")

    private Double caipinNewMoney;


    /**
     * 点击次数
     */
    @TableField(value = "caipin_clicknum")

    private Integer caipinClicknum;


    /**
     * 是否上架
     */
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    @TableField(value = "caipin_delete")

    private Integer caipinDelete;


    /**
     * 菜品简介
     */
    @TableField(value = "caipin_content")

    private String caipinContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：菜品名称
	 */
    public String getCaipinName() {
        return caipinName;
    }


    /**
	 * 获取：菜品名称
	 */

    public void setCaipinName(String caipinName) {
        this.caipinName = caipinName;
    }
    /**
	 * 设置：菜品照片
	 */
    public String getCaipinPhoto() {
        return caipinPhoto;
    }


    /**
	 * 获取：菜品照片
	 */

    public void setCaipinPhoto(String caipinPhoto) {
        this.caipinPhoto = caipinPhoto;
    }
    /**
	 * 设置：一级分类
	 */
    public Integer getCaipinTypes() {
        return caipinTypes;
    }


    /**
	 * 获取：一级分类
	 */

    public void setCaipinTypes(Integer caipinTypes) {
        this.caipinTypes = caipinTypes;
    }
    /**
	 * 设置：二级分类
	 */
    public Integer getCaipinErjiTypes() {
        return caipinErjiTypes;
    }


    /**
	 * 获取：二级分类
	 */

    public void setCaipinErjiTypes(Integer caipinErjiTypes) {
        this.caipinErjiTypes = caipinErjiTypes;
    }
    /**
	 * 设置：菜品库存
	 */
    public Integer getCaipinKucunNumber() {
        return caipinKucunNumber;
    }


    /**
	 * 获取：菜品库存
	 */

    public void setCaipinKucunNumber(Integer caipinKucunNumber) {
        this.caipinKucunNumber = caipinKucunNumber;
    }
    /**
	 * 设置：购买获得积分
	 */
    public Integer getCaipinPrice() {
        return caipinPrice;
    }


    /**
	 * 获取：购买获得积分
	 */

    public void setCaipinPrice(Integer caipinPrice) {
        this.caipinPrice = caipinPrice;
    }
    /**
	 * 设置：菜品原价
	 */
    public Double getCaipinOldMoney() {
        return caipinOldMoney;
    }


    /**
	 * 获取：菜品原价
	 */

    public void setCaipinOldMoney(Double caipinOldMoney) {
        this.caipinOldMoney = caipinOldMoney;
    }
    /**
	 * 设置：现价/积分
	 */
    public Double getCaipinNewMoney() {
        return caipinNewMoney;
    }


    /**
	 * 获取：现价/积分
	 */

    public void setCaipinNewMoney(Double caipinNewMoney) {
        this.caipinNewMoney = caipinNewMoney;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getCaipinClicknum() {
        return caipinClicknum;
    }


    /**
	 * 获取：点击次数
	 */

    public void setCaipinClicknum(Integer caipinClicknum) {
        this.caipinClicknum = caipinClicknum;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getCaipinDelete() {
        return caipinDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setCaipinDelete(Integer caipinDelete) {
        this.caipinDelete = caipinDelete;
    }
    /**
	 * 设置：菜品简介
	 */
    public String getCaipinContent() {
        return caipinContent;
    }


    /**
	 * 获取：菜品简介
	 */

    public void setCaipinContent(String caipinContent) {
        this.caipinContent = caipinContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Caipin{" +
            "id=" + id +
            ", caipinName=" + caipinName +
            ", caipinPhoto=" + caipinPhoto +
            ", caipinTypes=" + caipinTypes +
            ", caipinErjiTypes=" + caipinErjiTypes +
            ", caipinKucunNumber=" + caipinKucunNumber +
            ", caipinPrice=" + caipinPrice +
            ", caipinOldMoney=" + caipinOldMoney +
            ", caipinNewMoney=" + caipinNewMoney +
            ", caipinClicknum=" + caipinClicknum +
            ", shangxiaTypes=" + shangxiaTypes +
            ", caipinDelete=" + caipinDelete +
            ", caipinContent=" + caipinContent +
            ", createTime=" + createTime +
        "}";
    }
}
