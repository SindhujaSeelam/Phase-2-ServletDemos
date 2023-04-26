package com.project.model;

public class subjects {

	
	private int id;
	private String name;
	public subjects(int id2, String name2) {

		this.id=id2;
		this.name=name2;
	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "subjects [id=" + id + ", name=" + name + "]";
	}
	
	
}
