package com.lanou.domain;

import com.lanou.utils.HibernateUtil;
import org.hibernate.Session;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dllo on 17/10/31.
 */
public class HeroTest {
    //测试主键映射的一对一关系
    @Test
    public void save(){
        Session session = HibernateUtil.getSession().openSession();
        session.beginTransaction();

        Hero h1 = new Hero("李白",18888);
        Skin s1 = new Skin("凤求凰",178);

        h1.setSkin(s1);
        s1.setHero(h1);

        session.save(h1);

        session.getTransaction().commit();
        session.close();
    }

    @Test
    public void query(){
        Session session = HibernateUtil.getSession().openSession();
        session.beginTransaction();

        Skin skin = session.get(Skin.class, 1);
        System.out.println(skin);
        System.out.println(skin.getHero());

        session.getTransaction().commit();
        session.close();

    }
}