package com.kas.kotlin_api_springboot.model.dto.request

import com.kas.kotlin_api_springboot.model.entity.Role
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size

data class UserRequest(
    @field:NotBlank(message = "firstName must not be blank")
    @field:Size(min = 4, message = "Firstname must not be less than two characters")
    var firstName: String,
    @field:NotBlank(message = "Lastname must not be blank")
    @field:Size(min = 4, message = "Lastname must not be less than two characters")
    var lastName: String,
    @field:Email
    var email: String,
    @field:Pattern(regexp = "(^$|[0-9]{10})", message = "Phone must be only numbers and has 10 digits")
    var phone: Int,
    @field:NotBlank(message = "Password must not be blank")
    @field:Size(min = 8, message = "Password must not be less than 8 characters")
    var password: String,
    val roles: List<Role> = mutableListOf()
)
