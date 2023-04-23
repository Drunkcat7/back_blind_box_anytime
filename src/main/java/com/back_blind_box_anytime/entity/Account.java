package com.back_blind_box_anytime.entity;

import java.io.Serializable;

/**
 * (Account)实体类
 *
 * @author makejava
 * @since 2023-04-23 11:36:32
 */
public class Account implements Serializable {
    private static final long serialVersionUID = -20395639229409357L;
    /**
     * 用户id
     */
    private Integer uid;
    /**
     * 用户名
     */
    private String user;
    /**
     * 密码
     */
    private String password;
    /**
     * 钻石(钱)
     */
    private Double diamond;


    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getDiamond() {
        return diamond;
    }

    public void setDiamond(Double diamond) {
        this.diamond = diamond;
    }

}
