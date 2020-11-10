package com.goxda.check.encapsulation;

import lombok.Data;

@Data
public class Authorization {
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
}
