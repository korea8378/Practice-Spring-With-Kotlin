package com.practice.springinkotlin.mappingOne.post.`interface`

import com.practice.springinkotlin.mappingOne.post.service.PostOneService
import org.springframework.web.bind.annotation.RestController

@RestController
class PostOneController(val postOneService: PostOneService)