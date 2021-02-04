package com.gellertbiro.birthdaychallenge.core

import com.gellertbiro.birthdaychallenge.core.data.service.BirthdaysResponse
import retrofit2.Call
import retrofit2.http.GET

interface BirthdayService {

    @GET(".")
    fun getBirthDays(): Call<BirthdaysResponse>
}