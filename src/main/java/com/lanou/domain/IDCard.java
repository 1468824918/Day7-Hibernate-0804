package com.lanou.domain;

/**
 * Created by dllo on 17/10/31.
 */
public class IDCard {
    private int id;
    private String number;

    //添加人引用
    private Person person;

    public IDCard() {
    }

    public IDCard(String number) {
        this.number = number;
    }

    public IDCard(int id, String number) {
        this.id = id;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "IDCard{" +
                "id=" + id +
                ", number='" + number + '\'' +
                '}';
    }
}
