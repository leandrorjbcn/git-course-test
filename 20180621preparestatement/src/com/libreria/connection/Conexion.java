package com.libreria.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	public static Connection getConnection() {
		
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String sourceURL = "jdbc:mysql://localhost/20180326preparestatement";
			conn = DriverManager.getConnection(sourceURL, "root", "");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return conn;
		
	}
	
}
