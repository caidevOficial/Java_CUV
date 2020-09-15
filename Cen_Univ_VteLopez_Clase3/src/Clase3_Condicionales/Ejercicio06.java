package Clase3_Condicionales;

import java.util.Scanner;

public class Ejercicio06 {

	/**
	 *  Escriba un programa que permita ingresar valores numéricos A, B, C, D,E y 
	 *  decir si su promedio es mayor que o igual a 10.
	 */
	public static void PromedioMayoroIgualA10() {
		int numeroA;
		int numeroB;
		int numeroC;
		int numeroD;
		int suma = 0;
		double promedio = 0;
		
		@SuppressWarnings("resource")
		Scanner numero = new Scanner(System.in);
		System.out.print("Ingrese el primer numero: ");
		numeroA = numero.nextInt();
		suma += numeroA;
		System.out.print("Ingrese el segundo numero: ");
		numeroB = numero.nextInt();
		suma += numeroB;
		System.out.print("Ingrese el tercer numero: ");
		numeroC = numero.nextInt();
		suma += numeroC;
		System.out.print("Ingrese el cuarto numero: ");
		numeroD = numero.nextInt();
		suma += numeroD;
		
		promedio = (float)suma/4;
		if(promedio>10)
			System.out.println("El promedio es: " + promedio + " y es mayor a 10.");
		else if(promedio==10)
			System.out.println("El promedio es: " + promedio);
	}
	
	public static void main(String[] args) {
		PromedioMayoroIgualA10();
	}
}
