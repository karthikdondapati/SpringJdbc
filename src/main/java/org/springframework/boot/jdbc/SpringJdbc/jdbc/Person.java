package org.springframework.boot.jdbc.SpringJdbc.jdbc;

import java.util.Date;

public class Person {

    private int id;
    private String name;
    private String location;
    private Date birth_date;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public Person(){
    }

    public Person(int id,String name,String location,Date birth_date){
        super();
        this.id=id;
        this.name=name;
        this.location=location;
        this.birth_date=birth_date;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", birth_date=" + birth_date +
                '}';
    }

}
