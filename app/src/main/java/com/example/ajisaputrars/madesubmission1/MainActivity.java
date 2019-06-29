package com.example.ajisaputrars.madesubmission1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> titles;
    private ArrayList<String> overviews;
    private ArrayList<String> dates;
    private ArrayList<Double> voteAverages;
    private ArrayList<Integer> images;
    private ArrayList<Movie> movies;
    private MovieAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titles = MovieData.getTitles();
        overviews = MovieData.getOverviews();
        dates = MovieData.getDates();
        voteAverages = MovieData.getVoteAverages();
        images = MovieData.getImages();
        movies = new ArrayList<>();

        adapter = new MovieAdapter(this);
        ListView listView = findViewById(R.id.lv_list);
        listView.setAdapter(adapter);

        addMoviesItem();
        adapter.setMovies(movies);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent moveWithObjectIntent = new Intent(MainActivity.this, DetailFilmActivity.class);
                moveWithObjectIntent.putExtra(DetailFilmActivity.EXTRA_MOVIE, movies.get(i));
                startActivity(moveWithObjectIntent);
            }
        });
    }

    private void addMoviesItem() {
        for (int i = 0; i < titles.size(); i++) {
            Movie movie = new Movie();
            movie.setId(i);
            movie.setImage(images.get(i));
            movie.setTitle(titles.get(i));
            movie.setDate(dates.get(i));
            movie.setVote_average(voteAverages.get(i));
            movie.setOverview(overviews.get(i));
            movies.add(movie);
        }
    }
}
