package com.in28minutes.database.databasedemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.database.databasedemo.jpa.PersonJpaRepository;

@SpringBootApplication
public class JpaDemoApplication2 implements CommandLineRunner {

	@Autowired
	PersonJpaRepository repository;

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication2.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("User deatails of id-10001 is {}", repository.findById(10001));

		/*
		 * logger.info("Deleting user of Id-10002, no of rows affected {}",
		 * dao.deleteById(10002));
		 *
		 * logger.info("Inserting user of id 10004, no of rows affected - {}",
		 * dao.insert(new Person(10004, "Sanga", "Sydney", new Date())));
		 *
		 * logger.info("updating user of id 10001, no of rows affected - {}",
		 * dao.update(new Person(10001, "Vimo", "Colombo", new Date())));
		 */
	}
}
