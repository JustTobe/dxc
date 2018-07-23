package com.yidongzhineng.dxc.POJO;

public class ConllctionKey {
    private Integer userId;

    private Integer sellerId;

    public ConllctionKey(Integer userId, Integer sellerId) {
        this.userId = userId;
        this.sellerId = sellerId;
    }

    public ConllctionKey() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }
}