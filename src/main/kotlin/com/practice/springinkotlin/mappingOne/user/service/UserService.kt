package com.practice.springinkotlin.mappingOne.user.service

import com.practice.springinkotlin.mappingOne.user.domain.UserOneRepository
import org.springframework.stereotype.Service

@Service
class UserOneService(val userOneRepository: UserOneRepository)