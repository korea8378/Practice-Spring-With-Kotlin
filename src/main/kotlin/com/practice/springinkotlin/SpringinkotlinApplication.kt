package com.practice.springinkotlin
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringinkotlinApplication {

    fun main(args: Array<String>) {
        runApplication<SpringinkotlinApplication>(*args)
    }
}