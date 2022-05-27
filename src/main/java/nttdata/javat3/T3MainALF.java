package nttdata.javat3;

import nttdata.javat3.business.ManagmentServiceImpl;

/**
 * Taller Práctico 3 - Gestión de empleados y estudiantes
 * 
 * @author Alvaro L
 *
 */
public class T3MainALF {
	/**
	 * Método principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Variables
		final String student = "Estudiante";
		final String employee = "Empleado";

		// Se crea el objeto de la clase ManagmentServiceImpl
		ManagmentServiceImpl m = new ManagmentServiceImpl();

		// El método addNewPerson es ejecutado multitud de veces para probar la
		// funcionalidad de la base de datos al añadir varios empleados y estudiantes
		m.addNewPerson(student, "Paco", 12345678, null, null, null, "DAW", "Sotero Hernández");
		m.addNewPerson(employee, "Pepe", 11223344, "NTT Data", "Naturgy", "Analista programador", null, null);
		m.addNewPerson(employee, "Juan", 22334455, "Accenture", "Coca cola", "Programador Junior", null, null);
		m.addNewPerson(student, "Macarena", 43242534, null, null, null, "DAM", "Alixar");
		m.addNewPerson(student, "Alejandro", 75632821, null, null, null, "DAW", "CESUR");

		// El método showAllEmployees es ejecutado, mostrando los empleados de la base
		// de datos
		m.showAllPersons();

	}

}
