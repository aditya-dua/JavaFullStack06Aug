package com.example.app;


public class HelloWorld {
	   private String message;

	   public void setMessage(String message){
	      this.message  = message;
	   }
	   public void getMessage(){
	      System.out.println("Your Message : " + message);
	   }
	   
	   
	   public HelloWorld() {
		// TODO Auto-generated constructor stub
		   System.out.println("INITIze bean success");
	   }
	}