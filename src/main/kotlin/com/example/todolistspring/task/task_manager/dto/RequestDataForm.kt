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
    companion object {
        fun requireId(requestDataForm: RequestDataForm) = run {
            requestDataForm.taskId!!
        }

        fun requireTask(requestDataForm: RequestDataForm) = run {
            requestDataForm.task!!
        }

        fun requireResolveOption(requestDataForm: RequestDataForm) = run {
            requestDataForm.resolveOption!!
        }
    }
}
