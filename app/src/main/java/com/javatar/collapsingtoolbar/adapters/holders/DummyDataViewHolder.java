package com.javatar.collapsingtoolbar.adapters.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by gokhan on 21-Feb-17.
 */

public class DummyDataViewHolder extends RecyclerView.ViewHolder {

    public TextView title;

    public DummyDataViewHolder(View view) {
        super(view);
        title = (TextView) view.findViewById(android.R.id.text1);
    }
}