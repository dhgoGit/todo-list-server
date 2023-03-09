package com.example.todolistspring.util

import java.util.*

object DateFactory {
    fun gen(year: Int, month: Int, day: Int): Calendar {
        return Calendar
            .getInstance()
            .apply {
                set(Calendar.YEAR,year)
                set(Calendar.MONTH,month)
                set(Calendar.DATE,day)
            }
    }
}