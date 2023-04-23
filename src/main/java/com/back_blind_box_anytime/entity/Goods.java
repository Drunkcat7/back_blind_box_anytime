package com.back_blind_box_anytime.entity;

import java.io.Serializable;

/**
 * (Goods)实体类
 *
 * @author makejava
 * @since 2023-04-23 15:42:29
 */
public class Goods implements Serializable {
    private static final long serialVersionUID = 198154488551148456L;
    /**
     * 商品id
     */
    private Integer goodsId;
    /**
     * 系列id
     */
    private Integer seriesId;
    /**
     * 商品图
     */
    private String goodsImg;
    /**
     * 商品名
     */
    private String goodsName;
    /**
     * 回收价格
     */
    private Double recoveryPrice;
    /**
     * 稀有性
     */
    private Integer rare;


    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(Integer seriesId) {
        this.seriesId = seriesId;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Double getRecoveryPrice() {
        return recoveryPrice;
    }

    public void setRecoveryPrice(Double recoveryPrice) {
        this.recoveryPrice = recoveryPrice;
    }

    public Integer getRare() {
        return rare;
    }

    public void setRare(Integer rare) {
        this.rare = rare;
    }

}
