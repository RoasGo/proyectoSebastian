package clases;

public class Trabajador extends Persona {

	/**
	 * nombre apellido edad dni codigo de trabajador codigo de empresa fecha de
	 * ingreso nombre de cargo horas trabajdas
	 * 
	 * calcular el sueldo las cuales son las horas trabajadas *50
	 */

	

	private int cod_trabajador;
	private int cod_empresa;
	private int fech_ingreso;
	private String nombre_cargo;
	private int hora_trabajadas;

	public Trabajador(String nombre, String apellido, int edad, int dni, int cod_trabajador, int cod_empresa,
			int fech_ingreso, String nombre_cargo, int hora_trabajadas) {
		super(nombre, apellido, edad, dni);
		this.cod_trabajador = cod_trabajador;
		this.cod_empresa = cod_empresa;
		this.fech_ingreso = fech_ingreso;
		this.nombre_cargo = nombre_cargo;
		this.hora_trabajadas = hora_trabajadas;
	}

	public int getCod_trabajador() {
		return cod_trabajador;
	}

	public void setCod_trabajador(int cod_trabajador) {
		this.cod_trabajador = cod_trabajador;
	}

	public int getCod_empresa() {
		return cod_empresa;
	}

	public void setCod_empresa(int cod_empresa) {
		this.cod_empresa = cod_empresa;
	}

	public int getFech_ingreso() {
		return fech_ingreso;
	}

	public void setFech_ingreso(int fech_ingreso) {
		this.fech_ingreso = fech_ingreso;
	}

	public String getNombre_cargo() {
		return nombre_cargo;
	}

	public void setNombre_cargo(String nombre_cargo) {
		this.nombre_cargo = nombre_cargo;
	}

	public int getHora_trabajadas() {
		return hora_trabajadas;
	}

	public void setHora_trabajadas(int hora_trabajadas) {
		this.hora_trabajadas = hora_trabajadas;
	}

	public int sueldo_trabador() {
		int sueldo = this.hora_trabajadas * 50;

		return sueldo;
	}

}
