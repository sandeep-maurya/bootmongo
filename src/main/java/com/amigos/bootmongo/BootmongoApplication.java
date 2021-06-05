package com.amigos.bootmongo;

import com.amigos.bootmongo.model.Address;
import com.amigos.bootmongo.model.Gender;
import com.amigos.bootmongo.model.Student;
import com.amigos.bootmongo.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class BootmongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootmongoApplication.class, args);
	}

//	@Bean
//	CommandLineRunner commandLineRunner(StudentRepository studentRepository){
//		return args -> {
//			Address address = new Address(
//					"India",
//					"Pune",
//					"4311016"
//			);
//			Student student = new Student(
//					"Rohit",
//					"Maurya",
//					"rohit@gmail.com",
//					Gender.MALE,
//					address,
//					new ArrayList<>(Arrays.asList("Computer Science","Physics")),
//					LocalDateTime.now()
//			);
//
//			studentRepository.insert(student);
//
//		};
//	}

}
