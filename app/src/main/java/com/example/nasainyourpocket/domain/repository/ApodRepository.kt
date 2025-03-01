package com.example.nasainyourpocket.domain.repository

import com.example.nasainyourpocket.domain.model.Apod
import com.example.nasainyourpocket.data.remote.api.NasaApiService
import com.example.nasainyourpocket.Util.Constants
import com.example.nasainyourpocket.Util.DateUtil

class ApodRepository(private val nasaApiService: NasaApiService) {
    suspend fun getApod(): Apod = nasaApiService.getApod(Constants.API_KEY, DateUtil.getCurrentDate())
}