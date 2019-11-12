package com.practice.springinkotlin.mappingTwo.user.domain

import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

//DB랑 실질적 연결되는 애
interface UserRepository: JpaRepository<User, Long> {
    fun findByUserIdAndPassword(userId:String,password:String):User
}