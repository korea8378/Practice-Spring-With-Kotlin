package com.practice.springinkotlin.mappingTwo.like.service

import com.practice.springinkotlin.mappingTwo.like.domain.Like
import com.practice.springinkotlin.mappingTwo.like.domain.LikeRepository
import com.practice.springinkotlin.mappingTwo.like.dto.ReqCreateLikeDto
import org.springframework.stereotype.Service

@Service
class LikeService(val likesRepository: LikeRepository) {
    fun create(postId: Long, requestCreateLikeDto: ReqCreateLikeDto): Like {
        val like = Like(requestCreateLikeDto.likeType, requestCreateLikeDto.postId, requestCreateLikeDto.userId)
        return likesRepository.save(like)
    }

    fun delete(postId: Long, userId: Long) {
        val like = likesRepository.findByPostId(postId)
        if (like.userId == userId)
            return likesRepository.deleteById(postId)
    }
}