/**
 * 
 */
package mainpkg;

import entidadesSub.Empleado;

/**
 * @author FacuFalcone
 *
 */
public class PruebaEmpleado {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Empleado employee = new Empleado(35055007, "Facu", 65000, 10);
		employee.setAntiguedad(10);
		employee.setNombre("Facundo");
		employee.setSueldoBasico(83000);
		
		System.out.println("Empleado 1: ");
		employee.Mostrar();
		System.out.println("_______________");
		System.out.println("Empleado 2: ");
		Empleado employee2 = new Empleado(22222222, "Caidev", 90000);
		employee2.setAntiguedad(3);
		employee2.Mostrar();
	}

}
