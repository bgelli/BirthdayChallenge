package com.gellertbiro.birthdaychallenge

import com.gellertbiro.birthdaychallenge.ui.detail.DetailViewModel
import com.gellertbiro.birthdaychallenge.ui.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val appModule = module {
    viewModel { MainViewModel() }
    viewModel { DetailViewModel() }
}
