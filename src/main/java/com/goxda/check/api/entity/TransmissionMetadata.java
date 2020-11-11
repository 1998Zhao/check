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
public class TransmissionMetadata implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 起草
     */
    private String draft;

    /**
     * 审核
     */
    private String check;

    /**
     * 签发
     */
    private String signDistribution;

    /**
     * 复核
     */
    private String review;

    /**
     * 登记
     */
    private String register;

    /**
     * 用印
     */
    private String seal;

    /**
     * 核发
     */
    private String issuance;
    /**
     * 元数据id
     */
    private Integer metadataId;

}
