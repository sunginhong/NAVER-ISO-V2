package com.example.naver_iso_v2.TYPE2;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.RequiresApi;

import com.example.naver_iso_v2.MainActivity;
import com.example.naver_iso_v2.R;
import com.example.naver_iso_v2.Utils_Anim;
import com.example.naver_iso_v2.Vars_Def;

public class Pannel_Result extends RelativeLayout {

    public Context ctx;
    public View rect_code_back;
    public static View rect_codeObject_case0;
    public static View rect_codeObject_case1;
    public static View rect_codeObject_case2;
    public static TextView rect_code_anim_title;
    public static TextView inMotion_result_0;
    public static TextView inMotion_result_1;
    public static TextView inMotion_result_2;
    public static TextView inMotion_result_3;
    public static TextView inMotion_result_4;
    public static TextView outMotion_result_0;
    public static TextView outMotion_result_1;
    public static TextView outMotion_result_2;
    public static TextView outMotion_result_3;
    public static TextView outMotion_result_4;

    public Pannel_Result(Context ctx) {
        super(ctx);
        this.ctx = ctx;
        init();
    }

    public Pannel_Result(Context ctx, AttributeSet attrs) {
        super(ctx, attrs);
        this.ctx = ctx;
        init();
    }

    public Pannel_Result(Context ctx, AttributeSet attrs, int defStyle) {
        super(ctx, attrs, defStyle);
        this.ctx = ctx;
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public Pannel_Result(Context ctx, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(ctx, attrs, defStyleAttr, defStyleRes);
        this.ctx = ctx;
        init();
    }

    private void init() {
        String infService = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater li = (LayoutInflater) getContext().getSystemService(infService);
        View v = li.inflate(R.layout.pannel_code_result, this, false);
        addView(v);

        rect_code_back = findViewById(R.id.rect_code_back);
        rect_codeObject_case0 = findViewById(R.id.rect_codeObject_case0);
        rect_codeObject_case1 = findViewById(R.id.rect_codeObject_case1);
        rect_codeObject_case2 = findViewById(R.id.rect_codeObject_case2);
        rect_code_anim_title = findViewById(R.id.rect_code_anim_title);
        inMotion_result_0 = findViewById(R.id.inMotion_result_0);
        inMotion_result_1 = findViewById(R.id.inMotion_result_1);
        inMotion_result_2 = findViewById(R.id.inMotion_result_2);
        inMotion_result_3 = findViewById(R.id.inMotion_result_3);
        inMotion_result_4 = findViewById(R.id.inMotion_result_4);
        outMotion_result_0 = findViewById(R.id.outMotion_result_0);
        outMotion_result_1 = findViewById(R.id.outMotion_result_1);
        outMotion_result_2 = findViewById(R.id.outMotion_result_2);
        outMotion_result_3 = findViewById(R.id.outMotion_result_3);
        outMotion_result_4 = findViewById(R.id.outMotion_result_4);

        Pannel_Result.inMotion_result_4.setText("ease" + Vars_Def.array_string_easeType[1] + " - cubic-bezier(0.65, 0, 0.35, 1)");
        Pannel_Result.outMotion_result_4.setText("ease" + Vars_Def.array_string_easeType[1] + " - cubic-bezier(0.65, 0, 0.35, 1)");

        rect_code_back.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Vars_Def.codePage){
                    Utils_Anim.TransAlphaAnim(MainActivity.main_contain, -Vars_Def.screenWidth/2, 0, 0, 0, 0.5f, 1, 500);
                    Utils_Anim.TransAnim(MainActivity.pannel_result, 0, Vars_Def.screenWidth, 0, 0, 500);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            MainActivity.pannel_result.setX(Vars_Def.screenWidth);
                            Vars_Def.codePage = false;
                        }
                    }, 500);
                }
            }
        });
    }
}