package net.davzshaw.devquiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevquizApplication {

	public static void main(String[] args) {
		System.out.println("hello world, how are you today?");
		SpringApplication.run(DevquizApplication.class, args);
	}

}
