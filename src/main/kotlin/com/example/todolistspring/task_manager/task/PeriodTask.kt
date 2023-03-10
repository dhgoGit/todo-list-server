package com.example.todolistspring.task_manager.task

import com.example.todolistspring.task_manager.TaskManager
import com.example.todolistspring.util.logInfo
import org.springframework.stereotype.Component
import java.util.*

class PeriodTask(
    override val taskName: String,
    override val memo: String,
    private var startDate: Calendar,
    private var endDate: Calendar
) : Task {
    init {
        if (startDate.after(endDate)){
            throw Error("the 'endDate' have to be after 'startDate'")
        }
        logInfo("PeriodTask Generated")
    }
    override fun print(): String = run{
        """
            |taskName : $taskName
            |memo : $memo
            |startDate : $startDate
            |endDate : $endDate
        """.trimMargin()
    }
    fun setStartAndEnd(startDate: Calendar = this.startDate, endDate:Calendar = this.endDate){
        if (startDate.after(endDate)){
            throw Error("the 'endDate' have to be after 'startDate'")
        }
        this.startDate = startDate
        this.endDate = endDate
    }

    fun getStartDate(): Calendar {
        return this.startDate
    }
    fun getEndDate(): Calendar {
        return this.endDate
    }
}