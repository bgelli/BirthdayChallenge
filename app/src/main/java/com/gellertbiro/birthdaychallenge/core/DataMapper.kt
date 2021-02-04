package com.gellertbiro.birthdaychallenge.core

import android.annotation.SuppressLint
import com.gellertbiro.birthdaychallenge.core.data.domain.Birthday
import com.gellertbiro.birthdaychallenge.core.data.service.BirthdayResult
import java.text.ParseException
import java.text.SimpleDateFormat

class DataMapper {

    companion object {

        fun mapResult(result: List<BirthdayResult>): List<Birthday> {

            return result.map {
                Birthday(
                    "${it.name.first.first()}${it.name.last.first()}",
                    "${it.name.title} ${it.name.first} ${it.name.last}",
                    formatDate(it.dob.date),
                    it.dob.age
                )
            }.sortedBy {
                it.dob
            }
        }

        @SuppressLint("SimpleDateFormat")
        private fun formatDate(dateString: String): String {
            try {
                val date = SimpleDateFormat("yyyy-dd-MM'T'HH:mm:ss.sss'Z'").parse(dateString)
                date?.let {
                    return SimpleDateFormat("dd-MM-yyyy").format(date)
                }
            } catch (e: ParseException) {
                e.printStackTrace()
            }
            return ""
        }
    }

}