/**
 * 
 */
package Clase5;

import java.util.Scanner;

/**
 * @author Facu
 *
 */
public class Ejercicio_04 {

	/**
	 * Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 35000
	 */
	public static void Pedir10Sueldos() {
		int valorSueldo;
		int cantidadSueldos = 10;
		int sueldosMayor35k = 0;
		int contador = 0;
		@SuppressWarnings("resource")
		Scanner num = new Scanner(System.in);
		
		while(contador<cantidadSueldos) {
			contador++;
			System.out.print("Ingrese el " + contador + "° sueldo: ");
			valorSueldo = num.nextInt();
			
			if(valorSueldo>35000) {
				sueldosMayor35k++;
			}
		}
		System.out.printf("Sueldos mayores a $35000: %d",sueldosMayor35k);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pedir10Sueldos();
	}
}
