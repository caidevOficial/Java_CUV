package Clase3_Condicionales;

import java.util.Scanner;

public class Ejercicio04 {

	/**
	 *  Escribir un programa que pida 3 números y los ordene de mayor a menor.
	 */
	public static void OrdenarMayoraMenor() {
		int num1;
		int num2;
		int num3;

		@SuppressWarnings("resource")
		Scanner numero = new Scanner(System.in);
		System.out.print("Ingresa el primer numero: ");
		num1 = numero.nextInt();
		System.out.print("Ingresa el segundo numero: ");
		num2 = numero.nextInt();
		System.out.print("Ingresa el tercer numero: ");
		num3 = numero.nextInt();

		if (num1 > num2 && num1>num3) {
			if (num2 > num3) {
				System.out.println("Ordenados de Mayor a menor: " + num1 + num2 + num3);
			} else {
				System.out.println("Ordenados de Mayor a menor: " + num1 + num3 + num2);
			}
		} else if (num2 > num1 && num2>num3) {
			if (num1 > num3) {
				System.out.println("Ordenados de Mayor a menor: " + num2 + num1 + num3);
			} else {
				System.out.println("Ordenados de Mayor a menor: " + num2 + num3 + num1);
			}
		} else if (num3 > num2 && num3>num1) {
			if (num2 > num1) {
				System.out.println("Ordenados de Mayor a menor: " + num3 + num2 + num1);
			} else {
				System.out.println("Ordenados de Mayor a menor: " + num3 + num1 + num2);
			}
		}
	}

	public static void main(String[] args) {
		OrdenarMayoraMenor();
	}
}
