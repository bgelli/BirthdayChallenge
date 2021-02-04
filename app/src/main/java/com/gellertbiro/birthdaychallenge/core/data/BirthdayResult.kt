package com.gellertbiro.birthdaychallenge.core.data

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BirthdayResult(val name: Name, val dob: BirthdayInfo)