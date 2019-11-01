package com.practice.springinkotlin.mappingOne.comment.service

import com.practice.springinkotlin.mappingOne.comment.domain.CommentRepository
import org.springframework.stereotype.Service

@Service
class CommentService(val commentRepository: CommentRepository)