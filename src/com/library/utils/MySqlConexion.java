package com.library.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConexion {
	
	private static final String CONTROLADOR = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/library?serverTimezone=UTC";
	private static final String USER = "root";
	private static final String PASSWORD = "mysql";
	
	
	public static Connection getConection() {
		Connection con = null; 
		
		try {
			
			Class.forName(CONTROLADOR);
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Conexión a BD OK");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el controlador");
			e.printStackTrace();
			
		} catch (SQLException e) {
			System.out.println("Error al establecer la conexión");
			e.printStackTrace();
			
		} 
		
		return con;
	}
}
