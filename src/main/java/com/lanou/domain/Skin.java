package com.lanou.domain;

/**
 * Created by dllo on 17/10/31.
 */
public class Skin {
    private int sid;
    private String sname;
    private float sprice;
    private Hero hero;

    public Skin() {
    }

    public Skin(String sname, float sprice) {
        this.sname = sname;
        this.sprice = sprice;
    }

    public Skin(int sid, String sname, float sprice) {
        this.sid = sid;
        this.sname = sname;
        this.sprice = sprice;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public float getSprice() {
        return sprice;
    }

    public void setSprice(float sprice) {
        this.sprice = sprice;
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    @Override
    public String toString() {
        return "Skin{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sprice=" + sprice +
                '}';
    }
}
