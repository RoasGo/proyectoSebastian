package clases;

public class Persona {
	/**
	 * nombre apellido edad dni
	 * 
	 * funciones obtener nombre completo obtener edad completo
	 *  obtener dni completo
	 */

	private String nombre;
	private String apellido;
	private int edad;
	private int dni;
	
	
	public Persona(String nombre, String apellido, int edad, int dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.dni = dni;
	}

	public String obtener_nombre_completo() {

		return this.nombre +" "+ this.apellido;
	}
	
	public int obtener_edad() {
		
		return this.edad;
	}
	
	public int obtener_dni() {
		
		return this.dni;
	}
}
