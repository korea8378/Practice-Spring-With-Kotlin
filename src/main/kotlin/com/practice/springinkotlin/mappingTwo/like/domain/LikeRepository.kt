package com.practice.springinkotlin.mappingTwo.like.domain

import org.springframework.data.jpa.repository.JpaRepository

interface LikeRepository: JpaRepository<Like, Long>{
    fun findByPostId(postId: Long): Like

}