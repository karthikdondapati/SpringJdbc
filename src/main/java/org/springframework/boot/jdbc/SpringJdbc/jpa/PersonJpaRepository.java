package org.springframework.boot.jdbc.SpringJdbc.jpa;

import org.springframework.boot.jdbc.SpringJdbc.jdbc.PersonJDBCDao;
import org.springframework.boot.jdbc.SpringJdbc.jpa.Person;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.sql.Timestamp;
import java.util.List;

@Repository
@Transactional
public class PersonJpaRepository {

    @PersistenceContext
    EntityManager entityManager;

    public Person findById(int id) {
        return entityManager.find(Person.class,id);
    }

    public Person update(Person person) {
      return entityManager.merge(person);
    }

    public Person insert(Person person) {
        return entityManager.merge(person);
    }

    public void deleteById(int id) {
        Person person = findById(id);
        entityManager.remove(person);
    }

    public List<Person> findAll() {
        TypedQuery<Person> namedQuery = entityManager.createNamedQuery("find_all_persons" , Person.class);
        return namedQuery.getResultList();
    }

}
