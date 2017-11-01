package com.lanou.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dllo on 17/10/31.
 */
public class Department {
    private int id;
    private String name;

    //用来存储所有员工的集合
    //注意:一定要初始化
    private Set<Staff> staffs = new HashSet<>();


    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Department() {
    }

    public Department(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
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

    public Set<Staff> getStaffs() {
        return staffs;
    }

    public void setStaffs(Set<Staff> staffs) {
        this.staffs = staffs;
    }
}
