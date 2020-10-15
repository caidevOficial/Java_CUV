/**
 * 
 */
package Clase5;

import java.util.Scanner;

/**
 * @author Facu
 *
 */
public class Ejercicio_10 {

	/**
	 * . En un colegio existe la posibilidad de elegir, en la materia "lengua
	 * extranjera", entre las siguientes opciones: [I]nglés, [F]rancés,
	 * [P]ortugués y [A]lemán. Se ingresa, para cada alumno, la lengua
	 * elegida. La computadora muestra el porcentaje de alumnos que eligió
	 * cada lengua, en forma de número.
	 */
	public static void PorcentajeIdiomas() {
		int cantidadAlumnos = 0;
		int ger = 0;
		int en = 0;
		int fr = 0;
		int pt = 0;
		
		double porcentajeA = 0;
		double porcentajeI = 0;
		double porcentajeF = 0;
		double porcentajeP = 0;
		String respuestaContinuar = "s";
		String opcionElegida;
		@SuppressWarnings("resource")
		Scanner opcion = new Scanner(System.in);
		while(respuestaContinuar.equals("s")) {
			System.out.printf("A que materia se anotara el alumno?\n"
							+ "[A]leman.\n"
							+ "[I]ngles.\n"
							+ "[F]rances.\n"
							+ "[P]ortugues.\n"
							+ "Respuesta: ");
			opcionElegida = opcion.next();
			opcionElegida = opcionElegida.toUpperCase();
			
			switch(opcionElegida) {
				case "A":
					ger++;
					cantidadAlumnos++;
					break;
				case "I":
					en++;
					cantidadAlumnos++;
					break;
				case "F":
					fr++;
					cantidadAlumnos++;
					break;
				case "P":
					pt++;
					cantidadAlumnos++;
					break;
				default:
					System.out.println("Opcion invalida.");
					break;
			}
			
			System.out.println("Desea ingresar otro Alumno? [S/N]: ");			
			respuestaContinuar = opcion.next();
			// Convierto a minuscula
			respuestaContinuar = respuestaContinuar.toLowerCase();		
		}
		//Saco porcentajes
		porcentajeA = (float)(ger*100)/cantidadAlumnos; 
		porcentajeI = (float)(en*100)/cantidadAlumnos;
		porcentajeF = (float)(fr*100)/cantidadAlumnos;
		porcentajeP = (float)(pt*100)/cantidadAlumnos;
				
		// Imprimo porcentajes
		System.out.println("Alumnos inscriptos : " + cantidadAlumnos);
		System.out.println("Aleman: " + porcentajeA + "%.");
		System.out.println("Ingles: " + porcentajeI + "%.");
		System.out.println("Frances: " + porcentajeF + "%.");
		System.out.println("Portugues: " + porcentajeP + "%.");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PorcentajeIdiomas();
	}
}
