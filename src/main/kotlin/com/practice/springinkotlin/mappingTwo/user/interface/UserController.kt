package com.practice.springinkotlin.mappingTwo.user.`interface`

import com.practice.springinkotlin.mappingTwo.user.domain.User
import com.practice.springinkotlin.mappingTwo.user.dto.ReqSignInDto
import com.practice.springinkotlin.mappingTwo.user.dto.ReqSignUpDto
import com.practice.springinkotlin.mappingTwo.user.dto.Response
import com.practice.springinkotlin.mappingTwo.user.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/")
class UserController(val userService: UserService) {

    @PostMapping("/sign-in")
    fun signIn(@RequestBody reqSignInDto: ReqSignInDto): ResponseEntity<Response<User.User>> {
        val user = User.User(userService.signIn(reqSignInDto).userId)
        val response = Response(200, null, "",  user )
        return ResponseEntity.status(HttpStatus.OK).body(response)
    }

    @PostMapping("/sign-up")
    fun signUp(@RequestBody reqSignUpDto: ReqSignUpDto): ResponseEntity<String> {
        val user = userService.signUp(reqSignUpDto)
        return ResponseEntity.status(HttpStatus.OK).body("success id:${user.userId}")
    }

}