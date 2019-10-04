package com.practice.springinkotlin.user.service

import com.practice.springinkotlin.user.domain.User
import com.practice.springinkotlin.user.dto.ReqUserDto
import com.practice.springinkotlin.user.dto.ResUserDto
import org.springframework.stereotype.Component

@Component
class UserMapper {
    fun toResUserDto(user: User) = ResUserDto(user.id!!, user.name, user.age)

    fun toUser(reqUserDto: ReqUserDto): User = User(reqUserDto.name, reqUserDto.age)
}