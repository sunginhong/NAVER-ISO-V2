package com.example.naver_iso_v2;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class Main_ListFragment extends FrameLayout {

    public Context ctx;
    ArrayList<Main_List_Item> mainListItem;
    public static ListView mainListView;
    private static Main_List_CustomAdapter customAdapter;

    public Main_ListFragment(Context ctx){
        super(ctx);
        this.ctx = ctx;
        init();
    }

    public Main_ListFragment(Context ctx, AttributeSet attrs) {
        super(ctx, attrs);
        this.ctx = ctx;
        init();
    }

    public Main_ListFragment(Context ctx, AttributeSet attrs, int defStyle) {
        super(ctx, attrs, defStyle);
        this.ctx = ctx;
        init();
    }

    private void init() {
        String infService = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater li = (LayoutInflater) getContext().getSystemService(infService);
        View v = li.inflate(R.layout.main_listview, this, false);
        addView(v);
        final View header = li.inflate(R.layout.main_listview_header, null, false);

        mainListItem = new ArrayList<>();
        mainListItem.add(new Main_List_Item("Interactions.", "https://play-lh.googleusercontent.com/CvrAspBClfv1bbHdxw0gj5XBHenMECqVpT-0sdIX7aqnGj6CxqDKwHNLKPIzToRj7g", "디자인 컴포넌트의 인터랙션을 확인 할 수 있어요"));
        mainListItem.add(new Main_List_Item("Haptics", "https://play-lh.googleusercontent.com/CvrAspBClfv1bbHdxw0gj5XBHenMECqVpT-0sdIX7aqnGj6CxqDKwHNLKPIzToRj7g", "여러가지 햅택을 느껴볼 수 있어요"));

        mainListView = (ListView) findViewById(R.id.main_listView_custom);
        customAdapter = new Main_List_CustomAdapter(getContext(),mainListItem);
        mainListView.setAdapter(customAdapter);
        mainListView.addHeaderView(header);

//        Toast.makeText(getContext(), "Clicked: " + position +" " + selectedItem, Toast.LENGTH_SHORT).show();
    }
}

