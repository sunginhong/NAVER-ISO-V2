package com.example.naver_iso_v2;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.naver_iso_v2.TYPE2.Pannel_Result;

import java.util.ArrayList;

public class MainActivity_T2 extends AppCompatActivity {
    public static Context ctx;
    private Display display;
    public static Pannel_Result pannel_result;
    private final int sub = 1001;
    private RecyclerView rcv_horizon_case1_RecyclerView;
    private RecyclerView rcv_horizon_case2_RecyclerView;
    private RecyclerView rcv_vertical_case1_RecyclerView;
    private Main_Rcv_Horizon_Case1Adapter rcv_horizon_case1_adapter;
    private Main_Rcv_Horizon_Case2Adapter rcv_horizon_case2_adapter;
    private Main_Rcv_Vertical_Case1Adapter rcv_vertical_case1_adapter;
    private ArrayList<Main_Rcv_Horizon_Item> main_rcv_horizon_case1_item;
    private ArrayList<Main_Rcv_Horizon_Item> main_rcv_horizon_case2_item;
    private ArrayList<Main_Rcv_Vertical_Item> main_rcv_vertical_case1_items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_t2);

        ctx = this.getApplicationContext();
        new GetNavigationBarHeight(this);

        display = getWindowManager().getDefaultDisplay();
        Vars_Def.screenWidth = display.getWidth();
        Point size = new Point();
        display.getRealSize(size);

        rcv_horizon_case1_RecyclerView = (RecyclerView) findViewById(R.id.main_rcv_item_case1_horizon);
        rcv_horizon_case2_RecyclerView = (RecyclerView) findViewById(R.id.main_rcv_item_case2_horizon);
        rcv_vertical_case1_RecyclerView = (RecyclerView) findViewById(R.id.main_rcv_item_case1_vertical);
        rcv_horizon_case1_adapter = new Main_Rcv_Horizon_Case1Adapter(ctx);
        rcv_horizon_case2_adapter = new Main_Rcv_Horizon_Case2Adapter(ctx);
        rcv_vertical_case1_adapter  = new Main_Rcv_Vertical_Case1Adapter(ctx);

        rcv_horizon_case1_RecyclerView.setAdapter(rcv_horizon_case1_adapter);
        rcv_horizon_case1_RecyclerView.setLayoutManager(new LinearLayoutManager(this));
        rcv_horizon_case1_RecyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false));

        main_rcv_horizon_case1_item = new ArrayList<>();
        main_rcv_horizon_case1_item.add(new Main_Rcv_Horizon_Item(R.drawable.main_icn_1_0, (String) getResources().getString(R.string.elemaents_case1)));
        main_rcv_horizon_case1_item.add(new Main_Rcv_Horizon_Item(R.drawable.main_icn_1_1, (String) getResources().getString(R.string.elemaents_case2)));
        main_rcv_horizon_case1_item.add(new Main_Rcv_Horizon_Item(R.drawable.main_icn_1_2,(String) getResources().getString(R.string.elemaents_case3)));
        rcv_horizon_case1_adapter.setItemList(main_rcv_horizon_case1_item);
        rcv_horizon_case1_RecyclerView.addItemDecoration(new MarginItemDecoration("RIGHT", (int)getResources().getDimension(R.dimen.main_rcv_item_horizon_item_margin)));

        rcv_horizon_case2_RecyclerView.setAdapter(rcv_horizon_case2_adapter);
        rcv_horizon_case2_RecyclerView.setLayoutManager(new LinearLayoutManager(this));
        rcv_horizon_case2_RecyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false));

        main_rcv_horizon_case2_item = new ArrayList<>();
        main_rcv_horizon_case2_item.add(new Main_Rcv_Horizon_Item(R.drawable.main_icn_2_0, (String) getResources().getString(R.string.gestures_case1)));
        main_rcv_horizon_case2_item.add(new Main_Rcv_Horizon_Item(R.drawable.main_icn_2_1, (String) getResources().getString(R.string.gestures_case2)));
        main_rcv_horizon_case2_item.add(new Main_Rcv_Horizon_Item(R.drawable.main_icn_2_2,(String) getResources().getString(R.string.gestures_case3)));
        rcv_horizon_case2_adapter.setItemList(main_rcv_horizon_case2_item);
        rcv_horizon_case2_RecyclerView.addItemDecoration(new MarginItemDecoration("RIGHT", (int)getResources().getDimension(R.dimen.main_rcv_item_horizon_item_margin)));

        rcv_vertical_case1_RecyclerView.setAdapter(rcv_vertical_case1_adapter);
        rcv_vertical_case1_RecyclerView.setLayoutManager(new LinearLayoutManager(this));

        main_rcv_vertical_case1_items = new ArrayList<>();
        main_rcv_vertical_case1_items.add(new Main_Rcv_Vertical_Item(R.drawable.main_icn_haptics, (String) getResources().getString(R.string.vertical_case1_title), (String) getResources().getString(R.string.vertical_case1_subtitle)));
        main_rcv_vertical_case1_items.add(new Main_Rcv_Vertical_Item(R.drawable.main_icn_lottie, (String) getResources().getString(R.string.vertical_case2_title), (String) getResources().getString(R.string.vertical_case2_subtitle)));
        rcv_vertical_case1_adapter.setItemList(main_rcv_vertical_case1_items);
        rcv_vertical_case1_RecyclerView.addItemDecoration(new MarginItemDecoration("BOTTOM", (int)getResources().getDimension(R.dimen.main_rcv_item_vertical_item_margin)));

        rcv_horizon_case1_RecyclerView.addOnItemTouchListener(new RecyclerTouchListener(ctx.getApplicationContext(), rcv_horizon_case1_RecyclerView, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                switch(position){
                    case 0:
                        Intent hor_case1_intent0 = new Intent(getApplicationContext(), Activity_Element.class);
                        hor_case1_intent0.putExtra("text", "0");
                        startActivityForResult(hor_case1_intent0, sub);
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left_case1);
                        break;
                    case 1:
                        Intent hor_case1_intent1 = new Intent(getApplicationContext(), Activity_Element.class);
                        hor_case1_intent1.putExtra("text", "1");
                        startActivityForResult(hor_case1_intent1, sub);
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left_case1);
                        break;
                    case 2:
                        Intent hor_case1_intent2 = new Intent(getApplicationContext(), Activity_Element.class);
                        hor_case1_intent2.putExtra("text", "2");
                        startActivityForResult(hor_case1_intent2, sub);
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left_case1);

                        break;
                }
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));

        rcv_vertical_case1_RecyclerView.addOnItemTouchListener(new RecyclerTouchListener(ctx.getApplicationContext(), rcv_vertical_case1_RecyclerView, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                switch(position){
                    case 0:
                        Intent ver_case1_intent0 = new Intent(getApplicationContext(), Activity_Haptic.class);
                        startActivityForResult(ver_case1_intent0, sub);
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left_case1);
                        break;
                    case 1:
                        Intent ver_case1_intent1 = new Intent(getApplicationContext(), Activity_LottieView.class);
                        startActivityForResult(ver_case1_intent1, sub);
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left_case1);
                        break;
                }
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
        Main_IsoBanner.contain.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity_T2.this,Acitivity_Webview_ISO.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left_case1);
            }
        });
    }
}