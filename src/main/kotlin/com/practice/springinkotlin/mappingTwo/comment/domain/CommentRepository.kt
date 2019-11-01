package com.practice.springinkotlin.mappingTwo.comment.domain

import org.springframework.data.jpa.repository.JpaRepository


interface CommentRepository: JpaRepository<Comment, Long>