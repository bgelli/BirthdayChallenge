package com.gellertbiro.birthdaychallenge.core

import com.gellertbiro.birthdaychallenge.core.data.service.BirthdayInfo
import com.gellertbiro.birthdaychallenge.core.data.service.BirthdayResult
import com.gellertbiro.birthdaychallenge.core.data.service.Name
import org.junit.Assert
import org.junit.Test

class DataMapperTest {
    @Test
    fun mapResultTest() {
        val resultList: List<BirthdayResult> = listOf(
            BirthdayResult(Name("Ms", "Johny", "Walker"), BirthdayInfo("1946-05-12T10:34:51.447Z", 23)),
            BirthdayResult(Name("Mr", "Angeline", "Walker"), BirthdayInfo("1946-11-04T10:34:51.447Z", 23)),
            BirthdayResult(Name("Mrs", "Johny", "Biden"), BirthdayInfo("1946-05-09T10:34:51.447Z", 23))
        )

        val list = DataMapper.mapResult(resultList)

        Assert.assertEquals("JB", list[0].initials)
        Assert.assertEquals("JW", list[1].initials)
        Assert.assertEquals("AW", list[2].initials)

        Assert.assertEquals("Mrs Johny Biden", list[0].name,)
        Assert.assertEquals("Ms Johny Walker", list[1].name,)
        Assert.assertEquals("Mr Angeline Walker", list[2].name)

        Assert.assertEquals("05-09-1946", list[0].dob)
        Assert.assertEquals("05-12-1946", list[1].dob)
        Assert.assertEquals("11-04-1946", list[2].dob)

    }
}