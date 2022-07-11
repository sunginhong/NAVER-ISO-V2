package com.example.naver_iso_v2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;

import java.io.File;
import java.util.ArrayList;

public class Element_PopupActivity extends Activity {

    Context ctx;
    CardView element_popupll;
    public static String codeLine1;
    public static String codeLine2;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        ctx = this.getApplicationContext();

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.element_popup_activity);

        View view = getWindow().getDecorView();

        element_popupll = (CardView) findViewById(R.id.element_popupll);
        final TextView result_title = (TextView) findViewById(R.id.element_result_title);
        final TextView result_in_motion_li0 = (TextView) findViewById(R.id.element_result_in_li0);
        final TextView result_in_motion_li1 = (TextView) findViewById(R.id.element_result_in_li1);
        final TextView result_in_motion_li2 = (TextView) findViewById(R.id.element_result_in_li2);
        final TextView result_in_motion_li3 = (TextView) findViewById(R.id.element_result_in_li3);
        final TextView result_in_motion_li4 = (TextView) findViewById(R.id.element_result_in_li4);

        final TextView result_out_motion_li0 = (TextView) findViewById(R.id.element_result_out_li0);
        final TextView result_out_motion_li1 = (TextView) findViewById(R.id.element_result_out_li1);
        final TextView result_out_motion_li2 = (TextView) findViewById(R.id.element_result_out_li2);
        final TextView result_out_motion_li3 = (TextView) findViewById(R.id.element_result_out_li3);
        final TextView result_out_motion_li4 = (TextView) findViewById(R.id.element_result_out_li4);

        Window window = getWindow();
        if( window != null ) {
            window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

            WindowManager.LayoutParams params = window.getAttributes();
            params.width = WindowManager.LayoutParams.MATCH_PARENT;
            params.height = WindowManager.LayoutParams.MATCH_PARENT;

            window.setAttributes(params);
            window.setGravity( Gravity.CENTER );

            Animation animation = AnimationUtils.loadAnimation(ctx,R.anim.popup_open);
            element_popupll.startAnimation(animation);
        }

        Intent intent = getIntent();
        ArrayList<String> ReceiveArr = intent.getStringArrayListExtra("ArrayList");
        for (int i = 0; i < ReceiveArr.size(); i++) {
            System.out.println(ReceiveArr.get(i));
        }
        result_title.setText(ReceiveArr.get(0));
        result_in_motion_li0.setText(ReceiveArr.get(1));
        result_in_motion_li1.setText(ReceiveArr.get(2));
        result_in_motion_li2.setText(ReceiveArr.get(3));
        result_in_motion_li3.setText(ReceiveArr.get(4));
        result_in_motion_li4.setText(ReceiveArr.get(5));
        result_out_motion_li0.setText(ReceiveArr.get(6));
        result_out_motion_li1.setText(ReceiveArr.get(7));
        result_out_motion_li2.setText(ReceiveArr.get(8));
        result_out_motion_li3.setText(ReceiveArr.get(9));
        result_out_motion_li4.setText(ReceiveArr.get(10));

        FrameLayout element_result_closebtn = findViewById(R.id.element_result_closebtn);
        element_result_closebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mOnClose(v);
            }
        });

        FrameLayout element_result_capture = findViewById(R.id.element_result_capture);
        element_result_capture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                File screenShot = Result_Capture.ScreenShot(view);
                if(screenShot!=null){
                    Toast.makeText(getApplicationContext(), "현재 화면이 갤러리에 저장 되었습니다.", Toast.LENGTH_SHORT).show();
                    sendBroadcast(new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE, Uri.fromFile(screenShot)));
                }
            }
        });
    }

    public void mOnClose(View V){
        closeAanim();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        if (event.getAction()==MotionEvent.ACTION_OUTSIDE){
            return false;
        }
        return true;
    }

    @Override
    public void onBackPressed() {
        closeAanim();
    }

    public void closeAanim(){
        Animation animation = AnimationUtils.loadAnimation(ctx,R.anim.popup_close);
        element_popupll.startAnimation(animation);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
                element_popupll.setAlpha(0);
            }
        }, 150);
    }

}
