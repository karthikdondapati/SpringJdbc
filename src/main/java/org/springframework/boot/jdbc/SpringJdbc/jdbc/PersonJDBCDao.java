package org.springframework.boot.jdbc.SpringJdbc.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

@Repository
public class PersonJDBCDao {

    @Autowired
    JdbcTemplate jdbcTemplate ;

    public List<Person> findAll() {
        return jdbcTemplate.query("select * from person",
                new PersonRowMapper());
    }

    public Person findById(int id) {
        return jdbcTemplate.queryForObject
                ("select * from person where id = ?",
                new Object[] {id},new PersonRowMapper());
    }

    public int deleteById(int id) {
        return jdbcTemplate.update
                ("delete from person where id = ?",
                        new Object[] {id});
    }


    public int insert(Person person) {
        return jdbcTemplate.update
                ("insert into person (id, name, location, birth_date ) values (?,  ?, ?,?)",
                        new Object[] {person.getId(),person.getName(),person.getLocation(),new Timestamp(person.getBirth_date().getTime())});
    }

    public int update(Person person) {
        return jdbcTemplate.update
                ("update person set name =?, location=?, birth_date=? where id =?",
                        new Object[] {person.getName(),person.getLocation(),new Timestamp(person.getBirth_date().getTime()),person.getId()});
    }

    class PersonRowMapper implements RowMapper<Person>{

        @Override
        public Person mapRow(ResultSet resultSet, int i) throws SQLException {
            Person person = new Person();
            person.setId(resultSet.getInt("id"));
            person.setName(resultSet.getString("name"));
            person.setLocation(resultSet.getString("location"));
            person.setBirth_date(resultSet.getTimestamp("birth_date"));
            return person;
        }
    }
}
