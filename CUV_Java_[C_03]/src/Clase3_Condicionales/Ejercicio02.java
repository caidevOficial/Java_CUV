package Clase3_Condicionales;

import java.util.Scanner;

public class Ejercicio02 {

	/**
	 * Escribir un programa que sea capaz de encontrar el máximo de dosvalores (M y N).
	 */
	public static void NumeroMaximo() {
		int num1;
		int num2;
		System.out.print("Ingrese el primer numero: ");
		@SuppressWarnings("resource")
		Scanner numero = new Scanner(System.in);
		num1 = numero.nextInt();
		System.out.print("Ingrese el segundo numero: ");
		num2 = numero.nextInt();
		
		if(num1 < num2)
			System.out.println("El maximo es " + num2);
		else if(num1>num2)
			System.out.println("El maximo es " + num1);
		else
			System.out.println("Los numeros son iguales");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NumeroMaximo();
	}
}
