package com.jsp.SpringJdbc.crudoperation;

public class Student {
	private String USN;
	private String Name;
	private String City;
	@Override
	public String toString() {
		return "Student [USN=" + USN + ", Name=" + Name + ", City=" + City + "]";
	}
	public Student(String uSN, String name, String city) {
		super();
		USN = uSN;
		Name = name;
		City = city;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUSN() {
		return USN;
	}
	public void setUSN(String uSN) {
		USN = uSN;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
	

}
