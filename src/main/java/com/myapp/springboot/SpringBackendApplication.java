package com.myapp.springboot;

import com.myapp.springboot.model.User;
import com.myapp.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBackendApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override // 출력할 (fake data)내용을 입력해준다
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Jace", "Kang", "jace@gmail.com"));
		this.userRepository.save(new User("Harry", "Porter", "Porter@gmail.com"));
		this.userRepository.save(new User("Nam", "Junho", "Junho@gmail.com"));
	}
}
