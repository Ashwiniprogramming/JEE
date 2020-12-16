package com.xworkx.JDBCConnection.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTableLaptop {

	public static void main(String[] args) {
  String sqlQuery = "update laptops set cost = 45000 where laptop_id=1";
		
		try (
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/laptop" , "root" ,"root");
			Statement stmt = conn.createStatement();
			){
			int result=stmt.executeUpdate(sqlQuery);
			System.out.println("updated laptop cost is : " +result);
			
			
			
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	}


