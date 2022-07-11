package com.example.naver_iso_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.naver_iso_v2.TYPE2.Pannel_Result;

public class MainActivity extends AppCompatActivity {
    public static Context ctx;
    private Display display;
    public static RelativeLayout main_contain;
    public static RelativeLayout root;
    public static ViewGroup.LayoutParams params_copy;
    public static FrameLayout rect_objectFL;
    public static FrameLayout rect_objectFL_Copy;
    public static RelativeLayout bottom_rect;
    public static LinearLayout layout_container_top_group;
    public static Pannel_Result pannel_result;
    private final int sub = 1001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ctx = this.getApplicationContext();
        new GetNavigationBarHeight(this);

        display = getWindowManager().getDefaultDisplay();
        Vars_Def.screenWidth = display.getWidth();
        Point size = new Point();
        display.getRealSize(size);

        Main_ListFragment.mainListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                String selectedItem = (String) view.findViewById(R.id.textView_title).getTag().toString();

                switch(position){
                    case 1:
                        Intent intent1 = new Intent(getApplicationContext(), Activity_InteractionsMenu.class);
                        startActivityForResult(intent1, sub);
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left_case1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getApplicationContext(), Activity_Haptic.class);
                        startActivityForResult(intent2, sub);
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left_case1);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getApplicationContext(), Activity_LottieView.class);
                        startActivityForResult(intent3, sub);
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left_case1);
                        break;
                }
            }
        });

        Main_ListFragment.iso_link.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Acitivity_Webview_ISO.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_up_case1, R.anim.slide_out_down_case1);
            }
        });
    }

    public void ss(){
        Intent intent1 = new Intent(ctx.getApplicationContext(), Acitivity_Webview_ISO.class);
        startActivityForResult(intent1, 1001);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left_case1);
    }
}