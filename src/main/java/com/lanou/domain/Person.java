package com.lanou.domain;

/**
 * Created by dllo on 17/10/31.
 */
public class Person {
    private int id;
    private String name;
    private String username;

    //添加身份证的引用
    private IDCard idCard;


    public Person() {
    }

    public Person(String name, String username) {
        this.name = name;
        this.username = username;
    }

    public Person(int id, String name, String username) {
        this.id = id;
        this.name = name;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public IDCard getIdCard() {
        return idCard;
    }

    public void setIdCard(IDCard idCard) {
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
