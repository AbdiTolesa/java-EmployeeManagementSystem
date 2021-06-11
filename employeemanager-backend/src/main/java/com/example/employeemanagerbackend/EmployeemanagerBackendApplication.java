package com.example.employeemanagerbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.domain.AuditorAware;
import org.springframework.context.annotation.Bean;

import com.example.employeemanagerbackend.SpringSecurityAuditorAware;
import org.springframework.security.core.userdetails.User;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class EmployeemanagerBackendApplication {

	@Bean
    public AuditorAware<String> auditorAware() {
        return new SpringSecurityAuditorAware();
    }

	public static void main(String[] args) {
		SpringApplication.run(EmployeemanagerBackendApplication.class, args);
	}

}
