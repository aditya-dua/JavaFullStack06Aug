package com.example.di;

public class Marks {

	/*
	 * 1. DI
	 * 2. IoC -> Aspect Oriented Programming
	 * 3. Autowiring
	 */
	private int mO;

	public int getmO() {
		return mO;
	}

	public void setmO(int mO) {
		this.mO = mO;
	}

	
	public Marks() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Marks [mO=" + mO + "]";
	}
	
	
}
