package com.practice.springinkotlin.mappingTwo.user.domain

import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, Long>