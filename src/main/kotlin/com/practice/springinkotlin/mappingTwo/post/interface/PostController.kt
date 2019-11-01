package com.practice.springinkotlin.mappingTwo.post.`interface`

import com.practice.springinkotlin.mappingTwo.post.service.PostService
import org.springframework.web.bind.annotation.RestController

@RestController
class PostController(val postService: PostService)