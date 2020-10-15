/**
 * 
 */
package entidades;

/**
 * @author FacuFalcone
 *
 */
public class PruebaHerencia {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Hardcodeo
		Alumno student = new Alumno(35055007, "Facu", 9, 10);
		Persona person1 = new Persona(35055007, "Caidev");
		System.out.println("Persona:");
		person1.Mostrar();
		System.out.println("_____________");
		
		System.out.println("Alumno:");
		student.Mostrar();
		
	}
}
