package com.example.todolistspring.task.task_manager.enums

import com.example.todolistspring.task.task_manager.Plugin
import com.example.todolistspring.task.task_manager.Task
import com.example.todolistspring.task.task_manager.plugins.SimpleTaskPlugin
import com.example.todolistspring.task.task_manager.task_models.SimpleTask

enum class TaskType(val task:Class<out Task>, val plugin:Class<out Plugin>) {
    SIMPLE_TASK(SimpleTask::class.java, SimpleTaskPlugin::class.java),
}