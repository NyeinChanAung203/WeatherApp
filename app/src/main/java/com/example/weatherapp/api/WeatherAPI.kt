package com.example.weatherapp.api

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


// /v1/current.json?key=123123123&q=London&aqi=no
interface WeatherAPI {
    @GET("/v1/current.json")
    suspend fun getWeather(
        @Query("key") apiKey:String,
        @Query("q") city:String,
    ): Response<WeatherModel>
}