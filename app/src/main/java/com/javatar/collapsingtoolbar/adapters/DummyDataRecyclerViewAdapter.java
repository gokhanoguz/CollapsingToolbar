package com.javatar.collapsingtoolbar.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.javatar.collapsingtoolbar.adapters.holders.DummyDataViewHolder;

import java.util.List;

/**
 * Created by gokhan on 21-Feb-17.
 */

public class DummyDataRecyclerViewAdapter extends RecyclerView.Adapter<DummyDataViewHolder> {

    private List<String> itemList;
    private Context mContext;

    public DummyDataRecyclerViewAdapter(Context context, List<String> itemList) {
        this.itemList = itemList;
        this.mContext = context;
    }

    @Override
    public DummyDataViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(android.R.layout.simple_list_item_1, viewGroup, false);
        DummyDataViewHolder viewHolder = new DummyDataViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(DummyDataViewHolder viewHolder, int position) {
        viewHolder.title.setText(itemList.get(position));
    }

    @Override
    public int getItemCount() {
        return (null != itemList ? itemList.size() : 0);
    }


}