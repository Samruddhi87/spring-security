package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.User;
import com.example.repository.UserRepository;



@SpringBootApplication
@ComponentScan(basePackages = "com.example.*")
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
@EntityScan(basePackages = "com.example.*")

@CrossOrigin(origins = "http://localhost:3000" , exposedHeaders = "Access-Control-Allow-Origin")
public class SpringSecurityApplication implements CommandLineRunner {

	
	@Autowired
	private UserRepository  userRepository;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		user.setUsername("AK");
		user.setEmail("user@gmail.com");
		user.setPassword(this.bCryptPasswordEncoder.encode("user123"));
		user.setUserRole("USER");
		this.userRepository.save(user);

		User user1 = new User();
		user1.setUsername("max");
		user1.setEmail("admin@gmail.com");
		user1.setPassword(this.bCryptPasswordEncoder.encode("admin123"));
		user1.setUserRole("ADMIN");
		this.userRepository.save(user1);

	}

}
