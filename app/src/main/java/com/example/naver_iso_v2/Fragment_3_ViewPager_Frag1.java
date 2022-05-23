package com.example.naver_iso_v2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment_3_ViewPager_Frag1 extends Fragment {
    public Fragment_3_ViewPager_Frag1() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_3viewpager_frag1, container, false);
//        View parentView = inflater.inflate(R.layout.fragment_viewpager_frag1, container, false);
////        View childView = parentView.findViewById(R.id.child_view);
    }
}