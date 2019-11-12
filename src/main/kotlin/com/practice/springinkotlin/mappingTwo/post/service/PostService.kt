package com.practice.springinkotlin.mappingTwo.post.service

import com.practice.springinkotlin.mappingTwo.post.domain.Post
import com.practice.springinkotlin.mappingTwo.post.domain.PostRepository
import com.practice.springinkotlin.mappingTwo.post.dto.ReqCreatePostDto
import org.springframework.stereotype.Service
import java.util.*

@Service
class PostService(val postRepository: PostRepository) {
    fun createPost(requestCreatePostDto: ReqCreatePostDto): Post {
        val post = Post(requestCreatePostDto.writer,requestCreatePostDto.title,requestCreatePostDto.content,requestCreatePostDto.userId)
        return postRepository.save(post)
    }

    fun fetchPost(post_Id: Long): Optional<Post> {
        return postRepository.findById(post_Id)
    }

}