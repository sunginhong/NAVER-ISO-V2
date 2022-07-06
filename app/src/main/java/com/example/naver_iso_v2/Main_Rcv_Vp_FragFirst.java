package com.example.naver_iso_v2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Main_Rcv_Vp_FragFirst extends Fragment {
    // Store instance variables
    private int frag_num;
    private TextView data_t;

    public Main_Rcv_Vp_FragFirst(){

    }

    public static Main_Rcv_Vp_FragFirst newInstance(int num){
        Main_Rcv_Vp_FragFirst fragment = new Main_Rcv_Vp_FragFirst();
        Bundle args = new Bundle();
        args.putInt("num",num);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        frag_num = getArguments().getInt("num",0);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1p,container,false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstancdState){
        super.onViewCreated(view,savedInstancdState);

    }

    @Override
    public void onStop() {
        super.onStop();
    }
}