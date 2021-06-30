package com.library.beans;

public class User {

	// codigo, nombre, idRol, apellido, dni, celular, correo

	private int id;
	private String name;
	private String dni;
	private String phone;
	private String email;
	private String password;
	private int rolId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRolId() {
		return rolId;
	}

	public void setRolId(int rolId) {
		this.rolId = rolId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
