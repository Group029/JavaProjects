package beans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import entity.Employee;
import utile.HibernateUtile;

public class EmployeeProcessor {
	public static void createNewEmployee(Employee emp) {
		SessionFactory sessionFactory = HibernateUtile.getSessionFactory();
		try(Session s = sessionFactory.openSession()){
			
			Transaction tx = s.beginTransaction();
			s.save(emp);
		tx.commit();
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("Added sucessfuly");
	}
	
	public static void serachEmployee 
}
