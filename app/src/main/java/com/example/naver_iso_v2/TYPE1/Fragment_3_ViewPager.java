package com.example.naver_iso_v2.TYPE1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.naver_iso_v2.R;

public class Fragment_3_ViewPager extends Fragment {

    int MAX_PAGE = 3;
    private Fragment_3_ViewPager_Frag1 fragment1;
    private Fragment_3_ViewPager_Frag2 fragment2;
    private Fragment_3_ViewPager_Frag3 fragment3;
    Fragment currentFragment = new Fragment();
    private ViewPager viewPager;
    public int currentPage = 0;
    public float currentPosition = 0;
    public float lastPosition = 0;
    static public String scrollDirection = "RIGHT";
    static boolean swipeBool = false;

    public Fragment_3_ViewPager() {
        init();
    }

    @SuppressLint("ClickableViewAccessibility")
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
        viewPager.setOnTouchListener(new ViewPager.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.v(null, "TOUCH EVENT"); // handle your fragment number here
                return false;
            }
        });

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                currentPage = position;
            }
            @Override
            public void onPageScrollStateChanged(int state) {
//                System.out.println(currentPage);
                if (currentPage == 0){
                    scrollDirection = "RIGHT";
                }
                if (currentPage == MAX_PAGE-1){
//                    scrollDirection = "LEFT";
                }
            }
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//                if (lastPosition > position) {
//                    scrollDirection = "LEFT";
//                }else if (lastPosition < position) {
//                    scrollDirection = "RIGHT";
//                }
//                Log.d(""+lastPosition, "  "+positionOffset);
                currentPosition = positionOffset;
                if (swipeBool){
                    if (lastPosition <= positionOffset) {
                        scrollDirection = "RIGHT";
                    } else{
                        scrollDirection = "LEFT";
                    }
                }
                //                if (lastPosition <= positionOffset) {
//                    scrollDirection = "RIGHT";
//                }
//                else{
//                    scrollDirection = "LEFT";
//                }
//                lastPosition = position;
                lastPosition = positionOffset;
            }
        });
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