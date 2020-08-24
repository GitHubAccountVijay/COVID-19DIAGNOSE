package com.covid.factory;
import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covid.scan.Pojo;

public class HibernateUtil {

	private static SessionFactory sessionFactory;
	private static Session session;

	static {
		sessionFactory = new Configuration().configure().addAnnotatedClass(Pojo.class).buildSessionFactory();
	}

	public static Session getSession() {
//		if (sessionFactory != null) {
			session = sessionFactory.openSession();

//		} else {
//			session = null;
//		}
		return session;
	}

//	public static void close() {
//		if (sessionFactory != null) {
//			sessionFactory.close();
//		}

//	}

}
