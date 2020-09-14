package com.example.weatherapp2.Retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("weather?appid=ff3dea3db32e0b5e9f0b35238c8f079b&units=imperial")
    Call<Example> getWeatherData(@Query("q")String name);
}
