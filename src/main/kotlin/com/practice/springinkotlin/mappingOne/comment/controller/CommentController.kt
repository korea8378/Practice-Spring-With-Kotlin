package com.practice.springinkotlin.mappingOne.comment.controller

import com.practice.springinkotlin.mappingOne.comment.service.CommentService
import org.springframework.web.bind.annotation.RestController

@RestController
class CommentController(var commentService: CommentService)