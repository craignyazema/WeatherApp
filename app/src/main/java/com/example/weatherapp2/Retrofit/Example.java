package com.example.weatherapp2.Retrofit;

import com.google.gson.annotations.SerializedName;

public class Example {

    @SerializedName("main")
    private Main main;

    public com.example.weatherapp2.Retrofit.Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }
}
