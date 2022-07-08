package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.model.CustomeUserDetail;
import com.example.model.User;

import com.example.repository.UserRepository;
@Service
public class CustomUserDetailService  implements UserDetailsService {
@Autowired
private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user=this.userRepository.findByUsername(username);
		if(user==null) {
			throw new UsernameNotFoundException("no user");
			
		}
		return new CustomeUserDetail(user);
	}

}
