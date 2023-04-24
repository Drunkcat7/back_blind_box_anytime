package com.back_blind_box_anytime.entity;

import lombok.Data;

@Data
public class HitGoods {
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
    /**
     * 状态(0默认、1卖出反盒、2购入商品)
     */
    private Integer status;
    /**
     * 我的盲盒id
     */
    private Integer myboxId;


}
