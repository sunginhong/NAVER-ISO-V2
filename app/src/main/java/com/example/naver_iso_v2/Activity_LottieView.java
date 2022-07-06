package com.example.naver_iso_v2;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;


public class Activity_LottieView extends AppCompatActivity {

    public static Context ctx;
    LinearLayout contain_ll;
    WebView wv;
    LottieAnimationView lv_view;
    IntentIntegrator integrator;
    String getLottieUrl;
    Button play_btn1;
    Button play_btn2;
    Button play_btn3;
    Button play_btn4;
    boolean lvLoop = true;

    class RealTask extends AsyncTask<Void,Void,String> {
        private String Url;
        public RealTask(String url) {
            this.Url = url;
        }

        @Override
        protected String doInBackground(Void... voids) {
            String path = null;
            try {
                Document doc = Jsoup.connect(Url).get();
//                Document doc = Jsoup.connect("https://lottiefiles.com/110855-cube-animation/").get();
                Elements els = doc.select("lf-player"); //클래스는 .
                path = els.first().absUrl("path");
                getLottieUrl = path;
            } catch (IOException e) {
                e.printStackTrace();
            }
            return path;
        }

        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);
            getLottieUrl = result;
            lv_view.setAnimationFromUrl(getLottieUrl);
            lv_view.loop(true);
            lv_view.playAnimation();
            lvLoop = true;
//            Toast.makeText(ctx, "Scanned: " + getLottieUrl, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottie_view);
        ctx = this.getApplicationContext();
        contain_ll = findViewById(R.id.contain_ll);
        wv = findViewById(R.id.wv);
        lv_view = findViewById(R.id.lv_view);
        play_btn1 = findViewById(R.id.play_btn1);
        play_btn2 = findViewById(R.id.play_btn2);
        play_btn3 = findViewById(R.id.play_btn3);
        play_btn4 = findViewById(R.id.play_btn4);

        WebSettings webSettings = wv.getSettings();

        //자바 스크립트 사용을 할 수 있도록 합니다.
        webSettings.setJavaScriptEnabled(true);

        integrator = new IntentIntegrator(this);
        //바코드 안의 텍스트
        integrator.setPrompt("바코드를 사각형 안에 비춰주세요");
        //바코드 인식시 소리 여부
        integrator.setBeepEnabled(false);
        integrator.setBarcodeImageEnabled(true);
//        integrator.setCaptureActivity(CaptureActivity.class);
        //바코드 스캐너 시작
        integrator.initiateScan();

        play_btn1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                integrator.initiateScan();
                lvLoop = true;
            }
        });
        play_btn2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (lvLoop){
                    lvLoop = false;
                } else {
                    lvLoop = true;
                }
                lv_view.loop(lvLoop);
                lv_view.setProgress(0);
                lv_view.setSpeed(1);
                lv_view.playAnimation();
            }
        });
        play_btn3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                lvLoop = false;
                lv_view.loop(false);
                lv_view.setProgress(0);
                lv_view.setSpeed(1);
                lv_view.playAnimation();
            }
        });
        play_btn4.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                lvLoop = false;
                lv_view.loop(false);
                lv_view.setProgress(1);
                lv_view.setSpeed(-1);
                lv_view.playAnimation();
            }
        });
    }

    @Override
    public void onBackPressed() {
        finish();
        pageOutAnim();
    }

    void pageOutAnim(){
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right_case2);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if(result != null){
            if(result.getContents() == null){
            }else{
                new RealTask(result.getContents()).execute();
            }
        }else{
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    public void changeBgColor(View v) {
        int id = v.getId();
        if (id == R.id.lottie_color_0) {
            contain_ll.setBackgroundColor(LottieSelBottom_Menu.lottie_color_hex0);
        }
        if (id == R.id.lottie_color_1) {
            contain_ll.setBackgroundColor(LottieSelBottom_Menu.lottie_color_hex1);
        }
        if (id == R.id.lottie_color_2) {
            contain_ll.setBackgroundColor(LottieSelBottom_Menu.lottie_color_hex2);
        }
        if (id == R.id.lottie_color_3) {
            contain_ll.setBackgroundColor(LottieSelBottom_Menu.lottie_color_hex3);
        }
        if (id == R.id.lottie_color_4) {
            contain_ll.setBackgroundColor(LottieSelBottom_Menu.lottie_color_hex4);
        }
        if (id == R.id.lottie_color_5) {
            contain_ll.setBackgroundColor(LottieSelBottom_Menu.lottie_color_hex5);
        }

    }
}