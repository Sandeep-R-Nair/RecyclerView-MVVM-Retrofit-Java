package com.brogrammer.mvvmsample.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.brogrammer.mvvmsample.adapters.MovieListAdapter;
import com.brogrammer.mvvmsample.databinding.ActivityMainBinding;
import com.brogrammer.mvvmsample.models.MoviesResponse;
import com.brogrammer.mvvmsample.viewmodels.MovieListViewModel;

public class MainActivity extends AppCompatActivity {

    MoviesResponse movieList;
    MovieListViewModel listViewModel;
    MovieListAdapter adapter;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.rvMovies.setLayoutManager(new LinearLayoutManager(this));
        binding.rvMovies.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        adapter=new MovieListAdapter(movieList);
        binding.rvMovies.setAdapter(adapter);

        listViewModel= new ViewModelProvider(this).get(MovieListViewModel.class);
        listViewModel.getMovieListObserver().observe(this, movieModels -> {
            if(movieModels!=null) {
                movieList = movieModels;
                adapter.updateMovieList(movieModels);
                binding.tvNoResult.setVisibility(View.GONE);
            }
            if(movieModels==null)
            {
                binding.rvMovies.setVisibility(View.GONE);
                binding.tvNoResult.setVisibility(View.VISIBLE);
            }
        });
        listViewModel.makeApiCall();
    }
}