//package com.aliyesiloz.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//                .csrf(csrf -> csrf.disable())  // CSRF kapat
//                .authorizeHttpRequests(auth -> auth
//                        .anyRequest().permitAll() // tüm endpointlere izin ver
//                )
//                .formLogin(form -> form.disable())  // login formu kapat
//                .httpBasic(basic -> basic.disable()); // basic auth kapat
//
//        return http.build();
//    }
//
//    // Bu bean'i eklemezsen bazı security class'ları injection sırasında hata verebilir
//    @Bean
//    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
//        return config.getAuthenticationManager();
//    }
//}
