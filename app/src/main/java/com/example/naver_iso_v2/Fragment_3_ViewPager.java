package com.example.naver_iso_v2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class Fragment_3_ViewPager extends Fragment {

    int MAX_PAGE = 3;
    private Fragment_3_ViewPager_Frag1 fragment1;
    private Fragment_3_ViewPager_Frag2 fragment2;
    private Fragment_3_ViewPager_Frag3 fragment3;
    Fragment currentFragment = new Fragment();
    private ViewPager viewPager;

    public Fragment_3_ViewPager() {
        init();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_3viewpager, container, false);
        fragment1=new Fragment_3_ViewPager_Frag1();
        fragment2=new Fragment_3_ViewPager_Frag2();
        fragment3=new Fragment_3_ViewPager_Frag3();
        viewPager=(ViewPager)view.findViewById(R.id.view_pager);
        viewPager.setAdapter(new PagerAdapter(getChildFragmentManager()));
        viewPager.setCurrentItem(0);
        viewPager.setSaveEnabled(false);
        viewPager.setPageTransformer(true, new Fragment_3_ViewPager_TransformPage());
        init();
        return view;
    }

    private void init() {
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public Object getReturnTransition() {
        return super.getReturnTransition();
    }

    private class PagerAdapter extends FragmentStatePagerAdapter{
        public PagerAdapter(FragmentManager fm){
            super(fm);
            getItem(0);
        }
        @Override
        public Fragment getItem(int position) {
            if (position < 0 || MAX_PAGE <= position)
                return null;

            switch (position) {
                case 0:
                    currentFragment = new Fragment_3_ViewPager_Frag1();
                    break;
                case 1:
                    currentFragment = new Fragment_3_ViewPager_Frag2();
                    break;
                case 2:
                    currentFragment = new Fragment_3_ViewPager_Frag3();
                    break;
            }

            return currentFragment;
        }
        public int getCount(){
            return MAX_PAGE;
        }
    }
}