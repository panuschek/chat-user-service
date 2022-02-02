package de.pan.chatuserservice.service.impl

import de.pan.chatuserservice.entity.User
import de.pan.chatuserservice.repository.UserRepository
import de.pan.chatuserservice.resource.NotFoundException
import de.pan.chatuserservice.service.UserService
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(
    private val userRepository: UserRepository
) : UserService{
    override fun getUser(userId: Int): User {
        return userRepository
            .findById(userId)
            .orElseThrow{ NotFoundException("No user found with id=$userId") }
    }

    override fun register(user: User): User {
        return userRepository.save(user)
    }

    override fun resetPassword(username: String, email: String) {
        TODO("Not yet implemented")
    }
}