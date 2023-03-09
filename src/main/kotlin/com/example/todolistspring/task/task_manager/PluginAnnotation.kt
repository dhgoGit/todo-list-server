package com.example.todolistspring.task.task_manager

import com.example.todolistspring.task.task_manager.enums.TaskType

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS)
annotation class PluginAnnotation(val value:TaskType){
}
