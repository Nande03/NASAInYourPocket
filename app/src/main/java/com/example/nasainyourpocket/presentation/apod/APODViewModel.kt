package com.example.nasainyourpocket.presentation.apod

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.nasainyourpocket.domain.model.Apod
import com.example.nasainyourpocket.domain.repository.ApodRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

class APODViewModel @Inject constructor(private val apodRepository: ApodRepository) : ViewModel() {

    val apodData = MutableLiveData<Apod>()

    fun fetchApod() {
        viewModelScope.launch {
            apodData.value = apodRepository.getApod()
        }
    }
}