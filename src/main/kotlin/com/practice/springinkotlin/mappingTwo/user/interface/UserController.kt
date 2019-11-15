package com.practice.springinkotlin.mappingTwo.user.`interface`

import com.practice.springinkotlin.mappingTwo.user.dto.ReqUserDto
import com.practice.springinkotlin.mappingTwo.user.service.UserService
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiResponse
import io.swagger.annotations.ApiResponses
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class UserController(val userService: UserService) {

    @ApiOperation(value = "RECOMMENDATION YOUTUBER", notes = "RECOMMENDATION YOUTUBER API")
    @ApiResponses(value = [ApiResponse(code = 200, message = "RECOMMENDATION YOUTUBER 성공"),
        ApiResponse(code = 400, message = "잘 못 된 요청 - Not Found User"),
        ApiResponse(code = 403, message = "인증 실패"),
        ApiResponse(code = 500, message = "서버 에러")])

    @PostMapping("/users/")
    fun postUser(@RequestBody json: ReqUserDto, @ModelAttribute model: ReqUserDto, @RequestParam param: String): ResponseEntity<Unit> {
        return ResponseEntity.status(HttpStatus.CREATED).build()
    }
}