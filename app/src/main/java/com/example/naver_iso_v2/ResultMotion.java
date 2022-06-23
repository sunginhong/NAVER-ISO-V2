package com.example.naver_iso_v2;

public class ResultMotion {
    private int index;
    private String title;

    public ResultMotion(int index, String title) {
        this.index = index;
        this.title = title;

    }

    public int getIndex() {
        return index;
    }

    public String getTitle() {
        return title;
    }
}