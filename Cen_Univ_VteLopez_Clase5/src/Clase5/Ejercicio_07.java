/**
 * 
 */
package Clase5;

import java.util.Scanner;

/**
 * @author Facu
 *
 */
public class Ejercicio_07 {

	/**
	 * Una cuenta bancaria tiene 30000 pesos de saldo. El usuario ingresará
	 * valores que corresponden a extracciones vía cajero automático. Por
	 * cada extracción se debe mostrar como quedó el saldo luego de la
	 * operación. Una extracción que supere al saldo disponible se debe
	 * rechazar indicando que no es posible la operación. El programa finaliza
	 * cuando el saldo queda en cero.
	 */
	public static void CajeroAutomatico() {
		double saldo = 30000;
		double montoSacar;
		@SuppressWarnings("resource")
		Scanner monto = new Scanner(System.in);
		
		while(saldo>0) {
			System.out.printf("Saldo actual: $%.2f",saldo);
			System.out.print("\nIngrese un monto para retirar: $");
			montoSacar = monto.nextDouble();
			
			// Valido ingresar una cantidad menor o igual a mi saldo disponible
			if(montoSacar<=saldo) {
				System.out.println("Extraccion Exitosa!");
				saldo-=montoSacar;
			}else {
				//si es mayor, doy mensaje de error.
				System.out.println("Monto invalido, por favor intentelo de nuevo.\n");
			}
		}
		// Al finalizar la iteracion, imprimo mensaje y termino loop.
		System.out.println("Su cuenta no posee dinero disponible para la extraccion.");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CajeroAutomatico();
	}
}
