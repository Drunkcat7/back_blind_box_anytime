package com.back_blind_box_anytime.entity;

import lombok.Data;

@Data
public class SeriesComment {
    /**
     * 评论的信息
     */
    private String msg;
    /**
     * 用户
     */
    private String user;
    /**
     * 评论id
     */
    private Integer commentId;
}
