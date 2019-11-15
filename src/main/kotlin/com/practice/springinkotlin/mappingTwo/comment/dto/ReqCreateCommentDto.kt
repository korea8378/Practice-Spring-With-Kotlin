package com.practice.springinkotlin.mappingTwo.comment.dto

data class ReqCreateCommentDto(
        var writer: String,
        var content: String,
        var userId: Long
)