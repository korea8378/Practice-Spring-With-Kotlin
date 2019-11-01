package com.practice.springinkotlin.mappingTwo.user.dto

data class ReqUserDto(
        val userId: String,
        val password: String,
        val name: String,
        val age: Long)