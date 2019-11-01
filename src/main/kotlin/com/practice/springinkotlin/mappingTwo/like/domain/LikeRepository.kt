package com.practice.springinkotlin.mappingTwo.like.domain

import org.springframework.data.jpa.repository.JpaRepository

interface LikesRepository: JpaRepository<Likes, Long>