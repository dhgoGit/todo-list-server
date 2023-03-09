package com.example.todolistspring.task

import com.example.todolistspring.task.task_manager.enums.FindOption
import com.example.todolistspring.task.task_manager.Task

interface TaskService {
    fun addTask(task: Task): Task

    fun deleteTask(task: Task): Task

    fun edit(task: Task): Task

    fun findTaskWith(id: String, option: FindOption): List<Task>

}