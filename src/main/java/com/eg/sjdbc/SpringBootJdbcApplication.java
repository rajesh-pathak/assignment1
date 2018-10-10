package com.eg.sjdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
@ComponentScan("com.eg.sjdbc")
public class SpringBootJdbcApplication implements CommandLineRunner {

	@Autowired
	UserDao udao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		List<User> luser = udao.findAll();
		for(User user:luser) {
			System.out.println(user);
		}
	}
}
