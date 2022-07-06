package com.example.naver_iso_v2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class Main_Rcv_VpAdapter extends FragmentStateAdapter {

    public int mCount;

    public Main_Rcv_VpAdapter(FragmentActivity fa, int count) {
        super(fa);
        mCount = count;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        int index = getRealPosition(position);

        switch(index){
            case 0 :
                return Main_Rcv_Vp_FragFirst.newInstance(index+1);
            case 1:
                return Main_Rcv_Vp_FragSecond.newInstance(index+1);
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