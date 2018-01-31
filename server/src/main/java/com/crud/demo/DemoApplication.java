package com.crud.demo;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

    @Bean
    ApplicationRunner init(UserRepository repository) {
        return args -> {
            Stream.of("User_1", "User_2", "User_3", "User_4", "User_5",
                    "User_6", "User_7", "User_8", "User_9").forEach(name -> {
                User user = new User();
                user.setName(name);
                repository.save(user);

            });

            repository.findAll().forEach(System.out::println);

        };

    }
}
