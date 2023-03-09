package com.example.todolistspring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TodoListSpringApplication

fun main(args: Array<String>) {
    runApplication<TodoListSpringApplication>(*args)
}
