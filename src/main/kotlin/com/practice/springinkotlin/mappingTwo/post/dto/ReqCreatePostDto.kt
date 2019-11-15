package com.practice.springinkotlin.mappingTwo.post.dto

data class ReqCreatePostDto(
        var writer: String,
        var title: String,
        var content: String,
        var userId: Long)
