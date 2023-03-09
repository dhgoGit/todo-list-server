package com.example.todolistspring.task.task_manager

interface Task {
    val taskName: String
    val memo: String
    fun print():String
}