package com.back_blind_box_anytime.entity;

import java.io.Serializable;

/**
 * (Probability)实体类
 *
 * @author makejava
 * @since 2023-04-23 22:07:03
 */
public class Probability implements Serializable {
    private static final long serialVersionUID = -49074138673425283L;
    /**
     * 概率id
     */
    private Integer probabilityId;
    /**
     * 系列id
     */
    private Integer seriesId;
    /**
     * 隐藏款概率
     */
    private Integer probability;


    public Integer getProbabilityId() {
        return probabilityId;
    }

    public void setProbabilityId(Integer probabilityId) {
        this.probabilityId = probabilityId;
    }

    public Integer getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(Integer seriesId) {
        this.seriesId = seriesId;
    }

    public Integer getProbability() {
        return probability;
    }

    public void setProbability(Integer probability) {
        this.probability = probability;
    }

}
