package com.kotlinapi.controller

import com.kotlinapi.model.dto.request.UserRequest
import com.kotlinapi.model.dto.response.UserResponse
import com.kotlinapi.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping("/api/v1/users")
class UserController(val userService: UserService) {

    @PostMapping
    fun create(@RequestBody @Valid user: UserRequest): ResponseEntity<UserResponse> {
        val userResponse = userService.create(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(userResponse)
    }
}