package com.lanou.domain;

/**
 * Created by dllo on 17/10/31.
 */
public class Staff {
    private int id;
    private String name;

    //保存着该员工所属的部门
    private Department dept;


    public Staff() {
    }

    public Staff(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Staff(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Staff{" +
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

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }
}
