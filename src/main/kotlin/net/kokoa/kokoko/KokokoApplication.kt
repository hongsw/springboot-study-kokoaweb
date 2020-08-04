package net.kokoa.kokoko

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KokokoApplication

fun main(args: Array<String>) {
	runApplication<KokokoApplication>(*args)
}
