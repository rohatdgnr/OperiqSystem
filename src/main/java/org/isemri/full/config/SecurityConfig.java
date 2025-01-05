package org.isemri.full.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // CSRF'yi devre dışı bırak
                .cors(cors -> cors.configure(http)) // CORS yapılandırmasını etkinleştir
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/**").permitAll() // Tüm istekler için izin ver
                );
        return http.build();
    }
}
