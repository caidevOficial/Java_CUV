/**
 * 
 */
package Clase04;

import java.util.Scanner;

/**
 * @author caidev
 *
 */
public class Ejercicio10 {

	/**
	 * 10.Se ingresan 5 números. La computadora muestra cuál fue el mayor y en
	 * qué orden apareció.
	 */
	public static void AdivinarMayor() {
		int num1;
		int mayor = -99999;
		int orden = 0;
		Boolean primerNumero = true;
		@SuppressWarnings("resource")
		Scanner numero = new Scanner(System.in);
		for(int i = 1;i<6;i++) {
			System.out.print("Ingrese un numero: ");
			num1 = numero.nextInt();
			if(primerNumero || mayor<num1) {
				mayor = num1;
				orden = i;
				primerNumero = false;
			}			
		}
		System.out.println("El numero mayor es: " + mayor);
		System.out.println("Ubicado en la posicion: " + orden);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AdivinarMayor();
	}
}
