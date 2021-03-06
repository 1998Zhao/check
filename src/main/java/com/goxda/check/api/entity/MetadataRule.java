package com.goxda.check.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import com.goxda.check.api.entity.inte.IMetadataRule;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author ah
 * @since 2020-11-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class MetadataRule implements Serializable, IMetadataRule {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 编号
     */
    private String num;

    /**
     * 中文名称
     */
    @TableField("name_CN")
    private String nameCn;

    /**
     * 英文名称
     */
    private String name;

    /**
     * 定义
     */
    private String definition;

    /**
     * 目的
     */
    private String purpose;

    /**
     * 约束性
     */
    private String constraintion;




    /**
     * 可重复性
     */
    private String repeatability;

    /**
     * 元素类型
     */
    private String elementType;

    /**
     * 数据类型
     */
    private String dataType;

    /**
     * 编码修饰体系
     */
    private String encode;

    /**
     * 值域
     */
    private String valueRange;

    /**
     * 缺省值
     */
    private String defaultValue;

    /**
     * 子元素
     */
    private String subelement;

    /**
     * 信息来源
     */
    private String sourcesOfInformation;

    /**
     * 相关元素
     */
    private String coherentElement;

    /**
     * 注释
     */
    private String comments;
    /**
     * 类型
     */
    private String type;
    /**
     * 相关正则
     */
    private String regex;
    /**
     * 条件
     */
    private String conditions;
}
