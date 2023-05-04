package com.back_blind_box_anytime.entity;

import java.io.Serializable;

/**
 * (Comments)实体类
 *
 * @author makejava
 * @since 2023-05-04 08:53:29
 */
public class Comments implements Serializable {
    private static final long serialVersionUID = -51217664926819382L;
    /**
     * 评论id
     */
    private Integer commentId;
    /**
     * 评论的信息
     */
    private String msg;
    /**
     * 用户id
     */
    private Integer uid;
    /**
     * 系列id
     */
    private Integer seriesId;


    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(Integer seriesId) {
        this.seriesId = seriesId;
    }

}

