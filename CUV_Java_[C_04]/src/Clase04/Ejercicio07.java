/**
 * 
 */
package Clase04;

import java.util.Scanner;

/**
 * @author caidev
 *
 */
public class Ejercicio07 {

	/**
	 * Diseñar un algoritmo que realice el promedio de 4 números. Los
	 * números podrán ser decimales y serán ingresados por pantalla por el
	 * usuario.
	 */
	public static void Promedio4Numeros() {
		double suma = 0;
		double promedio;
		@SuppressWarnings("resource")
		Scanner numero = new Scanner(System.in);
		for(int i = 1;i<5;i++) {
			System.out.print(i + "° numero, ingresa: ");
			suma += numero.nextDouble();
		}
		promedio = suma/4;
		System.out.println("El promedio es: " + promedio);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Promedio4Numeros();
	}
}
