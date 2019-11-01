package com.practice.springinkotlin.mappingOne.user.service

import com.practice.springinkotlin.mappingOne.user.domain.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(val userRepository: UserRepository)