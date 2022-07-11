package com.example.naver_iso_v2.TYPE2;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.example.naver_iso_v2.R;

import java.util.ArrayList;

//https://ghj1001020.tistory.com/9

public class Haptic_PopupActivity extends Activity {

    Context ctx;
    CardView haptic_popupll;
    public static String codeLine1;
    public static String codeLine2;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        ctx = this.getApplicationContext();

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.haptic_popup_activity);

        haptic_popupll = (CardView) findViewById(R.id.haptic_popupll);
        final TextView haptic_title = (TextView) findViewById(R.id.haptic_title);
        final TextView haptic_subTitle = (TextView) findViewById(R.id.haptic_subtitle);
        final TextView haptic_code_line1 = (TextView) findViewById(R.id.haptic_code_line1);
        final TextView haptic_code_line2 = (TextView) findViewById(R.id.haptic_code_line2);

        haptic_code_line1.setText(codeLine1);
        haptic_code_line2.setText(codeLine2);

        Window window = getWindow();
        if( window != null ) {
            window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

            WindowManager.LayoutParams params = window.getAttributes();
            params.width = WindowManager.LayoutParams.MATCH_PARENT;
            params.height = WindowManager.LayoutParams.MATCH_PARENT;

//            params.windowAnimations = R.style.AnimationPopupStyle;
            window.setAttributes(params);
            window.setGravity( Gravity.CENTER );

            Animation animation = AnimationUtils.loadAnimation(ctx,R.anim.popup_open);
            haptic_popupll.startAnimation(animation);
        }

        Intent intent = getIntent();
        ArrayList<String> ReceiveArr = intent.getStringArrayListExtra("ArrayList");

        haptic_title.setText(ReceiveArr.get(0));
        haptic_subTitle.setText(ReceiveArr.get(1));

        LinearLayout haptic_closebtn = findViewById(R.id.haptic_closebtn);
        haptic_closebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mOnClose(v);
            }
        });
    }

    public void mOnClose(View V){
//        Intent intent = new Intent();
//        intent.putExtra("result", "Close Popup");
//        setResult(RESULT_OK, intent);
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
        haptic_popupll.startAnimation(animation);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
                haptic_popupll.setAlpha(0);
            }
        }, 150);
    }

}
