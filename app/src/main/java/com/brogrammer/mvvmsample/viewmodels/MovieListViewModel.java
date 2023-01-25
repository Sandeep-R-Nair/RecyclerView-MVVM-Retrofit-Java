package com.brogrammer.mvvmsample.viewmodels;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.brogrammer.mvvmsample.apis.APIServices;
import com.brogrammer.mvvmsample.apis.RetroInstance;
import com.brogrammer.mvvmsample.models.MoviesResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MovieListViewModel extends ViewModel
{
    private MutableLiveData<MoviesResponse> movielist;

    public MovieListViewModel(){
        movielist=new MutableLiveData<>();
    }

    public MutableLiveData<MoviesResponse> getMovieListObserver()
    {
        return movielist;
    }

    public void makeApiCall()
    {
        APIServices apiServices= RetroInstance.getRetroClient().create(APIServices.class);
        Call<MoviesResponse> call=apiServices.getMovieList();
        call.enqueue(new Callback<MoviesResponse>() {
            @Override
            public void onResponse(Call<MoviesResponse> call, Response<MoviesResponse> response) {
                movielist.postValue(response.body());
            }

            @Override
            public void onFailure(Call<MoviesResponse> call, Throwable t) {
                movielist.postValue(null);
                Log.e("Error :",t.getMessage().toString());
            }
        });


    }
}
