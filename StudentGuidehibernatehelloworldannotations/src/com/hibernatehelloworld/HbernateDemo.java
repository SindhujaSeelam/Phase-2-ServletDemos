package com.hibernatehelloworld;

import org.hibernate.Session;

import com.hibernatehelloworld.Utils.HibernateUtil;
import com.hibernatehelloworld.domain.Guide;
import com.hibernatehelloworld.domain.Student;

public class HbernateDemo {
    public static void main(String[] args) {
	
    	//demo1();
    	//demo2();
    	demo3();
	}
    private static void demo3() {
    	Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		Guide guide = session.get(Guide.class,1L);
		System.out.println("Number of students for this guide "+guide.getStudents().size());

		session.getTransaction().commit();
		session.close();
    }
    private static void demo2() {
    	Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		Guide guide = new Guide("ABCD3423424","Mike Lawson",4000);
		Student student1=new Student("STU001","Max",guide);
		
		session.persist(student1);

		session.getTransaction().commit();
		session.close();
    } private static void demo1() {
    	Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		Guide guide = new Guide("ABCD3423424","Mike Lawson",4000);
		Student student1=new Student("STU001","Max",guide);
		Student student2=new Student("STU002","John",guide);
		
		session.save(guide);
		session.save(student1);
		session.save(student2);

		session.getTransaction().commit();
		session.close();
    }
    
    
    
}
