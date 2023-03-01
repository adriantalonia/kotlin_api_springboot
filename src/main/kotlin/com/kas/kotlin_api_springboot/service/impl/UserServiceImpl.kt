package com.kas.kotlin_api_springboot.service.impl

import com.kas.kotlin_api_springboot.mapper.UserMapper
import com.kas.kotlin_api_springboot.model.dto.request.UserRequest
import com.kas.kotlin_api_springboot.model.dto.response.UserResponse
import com.kas.kotlin_api_springboot.repository.UserRepository
import com.kas.kotlin_api_springboot.service.UserService
import org.mapstruct.factory.Mappers
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(val userRepository: UserRepository) : UserService {

    val converter: UserMapper = Mappers.getMapper(UserMapper::class.java)

    override fun create(user: UserRequest): UserResponse {
        val userEntity = converter.toEntity(user)
        return converter.toResponse(userRepository.save(userEntity))
    }

    override fun update(user: UserRequest): UserResponse {
        TODO("Not yet implemented")
    }

    override fun delete(user: UserRequest): Void {
        TODO("Not yet implemented")
    }
}
