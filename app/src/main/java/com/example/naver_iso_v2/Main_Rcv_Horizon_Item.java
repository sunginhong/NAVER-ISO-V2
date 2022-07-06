package com.example.naver_iso_v2;

public class Main_Rcv_Horizon_Item {
    private int mImg;
    private String mTitle;

    public Main_Rcv_Horizon_Item(int mImg, String mTitle) {
        this.mImg = mImg;
        this.mTitle= mTitle;
    }

    public int getImg() {
        return mImg;
    }

    public void setImg(int img) {
        this.mImg = img;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

}