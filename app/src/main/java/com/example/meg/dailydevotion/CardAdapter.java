package com.example.meg.dailydevotion;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Meg on 2015-07-19.
 */
public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {

    List<WeeklyChapters> mItems;

    public CardAdapter() {
        super();
        mItems = new ArrayList<WeeklyChapters>();
        WeeklyChapters weeklychapters = new WeeklyChapters();
        weeklychapters.setName("Week One Chapters");
        mItems.add(weeklychapters);

        weeklychapters = new WeeklyChapters();
        weeklychapters.setName("Week Two Chapters");
        mItems.add(weeklychapters);

        weeklychapters = new WeeklyChapters();
        weeklychapters.setName("Week Three Chapters");
        mItems.add(weeklychapters);

        weeklychapters = new WeeklyChapters();
        weeklychapters.setName("Week Four Chapters");
        mItems.add(weeklychapters);

        weeklychapters = new WeeklyChapters();
        weeklychapters.setName("Week Five Chapters");
        mItems.add(weeklychapters);

        weeklychapters = new WeeklyChapters();
        weeklychapters.setName("Week six Chapters");
        mItems.add(weeklychapters);

        weeklychapters = new WeeklyChapters();
        weeklychapters.setName("Week Seven Chapters");
        mItems.add(weeklychapters);

        weeklychapters = new WeeklyChapters();
        weeklychapters.setName("Week Eight Chapters");
        mItems.add(weeklychapters);

        weeklychapters = new WeeklyChapters();
        weeklychapters.setName("Week Nine Chapters");
        mItems.add(weeklychapters);

        weeklychapters = new WeeklyChapters();
        weeklychapters.setName("Week Ten Chapters");
        mItems.add(weeklychapters);

        weeklychapters = new WeeklyChapters();
        weeklychapters.setName("Week Eleven Chapters");
        mItems.add(weeklychapters);

        weeklychapters = new WeeklyChapters();
        weeklychapters.setName("Week Twelve Chapters");
        mItems.add(weeklychapters);

        weeklychapters = new WeeklyChapters();
        weeklychapters.setName("Week Thirteen Chapters");
        mItems.add(weeklychapters);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.recyclerviewlayout, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        WeeklyChapters movie = mItems.get(i);
        viewHolder.tvMovie.setText(movie.getName());

    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView imgThumbnail;
        public TextView tvMovie;

        public ViewHolder(View itemView) {
            super(itemView);
            tvMovie = (TextView)itemView.findViewById(R.id.tv_movie);
        }
    }
}
