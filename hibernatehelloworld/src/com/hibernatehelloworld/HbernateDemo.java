package com.hibernatehelloworld;

import org.hibernate.Session;

import com.hibernatehelloworld.Utils.HibernateUtil;
import com.hibernatehelloworld.domain.Message;

public class HbernateDemo {
    public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Message message=new Message("Hello World from hibernate");
		session.save(message);
		session.getTransaction().commit();
		session.close();
	}
}
