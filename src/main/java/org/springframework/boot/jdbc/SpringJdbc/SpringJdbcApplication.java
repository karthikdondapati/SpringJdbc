package org.springframework.boot.jdbc.SpringJdbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.SpringJdbc.jdbc.Person;
import org.springframework.boot.jdbc.SpringJdbc.jdbc.PersonJDBCDao;

import java.util.Date;

//@SpringBootApplication
public class SpringJdbcApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(SpringJdbcApplication.class);
	@Autowired
	PersonJDBCDao personJDBCDao;

	public static void main(String[] args) {

		SpringApplication.run(SpringJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//logger.info("All Users -> {} ",personJDBCDao.findAll());
		//logger.info("All Users -> {} ",personJDBCDao.findById(10001));
		//logger.info("Number of Rows Deleted {} ",personJDBCDao.deleteById(10003));
		//logger.info("Inserting Rows Count ",personJDBCDao.insert(new Person(10004,"Sita","Berlin",new Date())));
		//logger.info("Updating Rows Count ",personJDBCDao.update(new Person(10004,"Sita","Mumbai",new Date())));
	}
}
