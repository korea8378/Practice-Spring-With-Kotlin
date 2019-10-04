package com.practice.springinkotlin.user

import com.practice.springinkotlin.user.dto.ReqUserDto
import org.springframework.http.ResponseEntity
import com.practice.springinkotlin.user.dto.ResUserDto
import org.springframework.http.HttpStatus
import com.practice.springinkotlin.user.service.UserService
import org.springframework.web.bind.annotation.*

@RestController
class UserController(val userService: UserService) {

    @GetMapping("/user/{userId}")
    fun getUser(@PathVariable userId: Long): ResponseEntity<ResUserDto> =
            ResponseEntity.status(HttpStatus.OK).body(userService.getUser(userId))

    @PostMapping("/user")
    fun insertUser(@RequestBody reqUserDto: ReqUserDto): ResponseEntity<ResUserDto> =
            ResponseEntity.status(HttpStatus.OK).body(userService.insertUser(reqUserDto))

    @PutMapping("/user/{userId}")
    fun updateUser(@PathVariable userId: Long, @ModelAttribute reqUserDto: ReqUserDto): ResponseEntity<ResUserDto> =
            ResponseEntity.status(HttpStatus.OK).body(userService.updateUser(userId, reqUserDto))

    @DeleteMapping("/user/{userId}")
    fun deleteUser(@PathVariable userId: Long): ResponseEntity<Unit> =
            ResponseEntity.status(HttpStatus.NO_CONTENT).body(userService.deleteUser(userId))

}