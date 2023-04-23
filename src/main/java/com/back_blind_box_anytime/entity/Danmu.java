package com.back_blind_box_anytime.entity;

import java.io.Serializable;

/**
 * (Danmu)实体类
 *
 * @author makejava
 * @since 2023-04-23 15:46:20
 */
public class Danmu implements Serializable {
    private static final long serialVersionUID = -92433847859438150L;
    /**
     * 弹幕id
     */
    private Integer danmuId;
    /**
     * 系列id
     */
    private Integer seriesId;
    /**
     * 弹幕文字
     */
    private String danmuText;


    public Integer getDanmuId() {
        return danmuId;
    }

    public void setDanmuId(Integer danmuId) {
        this.danmuId = danmuId;
    }

    public Integer getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(Integer seriesId) {
        this.seriesId = seriesId;
    }

    public String getDanmuText() {
        return danmuText;
    }

    public void setDanmuText(String danmuText) {
        this.danmuText = danmuText;
    }

}
