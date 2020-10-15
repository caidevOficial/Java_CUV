package Clase3_Condicionales;

import java.util.Scanner;

public class Ejercicio07 {

	/**
	 * Escribir un programa que dada una nota del 1 al 10 diga:
	 * Aplazado 1 al 3
	 * Regular 4-5
	 * Bueno 6-7
	 * Muy Bueno 8 y 9
	 * Sobresaliente 10
	 */
	public static void EstadoAlumno() {
		String estado = "";
		int nota;
		@SuppressWarnings("resource")
		Scanner notaInput = new Scanner(System.in);
		
		System.out.print("ingrese la nota del alumno: ");
		nota = notaInput.nextInt();
		
		switch(nota) {
			case 1:
			case 2:				
			case 3:
				estado = "Aplazado";
				break;
			case 4:				
			case 5:
				estado = "Regular";
				break;
			case 6:
			case 7:
				estado = "Bueno";
				break;
			case 8:
			case 9:
				estado = "Muy Bueno";
				break;
			case 10:
				estado = "Sobresaliente";
				break;
			default:
				estado = "Nota incorrecta";
				break;
		}
		System.out.println("Estado Alumno: " + estado);
	}
	
	public static void main(String[] args) {
		EstadoAlumno();
	}

}
