package com.practice.springinkotlin.mappingTwo.post.service

import com.practice.springinkotlin.mappingTwo.post.domain.Post
import com.practice.springinkotlin.mappingTwo.post.domain.PostRepository
import com.practice.springinkotlin.mappingTwo.post.dto.ReqCreatePostDto
import com.practice.springinkotlin.mappingTwo.post.dto.ReqEditPostDto
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.*

@Service
class PostService(val postRepository: PostRepository) {
    fun create(requestCreatePostDto: ReqCreatePostDto): Post {
        val post = Post(requestCreatePostDto.writer, requestCreatePostDto.title, requestCreatePostDto.content,requestCreatePostDto.userId)
        return postRepository.save(post)
    }

    fun get(postId: Long): Optional<Post> {
        return postRepository.findById(postId)
    }

    fun fetch(): MutableList<Post> {
        return postRepository.findAll()
    }

    fun delete(postId: Long) {
        return postRepository.deleteById(postId)
    }

    @Transactional
    fun edit(postId: Long, reqEditPostDto: ReqEditPostDto): Post {
        val post: Post = postRepository.findById(postId).orElseThrow { RuntimeException() }
         reqEditPostDto.title?.let {
            post.title = it
        }
        reqEditPostDto.content?.let {
            post.content = it
        }
        return post
    }

}