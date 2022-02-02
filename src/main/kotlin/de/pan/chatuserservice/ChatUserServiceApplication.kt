package de.pan.chatuserservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ChatUserServiceApplication

fun main(args: Array<String>) {
	runApplication<ChatUserServiceApplication>(*args)
}
