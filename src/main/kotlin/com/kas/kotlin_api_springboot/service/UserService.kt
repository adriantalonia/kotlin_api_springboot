package com.kas.kotlin_api_springboot.service

import com.kas.kotlin_api_springboot.model.dto.request.UserRequest
import com.kas.kotlin_api_springboot.model.dto.response.UserResponse

interface UserService {
    fun create(user: UserRequest): UserResponse
    fun update(user: UserRequest): UserResponse
    fun delete(user: UserRequest): Void
}