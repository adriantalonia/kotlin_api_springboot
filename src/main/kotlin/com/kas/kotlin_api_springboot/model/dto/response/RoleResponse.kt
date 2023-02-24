package com.kas.kotlin_api_springboot.model.dto.response

import java.util.UUID

data class RoleResponse(
    var id: UUID,
    var name: String,
    var description: String
)
