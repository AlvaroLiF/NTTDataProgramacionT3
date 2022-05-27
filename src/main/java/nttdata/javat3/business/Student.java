package nttdata.javat3.business;

public class Student extends Person {

	// Variables
	private String educationalCentre;
	private String modality = "DAM o DAW";

	/**
	 * Setter de la variable educationalCentre
	 * 
	 * @param educationalCentre
	 */
	public void setEducationalCentre(String educationalCentre) {
		this.educationalCentre = educationalCentre;
	}

	/**
	 * Setter de la variable modality
	 * 
	 * @param modality
	 */
	public void setModality(String modality) {
		this.modality = modality;
	}

	/**
	 * Método que muestra los atributos del estudiante de forma desglosada
	 */
	@Override
	public void showDetails() {
		System.out.println("DNI : " + dni);
		System.out.println("Nombre : " + name);
		System.out.println("Centro Educativo : " + educationalCentre);
		System.out.println("Modalidad : " + modality);

	}

	/**
	 * Método toString que representa los atributos del empleado en forma de cadena
	 * de texto
	 */
	@Override
	public String toString() {
		return "El estudiante con DNI " + dni + ", es " + name + " que estudia en el centro educativo "
				+ educationalCentre + " en la modalidad de " + modality;
	}

}
