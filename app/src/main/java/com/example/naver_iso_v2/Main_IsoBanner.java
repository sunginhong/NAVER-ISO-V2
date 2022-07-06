package com.example.naver_iso_v2;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.RequiresApi;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

public class Main_IsoBanner extends FrameLayout {
    public Context ctx;
    public static LinearLayout contain;
    ImageView thumb;
    TextView title;
    TextView summary;

    public Main_IsoBanner(Context ctx){
        super(ctx);
        this.ctx = ctx;
        init();
    }

    public Main_IsoBanner(Context ctx, AttributeSet attrs) {
        super(ctx, attrs);
        this.ctx = ctx;
        init();
    }

    public Main_IsoBanner(Context ctx, AttributeSet attrs, int defStyle) {
        super(ctx, attrs, defStyle);
        this.ctx = ctx;
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public Main_IsoBanner(Context ctx, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(ctx, attrs, defStyleAttr, defStyleRes);
        this.ctx = ctx;
        init();
    }

    private void init() {
        String infService = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater li = (LayoutInflater) getContext().getSystemService(infService);
        View v = li.inflate(R.layout.main_rcv_item_vertical_case2, this, false);
        addView(v);

        contain = (LinearLayout) v.findViewById(R.id.rect_main_list_rcv_case_vertical_case2);
        thumb = (ImageView) v.findViewById(R.id.main_rcv_item_vertical_case2_thumb);
        title = (TextView) v.findViewById(R.id.main_rcv_item_vertical_case2_title);
        summary = (TextView) v.findViewById(R.id.main_rcv_item_vertical_case2_summary);

        RequestOptions requestOptions = new RequestOptions();
        Glide
                .with(ctx)
                .load(R.drawable.main_icn_iso_a).apply(requestOptions)
                .centerCrop()
                .dontAnimate()
                .dontTransform()
                .skipMemoryCache(true)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(thumb);
//            thumb.setBackground(drawable);
        thumb.setClipToOutline(true);
        thumb.setImageResource(R.drawable.ic_launcher_background);
        title.setText((String) getResources().getString(R.string.vertical_case3_title));
        summary.setText((String) getResources().getString(R.string.vertical_case3_subtitle));
    }
}
