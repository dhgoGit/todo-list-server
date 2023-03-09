package com.example.todolistspring.task_manager

import com.example.todolistspring.task_manager.task.Task

interface TaskManager {
    fun resolve(task:Task)
    fun delete(task:Task)
    fun edit(task: Task)
}