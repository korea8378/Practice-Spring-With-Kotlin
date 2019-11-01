package com.practice.springinkotlin.mappingOne.comment.domain

import org.springframework.data.jpa.repository.JpaRepository


interface CommentRepository: JpaRepository<Comment, Long>