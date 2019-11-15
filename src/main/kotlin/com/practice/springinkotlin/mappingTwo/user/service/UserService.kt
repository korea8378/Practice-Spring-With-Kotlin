package com.practice.springinkotlin.mappingTwo.user.service

import com.practice.springinkotlin.mappingTwo.user.domain.User
import com.practice.springinkotlin.mappingTwo.user.domain.UserRepository
import com.practice.springinkotlin.mappingTwo.user.dto.ReqSignInDto
import com.practice.springinkotlin.mappingTwo.user.dto.ReqSignUpDto
import org.springframework.stereotype.Service


@Service
class UserService(val userRepository: UserRepository) {

    fun signUp(reqSignInDto: ReqSignUpDto): User {
        val user = User(reqSignInDto.userId,reqSignInDto.password,reqSignInDto.name, reqSignInDto.age)
        return  userRepository.save(user)
    }

    fun signIn(reqSignInDto: ReqSignInDto): User {
        return userRepository.findByUserIdAndPassword(reqSignInDto.userId, reqSignInDto.password)
    }
}

