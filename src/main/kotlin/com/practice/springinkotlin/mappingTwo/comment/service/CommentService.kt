package com.practice.springinkotlin.mappingTwo.comment.service

import com.practice.springinkotlin.mappingTwo.comment.domain.Comment
import com.practice.springinkotlin.mappingTwo.comment.domain.CommentRepository
import com.practice.springinkotlin.mappingTwo.comment.dto.ReqCreateCommentDto
import com.practice.springinkotlin.mappingTwo.comment.dto.ReqEditCommentDto
import com.practice.springinkotlin.mappingTwo.post.domain.Post
import com.practice.springinkotlin.mappingTwo.post.dto.ReqCreatePostDto
import com.practice.springinkotlin.mappingTwo.post.service.PostService
import com.practice.springinkotlin.mappingTwo.user.dto.Response
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.*
import java.util.*

@Service


@RestController
@RequestMapping("/posts")
class CommentService(val commentRepository: CommentRepository) {
    fun create(postId: Long, requestCreateCommentDto: ReqCreateCommentDto): Comment {
        val comment = Comment(requestCreateCommentDto.writer,  requestCreateCommentDto.content,requestCreateCommentDto.userId, postId)
        return commentRepository.save(comment)
    }

    fun get(commentId: Long): Optional<Comment> {
        return commentRepository.findById(commentId)
    }

    fun fetch(postId: Long): MutableList<Comment> {
        return commentRepository.findByPostId(postId)
    }

    fun delete(commentId: Long) {
        return commentRepository.deleteById(commentId)
    }

    @Transactional
    fun edit(commentId: Long, reqEditCommentDto: ReqEditCommentDto): Comment? {
        val comment = commentRepository.findById(commentId).orElseThrow { RuntimeException() }
        reqEditCommentDto.content?.let {
            comment.content = it
        }
        return comment
    }

}