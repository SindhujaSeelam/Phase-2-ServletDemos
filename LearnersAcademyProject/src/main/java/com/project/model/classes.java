package com.project.model;

public class classes {

	private int id;
	public String subject;
	private String teacher;
	private String time;
	
	
	public classes(int id2, String subject2, String teacher2, String time2) {
	
		this.id=id2;
		this.subject=subject2;
		this.teacher=teacher2;
		this.time=time2;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "classes [id=" + id + ", subject=" + subject + ", teacher=" + teacher + ", time=" + time + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
}
