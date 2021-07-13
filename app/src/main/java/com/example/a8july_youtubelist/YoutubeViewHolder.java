package com.example.a8july_youtubelist;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class YoutubeViewHolder extends RecyclerView.ViewHolder {
    private ImageView YtThumbNail;
    private Button mbtnLink;
    public YoutubeViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
    }

    private void initView(View itemView) {
        YtThumbNail = itemView.findViewById(R.id.ivThumbNail);
        mbtnLink = itemView.findViewById(R.id.ytLink);
    }

    public void setData(Youtube youtube,ItemOnClickListener itemOnClickListener){
        YtThumbNail.setBackgroundResource(youtube.getYtThumbnail());
        mbtnLink.setText(youtube.getYtLink());
        mbtnLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemOnClickListener.onCLick(youtube);
            }
        });
    }
}
