package com.pecuyu.fragmentinphoneandpad;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by pecuyu on 2017/7/25.
 */

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder>{
    private List<Info> mList;
    private Context mContext;

    public MyRecyclerViewAdapter(List<Info> mList,Context context) {
        this.mList = mList;
        mContext=context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(mContext, R.layout.layout_recycler_view_item, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tvId.setText("id:"+mList.get(position).getId());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    /**
     * Created by pecuyu on 2017/7/25.
     */

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvId;
        public ViewHolder(View itemView) {
            super(itemView);
            tvId = (TextView) itemView.findViewById(R.id.id_recycler_view_item);
        }
    }
}
