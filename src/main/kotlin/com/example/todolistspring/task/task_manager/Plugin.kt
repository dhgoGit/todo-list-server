package com.example.todolistspring.task.task_manager

interface Plugin {
    fun edit(taskEditFrom: TaskEditFrom)
    fun getFrom(task: Task):String
}