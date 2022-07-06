package com.example.naver_iso_v2;

public class ArrayListCustom {
    String imgUrl;
    String listTitle;

    public ArrayListCustom(){

    }
    public ArrayListCustom(String url, String title){
        imgUrl = url;
        listTitle = title;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getListTitle(){
        return listTitle;
    }

    public void setImgUrl(){
        this.imgUrl = imgUrl;
    }

    public void setListTitle(){
        this.listTitle = listTitle;
    }
}
