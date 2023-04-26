package com.project.model;

public class teachers {
	
	private int id;
	private String firstname;
	private String lastname;
	private int age;
	private String gender;
	public teachers(int id2, String firstname2, String lastname2, int age2, String gender2) {

		this.id=id2;
		this.firstname=firstname2;
		this.lastname=lastname2;
		this.age=age2;
		this.gender=gender2;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "teachers [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", age=" + age
				+ ", gender=" + gender + "]";
	}
	
	

}
