package com.example.todolistspring.task.task_manager

import com.example.todolistspring.task.task_manager.dto.RequestDataForm
import com.example.todolistspring.task.task_manager.enums.TaskResolveOption

interface Plugin {
    fun resolve(data: RequestDataForm)
}