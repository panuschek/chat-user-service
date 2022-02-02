package de.pan.chatuserservice.controller

import de.pan.chatuserservice.entity.User
import de.pan.chatuserservice.service.UserService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping

@Controller
class UserController(
    private val userService: UserService
) {

    @GetMapping("register")
    fun register(model: Model): String {
        model.addAttribute("user", User())
        return "register"
    }

    @PostMapping("register")
    fun register(@ModelAttribute user: User, model: Model): String {
        userService.register(user)
        return ""
    }
}