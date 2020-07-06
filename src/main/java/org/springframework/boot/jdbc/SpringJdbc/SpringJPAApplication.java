package org.springframework.boot.jdbc.SpringJdbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.SpringJdbc.jdbc.PersonJDBCDao;
import org.springframework.boot.jdbc.SpringJdbc.jpa.Person;
import org.springframework.boot.jdbc.SpringJdbc.jpa.PersonJpaRepository;

import java.util.Date;

@SpringBootApplication
public class SpringJPAApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(SpringJPAApplication.class);

	@Autowired
	PersonJpaRepository personJpaRepository;

	public static void main(String[] args) {

		SpringApplication.run(SpringJPAApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//logger.info("{} Output of Person ",personJpaRepository.findById(10002));
		//logger.info("{} Insert of Person ",personJpaRepository.insert(new Person(10005,"Lara","Bengaluru",new Date())));
		//logger.info("{} Update of Person ",personJpaRepository.update(new Person(10005,"Lara","Mumbai",new Date())));
		//personJpaRepository.deleteById(10003);
		//logger.info("{} Output of Person ",personJpaRepository.findAll());

	}
}
