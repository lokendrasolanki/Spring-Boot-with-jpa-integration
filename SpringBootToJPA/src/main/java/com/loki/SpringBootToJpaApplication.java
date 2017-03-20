package com.loki;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.loki.model.Employee;
import com.loki.repository.EmployeeRepository;

@SpringBootApplication
public class SpringBootToJpaApplication implements CommandLineRunner {

	@Autowired
	EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootToJpaApplication.class, args);
	}

	
	@SuppressWarnings("serial")
	@Override
	public void run(String... args) throws Exception {
	
		employeeRepository.deleteAll();

		new HashMap<String, String>() {
			{
				put("Lokendra singh", "Software Developer");
				put("Sunil rawat", "Software Developer");
				put("Ravi Jat", "Team Lead");
			}
		}
		.forEach((name, designation)
				-> employeeRepository
				.save(new Employee(name, designation)));

	}
}
