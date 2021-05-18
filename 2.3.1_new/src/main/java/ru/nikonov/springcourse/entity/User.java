package ru.nikonov.springcourse.entity;

import javax.persistence.*;

@Entity
@Table(name = "user")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;


    @Column(nullable = false)
    private int age;

    public User () {}

    public User(String name, int age) {
        this.name = name;

        this.age = age;
    }

    public User(long id, String name, int age) {
        this.id = id;
        this.name = name;

        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}