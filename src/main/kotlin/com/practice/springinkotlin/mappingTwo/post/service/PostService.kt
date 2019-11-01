package com.practice.springinkotlin.mappingTwo.post.service

import com.practice.springinkotlin.mappingTwo.post.domain.PostRepository
import org.springframework.stereotype.Service

@Service
class PostService(val postRepository: PostRepository)