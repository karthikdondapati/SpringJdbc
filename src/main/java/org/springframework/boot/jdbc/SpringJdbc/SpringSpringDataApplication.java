package org.springframework.boot.jdbc.SpringJdbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.SpringJdbc.jpa.Person;
import org.springframework.boot.jdbc.SpringJdbc.jpa.PersonJpaRepository;
import org.springframework.boot.jdbc.SpringJdbc.repository.PersonSpringDataRepository;

import java.util.Date;

@SpringBootApplication
public class SpringSpringDataApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(SpringSpringDataApplication.class);

	@Autowired
	PersonSpringDataRepository personSpringDataRepository;

	public static void main(String[] args) {

		SpringApplication.run(SpringSpringDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//logger.info("{} Output of Person ",personSpringDataRepository.findById(10002));
		//logger.info("{} Insert of Person ",personSpringDataRepository.save(new Person(10005,"Lara","Bengaluru",new Date())));
		//logger.info("{} Update of Person ",personJpaRepository.update(new Person(10005,"Lara","Mumbai",new Date())));
		//personSpringDataRepository.deleteById(1);
		//logger.info("{} Output of Person ",personJpaRepository.findAll());

	}
}
