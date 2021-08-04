package com.library.service;

import java.util.ArrayList;

import com.library.beans.Rol;
import com.library.factory.DAOFactory;
import com.library.interfaces.IRolesDAO;

public class RolService {
	
	private DAOFactory factory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
	private IRolesDAO rolesDAO = factory.getRolDAO();
	
	public  ArrayList<Rol> getRoles(){
		return rolesDAO.getRol();
	}

}
