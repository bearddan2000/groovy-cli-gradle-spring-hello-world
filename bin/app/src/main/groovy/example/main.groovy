package example

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean

@SpringBootApplication
class Application {
	static void main(String[] args) {
		SpringApplication.run(Application.class, args)
	}
	@Bean
	CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return {
 			println("[OUTPUT] Greetings")
		};
	}
}
