package com.kas.kotlin_api_springboot.model.dto.request

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import java.util.UUID

data class RoleRequest(
    @field:NotBlank(message = "role id must not be blank")
    @field:NotNull(message = "role id must not be null")
    var id: UUID
)
