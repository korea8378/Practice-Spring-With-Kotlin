package com.practice.springinkotlin.mappingOne.like.`interface`

import com.practice.springinkotlin.mappingTwo.like.service.LikeService
import org.springframework.web.bind.annotation.RestController

@RestController
class LikeController(var likeService: LikeService)