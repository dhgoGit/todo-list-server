package com.example.todolistspring.task

import com.example.todolistspring.task_manager.task.PeriodTask
import com.example.todolistspring.util.DateFactory
import com.example.todolistspring.util.logInfo
import io.kotest.core.spec.style.FeatureSpec

class PeriodTaskTest :FeatureSpec(){
    init {
        feature("테스크 생성하고 로그로 확인"){
            scenario("테스크 생성한다."){
                PeriodTask(
                    "나의 기간이 있는 테스크",
                    "나의 메모",
                    DateFactory.gen(2023,2,12),
                    DateFactory.gen(2023,2,13)
                ).apply{
                    logInfo("${this.memo}")
                }
            }
        }
    }
}