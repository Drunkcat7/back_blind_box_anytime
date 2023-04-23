package com.back_blind_box_anytime.entity;

import java.io.Serializable;

/**
 * (Series)实体类
 *
 * @author makejava
 * @since 2023-04-23 14:09:05
 */
public class Series implements Serializable {
    private static final long serialVersionUID = 712434362353353826L;
    /**
     * 系列id
     */
    private Integer seriesId;
    /**
     * 系列名称
     */
    private String seriesName;
    /**
     * 系列主图
     */
    private String mainImg;
    /**
     * 商品价格
     */
    private Double price;


    public Integer getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(Integer seriesId) {
        this.seriesId = seriesId;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public String getMainImg() {
        return mainImg;
    }

    public void setMainImg(String mainImg) {
        this.mainImg = mainImg;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
