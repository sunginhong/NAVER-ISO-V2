package com.example.naver_iso_v2;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class Main_Rcv_Vertical_Case1Adapter extends RecyclerView.Adapter<Main_Rcv_Vertical_Case1Adapter.ViewHolder> {

    public Context ctx;
    private ArrayList<Main_Rcv_Vertical_Item> mList;

    public Main_Rcv_Vertical_Case1Adapter(Context ctx){
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public Main_Rcv_Vertical_Case1Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_rcv_item_vertical_case1, parent, false);

        return new Main_Rcv_Vertical_Case1Adapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Main_Rcv_Vertical_Case1Adapter.ViewHolder holder, int position) {
        holder.onBind(mList.get(position));
    }

    public void setItemList(ArrayList<Main_Rcv_Vertical_Item> list){
        this.mList = list;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView thumb;
        TextView title;
        TextView summary;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            thumb = (ImageView) itemView.findViewById(R.id.main_rcv_item_vertical_case1_thumb);
            title = (TextView) itemView.findViewById(R.id.main_rcv_item_vertical_case1_title);
            summary = (TextView) itemView.findViewById(R.id.main_rcv_item_vertical_case1_summary);
        }

        void onBind(Main_Rcv_Vertical_Item item){
            RequestOptions requestOptions = new RequestOptions();
            Glide
                    .with(ctx)
                    .load(item.getImg()).apply(requestOptions)
                    .centerCrop()
                    .dontAnimate()
                    .dontTransform()
                    .skipMemoryCache(true)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(thumb);

//            GradientDrawable drawable= (GradientDrawable) ctx.getDrawable(R.drawable.radius);
//            thumb.setBackground(drawable);
            thumb.setClipToOutline(true);
//            thumb.setImageResource(R.drawable.ic_launcher_background);
            title.setText(item.getTitle());
            title.setTag(item.getTitle());
            summary.setText(item.getmSummary());
        }
    }
}
