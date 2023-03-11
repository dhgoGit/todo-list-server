package com.example.todolistspring.task.task_manager.dto

import com.example.todolistspring.task.task_manager.Task
import com.example.todolistspring.task.task_manager.enums.TaskResolveOption
import com.example.todolistspring.task.task_manager.enums.TaskType
import com.fasterxml.jackson.annotation.JsonProperty

data class RequestDataForm(
    @JsonProperty("task_id")
    val taskId: Int? = null,
    @JsonProperty("task")
    val task: Task? = null,
    @JsonProperty("task_type")
    val taskType: TaskType,
    @JsonProperty("resolve_option")
    val resolveOption: TaskResolveOption? = null,
) {
    fun requireId() = run {
        taskId!!
    }

    fun requireTask() = run {
        task!!
    }

    fun requireResolveOption() = run {
        resolveOption!!
    }

}
