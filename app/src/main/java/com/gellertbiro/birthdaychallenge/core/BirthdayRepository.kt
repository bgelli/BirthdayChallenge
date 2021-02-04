package com.gellertbiro.birthdaychallenge.core

import com.gellertbiro.birthdaychallenge.core.data.domain.Birthday
import com.gellertbiro.birthdaychallenge.core.data.service.BirthdaysResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class BirthdayRepository(private val service: BirthdayService) {

    fun getBirthdays(listener: (List<Birthday>) -> Unit) {
        service.getBirthDays().enqueue(object : Callback<BirthdaysResponse> {

            override fun onResponse(call: Call<BirthdaysResponse>, response: Response<BirthdaysResponse>) {
                response.body()?.let {
                    listener.invoke(DataMapper.mapResult(it.results))
                }
            }

            override fun onFailure(call: Call<BirthdaysResponse>, t: Throwable) {
                TODO("Not yet implemented")
            }
        })
    }
}