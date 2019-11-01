package com.practice.springinkotlin.mappingOne.like.service

import com.practice.springinkotlin.mappingTwo.like.domain.LikeRepository
import org.springframework.stereotype.Service

@Service
class LikeService(val likeRepository: LikeRepository)