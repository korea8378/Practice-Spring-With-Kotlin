package com.practice.springinkotlin.mappingTwo.user.dto

data class ReqSignInDto(
        val userId: String,
        val password: String,
        val name: String,
        val age: Int)