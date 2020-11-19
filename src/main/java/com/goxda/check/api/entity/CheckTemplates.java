package com.goxda.check.api.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class CheckTemplates implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 模板名称
     */
    private String templatesName;

    /**
     * 类名  例如 完整性
     */
    private String className;

    /**
     * 编号 例如 ZQ-1-1
     */
    private String stepNum;

    /**
     * 描述 著录项目数据长度检测
     */
    private String stepDesc;


}
