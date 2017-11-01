package com.lanou.domain;

import com.lanou.utils.HibernateUtil;
import org.hibernate.Session;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dllo on 17/10/31.
 */
public class StaffTest {
    @Test
    public void save(){
        Session session = HibernateUtil.getSession().openSession();
        session.beginTransaction();

        //测试Staff与Department的多对一关联
        //新建部门
        Department dept = new Department("教学部");
        //新建员工
        Staff s1 = new Staff("胖哥");
        Staff s2 = new Staff("李大稳");
        Staff s3 = new Staff("表姐");
        //设置员工的部门所属
        s1.setDept(dept);
        s2.setDept(dept);
        s3.setDept(dept);

        //向数据库中插入数据
        session.save(dept);
        session.save(s1);
        session.save(s2);
        session.save(s3);

        session.getTransaction().commit();;
        session.close();
    }

    @Test
    public void query(){
        //查询
        Session session = HibernateUtil.getSession().openSession();
        session.beginTransaction();

        //取员工
        Staff staff = session.get(Staff.class, 1);
        //打印员工信息
        System.out.println("员工信息:"+staff);
        //打印所属部门
        System.out.println("员工所属部门:"+staff.getDept());

        session.getTransaction().commit();
        session.close();
    }

    @Test
    public void oneToMany(){
        Session session = HibernateUtil.getSession().openSession();
        session.beginTransaction();

        Department d1 = new Department("市场部");
        Department d2 = new Department("财务部");

        Staff s11 = new Staff("李翠翠");
        Staff s12 = new Staff("韦艳艳");
        Staff s21 = new Staff("郝聪聪");
        Staff s22 = new Staff("杨红");

        //互相指定关系
        d1.getStaffs().add(s11);
        d1.getStaffs().add(s12);
        s11.setDept(d1);
        s12.setDept(d1);

        d2.getStaffs().add(s21);
        d2.getStaffs().add(s22);
        s21.setDept(d2);
        s22.setDept(d2);

        //插入数据
        session.save(d1);
        session.save(d2);

        session.save(s11);
        session.save(s12);
        session.save(s21);
        session.save(s22);


        session.getTransaction().commit();
        session.close();
    }

    @Test
    public void doubleQuery(){
        Session session = HibernateUtil.getSession().openSession();
        session.beginTransaction();

        //取一个部门出来
        Department d1 = session.get(Department.class, 1);
        System.out.println(d1);
        System.out.println(d1.getStaffs());

        //取一个员工出来
        Staff s1 = session.get(Staff.class, 4);
        System.out.println(s1);
        System.out.println(s1.getDept());


        session.getTransaction().commit();
        session.close();
    }



    //测试级联
    //为Staff添加了级联功能,那么取值为saveupdate,那么当对Staff表进行保存和更新操作的时候,相对应的操作也会执行到dept表上
    @Test
    public void cascadeSave(){
        Session session = HibernateUtil.getSession().openSession();
        session.beginTransaction();

        Department department = new Department("后勤部");
        Staff s = new Staff("张威");
        //在一端(一对多的一端)将inverse设置为true,代表让对方来维护关系,
        //在本例中也就是让Staff来维护关系,那么在给员工设置部门时,员工就会被自动添加到对应的部门中
        department.getStaffs().add(s);
        s.setDept(department);

        //只对员工进行保存
//        session.save(s);
        session.save(department);

        session.getTransaction().commit();
        session.close();

    }
}