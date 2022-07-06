package com.example.naver_iso_v2;

public class Main_Rcv_Vertical_Item {
    private int mImg;
    private String mTitle;
    private String mSummary;

    public Main_Rcv_Vertical_Item(int mImg, String mTitle, String mSummary) {
        this.mImg = mImg;
        this.mTitle= mTitle;
        this.mSummary= mSummary;
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

    public String getmSummary() {
        return mSummary;
    }

    public void setmSummary(String mSummary) {
        this.mSummary = mSummary;
    }
}