package com.gellertbiro.birthdaychallenge.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gellertbiro.birthdaychallenge.core.BirthdayRepository

class MainViewModel(private val repository: BirthdayRepository) : ViewModel() {

    val list: MutableLiveData<List<BirthDayListItem>> = MutableLiveData();

    fun loadData() {
        repository.getBirthdays { list ->
            this.list.postValue(list.map {
                BirthDayListItem(it.initials, it.name, it.dob)
            })
        }
    }
}