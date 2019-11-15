package com.practice.springinkotlin.mappingTwo.comment.`interface`

import com.practice.springinkotlin.mappingTwo.comment.domain.Comment
import com.practice.springinkotlin.mappingTwo.comment.dto.ReqCreateCommentDto
import com.practice.springinkotlin.mappingTwo.comment.dto.ReqEditCommentDto
import com.practice.springinkotlin.mappingTwo.comment.service.CommentService
import com.practice.springinkotlin.mappingTwo.post.dto.ReqCreatePostDto
import com.practice.springinkotlin.mappingTwo.user.dto.Response
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RequestMapping("/posts/{postId}/comments")
@RestController
class CommentController(var commentService: CommentService) {
    @PostMapping("")
    fun create(@PathVariable postId: Long, @RequestBody requestCreateCommentDto: ReqCreateCommentDto): ResponseEntity<Response<Comment>> {
        val post = commentService.create(postId, requestCreateCommentDto)
        val response = Response(200, null, "", post)
        return ResponseEntity.status(HttpStatus.OK).body(response)
    }
    @GetMapping("")
    fun fetch(@PathVariable postId: Long): ResponseEntity<Response<MutableList<Comment>>> {
        val post = commentService.fetch(postId)
        val response = Response(200, null, "", post)
        return ResponseEntity.status(HttpStatus.OK).body(response)
    }

    @GetMapping("/{commentId}")
    fun get(@PathVariable commentId: Long): ResponseEntity<Response<Optional<Comment>>> {
        val post = commentService.get(commentId)
        val response = Response(200, null, "", post)
        return ResponseEntity.status(HttpStatus.OK).body(response)
    }

    @DeleteMapping("/{commentId}")
    fun delete(@PathVariable commentId:Long): ResponseEntity<Response<Unit>> {
        val post = commentService.delete(commentId)
        val response = Response(200, null, "", post)
        return ResponseEntity.status(HttpStatus.OK).body(response)
    }

    @PutMapping("/{commentId}")
    fun edit(@PathVariable commentId: Long, @RequestBody reqEditCommentDto: ReqEditCommentDto): ResponseEntity<Response<Comment>> {
        val post = commentService.edit(commentId, reqEditCommentDto)
        val response = Response(200, null, "", post)
        return ResponseEntity.status(HttpStatus.OK).body(response)
    }
}