package com.example.spring.foundation;

public class PineapplePizza {

	private String name;
	
	private static PineapplePizza pnP;
	private PineapplePizza() {
		// TODO Auto-generated constructor stub
	}
	
	public static PineapplePizza getInstance(){
		if(pnP == null){
			pnP= new PineapplePizza();
		}
		return pnP;
	}
	public void display(){
		System.out.println("You are eating the PINEAPPLE PIZZA");
	}
	
}
