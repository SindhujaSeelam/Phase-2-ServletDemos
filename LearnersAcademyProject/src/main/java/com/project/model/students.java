package com.project.model;

public class students {
	private int id;
	private String firstname;
	private String lastname;
	private String gender;
	private int age;
	private int classid;
	public students(int id2, String firstname2, String lastname2, String gender2, int age2, int classid2) {

		this.id=id2;
		this.firstname=firstname2;
		this.lastname=lastname2;
		this.gender=gender2;
		this.age=age2;
		this.classid=classid2;
	
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getClassid() {
		return classid;
	}
	public void setClassid(int classid) {
		this.classid = classid;
	}
	@Override
	public String toString() {
		return "students [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", gender=" + gender
				+ ", age=" + age + ", classid=" + classid + "]";
	}
	
	


}
