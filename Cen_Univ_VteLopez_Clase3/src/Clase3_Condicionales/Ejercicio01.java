/**
 * 
 */
package Clase3_Condicionales;

import java.util.Scanner;

/**
 * @author caidev
 *
 */
public class Ejercicio01 {

	/**
	 * Escriba un programa que determine si un número ingresado es positivo,
	 * negativo o cero.
	 */
	public static void SignoNumero() {
		int numeroEvaluar;
		String mensaje = "El numero es igual a 0";
		@SuppressWarnings("resource")
		Scanner numero = new Scanner(System.in);
		System.out.print("Ingrese un numero: ");
		numeroEvaluar = numero.nextInt();
		
		if(numeroEvaluar<0)
			mensaje = "El numero es negativo.";
		else if(numeroEvaluar>0)
			mensaje = "El numero es positivo.";
		
		System.out.println(mensaje);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SignoNumero();
	}
}
