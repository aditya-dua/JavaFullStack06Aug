package com.example.hibernate.employee;

import java.util.HashSet;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeMainClass {

	private static SessionFactory factory;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factory = new Configuration().configure().buildSessionFactory();
		
		Employee e = new Employee();
		e.setName("ASDFGHJJKL");
		e.setSalary("2323");
		e.setPhone("12121212112");
		Account acc=new Account();
		acc.setName("ACCOUNT-1");
		Account acc1=new Account();
		acc1.setName("ACCOUNT-2");
		acc1.setEmployee(e);
		HashSet<Account> hs= new HashSet<Account>();
		hs.add(acc);
		hs.add(acc1);
	
		e.setAccounts(hs);
		Session session =factory.openSession();
		
		addEmployee(session,e);
		//System.out.println("Employee fetched is:"+fetchEmployee(session, 1));
		System.out.println("Employee fetched is:"+fetchEmployee(session, 6));
		//System.out.println("Employee id inserted is::"+addEmployee(session, e));
		//updateEmployee(session,258,"Aditya");
		//deleteEmployee(session,258);
		session.close();
		
	}
	
	public static Integer addEmployee(Session session,Employee e){
		return  (Integer)session.save(e);
	}
	
	public static Employee fetchEmployee(Session session,Integer id){
		
		//session.cre
		/*List empList = session.createQuery("From Employee where name='ADITYA DUA'").list();

		for (Object object : empList) {
			System.out.println((Employee)object);
		}*/
		return session.get(Employee.class, id);	
	}

	public static void updateEmployee(Session session,Integer id,String name){
		
		
		Transaction tx = session.beginTransaction();
		Employee emp = (Employee) session.get(Employee.class, id);
		emp.setSalary(name);
		
		System.out.println(emp);
		try{
			
			session.update(emp);
			session.flush();
			tx.commit();
			session.close();
		}catch(Exception e){
		
			tx.rollback();
			e.printStackTrace();
		}finally{
			tx.rollback();
		}	
	}
	
	public static void deleteEmployee(Session session,Integer id){
		
		Transaction tx = session.beginTransaction();
		
		Employee emp = (Employee) session.get(Employee.class, id);
		System.out.println(emp);
		session.delete(emp);
		tx.commit();
		
	}
	
}
