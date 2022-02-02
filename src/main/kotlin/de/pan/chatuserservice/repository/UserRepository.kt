package de.pan.chatuserservice.repository

import de.pan.chatuserservice.entity.User
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User, Int> {
}