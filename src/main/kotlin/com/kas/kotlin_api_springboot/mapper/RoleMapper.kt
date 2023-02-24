package com.kas.kotlin_api_springboot.mapper

import com.kas.kotlin_api_springboot.model.dto.request.RoleRequest
import com.kas.kotlin_api_springboot.model.dto.response.RoleResponse
import com.kas.kotlin_api_springboot.model.entity.Role
import org.mapstruct.Mapper

@Mapper
interface RoleMapper {

    fun toEntity(roleRequest: RoleRequest): Role
    fun toRequest(roleEntity: Role): RoleResponse
}
