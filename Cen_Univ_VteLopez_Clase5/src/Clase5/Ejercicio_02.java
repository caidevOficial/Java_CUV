/**
 * 
 */
package Clase5;

import java.util.Scanner;

/**
 * @author Facu
 *
 */
public class Ejercicio_02 {

	/**
	 * Pedir números hasta que se teclee uno negativo, y mostrar cuántos números
	 * se han introducido
	 */
	public static void PedirHastaNegativo() {
		int cantidadNumeros = 0;
		int numero;
		boolean esNegativo = false;
		@SuppressWarnings("resource")
		Scanner num = new Scanner(System.in);
		
		while(!esNegativo) {
			System.out.print("Ingrese un numero: ");
			numero = num.nextInt();
			
			if(numero<0) {
				esNegativo = true;
			}else {
				cantidadNumeros++;
			}
		}
		System.out.printf("Fin del Loop, Numeros ingresados: %d",cantidadNumeros);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PedirHastaNegativo();
	}
}
