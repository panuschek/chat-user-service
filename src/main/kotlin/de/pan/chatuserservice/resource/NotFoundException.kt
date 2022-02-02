package de.pan.chatuserservice.resource

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(HttpStatus.NOT_FOUND)
class NotFoundException(message: String) : Exception(message)
