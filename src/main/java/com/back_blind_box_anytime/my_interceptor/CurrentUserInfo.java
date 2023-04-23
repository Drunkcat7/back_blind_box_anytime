package com.back_blind_box_anytime.my_interceptor;

/**
 * 用户实体类
 */
public class CurrentUserInfo {
    Integer uid;
    String user;

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
}
