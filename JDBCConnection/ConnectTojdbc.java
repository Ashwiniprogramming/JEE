package com.xworkx.JDBCConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class ConnectTojdbc {
	//try with resource

	public static void main(String[] args) {
		
		String sqlQuery = "select * from laptops";
		
		try (
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/laptop" , "root" ,"root");
			Statement stmt = conn.createStatement();
			ResultSet results = stmt.executeQuery(sqlQuery);
			){
			System.out.println(" Laptop details are : ");
			
			while(results.next()) {
				String Brand = results.getString(1);
				int laptop_id =results.getInt(2);
				String processor=results.getString(3);
				String operatingsystem=results.getString(4);
				int cost =results.getInt(5);
				String color=results.getString(6);
				int RAM = results.getInt(7);
				
				System.out.print("Brand:" +Brand);
				System.out.print(" id:" +laptop_id);
				System.out.print(" Processor:" +processor);
				System.out.print(" OperatingSystem:" +operatingsystem);
				System.out.print(" Cost:" +cost);
				System.out.print(" color:" +color);
				System.out.println(" RAM:" +RAM);
			}
			
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
