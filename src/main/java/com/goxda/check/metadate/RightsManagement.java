package com.goxda.check.metadate;

import lombok.Data;

/**
 *
 * @author zgq
 */
@Data
public class RightsManagement implements IMetadata{
    private String rightsManagement;
    /**
     * 知识产权说明
     * 电子文件所涉及或具有的有关知识产权的描述
     */
    private String intellectualPropertyStatement;
    /**
     * 授权对象
     * 被授权操作、利用电子文件的组织和个人
     */
    private String authorizedAgent;
    /**
     * 授权行为
     * 授权对象被授予的对电子文件操作和利用的行为类型
     */
    private String permissionAssignment;
    /**
     * 控制标识
     * 电子文件是否公开、开放或控制使用的标识
     */
    private String controlIdentifier;


}
