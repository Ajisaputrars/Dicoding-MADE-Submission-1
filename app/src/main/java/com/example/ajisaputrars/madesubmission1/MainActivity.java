package com.example.ajisaputrars.madesubmission1;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String>titles;
    private ArrayList<String>overviews;
    private ArrayList<String>dates;
    private ArrayList<Double>voteAverages;
    private ArrayList<Integer> imageIds = new ArrayList<>();
    private ArrayList<Movie> movies;
    private MovieAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        titles = MovieData.getTitles();
        overviews = MovieData.getOverviews();
        dates = MovieData.getDates();
        voteAverages = MovieData.getVoteAverages();
        getImageIds();

        adapter = new MovieAdapter(this);
        ListView listView = findViewById(R.id.lv_list);
        listView.setAdapter(adapter);

        addItem();
    }

    private void addItem() {
        movies = new ArrayList<>();
        for (int i = 0; i < titles.size(); i++) {
            Movie movie = new Movie();
            movie.setImage(imageIds.get(i));
            movie.setTitle(titles.get(i));
            movie.setDate(dates.get(i));
            movie.setVote_average(voteAverages.get(i));
            movie.setOverview(overviews.get(i));
            movies.add(movie);
        }
        adapter.setMovies(movies);
    }

    private void getImageIds(){
        String poster = "poster";
        for (int i=1; i<=titles.size(); i++){
            String generatedString = poster + String.valueOf(i);
            int id = getResources().getIdentifier("com.example.ajisaputrars.madesubmission1:drawable/" + generatedString, null, null);
            imageIds.add(id);
        }
    }
}
