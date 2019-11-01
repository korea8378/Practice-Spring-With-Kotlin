package com.practice.springinkotlin.mappingTwo.post.domain

import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository : JpaRepository<Post, Long>