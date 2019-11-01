package com.practice.springinkotlin.mappingOne.post.domain

import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository : JpaRepository<Post, Long>