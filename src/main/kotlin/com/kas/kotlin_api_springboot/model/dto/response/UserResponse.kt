package com.kas.kotlin_api_springboot.model.dto.response

import com.kas.kotlin_api_springboot.model.entity.Role
import java.util.UUID

class UserResponse(
    var id: UUID,
    var firstName: String,
    var lastName: String,
    var email: String,
    var phone: Int,
    var active: Boolean,
    var roles: List<Role> = mutableListOf()
)
