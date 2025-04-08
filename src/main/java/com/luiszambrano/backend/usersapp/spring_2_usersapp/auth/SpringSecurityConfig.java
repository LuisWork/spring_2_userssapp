package com.luiszambrano.backend.usersapp.spring_2_usersapp.auth;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfig {

    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http.authorizeHttpRequests(authRules -> authRules
                .requestMatchers(HttpMethod.GET, "/api/users").permitAll()
                .anyRequest().authenticated())
                .csrf(config -> config.disable())
                .sessionManagement(managment -> managment.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .build();
    }

    /*

    ANTIGUA FORMA (NO USAR (DEPRECATED))

     * @Bean
     * SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
     * return http.authorizeHttpRequests()
     * .requestMatchers(HttpMethod.GET, "/api/users").permitAll()
     * .anyRequest().authenticated()
     * .and()
     * .csrf(config -> config.disable())
     * .sessionManagement(management ->
     * management.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
     * .build();
     * }
     */

}
