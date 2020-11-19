package com.goxda.check.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableId;
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
 * @since 2020-11-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class MetadataRulePkg implements Serializable, IMetadataRule {

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
     * 层次模型
     */
    private String levelModel;

    /**
     * XML元素属性
     */
    private String elementAttr;
    /**
     * 源代码
     */
    private String sourceCode;

    /**
     * 类型 此处为元数据类型 文书类 照片类 录音录像类
     */
    private String type;

    /**
     * 条件
     */
    private String conditions;

    /**
     * 相关正则
     */
    private String regex;




}
