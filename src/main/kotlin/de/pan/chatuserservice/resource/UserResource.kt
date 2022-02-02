package de.pan.chatuserservice.resource

import de.pan.chatuserservice.entity.User
import de.pan.chatuserservice.repository.UserRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class UserResource(
    private val userRepository: UserRepository
) {
    @GetMapping("/user/{userId}")
    fun getUser(@PathVariable userId: Int): User {
        return userRepository
            .findById(userId)
            .orElseThrow{ NotFoundException("User with id $userId not found.") }
    }
}