/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.pojo.Student;
import com.util.NewHibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Nasrin
 */
public class DatabaseClass {
     public static int doSave(Student stu) {
         Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        int n = (Integer) session.save(stu);
        session.getTransaction().commit();
        return n;
    }

    public static void doUpdate(Student stu) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(stu);
        session.getTransaction().commit();
    }

    public static void doDelete(Student stu) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(stu);
        session.getTransaction().commit();
    }

    public static List<Student> doQuery() {
        List<Student> list = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        list = session.createQuery("from Student").list();
        return list;
    }
}
