package com.brogrammer.mvvmsample.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.brogrammer.mvvmsample.databinding.RecyclerMoviesRowBinding;
import com.brogrammer.mvvmsample.models.MoviesResponse;
import com.bumptech.glide.Glide;

public class MovieListAdapter extends RecyclerView.Adapter<MovieListAdapter.movieViewHolder>
{
    MoviesResponse movieList;
    RecyclerMoviesRowBinding binding;

    public MovieListAdapter(MoviesResponse list) {
        this.movieList = list;
    }

    public void updateMovieList(MoviesResponse list) {
        this.movieList = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public movieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = RecyclerMoviesRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new movieViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull movieViewHolder holder, int position) {
      holder.binding.tvTitle.setText(movieList.getMarvelCinematicUniverse().get(position).getTitle());
      holder.binding.tvCategory.setText(movieList.getMarvelCinematicUniverse().get(position).getCategoryName());
      holder.binding.tvDiskFormat.setText(movieList.getMarvelCinematicUniverse().get(position).getDiscFormatName());

        Glide.with(holder.binding.tvTitle.getContext())
                .load("https://terrigen-cdn-dev.marvel.com/content/prod/1x/avengersendgame_lob_crd_05.jpg")
                .into(binding.imageView);
    }

    @Override
    public int getItemCount() {
        if(this.movieList !=null)
         return this.movieList.getMarvelCinematicUniverse().size();
        else
            return 0;
    }

    public class movieViewHolder extends RecyclerView.ViewHolder
    {
        RecyclerMoviesRowBinding binding;
        public movieViewHolder(RecyclerMoviesRowBinding itemBinding) {
            super(itemBinding.getRoot());
            this.binding = itemBinding;
        }
    }
}
