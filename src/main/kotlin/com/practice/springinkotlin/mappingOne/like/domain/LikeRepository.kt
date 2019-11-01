package com.practice.springinkotlin.mappingOne.like.domain

import org.springframework.data.jpa.repository.JpaRepository

interface LikesOneRepository: JpaRepository<Likes, Long>