package com.library.dao.mysql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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

		Connection connection = null;
		CallableStatement statement = null;
		ResultSet resultSet = null;
		User user = null;
		
		try {
			
			connection = MySqlConexion.getConection();
			String sql = "{CALL authenticate(?,?)}";
			statement = connection.prepareCall(sql);
			statement.setString(1, email);
			statement.setString(2, password);
	
			resultSet = statement.executeQuery();
			
			if (resultSet.next()) {
				user = new User();
				user.setId(resultSet.getInt(1));
				user.setName(resultSet.getString(2));
				user.setEmail(resultSet.getString(3));
				user.setPassword(resultSet.getString(4));
				user.setRolId(resultSet.getInt(6));
				user.setRolName(resultSet.getString(7));
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if (statement != null) {
					statement.close();
				}
				if (resultSet != null) {
					resultSet.close();
				}
			} catch(Exception ex) {
				System.out.println(ex.getMessage());
			}			
		}
		
		return user;
	}

	@Override
	public ArrayList<User> getUsers() {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		ArrayList<User> listado = new ArrayList<User>();
		
		try {
			
			connection = MySqlConexion.getConection();
			String sql = "select * from users";
			statement = connection.prepareCall(sql);
	
			resultSet = statement.executeQuery();
			
			while (resultSet.next()) {
				User user = new User();
				user.setId(resultSet.getInt(1));
				user.setName(resultSet.getString(2));
				user.setEmail(resultSet.getString(3));
				user.setRolId(resultSet.getInt(6));
				listado.add(user);
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if (statement != null) {
					statement.close();
				}
				if (resultSet != null) {
					resultSet.close();
				}
			} catch(Exception ex) {
				System.out.println(ex.getMessage());
			}			
		}
		
		return listado;
	}

}
