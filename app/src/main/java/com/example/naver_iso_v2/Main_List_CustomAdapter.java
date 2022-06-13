package com.example.naver_iso_v2;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class Main_List_CustomAdapter extends ArrayAdapter implements AdapterView.OnItemClickListener {

    private Context ctx;
    private List list;

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//        Toast.makeText(ctx, "clicked", Toast.LENGTH_SHORT).show();
    }

    class ViewHolder {
        public TextView tv_title;
        public TextView tv_summary;
        public ImageView iv_thumb;
    }

    public Main_List_CustomAdapter(Context context, ArrayList list){
        super(context, 0, list);
        this.ctx = context;
        this.list = list;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder viewHolder;

        if (convertView == null){
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            convertView = layoutInflater.inflate(R.layout.main_list_row_item, parent, false);
        }

        viewHolder = new ViewHolder();
        viewHolder.tv_title = (TextView) convertView.findViewById(R.id.textView_title);
        viewHolder.tv_summary = (TextView) convertView.findViewById(R.id.textView_summary);
        viewHolder.iv_thumb = (ImageView) convertView.findViewById(R.id.imageView_thumb);

        final Main_List_Item item = (Main_List_Item) list.get(position);
        viewHolder.tv_title.setText(item.getTitle());
        viewHolder.tv_summary.setText(item.getSummary());
        Glide
                .with(ctx)
                .load(item.getThumb_url())
                .circleCrop()
                .apply(new RequestOptions().override(200, 200))
                .into(viewHolder.iv_thumb);
        GradientDrawable drawable= (GradientDrawable) ctx.getDrawable(R.drawable.radius);
        viewHolder.iv_thumb.setBackground(drawable);
        viewHolder.iv_thumb.setClipToOutline(true);

        viewHolder.tv_title.setTag(item.getTitle());


//        //아이템 클릭 방법2 - 클릭시 아이템 반전 효과가 안 먹힘
//        convertView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(context, " " + actor.getName(), Toast.LENGTH_SHORT).show();
//            }
//        });

        //Return the completed view to render on screen
        return convertView;
    }
}