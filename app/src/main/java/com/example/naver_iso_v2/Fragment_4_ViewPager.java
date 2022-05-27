package com.example.naver_iso_v2;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

public class Fragment_4_ViewPager extends Fragment {

    int MAX_PAGE = 3;
    private Handler sliderHandler = new Handler();
    private Fragment_4_ViewPager_Frag1 fragment1;
    private Fragment_4_ViewPager_Frag2 fragment2;
    private Fragment_4_ViewPager_Frag3 fragment3;
    Fragment currentFragment = new Fragment();
    private ViewPager2 viewPager;
    private PagerAdapter pagerAdapter;
    private Runnable sliderRunnable;

    public Fragment_4_ViewPager() {
        init();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_4viewpager2, container, false);
        fragment1=new Fragment_4_ViewPager_Frag1();
        fragment2=new Fragment_4_ViewPager_Frag2();
        fragment3=new Fragment_4_ViewPager_Frag3();
        viewPager=(ViewPager2)view.findViewById(R.id.view_pager2);
        viewPager.setClipToPadding(false);
        viewPager.setClipChildren(false);
        viewPager.setPadding(100, 0, 100, 0);
        pagerAdapter=new PagerAdapter(this);
        viewPager.setAdapter(pagerAdapter);
        viewPager.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);
        viewPager.setOffscreenPageLimit(3);
        viewPager.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);
        viewPager.setCurrentItem(1, false);
        viewPager.setUserInputEnabled(true);
        this.initializeData();

        sliderRunnable = new Runnable() {
            @Override
            public void run() {
                viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
            }
        };

        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(50));
        compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {
                float r = 1 - Math.abs(position);
//                page.setScaleY(0.85f + r * 0.15f);
            }
        });
        viewPager.setPageTransformer(compositePageTransformer);
        viewPager.setSaveEnabled(false);
        init();

        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                sliderHandler.removeCallbacks(sliderRunnable);
//                sliderHandler.postDelayed(sliderRunnable, 2000);
            }
        });
        return view;
    }

    private void initializeData() {
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
    public void onPause() {
        super.onPause();
        sliderHandler.removeCallbacks(sliderRunnable);
    }

    @Override
    public void onResume() {
        super.onResume();
//        sliderHandler.postDelayed(sliderRunnable, 2000);
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

    private class PagerAdapter extends FragmentStateAdapter {
        public PagerAdapter(Fragment_4_ViewPager fa) {
            super(fa);
        }

        @Override
        public Fragment createFragment(int position) {
            if (position < 0 || MAX_PAGE <= position)
                return null;

            switch (position) {
                case 0:
                    currentFragment = new Fragment_4_ViewPager_Frag1();
                    break;
                case 1:
                    currentFragment = new Fragment_4_ViewPager_Frag2();
                    break;
                case 2:
                    currentFragment = new Fragment_4_ViewPager_Frag3();
                    break;
            }

            return currentFragment;
        }

        @Override
        public int getItemCount() {
            return MAX_PAGE;
        }
    }
}