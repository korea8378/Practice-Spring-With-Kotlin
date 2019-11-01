package com.practice.springinkotlin.mappingTwo.like.service

import com.practice.springinkotlin.mappingTwo.like.domain.LikesRepository
import org.springframework.stereotype.Service

@Service
class LikeService(val likesRepository: LikesRepository)