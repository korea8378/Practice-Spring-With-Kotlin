package com.practice.springinkotlin.mappingOne.user.`interface`

import com.practice.springinkotlin.mappingOne.user.service.UserOneService
import org.springframework.web.bind.annotation.RestController

@RestController
class UserOneController(val userOneService: UserOneService)