package com.example.di;

public class Student {

	private String name;
	private String email;
	private String id;
	private Marks marks;
	private String result;
	
	
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("INIT CALLED");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Marks getMarks() {
		return marks;
	}
	public void setMarks(Marks marks) {
		this.marks = marks;
		if(marks.getmO()>50) setResult("PASS");
		else setResult("NEEDS IMPROVEMENT");
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
	public Student() {
		super();
		System.out.println("CON CALLED");
		// TODO Auto-generated constructor stub
	}
	
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("DESTROY CALLED");
	}
	
	
	
	
}
