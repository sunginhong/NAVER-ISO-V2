package com.example.naver_iso_v2.TYPE1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.naver_iso_v2.R;

public class Fragment_4_ViewPager_Frag2 extends Fragment {
    public Fragment_4_ViewPager_Frag2() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return (ViewGroup) inflater.inflate(
                R.layout.fragment_4viewpager2_frag2, container, false);
    }
}