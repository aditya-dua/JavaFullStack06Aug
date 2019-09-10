package com.example.di;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class ExampleMain {
	/* 
	 * Weblogic, 
	 * properties -> jdbc, app.properties
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		// ApplicationContext context = new FileSystemXmlApplicationContext("//Users/AdityaDua/Downloads/beans.xml");
	     
		 XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
		 Student stu = (Student) factory.getBean("student");
		 System.out.println(stu);
		 
		 Student stu1 = (Student) factory.getBean("student");
		 System.out.println(stu1);
		 
		 
	}

}
