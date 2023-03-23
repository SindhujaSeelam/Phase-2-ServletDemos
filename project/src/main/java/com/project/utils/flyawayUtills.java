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
public  List<flight> getflight(String source, String destination, String date) {
	List<flight> flights=new ArrayList<>();

	flight flight=null;
	Connection con=null;
	PreparedStatement stmt=null;
	ResultSet rs=null;
	try {
		con=this.datasource.getConnection();
		String sql = "select * from flight where source=? and destination=? and date=?";
		stmt=con.prepareStatement(sql); 
		stmt.setString(1,source);
		stmt.setString(2,destination);
		stmt.setString(3,date);
		ResultSet resultSet=stmt.executeQuery();
		while(resultSet.next()) {
			String fid=resultSet.getString("fid");
			String airline=resultSet.getString("airline");
			String source1=resultSet.getString("source");
			String destination1=resultSet.getString("destination");
			String date1=resultSet.getString("date");
			int price =resultSet.getInt("price");

           flight =new flight(fid,airline,source1,destination1,date1,price);
           flights.add(flight);
            
		}
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		close(con,stmt,rs);
	}return flights;	
}


public void addpassenger(String fid,String firstname, String lastname, String gender, int age, int phone, String email) {
	Connection con=null;
	PreparedStatement stmt=null;
	try {
		con=this.datasource.getConnection();
		String sql = "insert into passenger(fid,firstname,lastname,gender,age,phone,email) values(?,?,?,?,?,?,?)";
		stmt=con.prepareStatement(sql); 
		stmt.setString(1,fid);
		stmt.setString(2,firstname);
		stmt.setString(3,lastname);
		stmt.setString(4,gender);
		stmt.setInt(5,age);
		stmt.setInt(6,phone);
		stmt.setString(7,email);
		
		stmt.execute();
	
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		close(con,stmt,null);
	}
}
public flight getpassenger(String fid) {
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
			String fid1=resultSet.getString("fid");
			String airline=resultSet.getString("airline");
			String source1=resultSet.getString("source");
			String destination1=resultSet.getString("destination");
			String date1=resultSet.getString("date");
			int price =resultSet.getInt("price");

           flight =new flight(fid1,airline,source1,destination1,date1,price);
           flights.add(flight);
            
		}
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		close(con,stmt,rs);
	}return flight;
}

}