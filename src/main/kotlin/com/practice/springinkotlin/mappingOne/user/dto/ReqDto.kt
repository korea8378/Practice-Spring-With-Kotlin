package com.practice.springinkotlin.mappingOne.user.dto

data class ReqUserDto(
        val userId: String,
        val password: String,
        val name: String,
        val age: Long)