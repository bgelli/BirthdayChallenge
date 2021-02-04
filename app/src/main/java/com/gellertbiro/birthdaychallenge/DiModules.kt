package com.gellertbiro.birthdaychallenge

import com.gellertbiro.birthdaychallenge.core.BirthdayRepository
import com.gellertbiro.birthdaychallenge.core.BirthdayService
import com.gellertbiro.birthdaychallenge.ui.detail.DetailViewModel
import com.gellertbiro.birthdaychallenge.ui.main.MainViewModel
import com.squareup.moshi.Moshi
import okhttp3.OkHttpClient
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory


val appModule = module {
    viewModel { MainViewModel(get()) }
    viewModel { DetailViewModel() }
}

val coreModule = module {
    single<Moshi> { Moshi.Builder().build() }

    single { OkHttpClient.Builder().build() }

    single {
        Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create())
            .baseUrl("https://randomuser.me/api/?results=1000&seed=chalkboard&inc=name,dob")
            .client(get())
            .build()
    }

    single { get<Retrofit>().create(BirthdayService::class.java) }

    single { BirthdayRepository(get()) }
}
