package com.liushuo.testviewid;

import android.support.v7.widget.RecyclerView;

/**
 * user liushuo
 * date 2017/4/6
 */

public abstract class AutoPointRecyclerAdapter<VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {
    public abstract Object getItem(int position);
}
