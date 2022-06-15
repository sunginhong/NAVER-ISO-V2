package com.example.naver_iso_v2.TYPE1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.naver_iso_v2.R;

public class Fragment_3_ViewPager_Frag2 extends Fragment {
    public Fragment_3_ViewPager_Frag2() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_3viewpager_frag2, container, false);
    }
}