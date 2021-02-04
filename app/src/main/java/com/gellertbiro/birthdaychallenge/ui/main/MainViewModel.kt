package com.gellertbiro.birthdaychallenge.ui.main

import androidx.lifecycle.ViewModel

class MainViewModel(private val adapter: BirthDayListAdapter) : ViewModel() {

    fun loadData() {
        adapter.submitList(
            listOf(
                BirthDayListItem("DF","xcvxcdf", "sdfsf"),
                BirthDayListItem("DF","xcvxcdf", "sdfsf"),
                BirthDayListItem("DF","xcvxcdf", "sdfsf"),
                BirthDayListItem("DF","xcvxcdf", "sdfsf")
            )
        )
    }
}