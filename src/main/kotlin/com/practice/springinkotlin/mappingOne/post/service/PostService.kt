package com.practice.springinkotlin.mappingOne.post.service

import com.practice.springinkotlin.mappingOne.post.domain.PostOneRepository
import org.springframework.stereotype.Service

@Service
class PostOneService(val postOneRepository: PostOneRepository)