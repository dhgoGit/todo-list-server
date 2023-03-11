package com.example.todolistspring.task.task_manager

import com.example.todolistspring.task.task_manager.dto.RequestDataForm
import com.example.todolistspring.task.task_manager.enums.TaskType

object PluginManager {
    private val pluginMap: Map<Class<in Task>, Plugin>

    init {
        pluginMap = getPluginMap()
    }

    /**
     * 유효성 검사와 함께 Plugin으로 편집한 Task를 넘겨준다.
     **/
    fun resolveTask(data: RequestDataForm?) = run {
        data?.task
            ?.run{
                pluginMap[this.javaClass]!!
                    .resolve(data)
        }
    }

    private fun getPluginMap(): HashMap<Class<in Task>, Plugin> {
        val tempPluginMap = HashMap<Class<in Task>, Plugin>()

        TaskType
            .values()
            .forEach { type ->
                tempPluginMap[type.task.javaClass] =
                    type.plugin
                        .getConstructor()
                        .newInstance()
            }
        return tempPluginMap
    }

}