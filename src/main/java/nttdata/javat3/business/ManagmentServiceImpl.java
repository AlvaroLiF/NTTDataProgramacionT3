package nttdata.javat3.business;

import java.util.HashMap;
import java.util.Map;

/**
 * Clase ManagmentServiceImpl
 * 
 * @author Alvaro L
 *
 */

public class ManagmentServiceImpl implements ManagmentServiceI {

	// Creación del mapa personsDatabase
	final Map<Integer, Person> personsDatabase = new HashMap<Integer, Person>();

	/**
	 * El método addNewPerson sirve para añadir empleados y estudiante a la base de
	 * datos
	 */
	@Override
	public void addNewPerson(String type, String name, int dni, String company, String project, String category,
			String modality, String educationalCentre) {
		if (type.equalsIgnoreCase("Empleado")) {
			Employee e = new Employee();
			e.setName(name);
			e.setDni(dni);
			e.setCompany(company);
			e.setProject(project);
			e.setCategory(category);

			e.showDetails();
			System.out.println();

			personsDatabase.put(dni, e);
		} else if (type.equalsIgnoreCase("Estudiante")) {
			Student e = new Student();
			e.setDni(dni);
			e.setName(name);
			e.setEducationalCentre(educationalCentre);
			e.setModality(modality);

			e.showDetails();
			System.out.println();

			personsDatabase.put(dni, e);
		} else {
			System.out.println("Escribe 'Empleado' o 'Estudiante' para añadir una persona a la base de datos");
		}
	}

	/**
	 * El método showAllPersons muestra todas las personas de la base de datos
	 */
	@Override
	public void showAllPersons() {

		for (Integer persons : personsDatabase.keySet()) {

			System.out.println(personsDatabase.get(persons));
			System.out.println();
		}

	}

}
