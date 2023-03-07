package com.harsh.jwt.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		List<SimpleGrantedAuthority> roles = null;
		if(username.equals("admin")) {
			roles = Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));
			return new User("admin", "$2a$10$IVjrWWmx5PTnDp6c4yMyYu8bsjS5M6Bw.Jb8pwFVZwd9v/puksg2i", roles);
		}
		
		if(username.equals("user")) {
			roles = Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
			return new User("user", "$2a$10$fRql8Yc3lIzodEMv3wetzesjqI4/Q1.BctD4MY2wu3hyZPbdjSeMS", roles);
		}
		throw new UsernameNotFoundException("User not found with username : " + username);
	}

}
