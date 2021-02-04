package com.gellertbiro.birthdaychallenge.core.data

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
class BirthdayInfo(
    val date: String,
    val age: Int
)