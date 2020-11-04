package com.goxda.check.metadate;

/**
 *
 * @author zgq
 */
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

    public String getRightsManagement() {
        return rightsManagement;
    }

    public void setRightsManagement(String rightsManagement) {
        this.rightsManagement = rightsManagement;
    }

    public String getIntellectualPropertyStatement() {
        return intellectualPropertyStatement;
    }

    public void setIntellectualPropertyStatement(String intellectualPropertyStatement) {
        this.intellectualPropertyStatement = intellectualPropertyStatement;
    }

    public String getAuthorizedAgent() {
        return authorizedAgent;
    }

    public void setAuthorizedAgent(String authorizedAgent) {
        this.authorizedAgent = authorizedAgent;
    }

    public String getPermissionAssignment() {
        return permissionAssignment;
    }

    public void setPermissionAssignment(String permissionAssignment) {
        this.permissionAssignment = permissionAssignment;
    }

    public String getControlIdentifier() {
        return controlIdentifier;
    }

    public void setControlIdentifier(String controlIdentifier) {
        this.controlIdentifier = controlIdentifier;
    }
}
