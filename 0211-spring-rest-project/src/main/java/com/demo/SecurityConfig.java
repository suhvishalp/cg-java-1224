package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.demo.services.EmployeeDetailsService;

@Configuration
@EnableMethodSecurity
public class SecurityConfig {

    @Autowired
    private EmployeeDetailsService userDetailsService;
    
    @Autowired
    private JwtRequestFilter jwtRequestFilter;
    
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authConfig) throws Exception {
        return authConfig.getAuthenticationManager();
    }
    
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
          .csrf().disable()
          .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
          .and()
          .authorizeRequests()
             // Allow unauthenticated access to login
             .requestMatchers("/auth/**").permitAll()
             // ADMIN-only endpoints: list all employees, create or delete employees.
             .requestMatchers(HttpMethod.GET, "/api/employees").hasRole("ADMIN")
             .requestMatchers(HttpMethod.POST, "/api/employees").hasRole("ADMIN")
             .requestMatchers(HttpMethod.DELETE, "/api/employees/**").hasRole("ADMIN")
             // For updating or viewing individual employee details, we'll do additional checks inside the controller.
             .anyRequest().authenticated();
        
        http.addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);
        
        return http.build();
    }
}
