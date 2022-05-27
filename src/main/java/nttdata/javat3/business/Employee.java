package nttdata.javat3.business;

/**
 * Clase Employee
 * 
 * @author Alvaro L
 *
 */

public class Employee extends Person {

	// Variables
	private String company;
	private String category;
	private String project;

	/**
	 * Setter de la variable category
	 * 
	 * @param category
	 */

	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * Setter de la variable company
	 * 
	 * @param company
	 */

	public void setCompany(String company) {
		this.company = company;
	}

	/**
	 * Setter de la variable project
	 * 
	 * @param project
	 */
	public void setProject(String project) {
		this.project = project;
	}

	/**
	 * Método que muestra los atributos del empleado de forma desglosada
	 */

	@Override
	public void showDetails() {
		System.out.println("DNI : " + dni);
		System.out.println("Nombre : " + name);
		System.out.println("Empresa : " + company);
		System.out.println("Proyecto : " + project);
		System.out.println("Categoría : " + category);

	}

	/**
	 * Método toString que representa los atributos del empleado en forma de cadena
	 * de texto
	 */
	@Override
	public String toString() {
		return "El empleado con DNI " + dni + " es " + name + ", que trabaja como " + category + " en la empresa "
				+ company + ", en el proyecto " + project;
	}

}
