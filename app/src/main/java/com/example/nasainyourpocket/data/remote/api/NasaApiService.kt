package com.example.nasainyourpocket.data.remote.api

import com.example.nasainyourpocket.domain.model.Apod
import retrofit2.http.GET
import retrofit2.http.Query

interface NasaApiService {

    @GET("planetary/apod")
    suspend fun getApod(@Query("qulRTg1jNCTGwoECb4ecnl9H9HEwzC6lrCYGaIFM") apiKey: String, @Query("date") date: String): Apod
}