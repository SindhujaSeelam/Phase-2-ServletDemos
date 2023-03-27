package com.project.utils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.project.model.flight;
public class flyawayUtills {
List<flight> flights=new ArrayList<>();
private DataSource datasource;

public flyawayUtills(DataSource datasource) {
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
public  List<flight> getflight(String source, String destination, String date,int persons) {
	List<flight> flights=new ArrayList<>();

	flight flight=null;
	Connection con=null;
	PreparedStatement stmt=null;
	ResultSet rs=null;
	try {
		con=this.datasource.getConnection();
		String sql = "select * from flight where source=? and destination=? and date=? and persons>=?";
		stmt=con.prepareStatement(sql); 
		stmt.setString(1,source);
		stmt.setString(2,destination);
		stmt.setString(3,date);
		stmt.setInt(4,persons);
		ResultSet resultSet=stmt.executeQuery();
		while(resultSet.next()) {
			String fid=resultSet.getString("fid");
			String airline=resultSet.getString("airline");
			String source1=resultSet.getString("source");
			String destination1=resultSet.getString("destination");
			String date1=resultSet.getString("date");
			int price =resultSet.getInt("price");
			int persons1=resultSet.getInt("persons");

           flight =new flight(fid,airline,source1,destination1,date1,price,persons1);
           flights.add(flight);
            
		}
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		close(con,stmt,rs);
	}return flights;	
}


public void addpassenger(String fid,String firstname, String lastname, String gender, int age, long phone, String email, int persons) {
	Connection con=null;
	PreparedStatement stmt=null;
	try {
		con=this.datasource.getConnection();
		String sql = "insert into passenger(fid,firstname,lastname,gender,age,phone,email,persons) values(?,?,?,?,?,?,?,?)";
		stmt=con.prepareStatement(sql); 
		stmt.setString(1,fid);
		stmt.setString(2,firstname);
		stmt.setString(3,lastname);
		stmt.setString(4,gender);
		stmt.setInt(5,age);
		stmt.setLong(6,phone);
		stmt.setString(7,email);
		stmt.setInt(8, persons);
		
		stmt.executeUpdate();
	
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		close(con,stmt,null);
	}
		
}
public int getpassengerid(String fid,String firstname, String lastname, String gender, int age, long phone, String email, int persons) {
	//flight flight=null;
	int pid=0;
	Connection con=null;
	PreparedStatement stmt=null;
	ResultSet rs=null;
	try {
		con=this.datasource.getConnection();
		String sql = "select pid from passenger where fid=? and firstname=? and lastname=? and gender=? and age=? and phone=? and email=? and persons=?";
		stmt=con.prepareStatement(sql); 
		stmt.setString(1,fid);
		stmt.setString(2,firstname);
		stmt.setString(3,lastname);
		stmt.setString(4,gender);
		stmt.setInt(5,age);
		stmt.setLong(6,phone);
		stmt.setString(7,email);
		stmt.setInt(8, persons);
		 rs=stmt.executeQuery();
		if(rs.next()) {
			 pid=rs.getInt("pid");		
           }	
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		//close(con,stmt,null);
	}
	
	return pid;
		
}
public flight getpassenger(int pid) {
	flight flight=null;
	Connection con=null;
	PreparedStatement stmt=null;
	ResultSet rs=null;
	try {
		con=this.datasource.getConnection();
		String sql = "select * from passenger where pid=?";
		stmt=con.prepareStatement(sql); 
		stmt.setInt(1,pid);
		ResultSet resultSet=stmt.executeQuery();
		while(resultSet.next()) {
			String firstname=resultSet.getString("firstname");
			String lastname=resultSet.getString("lastname");
			String gender=resultSet.getString("gender");
			int age=resultSet.getInt("age");
			int phone=resultSet.getInt("phone");
			String email =resultSet.getString("email");
            int persons=resultSet.getInt("persons");
           flight =new flight(firstname,lastname,gender,age,phone,email,persons);
           flights.add(flight);
            
		}
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		close(con,stmt,rs);
	}return flight;
}
public flight getflight(String fid) {
	flight flight=null;
	Connection con=null;
	PreparedStatement stmt=null;
	ResultSet rs=null;
	try {
		con=this.datasource.getConnection();
		String sql = "select * from flight where fid=?";
		stmt=con.prepareStatement(sql); 
		stmt.setString(1,fid);
		ResultSet resultSet=stmt.executeQuery();
		while(resultSet.next()) {
			String airline=resultSet.getString("airline");
			String source=resultSet.getString("source");
			String destination=resultSet.getString("destination");
			String date=resultSet.getString("date");
			int price =resultSet.getInt("price");
            int persons=resultSet.getInt("persons");

			flight =new flight(fid,airline,source,destination,date,price,persons);
	           flights.add(flight);
	            
            
		}
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		close(con,stmt,rs);
	}
	return flight;
}
public boolean getadmincheck(String username, String password) {
	boolean check=false;
	Connection con=null;
	PreparedStatement stmt=null;
	ResultSet rs=null;
	String un=null;
	String pwd=null;

	try {
		con=this.datasource.getConnection();
		String sql = "select * from admin";
		stmt=con.prepareStatement(sql); 
		ResultSet resultSet=stmt.executeQuery();
		while(resultSet.next()) {
			 un=resultSet.getString("username");
			 pwd=resultSet.getString("password");
            
		}
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		close(con,stmt,rs);
	}
	if(un.equals(username)&&pwd.equals(password)) {
		
		check=true;}
	
	return check;
}
public boolean setpwd(String password) {
	boolean check=false;
	Connection con=null;
	PreparedStatement stmt=null;
	try {
		con=this.datasource.getConnection();
		String sql = "update admin set password=?";
		stmt=con.prepareStatement(sql); 
		stmt.setString(1,password);
		boolean s=stmt.execute();
		System.out.println(s);
		if(!s) {
			check=true;
		}
		
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		close(con,stmt,null);
	}
	return check;
	
}
public List<flight> getsourceanddestination() {
	List<flight> flights=new ArrayList<>();
	flight flight=null;
	Connection con=null;
	PreparedStatement stmt=null;
	ResultSet rs=null;
	try {
		con=this.datasource.getConnection();
		String sql = "select distinct source,destination from flight";
		stmt=con.prepareStatement(sql); 
		rs=stmt.executeQuery();
		while(rs.next()) {
			String source=rs.getString("source");
			String destination=rs.getString("destination");
			
	           flight =new flight(source,destination);
	           flights.add(flight);
		}
		
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		close(con,stmt,null);
	}return flights;
}
public List<flight> getairlines() {
	List<flight> flights=new ArrayList<>();
	flight flight=null;
	Connection con=null;
	PreparedStatement stmt=null;
	ResultSet rs=null;
	try {
		con=this.datasource.getConnection();
		String sql = "select distinct airline from flight";
		stmt=con.prepareStatement(sql); 
		rs=stmt.executeQuery();
		while(rs.next()) {
			String airline=rs.getString("airline");
			
	           flight =new flight(airline);
	           flights.add(flight);
		}
		
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		close(con,stmt,null);
	}
	return flights;
}
public List<flight> getflights() {
	List<flight> flights=new ArrayList<>();
	flight flight=null;
	Connection con=null;
	PreparedStatement stmt=null;
	ResultSet rs=null;
	try {
		con=this.datasource.getConnection();
		String sql = "select * from flight order by date";
		stmt=con.prepareStatement(sql); 
		ResultSet resultSet=stmt.executeQuery();
		while(resultSet.next()) {
			String fid=resultSet.getString("fid");
			String airline=resultSet.getString("airline");
			String source=resultSet.getString("source");
			String destination=resultSet.getString("destination");
			String date=resultSet.getString("date");
			int price =resultSet.getInt("price");
            int persons=resultSet.getInt("persons");

			flight =new flight(fid,airline,source,destination,date,price,persons);
	           flights.add(flight);
	            
            
		}
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		close(con,stmt,rs);
	}
	return flights;
}

}