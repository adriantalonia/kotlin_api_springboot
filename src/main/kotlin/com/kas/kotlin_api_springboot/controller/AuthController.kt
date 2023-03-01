package com.kas.kotlin_api_springboot.controller

import jakarta.validation.Valid
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/auth")
class AuthController {

    @PostMapping(path = "/signup")
    fun signup() {
    }

    @PostMapping(path = "/signin")
    fun signins() {
    }
}
