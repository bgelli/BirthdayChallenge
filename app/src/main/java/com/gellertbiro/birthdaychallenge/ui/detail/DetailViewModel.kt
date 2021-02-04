package com.gellertbiro.birthdaychallenge.ui.detail

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gellertbiro.birthdaychallenge.core.data.domain.Birthday

class DetailViewModel : ViewModel() {

    val birthDay: MutableLiveData<Birthday> = MutableLiveData()

    fun loadData(id: String) {
        //TODO
        birthDay.value = Birthday("AD", "Jane", "24", 24)
    }
}