package com.example.todolistspring.task.task_manager

import com.example.todolistspring.task.task_manager.enums.TaskType
import com.example.todolistspring.util.logError
import org.reflections.Reflections

object PluginManager {
    private val pluginMap:Map<TaskType, Plugin>

    init {
        registerAnnotatedTasks()
        pluginMap = registerAnnotatedTasks()
    }

    fun getPlugin(taskType:TaskType): Plugin? {
        return pluginMap[taskType]
    }

    private fun registerAnnotatedTasks(): HashMap<TaskType, Plugin> {
        val tempPluginMap = HashMap<TaskType, Plugin>()

        Reflections("com.example.todolistspring.task.data")
            .getTypesAnnotatedWith(PluginAnnotation::class.java)
            .forEach {
                try{
                    val type = it.getAnnotation(PluginAnnotation::class.java).value
                    val plugin = it.newInstance() as Plugin
                    tempPluginMap[type] = plugin
                }catch (e:Error){
                    logError("$it is not a plugin type!!")
                }
            }
        return tempPluginMap
    }
}