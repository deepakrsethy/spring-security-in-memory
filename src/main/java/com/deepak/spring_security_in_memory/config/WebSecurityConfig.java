package com.deepak.spring_security_in_memory.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Bean
    public UserDetailsService getUserDetailService() {
        UserDetails userDetails = User.withDefaultPasswordEncoder()
                .username("deepak")
                .password("deepak")
                .roles("ADMIN")
                .build();
        return new InMemoryUserDetailsManager(userDetails);

    }
}
