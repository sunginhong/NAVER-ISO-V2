package com.example.naver_iso_v2;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class Main_Rcv_VpAdapter extends FragmentStateAdapter {

    public Context ctx;
    public int mCount;

    public Main_Rcv_VpAdapter(FragmentActivity fa, int count, Context context) {
        super(fa);
        mCount = count;
        ctx = context;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        int index = getRealPosition(position);

        switch(index){
            case 0 :
                return Main_Rcv_Vp_FragFirst.newInstance(index+1, ctx);
            case 1:
                return Main_Rcv_Vp_FragSecond.newInstance(index+1, ctx);
            default:
                return null;
        }
    }

    @Override
    public int getItemCount() {
        return mCount;
    }

    public int getRealPosition(int position) { return position % mCount; }

}