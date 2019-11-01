package com.practice.springinkotlin.mappingOne.user.domain

import org.springframework.data.jpa.repository.JpaRepository

interface UserOneRepository: JpaRepository<User, Long>