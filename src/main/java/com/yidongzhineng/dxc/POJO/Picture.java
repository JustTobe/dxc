package com.yidongzhineng.dxc.POJO;

public class Picture extends PictureKey {
    private String picPath;

    public Picture(Integer picId, Integer sellerId, String picPath) {
        super(picId, sellerId);
        this.picPath = picPath;
    }

    public Picture() {
        super();
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath == null ? null : picPath.trim();
    }
}