package com.goxda.check.api.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author ah
 * @since 2020-11-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SignedObject implements Serializable {

    private static final long serialVersionUID = 1L;

    private String type;

    private String packageTypeDescription;

    private LocalDateTime packageCreationTime;

    private Integer edepId;

    /**
     * 创建 或 修改 EEP包的团体或个人
     */
    private String packageCreator;

    private Integer originalEncapsulationPackageId;


}
