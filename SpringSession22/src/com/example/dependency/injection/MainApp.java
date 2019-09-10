package com.example.dependency.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	   public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	      Employee obj = (Employee) context.getBean("helloWorld");
	      System.out.println(obj);
	      Address ad1 = (Address) context.getBean("address");
	      System.out.println(ad1);
	   }
	}
