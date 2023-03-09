package com.example.todolistspring.task.task_manager.task_models

import com.example.todolistspring.task.task_manager.Task
import java.util.*

class SimpleTask(
    override val taskName: String,
    override val memo: String,
    var startDate: Calendar
) : Task {
    override fun print(): String = run{
        """
            |taskName : $taskName
            |memo : $memo
            |startDate : $startDate
        """.trimMargin()
    }
    fun setStart(startDate: Calendar){
        this.startDate = startDate
    }
}