package com.example.spring.foundation;


public class OrderMyPizza {
	
	public Object getPizzaInstance(String beanName){
		
		if(beanName.equalsIgnoreCase("cheesePizza")){
			return new CheesePizza();
		}else if (beanName.equalsIgnoreCase("pineapplePizza")) {
			return PineapplePizza.getInstance();
		}else if (beanName.equalsIgnoreCase("veggiePizza")) {
			return new VeggiePizza();
		}else{
			return null;
		}	
	}

}
