package com.example.todolistspring.task.task_manager

import com.example.todolistspring.task.task_manager.dto.RequestDataForm

interface Plugin {
    fun resolve(data: RequestDataForm)
}