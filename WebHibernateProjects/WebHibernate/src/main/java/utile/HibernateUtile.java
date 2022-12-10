package utile;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Employee;

public class HibernateUtile {
	private static SessionFactory hibernateSessionFactory;
	static {
		 Configuration conf = new Configuration();
		 conf = conf.configure("hibernate.cfg.xml");
		 conf.addAnnotatedClass(Employee.class);
		 hibernateSessionFactory=conf.buildSessionFactory();
		 System.out.println("open session");
	 }
	public static SessionFactory getSessionFactory() {
		return hibernateSessionFactory;
	}
}
