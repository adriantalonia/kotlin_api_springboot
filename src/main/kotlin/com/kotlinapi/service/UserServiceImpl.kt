package com.kotlinapi.service

import com.kotlinapi.model.dto.request.UserRequest
import com.kotlinapi.model.dto.response.UserResponse
import com.kotlinapi.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(val repository: UserRepository): UserService {
    override fun create(user: UserRequest): UserResponse {
        TODO("Not yet implemented")
    }

    override fun update(user: UserRequest): UserResponse {
        TODO("Not yet implemented")
    }

    override fun delete(user: UserRequest): Void {
        TODO("Not yet implemented")
    }
}