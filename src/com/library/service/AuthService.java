package com.library.service;

import java.util.ArrayList;

import com.library.beans.User;
import com.library.factory.DAOFactory;
import com.library.interfaces.IAuthDAO;

public class AuthService {
	private DAOFactory factory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
	private IAuthDAO authDAO = factory.getAuthDAO();
	
	public User createUser(User user) {
		return authDAO.createUser(user);
	}
	
	public User login(String email, String password) {
		return authDAO.authenticate(email, password);
	}
	
	public ArrayList<User> getUsers() {
		return authDAO.getUsers();
	}
}
