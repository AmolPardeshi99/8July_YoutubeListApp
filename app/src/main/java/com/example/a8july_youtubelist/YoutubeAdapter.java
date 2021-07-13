package com.example.a8july_youtubelist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class YoutubeAdapter extends RecyclerView.Adapter<YoutubeViewHolder> {
    private ArrayList<Youtube> YtArraylist;
    private ItemOnClickListener itemOnClickListener;

    public YoutubeAdapter(ArrayList<Youtube> YtArraylist, ItemOnClickListener itemOnClickListener) {
        this.YtArraylist = YtArraylist;
        this.itemOnClickListener = itemOnClickListener;
    }

    @NonNull
    @Override
    public YoutubeViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new YoutubeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  YoutubeViewHolder holder, int position) {
        Youtube youtube = YtArraylist.get(position);
        holder.setData(youtube,itemOnClickListener);

    }

    @Override
    public int getItemCount() {
        return YtArraylist.size();
    }
}
