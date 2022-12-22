package com.kotlinapi.model.dto.request

import com.kotlinapi.model.entity.Role
import javax.validation.constraints.Email
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

data class UserRequest(
    @field:NotBlank(message = "firstName must not be blank")
    @field:Size(min = 4, message = "Firstname must not be less than two characters")
    var firstName: String,
    @field:NotBlank(message = "Lastname must not be blank")
    @field:Size(min = 4, message = "Lastname must not be less than two characters")
    var lastName: String,
    @field:Email
    var email: String,
    //@field:Pattern(regexp = "^\\d{10}$")
    var phone: Int,
    @field:NotBlank(message = "Password must not be blank")
    @field:Size(min = 8, message = "Password must not be less than 8 characters")
    var password: String,
    val roles: List<Role> = mutableListOf()
) {
}