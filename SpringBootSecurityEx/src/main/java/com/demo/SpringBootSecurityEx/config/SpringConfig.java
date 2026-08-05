package com.demo.SpringBootSecurityEx.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
//@EnableWebSecurity //must needed for Spring MVC project, here spring boot automatically configures spring security so it is optional.
public class SpringConfig {
	
	 @Bean
	    public UserDetailsService userDetailsService() {

	        UserDetails user = User.withDefaultPasswordEncoder()
	                .username("john")
	                .password("123")
	                .roles("USER")
	                .build();

	        UserDetails admin = User.withDefaultPasswordEncoder()
	                .username("admin")
	                .password("123")
	                .roles("ADMIN")
	                .build();

	        return new InMemoryUserDetailsManager(user, admin);
	    }

	    @Bean
	    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

	        http
	            .authorizeHttpRequests(auth -> auth
	                    .requestMatchers("/").permitAll()
	                    .requestMatchers("/user").hasRole("USER")
	                    .requestMatchers("/admin").hasRole("ADMIN")
	                    .requestMatchers("/common").hasAnyRole("USER", "ADMIN")
	                    .requestMatchers("/secret").denyAll()
	                    .anyRequest().authenticated()
	            )
	            .formLogin(Customizer.withDefaults())
	            .rememberMe(Customizer.withDefaults())
	            .logout(Customizer.withDefaults());

	        return http.build();
	    }

}
