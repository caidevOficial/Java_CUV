/**
 * 
 */
package Clase5;

import java.util.Scanner;

/**
 * @author Facu
 *
 */
public class Ejercicio_Extra {

	/**
	 * Un usuario ingresa 12 valores de a uno por vez
	 * pertenecientes a sus sueldos mensuales durante un año.
	 * La computadora muestra su sualdo anual. Si durante la carga
	 * de los sueldos mensuales se detecta un valor negativo, debe dejar de 
	 * ingresar sus datos y mostrar la sumatoria de los sueldos que se ingresaron.
	 */
	public static void TeclearSueldoHastaNegativo() {
		int sueldoAnual = 0;
		int contador = 0;
		int valorSueldoMensual;
		boolean sueldoErroneo = false;
		@SuppressWarnings("resource")
		Scanner num = new Scanner(System.in);
		
		while(!sueldoErroneo && contador<12) {
			//Actualizo contador por cada iteracion.
			contador++;
			System.out.print("Ingrese sueldo del " + contador + "° mes: ");
			valorSueldoMensual = num.nextInt();
			
			if(valorSueldoMensual>=0) {
				// Si es positivo, acumulo.
				sueldoAnual += valorSueldoMensual;
			}else {
				// si es negativo, actualizo flag para salir.
				sueldoErroneo = true;
			}
		}
		System.out.printf("El sueldo anual es de: $[%6d]",sueldoAnual);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TeclearSueldoHastaNegativo();
	}
}
