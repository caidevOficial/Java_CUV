package Clase3_Condicionales;

import java.util.Scanner;

public class Ejercicio08 {

	/**
	 * Escribir un programa que muestre el día de la semana. 
	 * Ejemplo si ingreso 1 que me diga que es lunes,2 martes ,etc.
	 */
	public static void DiaSemanal() {
		String dia = "";
		int numeroDia;
		@SuppressWarnings("resource")
		Scanner diaInput = new Scanner(System.in);
		
		System.out.print("ingrese el numero de dia: ");
		numeroDia = diaInput.nextInt();
		
		switch(numeroDia) {
			case 1:
				dia = "LUNES";
				break;
			case 2:
				dia = "MARTES";
				break;
			case 3:
				dia = "MIERCOLES";
				break;
			case 4:
				dia = "JUEVES";
				break;
			case 5:
				dia = "VIERNES";
				break;
			case 6:
				dia = "SABADO";
				break;
			case 7:
				dia = "DOMINGO";
				break;
			default:
				dia = "DIA INCORRECTO";
				break;
		}
		System.out.println("dia: " + dia);
	}
	
	public static void main(String[] args) {
		DiaSemanal();
	}
}
