package com.example.todolistspring.task.task_manager.task_models

import com.example.todolistspring.task.task_manager.Task
import com.example.todolistspring.task.task_manager.enums.TaskType
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*

data class SimpleTask(
    @JsonProperty("task_name")
    override var taskName: String?,
    @JsonProperty("memo")
    override var memo: String?,
    @JsonProperty("start_date")
    var startDate: Calendar?
) : Task {
    override fun print(): String = run{
        """
            |taskName : $taskName
            |memo : $memo
            |startDate : $startDate
        """.trimMargin()
    }

    override fun checkValidate() :Task{
        this::class.java.fields
            .forEach { it!! } //check not null
        return this
    }
}