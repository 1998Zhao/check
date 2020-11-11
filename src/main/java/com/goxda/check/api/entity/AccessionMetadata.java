package com.goxda.check.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
 * @since 2020-11-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class AccessionMetadata implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 签收
     */
    private String signFor;

    /**
     * 登记
     */
    private String register;

    /**
     * 初审
     */
    private String firstCheck;

    /**
     * 承办
     */
    private String undertake;

    /**
     * 传阅
     */
    private String circulate;

    /**
     * 催办
     */
    private String reminder;

    /**
     * 答复
     */
    private String reply;

}
