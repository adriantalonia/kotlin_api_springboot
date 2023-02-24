package com.kas.kotlin_api_springboot.mapper

import com.kas.kotlin_api_springboot.model.dto.request.UserRequest
import com.kas.kotlin_api_springboot.model.dto.response.UserResponse
import com.kas.kotlin_api_springboot.model.entity.User
import org.mapstruct.Mapper

@Mapper(uses = [RoleMapper::class])
interface UserMapper {

    fun toEntity(userRequest: UserRequest): User
    fun toResponse(userEntity: User): UserResponse
}
