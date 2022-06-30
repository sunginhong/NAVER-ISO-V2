package com.example.naver_iso_v2;

import android.os.AsyncTask;
import android.util.Log;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class JsoupAsyncTask extends AsyncTask<Void, Void, String> {

    private String htmlContentInStringFormat;
    private String link;

    public JsoupAsyncTask(String url) {
        this.link = url;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected String doInBackground(Void... voids) {
        StringBuilder sb=new StringBuilder();
        //실시간 검색어를 가져오기위한 String객체(String 과는 차이가 있음)
        try {
            Document doc= Jsoup.connect("http://www.naver.com/").get();
            Elements els=doc.select(".ah_l .ah_item"); //클래스는 .
            for(Element e:els){
                sb.append(e.select(".ah_r").text())
                        .append(".")
                        .append(e.select(".ah_k").text())
                        .append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    @Override
    protected void onPostExecute(String result) {
        System.out.println("sdssda"+result);
    }
}

//https://hiruby.tistory.com/365