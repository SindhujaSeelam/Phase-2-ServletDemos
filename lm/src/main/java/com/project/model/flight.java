package com.project.model;

public class flight {
	private int pid;
	public String fid;
	private String airline;
	private String source;
	private String destination;
	private String date;
	private int price;
	private String firstname;
	private String lastname;
	private String gender;
	private int age;
	private String email;
	private int persons;
public flight(String fid,String source,String destination,String date){
	this.fid=fid;
	this.source=source;
	this.destination=destination;
	this.setDate(date);
}
flight(String source,String destination,String date){
	this.setSource(source);
	this.setDestination(destination);
	this.setDate(date);
}

public flight(String fid, String airline, String source, String destination, String date, int price,int persons) {
	this.fid=fid;
	this.airline=airline;
	this.setSource(source);
	this.setDestination(destination);
	this.setDate(date);
	this.price=price;
	this.setPersons(persons);
}
public flight(int pid) {
	this.pid=pid;
}
public flight(String firstname, String lastname, String gender, int age,String email,int persons) {
	this.setFirstname(firstname);
	this.setLastname(lastname);
	this.setGender(gender);
	this.setAge(age);
	this.setEmail(email);
	this.persons=persons;
}
public flight(String airline, String source, String destination, String date2, int price) {
	this.airline=airline;
	this.setSource(source);
	this.setDestination(destination);
	this.setDate(date);
	this.price=price;
}
public flight(String source2, String destination2) {
	this.source=source2;
	this.destination=destination2;
}
public flight(String airline2) {
	this.airline=airline2;
}
public flight(String fid2, String airline2, String source2, String destination2, String date2, int price2) {
	// TODO Auto-generated constructor stub
}
public String getFid() {
	return fid;
}
public void setFid(String fid) {
	this.fid = fid;
}
public String getAirline() {
	return airline;
}
public void setAirline(String airline) {
	this.airline = airline;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}

public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
/**
 * @return the firstname
 */
public String getFirstname() {
	return firstname;
}
/**
 * @param firstname the firstname to set
 */
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
/**
 * @return the lastname
 */
public String getLastname() {
	return lastname;
}
/**
 * @param lastname the lastname to set
 */
public void setLastname(String lastname) {
	this.lastname = lastname;
}
/**
 * @return the gender
 */
public String getGender() {
	return gender;
}
/**
 * @param gender the gender to set
 */
public void setGender(String gender) {
	this.gender = gender;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getPersons() {
	return persons;
}
public void setPersons(int persons) {
	this.persons = persons;
}
}
