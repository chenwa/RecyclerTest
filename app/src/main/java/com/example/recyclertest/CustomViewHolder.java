package com.example.recyclertest;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomViewHolder extends RecyclerView.ViewHolder {

    TextView tv_item_title;
    TextView tv_item_subtitle;

    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);
        tv_item_title = itemView.findViewById(R.id.tv_item_title);
        tv_item_subtitle = itemView.findViewById(R.id.tv_item_subtitle);
    }
}
