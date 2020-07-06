package org.springframework.boot.jdbc.SpringJdbc.repository;

import org.springframework.boot.jdbc.SpringJdbc.jpa.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonSpringDataRepository extends JpaRepository<Person,Integer> {


}
