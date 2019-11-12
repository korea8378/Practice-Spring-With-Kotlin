package com.practice.springinkotlin.mappingTwo.user.dto

data class ReqSignUpDto(
        val userId: String,
        val password: String,
        val name: String,
        val age: Int)