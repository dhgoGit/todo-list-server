package com.example.todolistspring.task_manager.task

import com.example.todolistspring.task_manager.TaskManager

interface Task {
    val taskName:String
    val memo:String
    fun print():String
}