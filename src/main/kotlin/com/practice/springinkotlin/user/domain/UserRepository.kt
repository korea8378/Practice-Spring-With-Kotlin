package com.practice.springinkotlin.user.domain

import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, Long>