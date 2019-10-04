package com.practice.springinkotlin.user.service

import com.practice.springinkotlin.user.domain.User
import com.practice.springinkotlin.user.domain.UserRepository
import com.practice.springinkotlin.user.dto.ReqUserDto
import com.practice.springinkotlin.user.dto.ResUserDto
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class UserService(val userRepository: UserRepository, val userMapper: UserMapper) {
    fun getUser(userId: Long): ResUserDto {
        val resultUser: User = userRepository.findById(userId).orElseThrow { throw NullPointerException() }
        return userMapper.toResUserDto(resultUser)
    }

    fun insertUser(reqUserDto: ReqUserDto): ResUserDto{
        var user: User = userMapper.toUser(reqUserDto)
        user = userRepository.save(user)
        return userMapper.toResUserDto(user)
    }

    @Transactional
    fun updateUser(userId: Long, reqUserDto: ReqUserDto): ResUserDto {
        val user: User = userRepository.findById(userId).orElseThrow { throw NullPointerException() }
        user.updateInfo(reqUserDto.name, reqUserDto.age)
        return userMapper.toResUserDto(user)
    }

    fun deleteUser(userId: Long) {
        userRepository.deleteById(userId)
    }

}