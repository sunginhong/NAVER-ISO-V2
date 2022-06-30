package com.example.naver_iso_v2;

import android.content.ContentValues;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

public class NetworkTask extends AsyncTask<Void, Void, String> {
    Context ctx;
    String url;
    ContentValues values;

    NetworkTask(String url, ContentValues values){
        this.url = url;
        this.values = values;
    }

    @Override
    protected String doInBackground(Void... params) {
        String result; // 요청 결과를 저장할 변수.
        RequestHttpURLConnection requestHttpURLConnection = new RequestHttpURLConnection();
        result = requestHttpURLConnection.request(url, values);
        return result; // 결과가 여기에 담깁니다. 아래 onPostExecute()의 파라미터로 전달됩니다.
    }

    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);
        System.out.println("SDASDADAS"+result);
    }
}
