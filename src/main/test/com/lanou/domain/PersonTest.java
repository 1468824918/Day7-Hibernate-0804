package com.lanou.domain;

import com.lanou.utils.HibernateUtil;
import org.hibernate.Session;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dllo on 17/10/31.
 */
public class PersonTest {
        //用来测试外检约束的一对一关联

    @Test
    public void oneToOneSave(){
        Session session = HibernateUtil.getSession().openSession();
        session.beginTransaction();

        Person p = new Person("刘兴东","东少");
        IDCard id = new IDCard("123456");
        p.setIdCard(id);
        id.setPerson(p);

        session.save(p);

        session.getTransaction().commit();
        session.close();
    }

    @Test
    public void oneToOneQuery(){
        Session session = HibernateUtil.getSession().openSession();
        session.beginTransaction();

        IDCard card = session.get(IDCard.class, 1);
        System.out.println(card);
        System.out.println(card.getPerson());

        session.getTransaction().commit();
        session.close();
    }
}