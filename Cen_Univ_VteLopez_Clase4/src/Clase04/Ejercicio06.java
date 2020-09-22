/**
 * 
 */
package Clase04;

import java.util.Scanner;

/**
 * @author caidev
 *
 */
public class Ejercicio06 {

	/**
	 * Dado un entero N entre 1 y 10 (inclusive), la computadora muestra la
	 * tabla de multiplicar de N.
	 */
	public static void TablaMultiplicar() {
		int numero;
		@SuppressWarnings("resource")
		Scanner num = new Scanner(System.in);
		System.out.print("Calculare la tabla del: ");
		numero = num.nextInt();
		if(numero>0 && numero<11) {
			System.out.println("Tabla del: " + numero);
			System.out.println("___________");
			for(int i = 1;i<11;i++) {
				System.out.println(numero + " * " + i + " = " + (numero*i));
			}
			System.out.println("___________");
			
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TablaMultiplicar();
	}
}
