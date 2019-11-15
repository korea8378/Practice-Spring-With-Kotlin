package com.practice.springinkotlin.mappingTwo.like.`interface`

import com.practice.springinkotlin.mappingTwo.like.domain.Like
import com.practice.springinkotlin.mappingTwo.like.dto.ReqCreateLikeDto
import com.practice.springinkotlin.mappingTwo.like.service.LikeService
import com.practice.springinkotlin.mappingTwo.user.dto.Response
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/posts/{postId}/likes")
class LikeController(var likeService: LikeService){
    @PostMapping("")
    fun create(@PathVariable postId: Long, @RequestBody requestCreateLikeDto: ReqCreateLikeDto): ResponseEntity<Response<Like>> {
        val like = likeService.create(postId, requestCreateLikeDto)
        val response = Response(200, null, "", like)
        return ResponseEntity.status(HttpStatus.OK).body(response)
    }

    @DeleteMapping("/?postId={postId}&userId={userId}")
    fun delete(@RequestParam("postId") postId: Long ,@RequestParam("userId") userId:Long): ResponseEntity<Response<Unit>> {
        val like = likeService.delete(postId,userId)
        val response = Response(200, null, "", like)
        return ResponseEntity.status(HttpStatus.OK).body(response)
    }
}

