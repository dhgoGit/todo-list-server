package com.example.todolistspring.util

import com.example.todolistspring.task.task_manager.Task
import kotlin.reflect.KMutableProperty
import kotlin.reflect.full.memberProperties

fun <T : Task> updateTask(originOne: T, newOne: T) {
    Task::class.memberProperties.forEach { prop ->
        if (prop.get(newOne) != null && prop is KMutableProperty<*>) {
            prop.setter.call(prop.get(newOne))
        }
    }
    originOne.checkValidate()
}
