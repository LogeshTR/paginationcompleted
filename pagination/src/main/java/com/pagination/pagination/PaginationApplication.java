package com.pagination.pagination;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pagination.pagination.domain.Student;
import com.pagination.pagination.repo.StudentRepository;

@SpringBootApplication
public class PaginationApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(PaginationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Student> students = new ArrayList<>();
		students.add(Student.builder().name("jara").city("UAE").build());
		students.add(Student.builder().name("ravi").city("UK").build());
		students.add(Student.builder().name("jamali").city("Scotland").build());
		students.add(Student.builder().name("zahra").city("IDN").build());
		students.add(Student.builder().name("harish").city("China").build());
		students.add(Student.builder().name("ragu").city("India").build());
		students.add(Student.builder().name("sidhu").city("Thailand").build());
		students.add(Student.builder().name("kamali").city("Scotland").build());
		students.add(Student.builder().name("kaifaa").city("China").build());
		students.add(Student.builder().name("ragu").city("US").build());
		students.add(Student.builder().name("alisa").city("US").build());
		students.add(Student.builder().name("shan").city("China").build());
		students.add(Student.builder().name("kiruthigaa").city("China").build());
		students.add(Student.builder().name("kousika").city("China").build());
		students.add(Student.builder().name("aruna").city("US").build());
		students.add(Student.builder().name("Tom").city("India").build());
		students.add(Student.builder().name("Jerry").city("India").build());
		students.add(Student.builder().name("sriram").city("Thailand").build());
		students.add(Student.builder().name("nami").city("Thailand").build());
		students.add(Student.builder().name("raghul").city("India").build());
		students.add(Student.builder().name("abiram").city("Thailand").build());
		students.add(Student.builder().name("Santhosh").city("Scotland").build());
		students.add(Student.builder().name("shrui").city("China").build());
		students.add(Student.builder().name("kamal").city("US").build());
		students.add(Student.builder().name("vijay").city("US").build());
		students.add(Student.builder().name("ajith").city("China").build());
		students.add(Student.builder().name("suriya").city("China").build());
		students.add(Student.builder().name("ariya").city("China").build());
		students.add(Student.builder().name("jayam").city("US").build());
		students.add(Student.builder().name("dhanush").city("India").build());

		studentRepository.saveAll(students);
	}
}
