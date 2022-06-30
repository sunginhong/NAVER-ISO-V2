package com.example.naver_iso_v2;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;

import com.airbnb.lottie.LottieAnimationView;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;
import com.journeyapps.barcodescanner.BarcodeEncoder;
import com.journeyapps.barcodescanner.ScanOptions;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;


public class Activity_LottieView extends AppCompatActivity {

    public static Context ctx;
    LinearLayout contain_ll;
    WebView wv;
    LottieAnimationView lv_view;
    IntentIntegrator integrator;
    String getLottieUrl;

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
            Toast.makeText(ctx, "Scanned: " + getLottieUrl, Toast.LENGTH_SHORT).show();
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
//        integrator.initiateScan();
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
//                Toast.makeText(this, "Scanned: " + htmlPageUrl, Toast.LENGTH_SHORT).show();
//                Toast.makeText(this, "Scanned: " + result.getContents(), Toast.LENGTH_SHORT).show();
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