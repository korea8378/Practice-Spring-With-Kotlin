package com.practice.springinkotlin.mappingTwo.post.`interface`

import com.practice.springinkotlin.mappingTwo.post.domain.Post
import com.practice.springinkotlin.mappingTwo.post.dto.ReqCreatePostDto
import com.practice.springinkotlin.mappingTwo.post.service.PostService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/posts")
class PostController(val postService: PostService){
    @PostMapping("/")
    fun createPost(@RequestBody requestCreatePostDto: ReqCreatePostDto) : ResponseEntity<Post> {
        val post = postService.createPost(requestCreatePostDto)
        return ResponseEntity.status(HttpStatus.OK).body(post)
    }

    @GetMapping("/{post_id}")
    fun fetchPost(@PathVariable post_id:Long): ResponseEntity<Optional<Post>> {
        val post = postService.fetchPost(post_id)
        return ResponseEntity.status(HttpStatus.OK).body(post)
    }
}