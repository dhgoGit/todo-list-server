package com.example.todolistspring.task.task_manager.plugins

import com.example.todolistspring.task.task_manager.Plugin
import com.example.todolistspring.task.task_manager.dto.RequestDataForm
import com.example.todolistspring.task.task_manager.enums.TaskResolveOption
import com.example.todolistspring.task.task_manager.task_models.SimpleTask
import com.example.todolistspring.util.updateTask
import java.util.*

class SimpleTaskPlugin : Plugin {
    override fun resolve(data: RequestDataForm): Unit = run {

        when (data.resolveOption) {
            TaskResolveOption.CREATE -> create(data)
            TaskResolveOption.READ -> read(data)
            TaskResolveOption.UPDATE -> update(data)
            TaskResolveOption.DELETE -> delete(data)
            else -> throw Error("this resolve option is not supported")
        }
    }

    private fun create(data: RequestDataForm) = run {
        data.requireTask()
            .checkValidate()
            .apply {
                //todo dao 가 필요해.
            }
    }

    private fun read(data: RequestDataForm) = run{
        val id =data.requireId()
        print("")
    }

    private fun delete(data: RequestDataForm) = run {
        data.requireId()
    }

    private fun update(data: RequestDataForm) = run {
        val id =
            data.requireId()
        val task =
            data.requireTask()
                .run{
                    //todo dao 가 필요해.
                    val origin = SimpleTask("원본 데이터","흠", Calendar.getInstance())//날짜 관련 유틸 함수가 필요함.
                    updateTask(origin,this)
                }

    }


}