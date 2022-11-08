package com.kotlinapi.service

import com.kotlinapi.model.dto.request.UserRequest
import com.kotlinapi.model.dto.response.UserResponse

interface UserService {
    fun create(user: UserRequest): UserResponse
    fun update(user: UserRequest): UserResponse
    fun delete(user: UserRequest): Void
}