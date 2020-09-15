package Clase3_Condicionales;

import java.util.Scanner;

public class Ejercicio11 {

	/**
	 * Construir un programa que dado la categoría y el sueldo de untrabajador ,
	 * calcule el aumento correspondiente teniendo en cuenta la siguiente información
	 * Categoría 1: 15%
	 * Categoría 2: 10%
	 * Categoría 3: 8%
	 * Categoría 4: 5%
	 */
	public static void AumentoSueldo() {
		int numeroCategoria;
		double sueldo;
		@SuppressWarnings("resource")
		Scanner num = new Scanner(System.in);
		
		System.out.print("Ingrese el sueldo: $");
		sueldo = num.nextDouble();
		
		System.out.print("Ingrese categoria: ");
		numeroCategoria = num.nextInt();
		
		switch(numeroCategoria) {
		case 1:
			sueldo *= 1.15;
			break;
		case 2:
			sueldo *= 1.10;
			break;
		case 3:
			sueldo *= 1.08;
			break;
		case 4:
			sueldo *= 1.05;
			break;
		}
		System.out.printf("el sueldo final sera de: $%.2f",sueldo);
	}
	
	public static void main(String[] args) {
		AumentoSueldo();
	}
}
