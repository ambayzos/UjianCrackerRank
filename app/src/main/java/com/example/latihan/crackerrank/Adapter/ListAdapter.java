package com.example.latihan.crackerrank.Adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewListHolder> {
    @NonNull
    @Override
    public ListAdapter.ViewListHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.ViewListHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewListHolder extends RecyclerView.ViewHolder {
        public ViewListHolder(@NonNull  View itemView) {
            super(itemView);
        }
    }
}
