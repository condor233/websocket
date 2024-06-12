package com.example.chat_web_socket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class ChatWebSocketApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatWebSocketApplication.class, args);
	}

}
