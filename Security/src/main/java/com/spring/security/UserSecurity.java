package com.spring.security;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.util.matcher.AnyRequestMatcher;

import com.spring.password.UserPassword;
import com.spring.service.UserService;
@Configuration
@EnableWebSecurity
public class UserSecurity extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private UserPassword password;

	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http
		.authorizeHttpRequests()
		.antMatchers("/","index").permitAll()
		.antMatchers("/userhome/**").hasAnyRole("STUDENT")
		.anyRequest()
		.authenticated()
		.and()
		.httpBasic();
	}

	@Bean
	@Override
	protected UserDetailsService userDetailsService() {
		UserDetails vanshika = User.builder()
				.username("Vansyy")
				.password(password.passwordencoder().encode("Vansyy"))
				.roles("STUDENT")
				.build();
		return new InMemoryUserDetailsManager(vanshika);
	
	
}
}
