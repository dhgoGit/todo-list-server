package com.example.todolistspring.task.task_manager.task_models

import com.example.todolistspring.task.task_manager.Task
import com.example.todolistspring.task.task_manager.enums.TaskType
import com.example.todolistspring.util.logInfo
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*

data class PeriodTask(
    @JsonProperty("task_name")
    override var taskName: String?,
    @JsonProperty("memo")
    override var memo: String?,
    @JsonProperty("start_date")
    private var startDate: Calendar?,
    @JsonProperty("end_date")
    private var endDate: Calendar?
) : Task {
    init {
        logInfo("PeriodTask Generated")
    }

    override fun print(): String = run {
        """
            |taskName : $taskName
            |memo : $memo
            |startDate : $startDate
            |endDate : $endDate
        """.trimMargin()
    }

    override fun checkValidate():Task {
        this::class.java.fields
            .forEach { it!! } //check not null

        startDate
            ?.takeIf { it.after(endDate) }
            ?.let { throw Error("the 'endDate' have to be after 'startDate'") } //validation check
        return this
    }
}