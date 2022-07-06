package com.example.naver_iso_v2;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import kotlin.jvm.internal.Intrinsics;

public final class MarginItemDecoration extends RecyclerView.ItemDecoration {

    private String direction;
    private final int spaceN;

    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");

        if (parent.getChildAdapterPosition(view) == 0) {
//            outRect.top = this.spaceHeight;
        }
        if (direction == "RIGHT"){
            outRect.right = this.spaceN;
        }
        if (direction == "BOTTOM"){
            outRect.bottom = this.spaceN;
        }
    }

    public MarginItemDecoration(String direction, int spaceN) {
        this.direction = direction;
        this.spaceN = spaceN;
    }
}
