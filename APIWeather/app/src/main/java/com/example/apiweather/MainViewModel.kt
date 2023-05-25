package com.example.apiweather

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.apiweather.adapters.WeatherModel

class MainViewModel: ViewModel() {
    val liveDataCurrent = MutableLiveData<WeatherModel>()
    val liveDataList = MutableLiveData<List<WeatherModel>>()
}