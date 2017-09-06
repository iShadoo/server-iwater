package com.iwater.domain.model;

import java.io.Serializable;

/**
 * Created by wangchuanhai on 2017/6/29.
 */
public class RoleBean implements Serializable {
    private static final long serialVersionUID = -8571119991633233572L;

    private String id; // 主键,角色ID
    private String role_name; // 角色名称
    private String create_time; // 创建时间
    private String update_time; // 修改时间
    private Integer status; // 状态 0-禁用 1-使用

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "RoleBean{" +
                "id='" + id + '\'' +
                ", role_name='" + role_name + '\'' +
                ", create_time='" + create_time + '\'' +
                ", update_time='" + update_time + '\'' +
                ", status=" + status +
                '}';
    }
}
