package com.example.hibernate.ecom;

import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ExampleMain {

	
	private static SessionFactory factory;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factory = new Configuration().configure().buildSessionFactory();
		
		Item i[] = new Item[5];

		HashSet<Item> iSet=new HashSet<>();
		HashSet<Item> i2Set=new HashSet<>();
		Cart c = new Cart();
		c.setCustomerName("CUSTOMER 1");
		Session session =factory.openSession();
		
		Transaction tx = session.beginTransaction();
		for(int num=0;num<5;num++){
			i[num] = new Item();
			i[num].setName("Item Name "+num);
			i[num].setDesc("Item DESC "+num);
			i[num].setManf("Item Manf "+num);
			i[num].setPrice(""+num*100*Math.random());
			//i[num].setCart(c);
			//saveItem(session, i[num]);
			iSet.add(i[num]);
			if(num%2==0) i2Set.add(i[num]);
		}
		
		
		
		c.setItems(iSet);
		
		Cart c1 = new Cart();
		c1.setCustomerName("CUSTOMER 2");
		iSet=new HashSet<>();
		
		c1.setItems(i2Set);
		System.out.println("Items inserted are:"+saveCart(session,c));
		System.out.println("Items inserted are:"+saveCart(session,c1));
		
		
		System.out.println(fetchEmployee(session,1));
		tx.commit();
		
		session.close();
		
	}
	public static Integer saveCart(Session session,Cart e){
		return  (Integer)session.save(e);
	}
	public static Integer saveItem(Session session,Item e){
		return  (Integer)session.save(e);
	}
	public static Cart fetchEmployee(Session session,Integer id){
		
		//session.cre
		/*List empList = session.createQuery("From Employee where name='ADITYA DUA'").list();

		for (Object object : empList) {
			System.out.println((Employee)object);
		}*/
		return session.get(Cart.class, id);	
	}
	
}
