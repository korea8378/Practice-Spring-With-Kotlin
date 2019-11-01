package com.practice.springinkotlin.mappingTwo.comment.`interface`

import com.practice.springinkotlin.mappingTwo.comment.service.CommentService
import org.springframework.web.bind.annotation.RestController

@RestController
class CommentController(var commentService: CommentService)