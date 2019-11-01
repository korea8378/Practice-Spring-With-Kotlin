package com.practice.springinkotlin.mappingTwo.comment.service

import com.practice.springinkotlin.mappingTwo.comment.domain.CommentRepository
import org.springframework.stereotype.Service

@Service
class CommentService(val commentRepository: CommentRepository)