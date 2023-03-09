package com.example.todolistspring.task_manager.plugins

import com.example.todolistspring.task_manager.task.PeriodTask
import com.example.todolistspring.task_manager.task.Task
import org.springframework.stereotype.Component

@Component
class PeriodTaskPlugin : Plugin {
    override fun isAvailable(task: Task): Boolean {
        return task is PeriodTask
    }
    /**todo
     * 01Form을 json 형식으로 받아올 수 있게 해야한다. 그래야 처리하기 쉬워진다**/
    override fun handle(forms: List<String>) {

    }


}