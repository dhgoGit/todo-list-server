package com.example.todolistspring.task_manager.plugins

import com.example.todolistspring.task_manager.task.Task

interface Plugin {
    fun isAvailable(task: Task):Boolean
    fun handle(forms:List<String>):Unit
}