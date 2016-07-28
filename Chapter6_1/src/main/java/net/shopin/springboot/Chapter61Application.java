package net.shopin.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Chapter61Application {

	@Autowired
	private AuthorSettings authorSettings;

	@RequestMapping("/")
	public String index() {
		return "book.name:" + authorSettings.getName() + "book.age:" + authorSettings.getAge();
	}


	public static void main(String[] args) {
		SpringApplication.run(Chapter61Application.class, args);
	}
}
