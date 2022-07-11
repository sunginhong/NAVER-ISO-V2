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
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Interaction_PopupActivity extends Activity {

    Context ctx;
    CardView interaction_popupll;
    public static String codeLine1;
    public static String codeLine2;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        ctx = this.getApplicationContext();

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.element_popup_activity);

        View rootView = getWindow().getDecorView();

        interaction_popupll = (CardView) findViewById(R.id.interaction_popupll);
        final TextView result_title = (TextView) findViewById(R.id.result_title);
        final TextView result_in_motion_li0 = (TextView) findViewById(R.id.result_in_motion_li0);
        final TextView result_in_motion_li1 = (TextView) findViewById(R.id.result_in_motion_li1);
        final TextView result_in_motion_li2 = (TextView) findViewById(R.id.result_in_motion_li2);
        final TextView result_in_motion_li3 = (TextView) findViewById(R.id.result_in_motion_li3);
        final TextView result_in_motion_li4 = (TextView) findViewById(R.id.result_in_motion_li4);
        final TextView result_in_motion_li5 = (TextView) findViewById(R.id.result_in_motion_li5);
        final TextView result_out_motion_li0 = (TextView) findViewById(R.id.result_out_motion_li0);
        final TextView result_out_motion_li1 = (TextView) findViewById(R.id.result_out_motion_li1);
        final TextView result_out_motion_li2 = (TextView) findViewById(R.id.result_out_motion_li2);
        final TextView result_out_motion_li3 = (TextView) findViewById(R.id.result_out_motion_li3);
        final TextView result_out_motion_li4 = (TextView) findViewById(R.id.result_out_motion_li4);
        final TextView result_out_motion_li5 = (TextView) findViewById(R.id.result_out_motion_li5);

        Window window = getWindow();
        if( window != null ) {
            window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

            WindowManager.LayoutParams params = window.getAttributes();
            params.width = WindowManager.LayoutParams.MATCH_PARENT;
            params.height = WindowManager.LayoutParams.MATCH_PARENT;

            window.setAttributes(params);
            window.setGravity( Gravity.CENTER );

            Animation animation = AnimationUtils.loadAnimation(ctx,R.anim.popup_open);
            interaction_popupll.startAnimation(animation);
        }

        Intent intent = getIntent();
        ArrayList<String> ReceiveArr = intent.getStringArrayListExtra("ArrayList");

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

        LinearLayout result_closebtn = findViewById(R.id.result_closebtn);
        result_closebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mOnClose(v);
            }
        });

        LinearLayout result_capture = findViewById(R.id.result_capture);
        result_capture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                File screenShot = Result_Capture.ScreenShot(rootView);
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
        interaction_popupll.startAnimation(animation);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
                interaction_popupll.setAlpha(0);
            }
        }, 150);
    }

}
