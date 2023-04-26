package com.project.utils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.project.model.*;

public class portalutils {
private DataSource datasource;

public portalutils(DataSource datasource) {
	this.datasource=datasource;
}
private void close(Connection con,Statement stmt,ResultSet rs) {
	try {
		if(rs!=null) {
			rs.close();
		}
		if(stmt!=null) {
			stmt.close();
		}
		if(con !=null) {
			con.close();
		}
	}catch(SQLException e) {
		e.printStackTrace();
	}
}

public List<teachers> getteachers(){
	List<teachers> teachers=new ArrayList<>();
	teachers teacher=null;
	Connection con=null;
	PreparedStatement stmt=null;
	ResultSet rs=null;
	try {
		con=this.datasource.getConnection();
		String sql="select * from teachers";
		stmt=con.prepareStatement(sql);
		ResultSet res=stmt.executeQuery();
		while(res.next()) {
			int id=res.getInt("id");
			System.out.println(id);
			String firstname=res.getString("firstname");
			String lastname=res.getString("lastname");
			int age=res.getInt("age");
			String gender=res.getString("gender");
			
			teacher=new teachers(id,firstname,lastname,age,gender);
			teachers.add(teacher);
		}
		
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		close(con,stmt,rs);
	}
	return teachers;
	
}
public List<classes> getclasses() {
	List<classes> classes = new ArrayList<>();
	classes sclass=null;
	Connection con=null;
	PreparedStatement stmt=null;
	ResultSet rs=null;
	try {
		con=this.datasource.getConnection();
		String sql="select * from classes";
		stmt=con.prepareStatement(sql);
		ResultSet res=stmt.executeQuery();
		while(res.next()) {
			int id=res.getInt("id");
			System.out.println(id);
			String subject=res.getString("subject");
			String teacher=res.getString("teacher");
			String time=res.getString("time");
			
			sclass=new classes(id,subject,teacher,time);
			classes.add(sclass);
		}
		
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		close(con,stmt,rs);
	}
	return classes;
	
}
public List<students>  getsttudents() {
	List<students> students = new ArrayList<>();
	students student=null;
	Connection con=null;
	PreparedStatement stmt=null;
	ResultSet rs=null;
	try {
		con=this.datasource.getConnection();
		String sql="select * from students";
		stmt=con.prepareStatement(sql);
		ResultSet res=stmt.executeQuery();
		while(res.next()) {
			int id=res.getInt("id");
			System.out.println(id);
			String firstname=res.getString("firstname");
			String lastname=res.getString("lastname");
			String gender=res.getString("gender");
			int age=res.getInt("age");
			int classid=res.getInt("classid");
			
			
			student=new students(id,firstname,lastname,gender,age,classid);
			students.add(student);
		}
		
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		close(con,stmt,rs);
	}
	return students;}
public List<subjects> getsubjects() {
	List<subjects> subjects = new ArrayList<>();
	subjects subject=null;
	Connection con=null;
	PreparedStatement stmt=null;
	ResultSet rs=null;
	try {
		con=this.datasource.getConnection();
		String sql="select * from subjects";
		stmt=con.prepareStatement(sql);
		ResultSet res=stmt.executeQuery();
		while(res.next()) {
			int id=res.getInt("id");
			System.out.println(id);
			String name=res.getString("name");
			
			
			subject=new subjects(id,name);
			subjects.add(subject);
		}
		
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		close(con,stmt,rs);
	}
	return subjects;}
public void setTeacher(int id, String teacher) {

	Connection con=null;
	PreparedStatement stmt=null;
	try {
		con=this.datasource.getConnection();
		String sql = "update classes set teacher=? where id=?";
		stmt=con.prepareStatement(sql); 
		stmt.setString(1,teacher);
		stmt.setInt(2, id);
		stmt.execute();
		
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		close(con,stmt,null);
	}
	
}
public void setSubject(int id, String subject) {
	Connection con=null;
	PreparedStatement stmt=null;
	try {
		con=this.datasource.getConnection();
		String sql = "update classes set subject=? where id=?";
		stmt=con.prepareStatement(sql); 
		stmt.setString(1,subject);
		stmt.setInt(2, id);
		stmt.execute();
		
		
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		close(con,stmt,null);
	}
	
}

}