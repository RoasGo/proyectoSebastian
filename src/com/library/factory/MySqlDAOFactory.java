package com.library.factory;

import com.library.dao.mysql.AuthDAO;
import com.library.dao.mysql.RolesDAO;
import com.library.interfaces.IAuthDAO;
import com.library.interfaces.IRolesDAO;

public class MySqlDAOFactory extends DAOFactory {

	@Override
	public IAuthDAO getAuthDAO() {

		return new AuthDAO();
	}

	@Override
	public IRolesDAO getRolDAO() {
		
		return new RolesDAO();
	}

 
}
