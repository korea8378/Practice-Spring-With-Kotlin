package com.practice.springinkotlin.mappingTwo.user.`interface`

import com.practice.springinkotlin.mappingTwo.user.service.UserService
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(val userService: UserService)