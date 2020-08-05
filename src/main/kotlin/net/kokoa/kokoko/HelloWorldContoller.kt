package net.kokoa.kokoko

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody


@Controller
class HelloController {
    @RequestMapping("/")
    @ResponseBody
    fun hello(): String {
        return "Hello Word ~ KoKoa Web using Spring Boot"
    }
}