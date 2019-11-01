package com.practice.springinkotlin.mappingOne.post.domain

import org.springframework.data.jpa.repository.JpaRepository

interface PostOneRepository : JpaRepository<Post, Long>