package com.practice.springinkotlin.mappingOne.user.`interface`

import com.practice.springinkotlin.mappingOne.user.service.UserService
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(val userService: UserService)