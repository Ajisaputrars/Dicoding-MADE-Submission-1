package com.example.ajisaputrars.madesubmission1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailFilmActivity extends AppCompatActivity {
    public static final String EXTRA_MOVIE = "extra_movie";

    private Movie movie;
    private TextView tvTitle;
    private TextView tvOverview;
    private TextView tvDate;
    private TextView tvVote;
    private ImageView ivImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_film);

        ivImage = findViewById(R.id.iv_image);
        tvTitle = findViewById(R.id.tv_title);
        tvOverview = findViewById(R.id.tv_overview);
        tvDate = findViewById(R.id.tv_date);
        tvVote = findViewById(R.id.tv_vote);

        movie = getIntent().getParcelableExtra(EXTRA_MOVIE);
        setUserInterface();
    }

    private void setUserInterface() {
        Glide.with(this).load(movie.getImage()).into(ivImage);
        tvTitle.setText(movie.getTitle());
        tvDate.setText(movie.getDate());
        tvOverview.setText(movie.getOverview());
        tvVote.setText(String.valueOf(movie.getVote_average()));

        setTitle(movie.getTitle());
    }
}
