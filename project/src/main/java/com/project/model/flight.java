package com.project.model;

public class flight {
	private String fid;
	private String airline;
	private String source;
	private String destination;
	private String date;
	private int price;
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

public flight(String fid, String airline, String source, String destination, String date, int price) {
	this.fid=fid;
	this.airline=airline;
	this.setSource(source);
	this.setDestination(destination);
	this.setDate(date);
	this.price=price;
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
}
