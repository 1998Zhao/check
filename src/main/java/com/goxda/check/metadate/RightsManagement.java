package com.goxda.check.metadate;

import com.goxda.check.encapsulation.Authorization;
import lombok.Data;

/**
 *
 * @author zgq
 */
@Data
public class RightsManagement implements IMetadata{
    /**
     * 知识产权说明
     * 电子文件所涉及或具有的有关知识产权的描述
     */
    private String intellectualPropertyStatement;
    private Authorization authorization;
    /**
     * 控制标识
     * 电子文件是否公开、开放或控制使用的标识
     */
    private String controlIdentifier;


}
