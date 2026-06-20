package com.ibm.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ibm.demo.model.Employee;

@Configuration
public class AppConfig {
	
    @Bean
    public Employee employee() {
    	return new Employee(101, "Sony", 50000);
    }
 
}
