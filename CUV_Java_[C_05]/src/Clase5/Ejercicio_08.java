/**
 * 
 */
package Clase5;

import java.util.Scanner;

/**
 * @author Facu
 *
 */
public class Ejercicio_08 {

	/**
	 * Desarrollar un programa que pida un carácter al usuario y que por cada
	 * carga pregunte si se desea seguir ingresando. De la forma “¿Desea
	 * ingresar otro carácter? [S/N]”. La carga de datos finaliza cuando se
	 * detecta una n o N. La computadora debe mostrar la cantidad de letras
	 * vocales ingresadas. (Debe admitir mayúsculas y minúsculas).
	 */
	public static void IngresoCaracteres() {
		int cantidadVocales = 0;
		String letraActual;
		String respuestaContinuar = "s";
		@SuppressWarnings("resource")
		Scanner letra = new Scanner(System.in);
		
		while(respuestaContinuar.equals("s")) {
			System.out.print("Ingrese una letra: ");
			letraActual = letra.next();
			// Convierto a minuscula
			letraActual = letraActual.toLowerCase();
			// Comparo valor de letras
			if(letraActual.equals("a") || letraActual.equals("e") ||
			   letraActual.equals("i") || letraActual.equals("o") ||
			   letraActual.equals("u")) {
				cantidadVocales++;
			}
			// Valido salida
			System.out.println("Desea ingresar otra letra? [S/N]: ");			
			respuestaContinuar = letra.next();
			// Convierto a minuscula
			respuestaContinuar = respuestaContinuar.toLowerCase();
		}
		
		System.out.printf("Vocales totales: %d",cantidadVocales);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IngresoCaracteres();
	}
}
