package com.gellertbiro.birthdaychallenge.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val list: MutableLiveData<List<BirthDayListItem>> = MutableLiveData();

    fun loadData() {
        list.value = listOf(
                BirthDayListItem("DF", "xcvxcdf", "sdfsf"),
                BirthDayListItem("DF", "xcvxcdf", "sdfsf"),
                BirthDayListItem("DF", "xcvxcdf", "sdfsf"),
                BirthDayListItem("DF", "xcvxcdf", "sdfsf")
        )
    }
}