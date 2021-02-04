package com.gellertbiro.birthdaychallenge.core.data.service

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BirthdaysResponse(
    val results: List<BirthdayResult>
)