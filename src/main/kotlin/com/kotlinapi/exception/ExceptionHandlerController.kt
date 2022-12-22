package com.kotlinapi.exception

import com.kotlinapi.model.dto.response.ErrorResponse
import org.springframework.http.HttpStatus
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.context.request.WebRequest
import java.util.*

@RestControllerAdvice
class ExceptionHandlerController {

    @ExceptionHandler(value = [MethodArgumentNotValidException::class])
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    fun badRequestException(ex: MethodArgumentNotValidException, request: WebRequest): ErrorResponse {
        val errors = ex.bindingResult.allErrors
            .map { error ->
                error.defaultMessage!!
            }
            .sorted()
        return ErrorResponse(Date(), HttpStatus.BAD_REQUEST.value(), errors.joinToString(", ") { it })
    }
}