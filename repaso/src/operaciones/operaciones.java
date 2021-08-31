package operaciones;

import java.util.ArrayList;

import clases.Empresa;
import clases.Trabajador;

public class operaciones {

	public static void main(String[] args) {

		ArrayList<Trabajador> listado_trabajadores = new ArrayList<Trabajador>();
		Trabajador persona1 = new Trabajador("Pepe", "Baldivia", 0, 0, 0, 0, 0, null, 15);
		Trabajador persona2 = new Trabajador("Pepe", "Paloma", 0, 0, 0, 0, 0, null, 14);
		Trabajador persona3 = new Trabajador("Pepe", "Milla", 0, 0, 0, 0, 0, null, 5);

		listado_trabajadores.add(persona1);
		listado_trabajadores.add(persona2);
		listado_trabajadores.add(persona3);

		Empresa a = new Empresa(1, "Sony", listado_trabajadores);
		a.nombre_completo();
		a.sueldo_trabadores();
	}

}
