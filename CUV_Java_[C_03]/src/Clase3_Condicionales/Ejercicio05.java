package Clase3_Condicionales;

import java.util.Scanner;

public class Ejercicio05 {

	/**
	 *  Escribir un programa que al ingresar un numero diga si este es par,imparo nulo.
	 */
	public static void ParImparoNulo() {
		int num1;
		
		@SuppressWarnings({"resource" })
		Scanner numero = new Scanner(System.in);
		System.out.print("Ingrese un numero: ");
		num1 = numero.nextInt();
		
		if(num1==0) {
			System.out.println("El numero es nulo.");
		}else {
			if(num1%2==1) {
				System.out.println("El numero es impar.");
			}else {
				System.out.println("El numero es par.");
			}
		}
	}
	
	public static void main(String[] args) {
		ParImparoNulo();
	}
}
