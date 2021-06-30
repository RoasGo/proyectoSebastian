package com.library.service;

import com.library.beans.User;
import com.library.factory.DAOFactory;
import com.library.interfaces.IAuthDAO;

public class AuthService {
	private DAOFactory factory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
	private IAuthDAO authDAO = factory.getAuthDAO();
	
	public User createUser(User user) {
		return authDAO.createUser(user);
	}
	
}
