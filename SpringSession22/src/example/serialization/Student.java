package example.serialization;

import java.io.Serializable;
import java.util.HashMap;

public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3825276936151229248L;
	/**
	 * 
	 */
	

	private char name;
	private int id;
	private transient int roll;
	
	

	public char getName() {
		return name;
	}
	public void setName(char name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public Student(char name, int id,int roll) {
		super();
		this.name = name;
		this.id = id;
		this.roll = roll;
		
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", roll=" + roll
				+ ", marks="  + "]";
	}
	
	
	
	
	
	
	

}
