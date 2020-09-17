/**
 * 
 */
package Clase5;

import java.util.Scanner;

/**
 * @author Facu
 *
 */
public class Ejercicio_06 {

	/**
	 * Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media,
	 * la cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que
	 * miden más de 1.75.
	 */
	public static void DatosAlumnos() {
		int maximoAlumnos = 5;
		int cantidadAlumno = 1;
		int edadAlumno;
		int sumaEdades = 0;
		double edadPromedio = 0;
		double estaturaAlumno;
		double sumaEstaturas = 0;
		double estaturaPromedio = 0;
		@SuppressWarnings("resource")
		Scanner num = new Scanner(System.in);
		
		while(cantidadAlumno<=maximoAlumnos) {
			System.out.print(cantidadAlumno + "° Alumno - Ingrese Edad: ");
			edadAlumno = num.nextInt();
			sumaEdades+=edadAlumno;
			
			System.out.print(cantidadAlumno + "° Alumno - Ingrese altura: ");
			estaturaAlumno = num.nextDouble();
			sumaEstaturas+=estaturaAlumno;
			cantidadAlumno++;			
		}
		
		estaturaPromedio = sumaEstaturas/cantidadAlumno;
		edadPromedio = sumaEdades/cantidadAlumno;
		System.out.printf("Edad Promedio: %.2f \n",edadPromedio);
		System.out.printf("Estatura promedio: %.2f",estaturaPromedio);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DatosAlumnos();
	}
}
