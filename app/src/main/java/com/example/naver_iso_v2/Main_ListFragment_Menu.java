package com.example.naver_iso_v2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class Main_ListFragment_Menu extends FrameLayout {

    public Context ctx;
    ArrayList<Main_List_Menu_Item> mainMenuListItem;
    public static ListView mainListView;
    private static Main_List_Menu_CustomAdapter customAdapter;

    public Main_ListFragment_Menu(Context ctx){
        super(ctx);
        this.ctx = ctx;
        init();
    }

    public Main_ListFragment_Menu(Context ctx, AttributeSet attrs) {
        super(ctx, attrs);
        this.ctx = ctx;
        init();
    }

    public Main_ListFragment_Menu(Context ctx, AttributeSet attrs, int defStyle) {
        super(ctx, attrs, defStyle);
        this.ctx = ctx;
        init();
    }

    private void init() {
        String infService = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater li = (LayoutInflater) getContext().getSystemService(infService);
        View v = li.inflate(R.layout.main_listview_menu, this, false);
        addView(v);
        final View header = li.inflate(R.layout.main_listview_menu_header, null, false);

        mainMenuListItem = new ArrayList<>();
        mainMenuListItem.add(new Main_List_Menu_Item("Popup Animation", "https://cdn-icons.flaticon.com/png/512/1886/premium/1886550.png?token=exp=1655446050~hmac=8ab191f2405721f3c9a15938e33fdf33", "팝업 애니메이션"));
        mainMenuListItem.add(new Main_List_Menu_Item("Nudge Animation", "https://cdn-icons-png.flaticon.com/512/1432/1432568.png", "넛지 애니메이션"));
        mainMenuListItem.add(new Main_List_Menu_Item("Alarm Animation", "https://cdn-icons-png.flaticon.com/512/1827/1827314.png", "알람 애니메이션"));

        mainListView = (ListView) findViewById(R.id.main_listView_menu_custom);
        customAdapter = new Main_List_Menu_CustomAdapter(getContext(),mainMenuListItem);
        mainListView.setAdapter(customAdapter);
        mainListView.addHeaderView(header);

    }
}