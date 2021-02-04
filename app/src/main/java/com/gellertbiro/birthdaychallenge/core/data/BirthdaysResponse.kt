package com.gellertbiro.birthdaychallenge.core.data

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BirthdaysResponse(
    val results: List<BirthdayResult>
)