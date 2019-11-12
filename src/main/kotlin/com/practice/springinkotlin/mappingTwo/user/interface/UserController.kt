package com.practice.springinkotlin.mappingTwo.user.`interface`

import com.practice.springinkotlin.mappingOne.post.domain.Post
import com.practice.springinkotlin.mappingOne.user.domain.User
import com.practice.springinkotlin.mappingTwo.user.dto.ReqSignInDto
import com.practice.springinkotlin.mappingTwo.user.dto.ReqSignUpDto
import com.practice.springinkotlin.mappingTwo.user.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/")
class UserController(val userService: UserService) {

    @PostMapping("/sign-in")
    fun signIn(@RequestBody reqSignInDto: ReqSignInDto): ResponseEntity<String> {
        val user = userService.signIn(reqSignInDto)
        return ResponseEntity.status(HttpStatus.OK).body("success id:${user.userId}")
    }

    @PostMapping("/sign-up")
    fun signUp(@RequestBody reqSignUpDto: ReqSignUpDto): ResponseEntity<String> {
        val user = userService.signUp(reqSignUpDto)
        return ResponseEntity.status(HttpStatus.OK).body("success id:${user.userId}")
    }

//    public user(@PathVariable id:Long) :String{
//        return return userService.id
//    }

//    var user: User = User(null, "user1", "user1", "lee", 24L, mutableListOf())
//
//    user = userOneRepository.save(user)
//
//    val postOne: Post = Post(null, "lee", "title1", "content1", 0L, 0L, user)
//    val postTwo: Post = Post(null, "lee2", "title2", "content2", 0L, 0L, user)
//
//    user.list.add(postOne)
//    user.list.add(postTwo)
//
//    userOneRepository.deleteAll()
//    postOneRepository.deleteAll()
}