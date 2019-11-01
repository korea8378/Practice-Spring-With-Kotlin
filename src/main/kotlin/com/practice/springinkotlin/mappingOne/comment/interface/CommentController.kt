package com.practice.springinkotlin.mappingOne.comment.`interface`

import com.practice.springinkotlin.mappingOne.comment.service.CommentOneService
import org.springframework.web.bind.annotation.RestController

@RestController
class CommentOneController(var commentOneService: CommentOneService)