package com.practice.springinkotlin.mappingOne.like.domain

import org.springframework.data.jpa.repository.JpaRepository

interface LikeRepository: JpaRepository<Like, Long>