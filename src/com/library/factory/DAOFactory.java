package com.library.factory;

import com.library.interfaces.IAuthDAO;
import com.library.interfaces.IRolesDAO;

public abstract class DAOFactory {

	public static final int MYSQL = 1;
	public static final int SQL = 2;
	
	public abstract IAuthDAO getAuthDAO();
	public abstract IRolesDAO getRolDAO();
	
	public static DAOFactory getDAOFactory(int database) {
		switch(database) {
			case MYSQL:
				return new MySqlDAOFactory();
			case SQL:
				return null;
			default: 
				return null;
		}
	}
	
}
