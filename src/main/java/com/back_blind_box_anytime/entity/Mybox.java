package com.back_blind_box_anytime.entity;

import java.io.Serializable;

/**
 * (Mybox)实体类
 *
 * @author makejava
 * @since 2023-04-23 22:58:34
 */
public class Mybox implements Serializable {
    private static final long serialVersionUID = 895537604162566844L;
    /**
     * 我的盲盒id
     */
    private Integer myboxId;
    /**
     * 用户id
     */
    private Integer uid;
    /**
     * 系列id
     */
    private Integer seriesId;
    /**
     * 商品id
     */
    private Integer goodsId;
    /**
     * 状态(0默认、1卖出反盒、2购入商品)
     */
    private Integer status;


    public Integer getMyboxId() {
        return myboxId;
    }

    public void setMyboxId(Integer myboxId) {
        this.myboxId = myboxId;
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

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
