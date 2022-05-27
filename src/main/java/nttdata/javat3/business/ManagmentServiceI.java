package nttdata.javat3.business;

/**
 * Interfaz implementada por la clase ManagmentServiceImpl
 * 
 * @author Alvaro L
 *
 */

public interface ManagmentServiceI {

	/**
	 * Método que da de alta a un empleado o a un estudiante en la base de datos
	 * 
	 * @param name
	 * @param category
	 */

	public void addNewPerson(String type, String name, int dni, String company, String project, String category,
			String modality, String educationalCentre);

	/**
	 * Método que muestra todos los empleados
	 */

	public void showAllPersons();

}
