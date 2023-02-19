package com.kas.kotlin_api_springboot.model.dto.response

import java.util.Date

class ErrorResponse(
    val timestamp: Date,
    val status: Int,
    val message: String
)
