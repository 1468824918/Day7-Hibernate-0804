package com.lanou.domain;

/**
 * Created by dllo on 17/10/31.
 */
public class Hero {

    private int id;
    private String name;
    private float price;

    private Skin skin;

    public Hero() {
    }

    public Hero(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Hero(String name, float price) {
        this.name = name;
        this.price = price;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Skin getSkin() {
        return skin;
    }

    public void setSkin(Skin skin) {
        this.skin = skin;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
