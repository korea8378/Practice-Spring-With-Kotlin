package com.practice.springinkotlin.mappingTwo.post.`interface`

import com.practice.springinkotlin.mappingTwo.user.dto.Response
import com.practice.springinkotlin.mappingTwo.post.domain.Post
import com.practice.springinkotlin.mappingTwo.post.dto.ReqCreatePostDto
import com.practice.springinkotlin.mappingTwo.post.dto.ReqEditPostDto
import com.practice.springinkotlin.mappingTwo.post.service.PostService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/posts")
class PostController(val postService: PostService){
    @PostMapping("")
    fun create(@RequestBody requestCreatePostDto: ReqCreatePostDto) : ResponseEntity<Response<Post>> {
        val post = postService.create(requestCreatePostDto)
        val response = Response(200, null, "", post)
        return ResponseEntity.status(HttpStatus.OK).body(response)
    }
    @GetMapping("")
    fun get(): ResponseEntity<Response<MutableList<Post>>> {
        val post = postService.fetch()
        val response = Response(200, null, "", post)
        return ResponseEntity.status(HttpStatus.OK).body(response)
    }

    @GetMapping("/{postId}")
    fun fetch(@PathVariable postId: Long): ResponseEntity<Response<Optional<Post>>> {
        val post = postService.get(postId)
        val response = Response(200, null, "", post)
        return ResponseEntity.status(HttpStatus.OK).body(response)
    }

    @DeleteMapping("/{postId}")
    fun delete(@PathVariable postId:Long): ResponseEntity<Response<Unit>> {
        val post = postService.delete(postId)
        val response = Response(200, null, "", post)
        return ResponseEntity.status(HttpStatus.OK).body(response)
    }

    @PutMapping("/{postId}")
    fun edit(@PathVariable postId: Long, @RequestBody reqEditPostDto: ReqEditPostDto): ResponseEntity<Response<Post>> {
        val post: Post = postService.edit(postId, reqEditPostDto)
        val response = Response(200, null, "", post)
        return ResponseEntity.status(HttpStatus.OK).body(response)
    }
}