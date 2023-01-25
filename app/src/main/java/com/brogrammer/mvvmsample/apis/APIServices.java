package com.brogrammer.mvvmsample.apis;

import com.brogrammer.mvvmsample.models.MoviesResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIServices
{
    @GET("mcu.json")
    Call<MoviesResponse> getMovieList();
}
