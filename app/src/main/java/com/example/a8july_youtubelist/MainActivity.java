package com.example.a8july_youtubelist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemOnClickListener {

    private RecyclerView recyclerView;
    private ArrayList<Youtube> YtArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        buildData();
        setRecyclerView();
    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerview);

    }

    private void buildData() {
        YtArrayList = new ArrayList<>();
        YtArrayList.add(new Youtube("https://youtu.be/DpFXj2evzPY",R.drawable.ytsavetax));
        YtArrayList.add(new Youtube("https://youtu.be/kiw-Y11ANWg",R.drawable.ytguide_tobuy_insurance));
        YtArrayList.add(new Youtube("https://youtu.be/yNaN5kYTNLY",R.drawable.yt_ultimateguide_toinvestin_20s));
        YtArrayList.add(new Youtube("https://youtu.be/hIYSxqrraWA",R.drawable.yt_stockmarket_begginers));
        YtArrayList.add(new Youtube("https://youtu.be/mt9ruc-iS2I",R.drawable.ytcommon_financial_mistakes));

    }

    private void setRecyclerView() {
        YoutubeAdapter youtubeAdapter = new YoutubeAdapter(YtArrayList,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(youtubeAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);

    }

    @Override
    public void onCLick(Youtube youtube) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(youtube.getYtLink()));
        startActivity(intent);

    }
}