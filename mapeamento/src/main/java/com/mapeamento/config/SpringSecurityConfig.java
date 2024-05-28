package com.mapeamento.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.HttpBasicConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfig {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http)throws Exception{
        http
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests((requests) -> requests

                                .requestMatchers(
                                        "/v3/api-docs/**",
                                        "/swagger-ui/**",
                                        "/swagger-ui.html/**")
                                .permitAll()
                                .requestMatchers(
                                        HttpMethod.POST, "/aluno/", "/turma/")
                                .permitAll()
                                .requestMatchers(
                                        HttpMethod.GET, "/aluno/", "/turma/")
                                .permitAll()
                                .requestMatchers(
                                        HttpMethod.DELETE, "/aluno/", "/turma/{id}")
                                .permitAll()
                                .requestMatchers(
                                        HttpMethod.PUT, "/turma/**")
                                .permitAll()
                                .anyRequest()
                                .authenticated()

                )
                .httpBasic(withDefaults());
		return http.build();

	}

	private Customizer<HttpBasicConfigurer<HttpSecurity>> withDefaults() {
		// TODO Auto-generated method stub
		return null;
	}

	@Bean
	public InMemoryUserDetailsManager userDetailsService(){
		@SuppressWarnings("deprecation")
		UserDetails user = User.withDefaultPasswordEncoder()
				.username("admin")
				.password("admin")
				.roles("USER")
				.build();
		return new InMemoryUserDetailsManager(user);

	}

}
