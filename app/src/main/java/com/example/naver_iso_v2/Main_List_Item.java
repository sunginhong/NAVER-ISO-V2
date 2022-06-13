package com.example.naver_iso_v2;

public class Main_List_Item {
    private String title;
    private String summary;
    private String thumb_url;

    public Main_List_Item(String title, String thumb_url, String summary) {
        this.title = title;
        this.summary = summary;
        this.thumb_url = thumb_url;
    }

    public String getTitle() {
        return title;
    }

    public String getSummary() {
        return summary;
    }

    public String getThumb_url() {
        return thumb_url;
    }
}