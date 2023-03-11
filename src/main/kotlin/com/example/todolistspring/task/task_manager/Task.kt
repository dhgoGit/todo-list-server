package com.example.todolistspring.task.task_manager

import com.example.todolistspring.task.task_manager.enums.TaskType

interface Task {
    var taskName: String?
    var memo: String?
    fun print():String
    fun checkValidate():Task
}