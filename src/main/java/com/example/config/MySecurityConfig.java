package com.example.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

import com.example.service.CustomUserDetailService;
import com.zaxxer.hikari.util.ClockSource.Factory;

@Configuration
@EnableWebSecurity
public class MySecurityConfig  extends WebSecurityConfigurerAdapter{
	
	
	@Autowired
	private CustomUserDetailService customUserDetailService;
	
//	 @Bean
//	   SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//		 http
//			.csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())		
//			.and()
//			.authorizeRequests()
//			.anyRequest()
//			.authenticated()
//			.and()
//			.httpBasic();
//			
//	        return http.build();
//	    }

	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())		
		.and()
		.authorizeRequests()
		.antMatchers("/login/**") .permitAll()
		.antMatchers("/api/**").permitAll()
		.anyRequest()
		.authenticated()
		.and()
		.httpBasic();

	}
	
	 
//	 @Bean
//	     authenticationManager(AuthenticationManagerBuilder auth) throws Exception {
//	  
//	 auth.userDetailsService(customUserDetailService).passwordEncoder(passwordEncoder());
//	
//	 }
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication().withUser("user").password(this.passwordEncoder().encode("user123")).roles("USER");
//		auth.inMemoryAuthentication().withUser("admin").password(this.passwordEncoder().encode("admin123"))
//				.roles("ADMIN");
		auth.userDetailsService(customUserDetailService).passwordEncoder(passwordEncoder());
	}

    @Bean
   BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(10);
    }
}
