package com.iwater.domain.model;

import java.io.Serializable;

/**
 * Created by wangchuanhai on 2017/6/29.
 */
public class PermissionBean implements Serializable {
    private static final long serialVersionUID = -4998693310458093708L;

    private String id; // 主键,权限ID
    private String permissionName; // 权限名称
    private Integer status; // 状态 0-禁用 1-使用
    private String createTime; // 创建时间
    private String updateTime; // 修改时间

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "PermissionBean{" +
                "id='" + id + '\'' +
                ", permissionName='" + permissionName + '\'' +
                ", status=" + status +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                '}';
    }
}
