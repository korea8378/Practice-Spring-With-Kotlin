package com.practice.springinkotlin.mappingOne.post.`interface`

import com.practice.springinkotlin.mappingOne.post.service.PostService
import org.springframework.web.bind.annotation.RestController

@RestController
class PostController(val postService: PostService)