package com.library.interfaces;

import com.library.beans.User;

public interface IAuthDAO {
	//EL REGISTRAR + EL LOGUEO    -> AMBOS SON PARTE DE AUTHENTICACION
	public User createUser(User user);
	public User authenticate(String email, String password);
	
}
