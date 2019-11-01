package com.practice.springinkotlin.mappingTwo.user.service

import com.practice.springinkotlin.mappingTwo.user.domain.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(val userRepository: UserRepository)
