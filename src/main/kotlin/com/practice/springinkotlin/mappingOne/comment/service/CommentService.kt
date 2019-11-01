package com.practice.springinkotlin.mappingOne.comment.service

import com.practice.springinkotlin.mappingOne.comment.domain.CommentOneRepository
import org.springframework.stereotype.Service

@Service
class CommentOneService(val commentOneRepository: CommentOneRepository)