package com.studyjun.studyTDD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudyTddApplication {
	public static void main(String[] args) {
		SpringApplication.run(StudyTddApplication.class, args);

		System.out.println("Hello World");

		int a = 1;
		assert a < 0 : "aaa";
	}
}