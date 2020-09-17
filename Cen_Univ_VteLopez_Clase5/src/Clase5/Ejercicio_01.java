/**
 * 
 */
package Clase5;

import java.util.Scanner;

/**
 * @author Facu
 */
public class Ejercicio_01 {

	/**
	 * Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta
	 * que se introduzca un 0.
	 */
	public static void NegativoOPositivo() {
		int numero;
		String mensaje;
		boolean esCero = false;
		while(!esCero) {
			@SuppressWarnings("resource")
			Scanner num = new Scanner(System.in);
			System.out.print("Ingrese un numero: ");
			numero = num.nextInt();
			
			if(numero<0) {
				mensaje = "Es negativo";
			}else if(numero>0) {
				mensaje = "Es Positivo";
			}else {
				esCero = true;
				mensaje = "Es Cero, Fin del loop";
			}
			System.out.println(mensaje);
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NegativoOPositivo();
	}
}
