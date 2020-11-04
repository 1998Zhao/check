package com.goxda.check.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author ah
 * @since 2020-11-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CheckStep implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 名称 例如：归档环节
     */
    private String name;

    /**
     * 父节点id
     */
    private Integer parentStepId;

    /**
     * 是否被选取
     */
    private Integer selected;

    /**
     * 代码 例如：归档环节代码 5.1
     */
    private String code;

    /**
     * 对应的方法名和所属类名
     */
    private String function;

    /**
     * 显示
     */
    private String show;

    /**
     * 子节点
     */
    private transient List<CheckStep> steps;

}
