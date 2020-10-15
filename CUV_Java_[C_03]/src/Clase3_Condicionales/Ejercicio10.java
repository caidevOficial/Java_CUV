package Clase3_Condicionales;

import java.util.Scanner;

public class Ejercicio10 {

	/**
	 * Escribir un programa que al ingresar un numero entero indique cuantascifras de 0 al 99.999
	 */
	public static void CantidadDigitos() {
		int numero;
		int cantidadDigitos = 1;
		
		@SuppressWarnings("resource")
		Scanner num = new Scanner(System.in);
		System.out.print("Ingrese un numero: ");
		numero = num.nextInt();
		
		if(numero>10 && numero<100)
			cantidadDigitos = 2;
		else if(numero>100 && numero<1000)
			cantidadDigitos = 3;
		else if(numero>1000 && numero<10000)
			cantidadDigitos = 4;
		else if(numero>10000 && numero<100000)
			cantidadDigitos = 5;
			
		System.out.println("El numero tiene Digitos: " + cantidadDigitos);
	}
	
	public static void main(String[] args) {
		CantidadDigitos();
	}
}
