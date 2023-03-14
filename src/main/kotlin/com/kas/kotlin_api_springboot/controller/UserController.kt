package com.kas.kotlin_api_springboot.controller

import com.kas.kotlin_api_springboot.model.dto.request.UserRequest
import com.kas.kotlin_api_springboot.model.dto.response.UserResponse
import com.kas.kotlin_api_springboot.service.UserService
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/users")
class UserController(val userService: UserService) {

    @GetMapping
    fun getUsers() {
    }

    @PostMapping(consumes = [ MediaType.APPLICATION_JSON_VALUE ], produces = [ MediaType.APPLICATION_JSON_VALUE ])
    fun create(@RequestBody @Valid user: UserRequest): ResponseEntity<UserResponse> {
        val userResponse = userService.create(user)
        return ResponseEntity.status(HttpStatus.CREATED).body(userResponse)
    }
}
