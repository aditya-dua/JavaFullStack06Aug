package com.example.dependency.injection;

public class Address {

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int houseNumber;
	private String streetName;
	private String city;
	
	
	public Address(int houseNumber, String streetName, String city) {
		super();
		this.houseNumber = houseNumber;
		this.streetName = streetName;
		this.city = city;
	}
	public int getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Adress [houseNumber=" + houseNumber + ", streetName="
				+ streetName + ", city=" + city + "]";
	}
	
	
	
}
