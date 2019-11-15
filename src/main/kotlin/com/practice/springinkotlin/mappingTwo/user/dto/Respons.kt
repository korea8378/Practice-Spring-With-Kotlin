package com.practice.springinkotlin.mappingTwo.user.dto

data class Response<T>(val status: Int, val error: String? = null, val message: String, val data: T?)