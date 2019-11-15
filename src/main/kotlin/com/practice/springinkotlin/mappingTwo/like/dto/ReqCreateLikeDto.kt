package com.practice.springinkotlin.mappingTwo.like.dto

import com.practice.springinkotlin.mappingTwo.like.domain.LikeType

data class ReqCreateLikeDto(var likeType: LikeType,
                            var postId: Long,
                            var userId: Long)