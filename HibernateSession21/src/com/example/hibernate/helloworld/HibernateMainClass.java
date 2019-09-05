package com.example.hibernate.helloworld;

import java.io.File;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * 1. Create a new project
 * 2. Adding Hibernate/lib/required to the build path
 * 3. in the default location of your source : create a hibernate.cfg.xml
 * 4. Add a mapping resource file : <mapping resource="message.hbm.xml" />
 * 5. Create a mapping resource file with the same name
 * 6. Based on mapping I create the message class
 * 
 * @author AdityaDua
 *
 */
public class HibernateMainClass {

	private static SessionFactory factory;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		factory = new Configuration().configure().buildSessionFactory();
		
		Message message  = new Message();
		message.setMessageText("Hello World!");
		readData();
		
		Session session =factory.openSession();
		 //factory.getCurrentSession();
		
		
		MessageNew msgNew = new MessageNew();
		msgNew.setMessageText("Annotized Hello World!");
		//Transaction tnx = session.beginTransaction();
		Integer idInserted= (Integer)session.save(msgNew);
		//msgNew.setMessageText("IT IS NEW");
		message  = new Message();
		message.setMessageText("Hello World!123456789");
		System.out.println("ID inserted is:"+idInserted);
		 idInserted= (Integer)session.save(msgNew);
		System.out.println("ID inserted is:"+idInserted);

		//tnx.commit();
		session.close();	
	}
	
	public static void readData(){
		
		Session session = factory.openSession();
		Transaction tx=null;
		
		List messageList = session.createQuery("From MessageNew").list();
		
		for (Object object : messageList) {
			MessageNew msg = (MessageNew) object;
			
			System.out.println(msg);
		}
		
		session.close();
	}

}
