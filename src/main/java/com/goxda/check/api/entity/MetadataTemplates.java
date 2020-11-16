package com.goxda.check.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author ah
 * @since 2020-11-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class MetadataTemplates implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 模版名称
     */
    private String templatesName;

    /**
     * 编号
     */
    private String metadataNum;

    /**
     * 元数据中文名称
     */
    @TableField("metadata_name_CN")
    private String metadataNameCn;

    /**
     * 名称
     */
    private String metadataName;

    /**
     * 约束性
     */
    private String metadataRestriction;

    /**
     * 重复性
     */
    private String metedataRepeat;

    /**
     * 元素类型
     */
    private String metadataElementType;

    /**
     * 数据类型
     */
    private String metadataDataType;

    /**
     * 数据长度
     */
    private Integer metadataDataLength;

    /**
     * 数据值域
     */
    private String metadataDataRange;


}
