package com.practice.springinkotlin.mappingOne.like.`interface`

import com.practice.springinkotlin.mappingOne.like.service.LikeOneService
import org.springframework.web.bind.annotation.RestController

@RestController
class LikeOneController(var likeOneService: LikeOneService)