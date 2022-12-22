package com.kotlinapi.model.dto.response

import java.util.*


data class ErrorResponse(
    val timestamp: Date,
    val status: Int,
    val message: String
    ) {
}