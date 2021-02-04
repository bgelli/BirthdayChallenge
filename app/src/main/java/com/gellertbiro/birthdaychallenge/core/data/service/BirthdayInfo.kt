package com.gellertbiro.birthdaychallenge.core.data.service

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
class BirthdayInfo(
    val date: String,
    val age: Int
)