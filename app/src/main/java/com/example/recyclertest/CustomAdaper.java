package com.example.recyclertest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdaper extends RecyclerView.Adapter<CustomViewHolder> {

    private List<PojoCategories> dataSet;

    public void setDataSet(List<PojoCategories> dataSet) {
        this.dataSet = dataSet;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);

        CustomViewHolder holder = new CustomViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.tv_item_title.setText(dataSet.get(position).getTitle());
        holder.tv_item_subtitle.setText(dataSet.get(position).getSubtitle());
    }

    /**
     * Will be a number representation of how many rows will be printed into RecyclerView
     * @return
     */
    @Override
    public int getItemCount() {
        return (dataSet != null) ? dataSet.size() : 0;
    }
}
