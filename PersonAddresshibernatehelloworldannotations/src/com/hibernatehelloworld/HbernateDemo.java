package com.hibernatehelloworld;

import org.hibernate.Session;

import com.hibernatehelloworld.Utils.HibernateUtil;
import com.hibernatehelloworld.domain.Address;
import com.hibernatehelloworld.domain.Person;

public class HbernateDemo {
    public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Address address1=new Address("1234 Home street","Mumbai","600123");
		Address address2=new Address("1234 Work street","Mumbai","600987");
		Person person=new Person("Max",address1,address2);
		session.save(person);
		session.getTransaction().commit();
		session.close();
	}
}
