package com.example.spring.foundation;

public class OrderPizzaShop {

	
	public static void main(String[] args) {
		
		OrderMyPizza omp= new OrderMyPizza();
		
		PineapplePizza pnp=(PineapplePizza) omp.getPizzaInstance("pineapplePizza");
		pnp.display();
		
		VeggiePizza vP=(VeggiePizza) omp.getPizzaInstance("veggiePizza");
		vP.display();
		
		PineapplePizza pnp2=(PineapplePizza) omp.getPizzaInstance("pineapplePizza");
		pnp2.display();
		
		CheesePizza cP=(CheesePizza) omp.getPizzaInstance("cheesePizza");
		cP.display();
		
		
	}
}
