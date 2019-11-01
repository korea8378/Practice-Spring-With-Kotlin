package com.practice.springinkotlin.mappingOne.like.service

import com.practice.springinkotlin.mappingOne.like.domain.LikesOneRepository
import org.springframework.stereotype.Service

@Service
class LikeOneService(val likesOneRepository: LikesOneRepository)