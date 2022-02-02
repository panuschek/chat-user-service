package de.pan.chatuserservice.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity(name = "users")
data class User(
    @Id
    @GeneratedValue
    val userId: Int = 0,
    val username: String = "",
    val email: String = "",
    val password: String = ""
)
