package clases;

import java.util.ArrayList;

public class Empresa {

	/**
	 * codio de empresa trabajadores nombre de empresa
	 * 
	 * saber nombre completo de sus trabajadores saber sueldo de trabajadores
	 */
	private int cod_empresa;
	private String nom_empresa;
	private ArrayList<Trabajador> listTrabajadores;
	
	public Empresa(int cod_empresa, String nom_empresa, ArrayList<Trabajador> listTrabajadores) {
		super();
		this.cod_empresa = cod_empresa;
		this.nom_empresa = nom_empresa;
		this.listTrabajadores = listTrabajadores;
	}

	public int getCod_empresa() {
		return cod_empresa;
	}

	public void setCod_empresa(int cod_empresa) {
		this.cod_empresa = cod_empresa;
	}

	public String getNom_empresa() {
		return nom_empresa;
	}

	public void setNom_empresa(String nom_empresa) {
		this.nom_empresa = nom_empresa;
	}

	public ArrayList<Trabajador> getListTrabajadores() {
		return listTrabajadores;
	}

	public void setListTrabajadores(ArrayList<Trabajador> listTrabajadores) {
		this.listTrabajadores = listTrabajadores;
	}

	public void nombre_completo() {

		for (int i = 0; i < listTrabajadores.size(); i++) {
			System.out.println(listTrabajadores.get(i).obtener_nombre_completo());
		}

	}

	public void sueldo_trabadores() {

		for (int i = 0; i < listTrabajadores.size(); i++) {
			System.out.println(" nombre y sueldo :" + "" + listTrabajadores.get(i).obtener_nombre_completo()
					+ listTrabajadores.get(i).sueldo_trabador());
		}
	}

	
	
}
