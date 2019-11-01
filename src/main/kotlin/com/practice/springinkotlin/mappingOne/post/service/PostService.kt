package com.practice.springinkotlin.mappingOne.post.service

import com.practice.springinkotlin.mappingOne.post.domain.PostRepository
import org.springframework.stereotype.Service

@Service
class PostService(val postRepository: PostRepository)