package com.practice.springinkotlin.mappingOne.comment.domain

import org.springframework.data.jpa.repository.JpaRepository


interface CommentOneRepository: JpaRepository<Comment, Long>