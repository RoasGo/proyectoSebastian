package com.library.dao.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.library.beans.Rol;
import com.library.interfaces.IRolesDAO;
import com.library.utils.MySqlConexion;

public class RolesDAO implements IRolesDAO {

	@Override
	public ArrayList<Rol> getRol() {
		Connection connecion = null;
		PreparedStatement statment = null;
		ResultSet result = null;
		ArrayList<Rol> listadoRoles = new ArrayList<Rol>();

		try {
			connecion = MySqlConexion.getConection();
			String sql = "select * from roles";
			statment = connecion.prepareStatement(sql);
			result = statment.executeQuery();
			
			while (result.next()) {
				Rol roles = new Rol();
				roles.setId(result.getInt(1));
				roles.setName(result.getString(2));
				listadoRoles.add(roles);
			}

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

		return listadoRoles;
	}

}
