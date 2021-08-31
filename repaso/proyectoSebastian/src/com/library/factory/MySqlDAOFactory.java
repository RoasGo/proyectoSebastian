package com.library.factory;

import com.library.dao.mysql.AuthDAO;
import com.library.interfaces.IAuthDAO;

public class MySqlDAOFactory extends DAOFactory {

	@Override
	public IAuthDAO getAuthDAO() {

		return new AuthDAO();
	}


}
