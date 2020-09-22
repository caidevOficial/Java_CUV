/**
 * 
 */
package Clase5;

import java.util.Scanner;

/**
 * @author Facu
 *
 */
public class Ejercicio_03 {

	/**
	 * Pedir números hasta que se teclee un 0, mostrar la suma de todos los números
	 * introducidos.
	 */
	public static void TeclearHasta0() {
		int numero;
		int suma = 0;
		boolean esCero = false;
		@SuppressWarnings("resource")
		Scanner num = new Scanner(System.in);
		
		while(!esCero) {
			System.out.print("Ingrese un numero: ");
			numero = num.nextInt();
			if(numero!=0) {
				suma += numero;				
			}else {
				esCero = true;
			}
		}
		System.out.printf("La suma es: %d",suma);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TeclearHasta0();
	}
}
