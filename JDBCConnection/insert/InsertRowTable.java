package com.xworkx.JDBCConnection.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRowTable {

	public static void main(String[] args) {
		
 String sqlQuery = "insert into laptops values('micromax',5,'corei6','windows10',35000,'black',8)";
		
		try (
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/laptop" , "root" ,"root");
			Statement stmt = conn.createStatement();
			){
			int result=stmt.executeUpdate(sqlQuery);
			System.out.println("insert row to laptop table is : " +result);
			
			
			
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}


	}


