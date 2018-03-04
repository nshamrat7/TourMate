package com.example.nizamuddinshamrat.tourmate;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by Nizam Uddin Shamrat on 12/31/2017.
 */

public interface WeatherService {
    @GET()
    Call<WeatherResponse> getWeatherRespose(@Url String urlString);
}
