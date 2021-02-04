package com.gellertbiro.birthdaychallenge.core.data.service

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BirthdayResult(val name: Name, val dob: BirthdayInfo)