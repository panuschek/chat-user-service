package de.pan.chatuserservice.service

import de.pan.chatuserservice.entity.User

interface UserService {
    fun getUser(userId: Int): User
    fun register(user: User): User
    fun resetPassword(username: String, email: String)
}