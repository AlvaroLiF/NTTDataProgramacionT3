package nttdata.javat3.business;

/**
 * Clase abstracta Person
 * 
 * @author Alvaro L
 *
 */
public abstract class Person {

	// Variables
	protected int dni;
	protected String name;

	/**
	 * Setter de la variable dni
	 * 
	 * @param dni
	 */
	public void setDni(int dni) {
		this.dni = dni;
	}

	/**
	 * Setter de la variable name
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Método que permite ver los atributos de la persona desglosados
	 */
	protected abstract void showDetails();

}
