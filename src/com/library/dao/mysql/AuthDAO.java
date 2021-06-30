package com.library.dao.mysql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.library.beans.User;
import com.library.interfaces.IAuthDAO;
import com.library.utils.MySqlConexion;

public class AuthDAO implements IAuthDAO {

	/*
	 * 3 PARAMETROS: NOMBRE, EMAIL, PASSWORD
	 */
	
	@Override
	public User createUser(User user) {
		/*
		 * 1. CONEXION A TU BASE DE DATOS.
		 * 2. PREPARED STATEMENT. 
		 * 3. RESULTADO.
		 * 
		 * |||| 1. te conectas -> haces tu sentencia -> seteas parametros -> ejecutas tu sentencia -> recibes resultados -> seteas resultados.
		 * 
		 */
		
		Connection connection = null;
		CallableStatement statement = null;
		int rs = 0;
		User userCreated = null;
		try {
			// Conectarse
			connection = MySqlConexion.getConection();
			
			// Escribir tu sentencia
			String sql = "{CALL createUser(?, ?, ?)}";
			
			//Preparar tu sentencia
			statement = connection.prepareCall(sql);
			
			//Setear parametros
			statement.setString(1, user.getName());
			statement.setString(2, user.getEmail());
			statement.setString(3, user.getPassword());
			
			//Ejecutar sentencia y guardar los resultados en resultSet
			rs = statement.executeUpdate();
			
			//Setear el resultado en clases de Java(Arrays, Beans, etc)
			
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if (statement != null) {
					statement.close();
				}
			} catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
		}
		
		return user;
	}

	@Override
	public User authenticate(String email, String password) {

		return null;
	}

}
