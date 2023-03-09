package com.example.todolistspring.task.task_manager.plugins

import com.example.todolistspring.task.task_manager.Plugin
import com.example.todolistspring.task.task_manager.enums.TaskType
import com.example.todolistspring.task.task_manager.TaskEditFrom
import com.example.todolistspring.task.task_manager.PluginAnnotation
import com.example.todolistspring.task.task_manager.Task

@PluginAnnotation(TaskType.SIMPLE_TASK)
class SimpleTaskPlugin : Plugin {
    override fun edit(taskEditFrom: TaskEditFrom) {
        TODO("Not yet implemented")
    }

    override fun getFrom(task: Task): String {
        TODO("Not yet implemented")
    }

}